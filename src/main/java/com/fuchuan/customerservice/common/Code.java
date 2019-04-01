// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: customer-service.proto

package com.fuchuan.customerservice.common;

/**
 * Protobuf enum {@code com.fuchuan.customerservice.common.Code}
 */
public enum Code
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>OK = 0;</code>
   */
  OK(0),
  /**
   * <code>FAIL = -1;</code>
   */
  FAIL(-1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>OK = 0;</code>
   */
  public static final int OK_VALUE = 0;
  /**
   * <code>FAIL = -1;</code>
   */
  public static final int FAIL_VALUE = -1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Code valueOf(int value) {
    return forNumber(value);
  }

  public static Code forNumber(int value) {
    switch (value) {
      case 0: return OK;
      case -1: return FAIL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Code>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Code> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Code>() {
          public Code findValueByNumber(int number) {
            return Code.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.fuchuan.customerservice.common.CustomerServiceGrpc.getDescriptor().getEnumTypes().get(1);
  }

  private static final Code[] VALUES = values();

  public static Code valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Code(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.fuchuan.customerservice.common.Code)
}
