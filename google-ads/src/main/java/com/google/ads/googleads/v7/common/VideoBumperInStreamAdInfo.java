// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/common/ad_type_infos.proto

package com.google.ads.googleads.v7.common;

/**
 * <pre>
 * Representation of video bumper in-stream ad format (very short in-stream
 * non-skippable video ad).
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v7.common.VideoBumperInStreamAdInfo}
 */
public final class VideoBumperInStreamAdInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v7.common.VideoBumperInStreamAdInfo)
    VideoBumperInStreamAdInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VideoBumperInStreamAdInfo.newBuilder() to construct.
  private VideoBumperInStreamAdInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VideoBumperInStreamAdInfo() {
    companionBanner_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VideoBumperInStreamAdInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VideoBumperInStreamAdInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            companionBanner_ = s;
            break;
          }
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
    return com.google.ads.googleads.v7.common.AdTypeInfosProto.internal_static_google_ads_googleads_v7_common_VideoBumperInStreamAdInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v7.common.AdTypeInfosProto.internal_static_google_ads_googleads_v7_common_VideoBumperInStreamAdInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo.class, com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo.Builder.class);
  }

  private int bitField0_;
  public static final int COMPANION_BANNER_FIELD_NUMBER = 2;
  private volatile java.lang.Object companionBanner_;
  /**
   * <pre>
   * The MediaFile resource name of the companion banner used with the ad.
   * </pre>
   *
   * <code>string companion_banner = 2;</code>
   * @return Whether the companionBanner field is set.
   */
  @java.lang.Override
  public boolean hasCompanionBanner() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The MediaFile resource name of the companion banner used with the ad.
   * </pre>
   *
   * <code>string companion_banner = 2;</code>
   * @return The companionBanner.
   */
  @java.lang.Override
  public java.lang.String getCompanionBanner() {
    java.lang.Object ref = companionBanner_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      companionBanner_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The MediaFile resource name of the companion banner used with the ad.
   * </pre>
   *
   * <code>string companion_banner = 2;</code>
   * @return The bytes for companionBanner.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCompanionBannerBytes() {
    java.lang.Object ref = companionBanner_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      companionBanner_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, companionBanner_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, companionBanner_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo other = (com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo) obj;

    if (hasCompanionBanner() != other.hasCompanionBanner()) return false;
    if (hasCompanionBanner()) {
      if (!getCompanionBanner()
          .equals(other.getCompanionBanner())) return false;
    }
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
    if (hasCompanionBanner()) {
      hash = (37 * hash) + COMPANION_BANNER_FIELD_NUMBER;
      hash = (53 * hash) + getCompanionBanner().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo prototype) {
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
   * Representation of video bumper in-stream ad format (very short in-stream
   * non-skippable video ad).
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v7.common.VideoBumperInStreamAdInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v7.common.VideoBumperInStreamAdInfo)
      com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v7.common.AdTypeInfosProto.internal_static_google_ads_googleads_v7_common_VideoBumperInStreamAdInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v7.common.AdTypeInfosProto.internal_static_google_ads_googleads_v7_common_VideoBumperInStreamAdInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo.class, com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo.newBuilder()
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
      companionBanner_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v7.common.AdTypeInfosProto.internal_static_google_ads_googleads_v7_common_VideoBumperInStreamAdInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo build() {
      com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo buildPartial() {
      com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo result = new com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.companionBanner_ = companionBanner_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo) {
        return mergeFrom((com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo other) {
      if (other == com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo.getDefaultInstance()) return this;
      if (other.hasCompanionBanner()) {
        bitField0_ |= 0x00000001;
        companionBanner_ = other.companionBanner_;
        onChanged();
      }
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
      com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object companionBanner_ = "";
    /**
     * <pre>
     * The MediaFile resource name of the companion banner used with the ad.
     * </pre>
     *
     * <code>string companion_banner = 2;</code>
     * @return Whether the companionBanner field is set.
     */
    public boolean hasCompanionBanner() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The MediaFile resource name of the companion banner used with the ad.
     * </pre>
     *
     * <code>string companion_banner = 2;</code>
     * @return The companionBanner.
     */
    public java.lang.String getCompanionBanner() {
      java.lang.Object ref = companionBanner_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        companionBanner_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The MediaFile resource name of the companion banner used with the ad.
     * </pre>
     *
     * <code>string companion_banner = 2;</code>
     * @return The bytes for companionBanner.
     */
    public com.google.protobuf.ByteString
        getCompanionBannerBytes() {
      java.lang.Object ref = companionBanner_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        companionBanner_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The MediaFile resource name of the companion banner used with the ad.
     * </pre>
     *
     * <code>string companion_banner = 2;</code>
     * @param value The companionBanner to set.
     * @return This builder for chaining.
     */
    public Builder setCompanionBanner(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      companionBanner_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The MediaFile resource name of the companion banner used with the ad.
     * </pre>
     *
     * <code>string companion_banner = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCompanionBanner() {
      bitField0_ = (bitField0_ & ~0x00000001);
      companionBanner_ = getDefaultInstance().getCompanionBanner();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The MediaFile resource name of the companion banner used with the ad.
     * </pre>
     *
     * <code>string companion_banner = 2;</code>
     * @param value The bytes for companionBanner to set.
     * @return This builder for chaining.
     */
    public Builder setCompanionBannerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      companionBanner_ = value;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v7.common.VideoBumperInStreamAdInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v7.common.VideoBumperInStreamAdInfo)
  private static final com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo();
  }

  public static com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VideoBumperInStreamAdInfo>
      PARSER = new com.google.protobuf.AbstractParser<VideoBumperInStreamAdInfo>() {
    @java.lang.Override
    public VideoBumperInStreamAdInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VideoBumperInStreamAdInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VideoBumperInStreamAdInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VideoBumperInStreamAdInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v7.common.VideoBumperInStreamAdInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

