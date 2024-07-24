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
import com.google.api.gax.rpc.ApiException;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.cloud.pubsub.v1.Publisher;
import com.google.api.gax.batching.BatchingSettings;
import com.google.api.gax.batching.FlowControlSettings;
import com.google.api.gax.batching.FlowController.LimitExceededBehavior;
import com.google.protobuf.ByteString;
import com.google.pubsub.v1.PubsubMessage;
import com.google.pubsub.v1.TopicName;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.ArrayList;
import com.google.common.collect.ImmutableMap;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

import utilities.TaxiTripOuterClass.TaxiTrip;

public class PublisherExample {
  private static final String[] COMPANIES = {"GREEN"};
  private static final double[] TOLLS = {6.94, 3.18,2.60};

  private static Random generator = new Random();

  private static long nextPickupTime =  System.currentTimeMillis() - 365 * 24 * 3600 * 1000;


  public static void main(String... args) throws Exception {
    // TODO(developer): Replace these variables before running the sample.
    String projectId = "ordering-keys-testing";
    String topicId = "taxitrip";

    publisherExample(projectId, topicId);
  }

  public static TaxiTrip generateTaxiTrip() {
    TaxiTrip.Builder ttb = TaxiTrip.newBuilder();

    int ci = generator.nextInt(COMPANIES.length);
    ttb.setTaxiCompany(COMPANIES[ci]);
    ttb.setVendorId(generator.nextInt(2) + 1);

    long endTimeSeconds = nextPickupTime + 60000 + generator.nextInt(7200000);

    Date pickupTime = new Date(nextPickupTime);
    Date dropoffTime = new Date(endTimeSeconds);

    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.000000", Locale.US);
    format.setTimeZone(TimeZone.getTimeZone("America/New_York"));
    ttb.setPickupDateTime(format.format(pickupTime));
    ttb.setDropoffDateTime(format.format(dropoffTime));

    ttb.setStoreAndForward(generator.nextInt(100) < 5 ? "Y" : "N");

    int rateCode = generator.nextInt(50);
    rateCode = rateCode < 6 ? (rateCode + 1) : 1;
    ttb.setRateCodeId(rateCode);

    ttb.setPassengerCount(generator.nextInt(4) + 1);
    ttb.setPULocationID(generator.nextInt(262) + 1);
    ttb.setDOLocationID(generator.nextInt(262) + 1);

    double distance = 0.0;
    double fare = 0.0;
    double surcharge = 0.0;
    double mtaTax = 0.0;
    double improvementSurcharge = 1.0;
    double congestionSurcharge = 1.0;
    double tolls = 0.0;
    switch (rateCode) {
      case 1:
      case 5:
      case 6:
        distance = (double)generator.nextInt(300) / 100.0 + 0.5;
        fare = distance * 0.70 * 5;
        surcharge = 3.0;
        mtaTax = 0.5;
        break;
      case 2:
        distance = 22.3 + (28.0 - 22.3) * generator.nextDouble();
        fare = 70.0;
        surcharge += 1.75;
        mtaTax = 0.5;
        break;
      case 3:
        distance = 12.5 + (30.0 - 12.5) * generator.nextDouble();
        fare = distance * 0.70 * 5;
        mtaTax = 0.5;
        break;
      case 4:
        distance = 25.0 + (double)generator.nextInt(300) / 100.0;
        fare = distance * 0.70 * 5;
        tolls = 15.38;
    }

    if (rateCode == 1) {
      if (pickupTime.getHours() >= 20 || pickupTime.getHours() < 6) {
        surcharge += 1.0;
      } else if ((pickupTime.getHours() >= 4 || pickupTime.getHours() < 8) && (pickupTime.getDay() != 0 && pickupTime.getDay() != 6)) {
        surcharge += 2.5;
      }
    }
    // LGA
    if (rateCode == 1 && generator.nextInt(50) < 1) {
      surcharge += 5.00 + 1.75;
      if ((pickupTime.getHours() >= 4 || pickupTime.getHours() < 8) && (pickupTime.getDay() != 0 && pickupTime.getDay() != 6)) {
        surcharge += 5.0;
      }
    }
    if (rateCode == 4) {
      surcharge += 20.0;
    }
    if (rateCode == 2 || rateCode == 4) {
      if ((pickupTime.getHours() >= 4 || pickupTime.getHours() < 8) && (pickupTime.getDay() != 0 && pickupTime.getDay() != 6)) {
        surcharge += 5.0;
      }
    }

    double tip = (double)((int)((0.3 - 0.1) * (generator.nextDouble() + 0.1) * fare * 100)) / 100.0;

    if (rateCode != 4 && generator.nextInt(10) == 0) {
      tolls = TOLLS[generator.nextInt(TOLLS.length)];
    }

    distance = (double)((int)(distance * 10)) / 10.0;
    fare = (double)((int)(fare * 100)) / 100.0;
    double total = fare+surcharge+mtaTax+tip+tolls+improvementSurcharge+congestionSurcharge;
    total = (double)((int)(total * 100)) / 100.0;

    ttb.setTripDistance(distance);
    ttb.setFareAmount(fare);
    ttb.setSurcharge(surcharge);
    ttb.setCongestionSurcharge(congestionSurcharge);
    ttb.setMTATax(mtaTax);
    ttb.setTipAmount(tip);
    ttb.setTollsAmount(tolls);
    ttb.setImprovementSurcharge(improvementSurcharge);
    ttb.setTotalAmount(total);
    ttb.setTripType(1);

    SimpleDateFormat partitionFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    partitionFormat.setTimeZone(TimeZone.getTimeZone("America/New_York"));
    ttb.setPartitionDate(partitionFormat.format(pickupTime));

    return ttb.build();
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
              .setMaxOutstandingRequestBytes(10000 * 1024 * 1024L) // 10 MiB
              .setMaxOutstandingElementCount(1000L) // 100 messages
              .build();

      // By default, messages are not batched.
      BatchingSettings batchingSettings =
          BatchingSettings.newBuilder().setFlowControlSettings(flowControlSettings).build();
      // Create a publisher instance with default settings bound to the topic
      publisher = Publisher.newBuilder(topicName).setEnableMessageOrdering(true)
            // .setEndpoint("us-central2-loadtest-pubsub.sandbox.googleapis.com:443")
            .build();

      // String goodMessage = "{\"d\": 3957, \"ts\": 1707497853000000, \"dt\": 63843254520000000}";
      // ByteString goodData = ByteString.copyFromUtf8(goodMessage);
      // String badMessage = "{\"ts\": \"This is not a timestamp\"}";
      // ByteString badData = ByteString.copyFromUtf8(badMessage);
      //String badMessage;
      int messageCount = 0;
      Random ran = new Random();
      ArrayList<ApiFuture<String>> messageFutures = new ArrayList<>();
      while (true) {
        TaxiTrip t = generateTaxiTrip();

        PubsubMessage pubsubMessage;
        pubsubMessage = PubsubMessage.newBuilder().setData(t.toByteString()).build();

        ApiFuture<String> msgIdFuture = publisher.publish(pubsubMessage);
        final int thisCount = messageCount;
        // ApiFutures.addCallback(
        //     msgIdFuture,
        //     new ApiFutureCallback<String>() {

        //       @Override
        //       public void onFailure(Throwable throwable) {
        //         if (throwable instanceof ApiException) {
        //           ApiException apiException = ((ApiException) throwable);
        //           // Details on the API exception.
        //           System.out.println(apiException.getStatusCode().getCode());
        //           System.out.println(apiException.isRetryable());
        //         }
        //         System.out.println("Error publishing message : " + pubsubMessage.getData());
        //       }

        //       @Override
        //       public void onSuccess(String messageId) {
        //         if (thisCount % 1000 == 0) {
        //           System.out.println("GOT MESSAGE " + messageId);
        //         }
        //       }
        //     },
        //     MoreExecutors.directExecutor());

        // Once published, returns a server-assigned message id (unique within the topic)
        ++messageCount;
        messageFutures.add(msgIdFuture);
        if (messageCount % 1000 == 0) {
          try {
            System.out.println("Published " + messageCount + " messages ");
            ApiFutures.allAsList(messageFutures).get();
          } catch (Exception e) {
            System.out.println("Wait failed");
          }
          messageFutures.clear();
        }
        int nextPickupDelay = generator.nextInt(1000);
        nextPickupTime += nextPickupDelay;
        Thread.sleep(5);
      }
    } finally {
      if (publisher != null) {
        // When finished with the publisher, shutdown to free up resources.
        publisher.shutdown();
        publisher.awaitTermination(1, TimeUnit.MINUTES);
      }
    }
  }


  private static void printThreads() {
    System.out.println("Thread names:");
    Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
    for (Thread t : threadSet) {
      System.out.println("\t" + t.getName());
    }
    System.out.printf("Thread count: %d\n", Thread.activeCount());
  }
}
// [END pubsub_quickstart_publisher]
// [END pubsub_publish]
