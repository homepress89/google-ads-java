// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/enums/call_conversion_reporting_state.proto

package com.google.ads.googleads.v6.enums;

/**
 * <pre>
 * Container for enum describing possible data types for call conversion
 * reporting state.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v6.enums.CallConversionReportingStateEnum}
 */
public final class CallConversionReportingStateEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v6.enums.CallConversionReportingStateEnum)
    CallConversionReportingStateEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CallConversionReportingStateEnum.newBuilder() to construct.
  private CallConversionReportingStateEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CallConversionReportingStateEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CallConversionReportingStateEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CallConversionReportingStateEnum(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v6.enums.CallConversionReportingStateProto.internal_static_google_ads_googleads_v6_enums_CallConversionReportingStateEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v6.enums.CallConversionReportingStateProto.internal_static_google_ads_googleads_v6_enums_CallConversionReportingStateEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum.class, com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum.Builder.class);
  }

  /**
   * <pre>
   * Possible data types for a call conversion action state.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v6.enums.CallConversionReportingStateEnum.CallConversionReportingState}
   */
  public enum CallConversionReportingState
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Call conversion action is disabled.
     * </pre>
     *
     * <code>DISABLED = 2;</code>
     */
    DISABLED(2),
    /**
     * <pre>
     * Call conversion action will use call conversion type set at the
     * account level.
     * </pre>
     *
     * <code>USE_ACCOUNT_LEVEL_CALL_CONVERSION_ACTION = 3;</code>
     */
    USE_ACCOUNT_LEVEL_CALL_CONVERSION_ACTION(3),
    /**
     * <pre>
     * Call conversion action will use call conversion type set at the resource
     * (call only ads/call extensions) level.
     * </pre>
     *
     * <code>USE_RESOURCE_LEVEL_CALL_CONVERSION_ACTION = 4;</code>
     */
    USE_RESOURCE_LEVEL_CALL_CONVERSION_ACTION(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Call conversion action is disabled.
     * </pre>
     *
     * <code>DISABLED = 2;</code>
     */
    public static final int DISABLED_VALUE = 2;
    /**
     * <pre>
     * Call conversion action will use call conversion type set at the
     * account level.
     * </pre>
     *
     * <code>USE_ACCOUNT_LEVEL_CALL_CONVERSION_ACTION = 3;</code>
     */
    public static final int USE_ACCOUNT_LEVEL_CALL_CONVERSION_ACTION_VALUE = 3;
    /**
     * <pre>
     * Call conversion action will use call conversion type set at the resource
     * (call only ads/call extensions) level.
     * </pre>
     *
     * <code>USE_RESOURCE_LEVEL_CALL_CONVERSION_ACTION = 4;</code>
     */
    public static final int USE_RESOURCE_LEVEL_CALL_CONVERSION_ACTION_VALUE = 4;


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
    public static CallConversionReportingState valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CallConversionReportingState forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return DISABLED;
        case 3: return USE_ACCOUNT_LEVEL_CALL_CONVERSION_ACTION;
        case 4: return USE_RESOURCE_LEVEL_CALL_CONVERSION_ACTION;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CallConversionReportingState>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CallConversionReportingState> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CallConversionReportingState>() {
            public CallConversionReportingState findValueByNumber(int number) {
              return CallConversionReportingState.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final CallConversionReportingState[] VALUES = values();

    public static CallConversionReportingState valueOf(
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

    private CallConversionReportingState(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v6.enums.CallConversionReportingStateEnum.CallConversionReportingState)
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum other = (com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum) obj;

    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Container for enum describing possible data types for call conversion
   * reporting state.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v6.enums.CallConversionReportingStateEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v6.enums.CallConversionReportingStateEnum)
      com.google.ads.googleads.v6.enums.CallConversionReportingStateEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v6.enums.CallConversionReportingStateProto.internal_static_google_ads_googleads_v6_enums_CallConversionReportingStateEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v6.enums.CallConversionReportingStateProto.internal_static_google_ads_googleads_v6_enums_CallConversionReportingStateEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum.class, com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v6.enums.CallConversionReportingStateProto.internal_static_google_ads_googleads_v6_enums_CallConversionReportingStateEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum build() {
      com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum buildPartial() {
      com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum result = new com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum) {
        return mergeFrom((com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum other) {
      if (other == com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v6.enums.CallConversionReportingStateEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v6.enums.CallConversionReportingStateEnum)
  private static final com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum();
  }

  public static com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CallConversionReportingStateEnum>
      PARSER = new com.google.protobuf.AbstractParser<CallConversionReportingStateEnum>() {
    @java.lang.Override
    public CallConversionReportingStateEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CallConversionReportingStateEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CallConversionReportingStateEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CallConversionReportingStateEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v6.enums.CallConversionReportingStateEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

