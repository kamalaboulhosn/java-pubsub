/*
 * Copyright 2016 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package pubsub;

// [START pubsub_quickstart_publisher]
// [START pubsub_publish]

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutureCallback;
import com.google.api.core.ApiFutures;
import com.google.api.gax.batching.BatchingSettings;
import com.google.api.gax.batching.FlowControlSettings;
import com.google.api.gax.batching.FlowController.LimitExceededBehavior;
import com.google.api.gax.rpc.ApiException;
import com.google.cloud.pubsub.v1.Publisher;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ByteString;
import com.google.pubsub.v1.PubsubMessage;
import com.google.pubsub.v1.TopicName;
import java.io.IOException;
import java.time.Instant;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.threeten.bp.Duration;

public class PublisherExample {
  public static void main(String... args) throws Exception {
    // TODO(developer): Replace these variables before running the sample.
    String projectId = "my-project";
    String topicId = "my-topic";

    publisherExample(projectId, topicId);
  }

  public static void publisherExample(String projectId, String topicId)
      throws IOException, ExecutionException, InterruptedException {
    TopicName topicName = TopicName.of(projectId, topicId);

    Publisher publisher = null;
    try {
      FlowControlSettings flowControlSettings =
          FlowControlSettings.newBuilder()
              // Block more messages from being published when the limit is reached. The other
              // options are Ignore (or continue publishing) and ThrowException (or error out).
              .setLimitExceededBehavior(LimitExceededBehavior.Block)
              .setMaxOutstandingRequestBytes(10 * 1024 * 1024 * 1024L) // 10 GiB
              .setMaxOutstandingElementCount(300000L) // 300000 messages
              .build();

      // By default, messages are not batched.
      BatchingSettings batchingSettings =
          BatchingSettings.newBuilder()
              .setFlowControlSettings(flowControlSettings)
              .setElementCountThreshold(1000L)
              .setRequestByteThreshold(10 * 1024 * 1024L)
              .setDelayThreshold(Duration.ofMillis(1000))
              .build();

      publisher = Publisher.newBuilder(topicName).setBatchingSettings(batchingSettings).build();

      long published = 0;
      Random rand = new Random();
      while (true) {
        long micros = Instant.now().toEpochMilli() * 1000;
        long userId = rand.nextInt(100000);
        int quantity = rand.nextInt(100);
        long itemId = rand.nextInt(10000);
        String message =
            "{\"event_time\":"
                + micros
                + ", \"user_id\": "
                + userId
                + ", \"item_id\": "
                + itemId
                + ", \"quantity\": "
                + quantity
                + "}";
        ByteString data = ByteString.copyFromUtf8(message);
        PubsubMessage pubsubMessage = PubsubMessage.newBuilder().setData(data).build();

        // Once published, returns a server-assigned message id (unique within the topic)
        ApiFuture<String> future = publisher.publish(pubsubMessage);
        ApiFutures.addCallback(
            future,
            new ApiFutureCallback<String>() {

              @Override
              public void onFailure(Throwable throwable) {
                if (throwable instanceof ApiException) {
                  ApiException apiException = ((ApiException) throwable);
                  // details on the API exception
                  System.out.println(apiException.getStatusCode().getCode());
                  System.out.println(apiException.isRetryable());
                }
                System.out.println("Error publishing message : " + message);
              }

              @Override
              public void onSuccess(String messageId) {
                // Once published, returns server-assigned message ids (unique within the topic)
                // System.out.println("Published message ID: " + messageId);
              }
            },
            MoreExecutors.directExecutor());
        if (++published % 100000 == 0) {
          System.out.println("Published " + published);
        }
      }
    } finally {
      if (publisher != null) {
        // When finished with the publisher, shutdown to free up resources.
        publisher.shutdown();
        publisher.awaitTermination(1, TimeUnit.MINUTES);
      }
    }
  }
}
// [END pubsub_quickstart_publisher]
// [END pubsub_publish]
