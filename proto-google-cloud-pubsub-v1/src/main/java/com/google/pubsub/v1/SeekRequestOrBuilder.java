/*
 * Copyright 2020 Google LLC
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

public interface SeekRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.SeekRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The subscription to affect.
   * </pre>
   *
   * <code>
   * string subscription = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The subscription.
   */
  java.lang.String getSubscription();
  /**
   *
   *
   * <pre>
   * Required. The subscription to affect.
   * </pre>
   *
   * <code>
   * string subscription = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for subscription.
   */
  com.google.protobuf.ByteString getSubscriptionBytes();

  /**
   *
   *
   * <pre>
   * The time to seek to.
   * Messages retained in the subscription that were published before this
   * time are marked as acknowledged, and messages retained in the
   * subscription that were published after this time are marked as
   * unacknowledged. Note that this operation affects only those messages
   * retained in the subscription (configured by the combination of
   * `message_retention_duration` and `retain_acked_messages`). For example,
   * if `time` corresponds to a point before the message retention
   * window (or to a point before the system's notion of the subscription
   * creation time), only retained messages will be marked as unacknowledged,
   * and already-expunged messages will not be restored.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 2;</code>
   *
   * @return Whether the time field is set.
   */
  boolean hasTime();
  /**
   *
   *
   * <pre>
   * The time to seek to.
   * Messages retained in the subscription that were published before this
   * time are marked as acknowledged, and messages retained in the
   * subscription that were published after this time are marked as
   * unacknowledged. Note that this operation affects only those messages
   * retained in the subscription (configured by the combination of
   * `message_retention_duration` and `retain_acked_messages`). For example,
   * if `time` corresponds to a point before the message retention
   * window (or to a point before the system's notion of the subscription
   * creation time), only retained messages will be marked as unacknowledged,
   * and already-expunged messages will not be restored.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 2;</code>
   *
   * @return The time.
   */
  com.google.protobuf.Timestamp getTime();
  /**
   *
   *
   * <pre>
   * The time to seek to.
   * Messages retained in the subscription that were published before this
   * time are marked as acknowledged, and messages retained in the
   * subscription that were published after this time are marked as
   * unacknowledged. Note that this operation affects only those messages
   * retained in the subscription (configured by the combination of
   * `message_retention_duration` and `retain_acked_messages`). For example,
   * if `time` corresponds to a point before the message retention
   * window (or to a point before the system's notion of the subscription
   * creation time), only retained messages will be marked as unacknowledged,
   * and already-expunged messages will not be restored.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The snapshot to seek to. The snapshot's topic must be the same as that of
   * the provided subscription.
   * Format is `projects/{project}/snapshots/{snap}`.
   * </pre>
   *
   * <code>string snapshot = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return Whether the snapshot field is set.
   */
  boolean hasSnapshot();
  /**
   *
   *
   * <pre>
   * The snapshot to seek to. The snapshot's topic must be the same as that of
   * the provided subscription.
   * Format is `projects/{project}/snapshots/{snap}`.
   * </pre>
   *
   * <code>string snapshot = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The snapshot.
   */
  java.lang.String getSnapshot();
  /**
   *
   *
   * <pre>
   * The snapshot to seek to. The snapshot's topic must be the same as that of
   * the provided subscription.
   * Format is `projects/{project}/snapshots/{snap}`.
   * </pre>
   *
   * <code>string snapshot = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for snapshot.
   */
  com.google.protobuf.ByteString getSnapshotBytes();

  com.google.pubsub.v1.SeekRequest.TargetCase getTargetCase();
}
