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

/**
 *
 *
 * <pre>
 * Response for the `ListTopicSnapshots` method.
 * </pre>
 *
 * Protobuf type {@code google.pubsub.v1.ListTopicSnapshotsResponse}
 */
public final class ListTopicSnapshotsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.pubsub.v1.ListTopicSnapshotsResponse)
    ListTopicSnapshotsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListTopicSnapshotsResponse.newBuilder() to construct.
  private ListTopicSnapshotsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListTopicSnapshotsResponse() {
    snapshots_ = com.google.protobuf.LazyStringArrayList.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListTopicSnapshotsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.pubsub.v1.PubsubProto
        .internal_static_google_pubsub_v1_ListTopicSnapshotsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.pubsub.v1.PubsubProto
        .internal_static_google_pubsub_v1_ListTopicSnapshotsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.pubsub.v1.ListTopicSnapshotsResponse.class,
            com.google.pubsub.v1.ListTopicSnapshotsResponse.Builder.class);
  }

  public static final int SNAPSHOTS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList snapshots_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * Optional. The names of the snapshots that match the request.
   * </pre>
   *
   * <code>repeated string snapshots = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the snapshots.
   */
  public com.google.protobuf.ProtocolStringList getSnapshotsList() {
    return snapshots_;
  }
  /**
   *
   *
   * <pre>
   * Optional. The names of the snapshots that match the request.
   * </pre>
   *
   * <code>repeated string snapshots = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of snapshots.
   */
  public int getSnapshotsCount() {
    return snapshots_.size();
  }
  /**
   *
   *
   * <pre>
   * Optional. The names of the snapshots that match the request.
   * </pre>
   *
   * <code>repeated string snapshots = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The snapshots at the given index.
   */
  public java.lang.String getSnapshots(int index) {
    return snapshots_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Optional. The names of the snapshots that match the request.
   * </pre>
   *
   * <code>repeated string snapshots = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the snapshots at the given index.
   */
  public com.google.protobuf.ByteString getSnapshotsBytes(int index) {
    return snapshots_.getByteString(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * Optional. If not empty, indicates that there may be more snapshots that
   * match the request; this value should be passed in a new
   * `ListTopicSnapshotsRequest` to get more snapshots.
   * </pre>
   *
   * <code>string next_page_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. If not empty, indicates that there may be more snapshots that
   * match the request; this value should be passed in a new
   * `ListTopicSnapshotsRequest` to get more snapshots.
   * </pre>
   *
   * <code>string next_page_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < snapshots_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, snapshots_.getRaw(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < snapshots_.size(); i++) {
        dataSize += computeStringSizeNoTag(snapshots_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getSnapshotsList().size();
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.pubsub.v1.ListTopicSnapshotsResponse)) {
      return super.equals(obj);
    }
    com.google.pubsub.v1.ListTopicSnapshotsResponse other =
        (com.google.pubsub.v1.ListTopicSnapshotsResponse) obj;

    if (!getSnapshotsList().equals(other.getSnapshotsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getSnapshotsCount() > 0) {
      hash = (37 * hash) + SNAPSHOTS_FIELD_NUMBER;
      hash = (53 * hash) + getSnapshotsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.pubsub.v1.ListTopicSnapshotsResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.ListTopicSnapshotsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.ListTopicSnapshotsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.ListTopicSnapshotsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.ListTopicSnapshotsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.ListTopicSnapshotsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.ListTopicSnapshotsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.ListTopicSnapshotsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.pubsub.v1.ListTopicSnapshotsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.ListTopicSnapshotsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.pubsub.v1.ListTopicSnapshotsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.ListTopicSnapshotsResponse parseFrom(
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

  public static Builder newBuilder(com.google.pubsub.v1.ListTopicSnapshotsResponse prototype) {
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
   * Response for the `ListTopicSnapshots` method.
   * </pre>
   *
   * Protobuf type {@code google.pubsub.v1.ListTopicSnapshotsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.pubsub.v1.ListTopicSnapshotsResponse)
      com.google.pubsub.v1.ListTopicSnapshotsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_ListTopicSnapshotsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_ListTopicSnapshotsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.pubsub.v1.ListTopicSnapshotsResponse.class,
              com.google.pubsub.v1.ListTopicSnapshotsResponse.Builder.class);
    }

    // Construct using com.google.pubsub.v1.ListTopicSnapshotsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      snapshots_ = com.google.protobuf.LazyStringArrayList.emptyList();
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_ListTopicSnapshotsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.pubsub.v1.ListTopicSnapshotsResponse getDefaultInstanceForType() {
      return com.google.pubsub.v1.ListTopicSnapshotsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.pubsub.v1.ListTopicSnapshotsResponse build() {
      com.google.pubsub.v1.ListTopicSnapshotsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.pubsub.v1.ListTopicSnapshotsResponse buildPartial() {
      com.google.pubsub.v1.ListTopicSnapshotsResponse result =
          new com.google.pubsub.v1.ListTopicSnapshotsResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.pubsub.v1.ListTopicSnapshotsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        snapshots_.makeImmutable();
        result.snapshots_ = snapshots_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.pubsub.v1.ListTopicSnapshotsResponse) {
        return mergeFrom((com.google.pubsub.v1.ListTopicSnapshotsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.pubsub.v1.ListTopicSnapshotsResponse other) {
      if (other == com.google.pubsub.v1.ListTopicSnapshotsResponse.getDefaultInstance())
        return this;
      if (!other.snapshots_.isEmpty()) {
        if (snapshots_.isEmpty()) {
          snapshots_ = other.snapshots_;
          bitField0_ |= 0x00000001;
        } else {
          ensureSnapshotsIsMutable();
          snapshots_.addAll(other.snapshots_);
        }
        onChanged();
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
        onChanged();
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
                java.lang.String s = input.readStringRequireUtf8();
                ensureSnapshotsIsMutable();
                snapshots_.add(s);
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private com.google.protobuf.LazyStringArrayList snapshots_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureSnapshotsIsMutable() {
      if (!snapshots_.isModifiable()) {
        snapshots_ = new com.google.protobuf.LazyStringArrayList(snapshots_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     *
     *
     * <pre>
     * Optional. The names of the snapshots that match the request.
     * </pre>
     *
     * <code>repeated string snapshots = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return A list containing the snapshots.
     */
    public com.google.protobuf.ProtocolStringList getSnapshotsList() {
      snapshots_.makeImmutable();
      return snapshots_;
    }
    /**
     *
     *
     * <pre>
     * Optional. The names of the snapshots that match the request.
     * </pre>
     *
     * <code>repeated string snapshots = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The count of snapshots.
     */
    public int getSnapshotsCount() {
      return snapshots_.size();
    }
    /**
     *
     *
     * <pre>
     * Optional. The names of the snapshots that match the request.
     * </pre>
     *
     * <code>repeated string snapshots = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param index The index of the element to return.
     * @return The snapshots at the given index.
     */
    public java.lang.String getSnapshots(int index) {
      return snapshots_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Optional. The names of the snapshots that match the request.
     * </pre>
     *
     * <code>repeated string snapshots = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the snapshots at the given index.
     */
    public com.google.protobuf.ByteString getSnapshotsBytes(int index) {
      return snapshots_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Optional. The names of the snapshots that match the request.
     * </pre>
     *
     * <code>repeated string snapshots = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param index The index to set the value at.
     * @param value The snapshots to set.
     * @return This builder for chaining.
     */
    public Builder setSnapshots(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureSnapshotsIsMutable();
      snapshots_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The names of the snapshots that match the request.
     * </pre>
     *
     * <code>repeated string snapshots = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The snapshots to add.
     * @return This builder for chaining.
     */
    public Builder addSnapshots(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureSnapshotsIsMutable();
      snapshots_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The names of the snapshots that match the request.
     * </pre>
     *
     * <code>repeated string snapshots = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param values The snapshots to add.
     * @return This builder for chaining.
     */
    public Builder addAllSnapshots(java.lang.Iterable<java.lang.String> values) {
      ensureSnapshotsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, snapshots_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The names of the snapshots that match the request.
     * </pre>
     *
     * <code>repeated string snapshots = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSnapshots() {
      snapshots_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The names of the snapshots that match the request.
     * </pre>
     *
     * <code>repeated string snapshots = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes of the snapshots to add.
     * @return This builder for chaining.
     */
    public Builder addSnapshotsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureSnapshotsIsMutable();
      snapshots_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Optional. If not empty, indicates that there may be more snapshots that
     * match the request; this value should be passed in a new
     * `ListTopicSnapshotsRequest` to get more snapshots.
     * </pre>
     *
     * <code>string next_page_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. If not empty, indicates that there may be more snapshots that
     * match the request; this value should be passed in a new
     * `ListTopicSnapshotsRequest` to get more snapshots.
     * </pre>
     *
     * <code>string next_page_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. If not empty, indicates that there may be more snapshots that
     * match the request; this value should be passed in a new
     * `ListTopicSnapshotsRequest` to get more snapshots.
     * </pre>
     *
     * <code>string next_page_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. If not empty, indicates that there may be more snapshots that
     * match the request; this value should be passed in a new
     * `ListTopicSnapshotsRequest` to get more snapshots.
     * </pre>
     *
     * <code>string next_page_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. If not empty, indicates that there may be more snapshots that
     * match the request; this value should be passed in a new
     * `ListTopicSnapshotsRequest` to get more snapshots.
     * </pre>
     *
     * <code>string next_page_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.pubsub.v1.ListTopicSnapshotsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.pubsub.v1.ListTopicSnapshotsResponse)
  private static final com.google.pubsub.v1.ListTopicSnapshotsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.pubsub.v1.ListTopicSnapshotsResponse();
  }

  public static com.google.pubsub.v1.ListTopicSnapshotsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListTopicSnapshotsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListTopicSnapshotsResponse>() {
        @java.lang.Override
        public ListTopicSnapshotsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListTopicSnapshotsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListTopicSnapshotsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.pubsub.v1.ListTopicSnapshotsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
