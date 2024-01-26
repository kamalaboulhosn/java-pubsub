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

public interface ExpirationPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.ExpirationPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Specifies the "time-to-live" duration for an associated resource.
   * The resource expires if it is not active for a period of `ttl`. The
   * definition of "activity" depends on the type of the associated resource.
   * The minimum and maximum allowed values for `ttl` depend on the type of the
   * associated resource, as well. If `ttl` is not set, the associated resource
   * never expires.
   * </pre>
   *
   * <code>.google.protobuf.Duration ttl = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the ttl field is set.
   */
  boolean hasTtl();
  /**
   *
   *
   * <pre>
   * Optional. Specifies the "time-to-live" duration for an associated resource.
   * The resource expires if it is not active for a period of `ttl`. The
   * definition of "activity" depends on the type of the associated resource.
   * The minimum and maximum allowed values for `ttl` depend on the type of the
   * associated resource, as well. If `ttl` is not set, the associated resource
   * never expires.
   * </pre>
   *
   * <code>.google.protobuf.Duration ttl = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The ttl.
   */
  com.google.protobuf.Duration getTtl();
  /**
   *
   *
   * <pre>
   * Optional. Specifies the "time-to-live" duration for an associated resource.
   * The resource expires if it is not active for a period of `ttl`. The
   * definition of "activity" depends on the type of the associated resource.
   * The minimum and maximum allowed values for `ttl` depend on the type of the
   * associated resource, as well. If `ttl` is not set, the associated resource
   * never expires.
   * </pre>
   *
   * <code>.google.protobuf.Duration ttl = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.DurationOrBuilder getTtlOrBuilder();
}
