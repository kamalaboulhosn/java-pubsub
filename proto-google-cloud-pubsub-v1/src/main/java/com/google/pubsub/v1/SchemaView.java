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
// source: google/pubsub/v1/schema.proto

package com.google.pubsub.v1;

/**
 *
 *
 * <pre>
 * View of Schema object fields to be returned by GetSchema and ListSchemas.
 * </pre>
 *
 * Protobuf enum {@code google.pubsub.v1.SchemaView}
 */
public enum SchemaView implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * The default / unset value.
   * The API will default to the BASIC view.
   * </pre>
   *
   * <code>SCHEMA_VIEW_UNSPECIFIED = 0;</code>
   */
  SCHEMA_VIEW_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Include the name and type of the schema, but not the definition.
   * </pre>
   *
   * <code>BASIC = 1;</code>
   */
  BASIC(1),
  /**
   *
   *
   * <pre>
   * Include all Schema object fields.
   * </pre>
   *
   * <code>FULL = 2;</code>
   */
  FULL(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * The default / unset value.
   * The API will default to the BASIC view.
   * </pre>
   *
   * <code>SCHEMA_VIEW_UNSPECIFIED = 0;</code>
   */
  public static final int SCHEMA_VIEW_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Include the name and type of the schema, but not the definition.
   * </pre>
   *
   * <code>BASIC = 1;</code>
   */
  public static final int BASIC_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Include all Schema object fields.
   * </pre>
   *
   * <code>FULL = 2;</code>
   */
  public static final int FULL_VALUE = 2;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static SchemaView valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SchemaView forNumber(int value) {
    switch (value) {
      case 0:
        return SCHEMA_VIEW_UNSPECIFIED;
      case 1:
        return BASIC;
      case 2:
        return FULL;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SchemaView> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<SchemaView> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<SchemaView>() {
        public SchemaView findValueByNumber(int number) {
          return SchemaView.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.pubsub.v1.SchemaProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final SchemaView[] VALUES = values();

  public static SchemaView valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private SchemaView(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.pubsub.v1.SchemaView)
}
