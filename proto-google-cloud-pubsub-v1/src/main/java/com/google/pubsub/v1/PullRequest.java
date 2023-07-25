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

/**
 *
 *
 * <pre>
 * Request for the `Pull` method.
 * </pre>
 *
 * Protobuf type {@code google.pubsub.v1.PullRequest}
 */
public final class PullRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.pubsub.v1.PullRequest)
    PullRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PullRequest.newBuilder() to construct.
  private PullRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PullRequest() {
    subscription_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PullRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_PullRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.pubsub.v1.PubsubProto
        .internal_static_google_pubsub_v1_PullRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.pubsub.v1.PullRequest.class, com.google.pubsub.v1.PullRequest.Builder.class);
  }

  public static final int SUBSCRIPTION_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object subscription_ = "";
  /**
   *
   *
   * <pre>
   * Required. The subscription from which messages should be pulled.
   * Format is `projects/{project}/subscriptions/{sub}`.
   * </pre>
   *
   * <code>
   * string subscription = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The subscription.
   */
  @java.lang.Override
  public java.lang.String getSubscription() {
    java.lang.Object ref = subscription_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subscription_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The subscription from which messages should be pulled.
   * Format is `projects/{project}/subscriptions/{sub}`.
   * </pre>
   *
   * <code>
   * string subscription = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for subscription.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSubscriptionBytes() {
    java.lang.Object ref = subscription_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      subscription_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RETURN_IMMEDIATELY_FIELD_NUMBER = 2;
  private boolean returnImmediately_ = false;
  /**
   *
   *
   * <pre>
   * Optional. If this field set to true, the system will respond immediately
   * even if it there are no messages available to return in the `Pull`
   * response. Otherwise, the system may wait (for a bounded amount of time)
   * until at least one message is available, rather than returning no messages.
   * Warning: setting this field to `true` is discouraged because it adversely
   * impacts the performance of `Pull` operations. We recommend that users do
   * not set this field.
   * </pre>
   *
   * <code>bool return_immediately = 2 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @deprecated google.pubsub.v1.PullRequest.return_immediately is deprecated. See
   *     google/pubsub/v1/pubsub.proto;l=1222
   * @return The returnImmediately.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public boolean getReturnImmediately() {
    return returnImmediately_;
  }

  public static final int MAX_MESSAGES_FIELD_NUMBER = 3;
  private int maxMessages_ = 0;
  /**
   *
   *
   * <pre>
   * Required. The maximum number of messages to return for this request. Must
   * be a positive integer. The Pub/Sub system may return fewer than the number
   * specified.
   * </pre>
   *
   * <code>int32 max_messages = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The maxMessages.
   */
  @java.lang.Override
  public int getMaxMessages() {
    return maxMessages_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subscription_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, subscription_);
    }
    if (returnImmediately_ != false) {
      output.writeBool(2, returnImmediately_);
    }
    if (maxMessages_ != 0) {
      output.writeInt32(3, maxMessages_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subscription_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, subscription_);
    }
    if (returnImmediately_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, returnImmediately_);
    }
    if (maxMessages_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, maxMessages_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.pubsub.v1.PullRequest)) {
      return super.equals(obj);
    }
    com.google.pubsub.v1.PullRequest other = (com.google.pubsub.v1.PullRequest) obj;

    if (!getSubscription().equals(other.getSubscription())) return false;
    if (getReturnImmediately() != other.getReturnImmediately()) return false;
    if (getMaxMessages() != other.getMaxMessages()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SUBSCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getSubscription().hashCode();
    hash = (37 * hash) + RETURN_IMMEDIATELY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getReturnImmediately());
    hash = (37 * hash) + MAX_MESSAGES_FIELD_NUMBER;
    hash = (53 * hash) + getMaxMessages();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.pubsub.v1.PullRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.PullRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.PullRequest parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.PullRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.PullRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.PullRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.PullRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.PullRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.pubsub.v1.PullRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.PullRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.pubsub.v1.PullRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.PullRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.pubsub.v1.PullRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request for the `Pull` method.
   * </pre>
   *
   * Protobuf type {@code google.pubsub.v1.PullRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.pubsub.v1.PullRequest)
      com.google.pubsub.v1.PullRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_PullRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_PullRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.pubsub.v1.PullRequest.class,
              com.google.pubsub.v1.PullRequest.Builder.class);
    }

    // Construct using com.google.pubsub.v1.PullRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      subscription_ = "";
      returnImmediately_ = false;
      maxMessages_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_PullRequest_descriptor;
    }

    @java.lang.Override
    public com.google.pubsub.v1.PullRequest getDefaultInstanceForType() {
      return com.google.pubsub.v1.PullRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.pubsub.v1.PullRequest build() {
      com.google.pubsub.v1.PullRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.pubsub.v1.PullRequest buildPartial() {
      com.google.pubsub.v1.PullRequest result = new com.google.pubsub.v1.PullRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.pubsub.v1.PullRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.subscription_ = subscription_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.returnImmediately_ = returnImmediately_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.maxMessages_ = maxMessages_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.pubsub.v1.PullRequest) {
        return mergeFrom((com.google.pubsub.v1.PullRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.pubsub.v1.PullRequest other) {
      if (other == com.google.pubsub.v1.PullRequest.getDefaultInstance()) return this;
      if (!other.getSubscription().isEmpty()) {
        subscription_ = other.subscription_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getReturnImmediately() != false) {
        setReturnImmediately(other.getReturnImmediately());
      }
      if (other.getMaxMessages() != 0) {
        setMaxMessages(other.getMaxMessages());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                subscription_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                returnImmediately_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                maxMessages_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object subscription_ = "";
    /**
     *
     *
     * <pre>
     * Required. The subscription from which messages should be pulled.
     * Format is `projects/{project}/subscriptions/{sub}`.
     * </pre>
     *
     * <code>
     * string subscription = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The subscription.
     */
    public java.lang.String getSubscription() {
      java.lang.Object ref = subscription_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subscription_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The subscription from which messages should be pulled.
     * Format is `projects/{project}/subscriptions/{sub}`.
     * </pre>
     *
     * <code>
     * string subscription = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for subscription.
     */
    public com.google.protobuf.ByteString getSubscriptionBytes() {
      java.lang.Object ref = subscription_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        subscription_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The subscription from which messages should be pulled.
     * Format is `projects/{project}/subscriptions/{sub}`.
     * </pre>
     *
     * <code>
     * string subscription = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The subscription to set.
     * @return This builder for chaining.
     */
    public Builder setSubscription(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      subscription_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The subscription from which messages should be pulled.
     * Format is `projects/{project}/subscriptions/{sub}`.
     * </pre>
     *
     * <code>
     * string subscription = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSubscription() {
      subscription_ = getDefaultInstance().getSubscription();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The subscription from which messages should be pulled.
     * Format is `projects/{project}/subscriptions/{sub}`.
     * </pre>
     *
     * <code>
     * string subscription = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for subscription to set.
     * @return This builder for chaining.
     */
    public Builder setSubscriptionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      subscription_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean returnImmediately_;
    /**
     *
     *
     * <pre>
     * Optional. If this field set to true, the system will respond immediately
     * even if it there are no messages available to return in the `Pull`
     * response. Otherwise, the system may wait (for a bounded amount of time)
     * until at least one message is available, rather than returning no messages.
     * Warning: setting this field to `true` is discouraged because it adversely
     * impacts the performance of `Pull` operations. We recommend that users do
     * not set this field.
     * </pre>
     *
     * <code>
     * bool return_immediately = 2 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @deprecated google.pubsub.v1.PullRequest.return_immediately is deprecated. See
     *     google/pubsub/v1/pubsub.proto;l=1222
     * @return The returnImmediately.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public boolean getReturnImmediately() {
      return returnImmediately_;
    }
    /**
     *
     *
     * <pre>
     * Optional. If this field set to true, the system will respond immediately
     * even if it there are no messages available to return in the `Pull`
     * response. Otherwise, the system may wait (for a bounded amount of time)
     * until at least one message is available, rather than returning no messages.
     * Warning: setting this field to `true` is discouraged because it adversely
     * impacts the performance of `Pull` operations. We recommend that users do
     * not set this field.
     * </pre>
     *
     * <code>
     * bool return_immediately = 2 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @deprecated google.pubsub.v1.PullRequest.return_immediately is deprecated. See
     *     google/pubsub/v1/pubsub.proto;l=1222
     * @param value The returnImmediately to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setReturnImmediately(boolean value) {

      returnImmediately_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. If this field set to true, the system will respond immediately
     * even if it there are no messages available to return in the `Pull`
     * response. Otherwise, the system may wait (for a bounded amount of time)
     * until at least one message is available, rather than returning no messages.
     * Warning: setting this field to `true` is discouraged because it adversely
     * impacts the performance of `Pull` operations. We recommend that users do
     * not set this field.
     * </pre>
     *
     * <code>
     * bool return_immediately = 2 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @deprecated google.pubsub.v1.PullRequest.return_immediately is deprecated. See
     *     google/pubsub/v1/pubsub.proto;l=1222
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder clearReturnImmediately() {
      bitField0_ = (bitField0_ & ~0x00000002);
      returnImmediately_ = false;
      onChanged();
      return this;
    }

    private int maxMessages_;
    /**
     *
     *
     * <pre>
     * Required. The maximum number of messages to return for this request. Must
     * be a positive integer. The Pub/Sub system may return fewer than the number
     * specified.
     * </pre>
     *
     * <code>int32 max_messages = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The maxMessages.
     */
    @java.lang.Override
    public int getMaxMessages() {
      return maxMessages_;
    }
    /**
     *
     *
     * <pre>
     * Required. The maximum number of messages to return for this request. Must
     * be a positive integer. The Pub/Sub system may return fewer than the number
     * specified.
     * </pre>
     *
     * <code>int32 max_messages = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The maxMessages to set.
     * @return This builder for chaining.
     */
    public Builder setMaxMessages(int value) {

      maxMessages_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The maximum number of messages to return for this request. Must
     * be a positive integer. The Pub/Sub system may return fewer than the number
     * specified.
     * </pre>
     *
     * <code>int32 max_messages = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaxMessages() {
      bitField0_ = (bitField0_ & ~0x00000004);
      maxMessages_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.pubsub.v1.PullRequest)
  }

  // @@protoc_insertion_point(class_scope:google.pubsub.v1.PullRequest)
  private static final com.google.pubsub.v1.PullRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.pubsub.v1.PullRequest();
  }

  public static com.google.pubsub.v1.PullRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PullRequest> PARSER =
      new com.google.protobuf.AbstractParser<PullRequest>() {
        @java.lang.Override
        public PullRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<PullRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PullRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.pubsub.v1.PullRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
