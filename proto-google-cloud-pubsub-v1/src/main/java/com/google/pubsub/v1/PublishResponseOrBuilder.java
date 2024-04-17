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

// Protobuf Java Version: 3.25.3
package com.google.pubsub.v1;

public interface PublishResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.PublishResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The server-assigned ID of each published message, in the same
   * order as the messages in the request. IDs are guaranteed to be unique
   * within the topic.
   * </pre>
   *
   * <code>repeated string message_ids = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the messageIds.
   */
  java.util.List<java.lang.String> getMessageIdsList();
  /**
   *
   *
   * <pre>
   * Optional. The server-assigned ID of each published message, in the same
   * order as the messages in the request. IDs are guaranteed to be unique
   * within the topic.
   * </pre>
   *
   * <code>repeated string message_ids = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of messageIds.
   */
  int getMessageIdsCount();
  /**
   *
   *
   * <pre>
   * Optional. The server-assigned ID of each published message, in the same
   * order as the messages in the request. IDs are guaranteed to be unique
   * within the topic.
   * </pre>
   *
   * <code>repeated string message_ids = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The messageIds at the given index.
   */
  java.lang.String getMessageIds(int index);
  /**
   *
   *
   * <pre>
   * Optional. The server-assigned ID of each published message, in the same
   * order as the messages in the request. IDs are guaranteed to be unique
   * within the topic.
   * </pre>
   *
   * <code>repeated string message_ids = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the messageIds at the given index.
   */
  com.google.protobuf.ByteString getMessageIdsBytes(int index);
}
