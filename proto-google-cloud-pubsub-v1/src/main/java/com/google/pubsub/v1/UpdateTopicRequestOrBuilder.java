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

public interface UpdateTopicRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.UpdateTopicRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The updated topic object.
   * </pre>
   *
   * <code>.google.pubsub.v1.Topic topic = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the topic field is set.
   */
  boolean hasTopic();
  /**
   *
   *
   * <pre>
   * Required. The updated topic object.
   * </pre>
   *
   * <code>.google.pubsub.v1.Topic topic = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The topic.
   */
  com.google.pubsub.v1.Topic getTopic();
  /**
   *
   *
   * <pre>
   * Required. The updated topic object.
   * </pre>
   *
   * <code>.google.pubsub.v1.Topic topic = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.pubsub.v1.TopicOrBuilder getTopicOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Indicates which fields in the provided topic to update. Must be
   * specified and non-empty. Note that if `update_mask` contains
   * "message_storage_policy" but the `message_storage_policy` is not set in
   * the `topic` provided above, then the updated value is determined by the
   * policy configured at the project or organization level.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Indicates which fields in the provided topic to update. Must be
   * specified and non-empty. Note that if `update_mask` contains
   * "message_storage_policy" but the `message_storage_policy` is not set in
   * the `topic` provided above, then the updated value is determined by the
   * policy configured at the project or organization level.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Indicates which fields in the provided topic to update. Must be
   * specified and non-empty. Note that if `update_mask` contains
   * "message_storage_policy" but the `message_storage_policy` is not set in
   * the `topic` provided above, then the updated value is determined by the
   * policy configured at the project or organization level.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
