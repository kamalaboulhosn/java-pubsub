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

public interface CloudStorageConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.CloudStorageConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. User-provided name for the Cloud Storage bucket.
   * The bucket must be created by the user. The bucket name must be without
   * any prefix like "gs://". See the [bucket naming
   * requirements] (https://cloud.google.com/storage/docs/buckets#naming).
   * </pre>
   *
   * <code>string bucket = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bucket.
   */
  java.lang.String getBucket();
  /**
   *
   *
   * <pre>
   * Required. User-provided name for the Cloud Storage bucket.
   * The bucket must be created by the user. The bucket name must be without
   * any prefix like "gs://". See the [bucket naming
   * requirements] (https://cloud.google.com/storage/docs/buckets#naming).
   * </pre>
   *
   * <code>string bucket = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for bucket.
   */
  com.google.protobuf.ByteString getBucketBytes();

  /**
   *
   *
   * <pre>
   * Optional. User-provided prefix for Cloud Storage filename. See the [object
   * naming requirements](https://cloud.google.com/storage/docs/objects#naming).
   * </pre>
   *
   * <code>string filename_prefix = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filenamePrefix.
   */
  java.lang.String getFilenamePrefix();
  /**
   *
   *
   * <pre>
   * Optional. User-provided prefix for Cloud Storage filename. See the [object
   * naming requirements](https://cloud.google.com/storage/docs/objects#naming).
   * </pre>
   *
   * <code>string filename_prefix = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filenamePrefix.
   */
  com.google.protobuf.ByteString getFilenamePrefixBytes();

  /**
   *
   *
   * <pre>
   * Optional. User-provided suffix for Cloud Storage filename. See the [object
   * naming requirements](https://cloud.google.com/storage/docs/objects#naming).
   * Must not end in "/".
   * </pre>
   *
   * <code>string filename_suffix = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filenameSuffix.
   */
  java.lang.String getFilenameSuffix();
  /**
   *
   *
   * <pre>
   * Optional. User-provided suffix for Cloud Storage filename. See the [object
   * naming requirements](https://cloud.google.com/storage/docs/objects#naming).
   * Must not end in "/".
   * </pre>
   *
   * <code>string filename_suffix = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filenameSuffix.
   */
  com.google.protobuf.ByteString getFilenameSuffixBytes();

  /**
   *
   *
   * <pre>
   * Optional. User-provided format string specifying how to represent datetimes
   * in Cloud Storage filenames. See the [datetime format
   * guidance](https://cloud.google.com/pubsub/docs/create-cloudstorage-subscription#file_names).
   * </pre>
   *
   * <code>string filename_datetime_format = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filenameDatetimeFormat.
   */
  java.lang.String getFilenameDatetimeFormat();
  /**
   *
   *
   * <pre>
   * Optional. User-provided format string specifying how to represent datetimes
   * in Cloud Storage filenames. See the [datetime format
   * guidance](https://cloud.google.com/pubsub/docs/create-cloudstorage-subscription#file_names).
   * </pre>
   *
   * <code>string filename_datetime_format = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filenameDatetimeFormat.
   */
  com.google.protobuf.ByteString getFilenameDatetimeFormatBytes();

  /**
   *
   *
   * <pre>
   * Optional. If set, message data will be written to Cloud Storage in text
   * format.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.CloudStorageConfig.TextConfig text_config = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the textConfig field is set.
   */
  boolean hasTextConfig();
  /**
   *
   *
   * <pre>
   * Optional. If set, message data will be written to Cloud Storage in text
   * format.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.CloudStorageConfig.TextConfig text_config = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The textConfig.
   */
  com.google.pubsub.v1.CloudStorageConfig.TextConfig getTextConfig();
  /**
   *
   *
   * <pre>
   * Optional. If set, message data will be written to Cloud Storage in text
   * format.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.CloudStorageConfig.TextConfig text_config = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.pubsub.v1.CloudStorageConfig.TextConfigOrBuilder getTextConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. If set, message data will be written to Cloud Storage in Avro
   * format.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.CloudStorageConfig.AvroConfig avro_config = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the avroConfig field is set.
   */
  boolean hasAvroConfig();
  /**
   *
   *
   * <pre>
   * Optional. If set, message data will be written to Cloud Storage in Avro
   * format.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.CloudStorageConfig.AvroConfig avro_config = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The avroConfig.
   */
  com.google.pubsub.v1.CloudStorageConfig.AvroConfig getAvroConfig();
  /**
   *
   *
   * <pre>
   * Optional. If set, message data will be written to Cloud Storage in Avro
   * format.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.CloudStorageConfig.AvroConfig avro_config = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.pubsub.v1.CloudStorageConfig.AvroConfigOrBuilder getAvroConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The maximum duration that can elapse before a new Cloud Storage
   * file is created. Min 1 minute, max 10 minutes, default 5 minutes. May not
   * exceed the subscription's acknowledgement deadline.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_duration = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the maxDuration field is set.
   */
  boolean hasMaxDuration();
  /**
   *
   *
   * <pre>
   * Optional. The maximum duration that can elapse before a new Cloud Storage
   * file is created. Min 1 minute, max 10 minutes, default 5 minutes. May not
   * exceed the subscription's acknowledgement deadline.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_duration = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The maxDuration.
   */
  com.google.protobuf.Duration getMaxDuration();
  /**
   *
   *
   * <pre>
   * Optional. The maximum duration that can elapse before a new Cloud Storage
   * file is created. Min 1 minute, max 10 minutes, default 5 minutes. May not
   * exceed the subscription's acknowledgement deadline.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_duration = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.DurationOrBuilder getMaxDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The maximum bytes that can be written to a Cloud Storage file
   * before a new file is created. Min 1 KB, max 10 GiB. The max_bytes limit may
   * be exceeded in cases where messages are larger than the limit.
   * </pre>
   *
   * <code>int64 max_bytes = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The maxBytes.
   */
  long getMaxBytes();

  /**
   *
   *
   * <pre>
   * Output only. An output-only field that indicates whether or not the
   * subscription can receive messages.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.CloudStorageConfig.State state = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. An output-only field that indicates whether or not the
   * subscription can receive messages.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.CloudStorageConfig.State state = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.pubsub.v1.CloudStorageConfig.State getState();

  com.google.pubsub.v1.CloudStorageConfig.OutputFormatCase getOutputFormatCase();
}
