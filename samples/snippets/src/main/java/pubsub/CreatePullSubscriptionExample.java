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

// [START pubsub_create_pull_subscription]

import com.google.cloud.pubsub.v1.SubscriptionAdminClient;
import com.google.cloud.pubsub.v1.SubscriptionAdminSettings;
import com.google.pubsub.v1.ProjectSubscriptionName;
import com.google.pubsub.v1.PushConfig;
import com.google.pubsub.v1.Subscription;
import com.google.pubsub.v1.TopicName;
import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;

public class CreatePullSubscriptionExample {
  public static void main(String... args) throws Exception {
    // TODO(developer): Replace these variables before running the sample.
    String projectId = "ordering-keys-testing";
    String subscriptionId = "subscription-";
    String topicId = "lots-of-subscriptions-topic";

    createPullSubscriptionExample(projectId, subscriptionId, topicId);
  }

  public static void createPullSubscriptionExample(
      String projectId, String subscriptionId, String topicId) throws IOException {
    try {
      String endpoint = "staging-pubsub.sandbox.googleapis.com:443";
      SubscriptionAdminSettings.Builder subscriptionAdminClientBuilder =
          SubscriptionAdminSettings.newBuilder().setEndpoint(endpoint);
      final SubscriptionAdminClient subscriptionAdminClient =
          SubscriptionAdminClient.create(subscriptionAdminClientBuilder.build());
      final TopicName topicName = TopicName.of(projectId, topicId);
      final Semaphore s = new Semaphore(10000);
      ExecutorService executor = Executors.newFixedThreadPool(2048);
      for (int i = 0; i < 1000000; ++i) {
        final int index = i;
        final ProjectSubscriptionName subscriptionName =
            ProjectSubscriptionName.of(projectId, subscriptionId + i);
        s.acquire();
        executor.submit(() -> {
        Subscription subscription =
            subscriptionAdminClient.createSubscription(
                subscriptionName, topicName, PushConfig.getDefaultInstance(), 10);
        subscriptionAdminClient.deleteSubscription(subscriptionName);
        s.release();
        //if (i % 10 == 0 ) {
          System.out.println("Created " + index + "pull subscriptions");
        //}
        });
      }
    } catch (Exception e) {
      System.out.println("No create: " + e);
    }
  }
}
// [END pubsub_create_pull_subscription]
