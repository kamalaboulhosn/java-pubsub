/*
 * Copyright 2023 Google LLC
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

public interface ListSnapshotsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.ListSnapshotsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resulting snapshots.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.Snapshot snapshots = 1;</code>
   */
  java.util.List<com.google.pubsub.v1.Snapshot> getSnapshotsList();
  /**
   *
   *
   * <pre>
   * The resulting snapshots.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.Snapshot snapshots = 1;</code>
   */
  com.google.pubsub.v1.Snapshot getSnapshots(int index);
  /**
   *
   *
   * <pre>
   * The resulting snapshots.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.Snapshot snapshots = 1;</code>
   */
  int getSnapshotsCount();
  /**
   *
   *
   * <pre>
   * The resulting snapshots.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.Snapshot snapshots = 1;</code>
   */
  java.util.List<? extends com.google.pubsub.v1.SnapshotOrBuilder> getSnapshotsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The resulting snapshots.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.Snapshot snapshots = 1;</code>
   */
  com.google.pubsub.v1.SnapshotOrBuilder getSnapshotsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If not empty, indicates that there may be more snapshot that match the
   * request; this value should be passed in a new `ListSnapshotsRequest`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * If not empty, indicates that there may be more snapshot that match the
   * request; this value should be passed in a new `ListSnapshotsRequest`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
