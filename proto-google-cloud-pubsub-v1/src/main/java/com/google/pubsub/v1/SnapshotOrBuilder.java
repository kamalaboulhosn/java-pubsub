/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

public interface SnapshotOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.Snapshot)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The name of the snapshot.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Optional. The name of the snapshot.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The name of the topic from which this snapshot is retaining
   * messages.
   * </pre>
   *
   * <code>
   * string topic = 2 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The topic.
   */
  java.lang.String getTopic();
  /**
   *
   *
   * <pre>
   * Optional. The name of the topic from which this snapshot is retaining
   * messages.
   * </pre>
   *
   * <code>
   * string topic = 2 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for topic.
   */
  com.google.protobuf.ByteString getTopicBytes();

  /**
   *
   *
   * <pre>
   * Optional. The snapshot is guaranteed to exist up until this time.
   * A newly-created snapshot expires no later than 7 days from the time of its
   * creation. Its exact lifetime is determined at creation by the existing
   * backlog in the source subscription. Specifically, the lifetime of the
   * snapshot is `7 days - (age of oldest unacked message in the subscription)`.
   * For example, consider a subscription whose oldest unacked message is 3 days
   * old. If a snapshot is created from this subscription, the snapshot -- which
   * will always capture this 3-day-old backlog as long as the snapshot
   * exists -- will expire in 4 days. The service will refuse to create a
   * snapshot that would expire in less than 1 hour after creation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the expireTime field is set.
   */
  boolean hasExpireTime();
  /**
   *
   *
   * <pre>
   * Optional. The snapshot is guaranteed to exist up until this time.
   * A newly-created snapshot expires no later than 7 days from the time of its
   * creation. Its exact lifetime is determined at creation by the existing
   * backlog in the source subscription. Specifically, the lifetime of the
   * snapshot is `7 days - (age of oldest unacked message in the subscription)`.
   * For example, consider a subscription whose oldest unacked message is 3 days
   * old. If a snapshot is created from this subscription, the snapshot -- which
   * will always capture this 3-day-old backlog as long as the snapshot
   * exists -- will expire in 4 days. The service will refuse to create a
   * snapshot that would expire in less than 1 hour after creation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The expireTime.
   */
  com.google.protobuf.Timestamp getExpireTime();
  /**
   *
   *
   * <pre>
   * Optional. The snapshot is guaranteed to exist up until this time.
   * A newly-created snapshot expires no later than 7 days from the time of its
   * creation. Its exact lifetime is determined at creation by the existing
   * backlog in the source subscription. Specifically, the lifetime of the
   * snapshot is `7 days - (age of oldest unacked message in the subscription)`.
   * For example, consider a subscription whose oldest unacked message is 3 days
   * old. If a snapshot is created from this subscription, the snapshot -- which
   * will always capture this 3-day-old backlog as long as the snapshot
   * exists -- will expire in 4 days. The service will refuse to create a
   * snapshot that would expire in less than 1 hour after creation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. See [Creating and managing labels]
   * (https://cloud.google.com/pubsub/docs/labels).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. See [Creating and managing labels]
   * (https://cloud.google.com/pubsub/docs/labels).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. See [Creating and managing labels]
   * (https://cloud.google.com/pubsub/docs/labels).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. See [Creating and managing labels]
   * (https://cloud.google.com/pubsub/docs/labels).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. See [Creating and managing labels]
   * (https://cloud.google.com/pubsub/docs/labels).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);
}
