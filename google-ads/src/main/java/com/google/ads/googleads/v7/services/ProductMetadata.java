// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/services/reach_plan_service.proto

package com.google.ads.googleads.v7.services;

/**
 * <pre>
 * The metadata associated with an available plannable product.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v7.services.ProductMetadata}
 */
public final class ProductMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v7.services.ProductMetadata)
    ProductMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProductMetadata.newBuilder() to construct.
  private ProductMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductMetadata() {
    plannableProductCode_ = "";
    plannableProductName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProductMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProductMetadata(
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
            com.google.ads.googleads.v7.services.PlannableTargeting.Builder subBuilder = null;
            if (plannableTargeting_ != null) {
              subBuilder = plannableTargeting_.toBuilder();
            }
            plannableTargeting_ = input.readMessage(com.google.ads.googleads.v7.services.PlannableTargeting.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(plannableTargeting_);
              plannableTargeting_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            plannableProductName_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            plannableProductCode_ = s;
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
    return com.google.ads.googleads.v7.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v7_services_ProductMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v7.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v7_services_ProductMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v7.services.ProductMetadata.class, com.google.ads.googleads.v7.services.ProductMetadata.Builder.class);
  }

  private int bitField0_;
  public static final int PLANNABLE_PRODUCT_CODE_FIELD_NUMBER = 4;
  private volatile java.lang.Object plannableProductCode_;
  /**
   * <pre>
   * The code associated with the ad product. E.g. BUMPER, TRUEVIEW_IN_STREAM
   * To list the available plannable product codes use ListPlannableProducts.
   * </pre>
   *
   * <code>string plannable_product_code = 4;</code>
   * @return Whether the plannableProductCode field is set.
   */
  @java.lang.Override
  public boolean hasPlannableProductCode() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The code associated with the ad product. E.g. BUMPER, TRUEVIEW_IN_STREAM
   * To list the available plannable product codes use ListPlannableProducts.
   * </pre>
   *
   * <code>string plannable_product_code = 4;</code>
   * @return The plannableProductCode.
   */
  @java.lang.Override
  public java.lang.String getPlannableProductCode() {
    java.lang.Object ref = plannableProductCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      plannableProductCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The code associated with the ad product. E.g. BUMPER, TRUEVIEW_IN_STREAM
   * To list the available plannable product codes use ListPlannableProducts.
   * </pre>
   *
   * <code>string plannable_product_code = 4;</code>
   * @return The bytes for plannableProductCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPlannableProductCodeBytes() {
    java.lang.Object ref = plannableProductCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      plannableProductCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PLANNABLE_PRODUCT_NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object plannableProductName_;
  /**
   * <pre>
   * The name associated with the ad product.
   * </pre>
   *
   * <code>string plannable_product_name = 3;</code>
   * @return The plannableProductName.
   */
  @java.lang.Override
  public java.lang.String getPlannableProductName() {
    java.lang.Object ref = plannableProductName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      plannableProductName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name associated with the ad product.
   * </pre>
   *
   * <code>string plannable_product_name = 3;</code>
   * @return The bytes for plannableProductName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPlannableProductNameBytes() {
    java.lang.Object ref = plannableProductName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      plannableProductName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PLANNABLE_TARGETING_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v7.services.PlannableTargeting plannableTargeting_;
  /**
   * <pre>
   * The allowed plannable targeting for this product.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.services.PlannableTargeting plannable_targeting = 2;</code>
   * @return Whether the plannableTargeting field is set.
   */
  @java.lang.Override
  public boolean hasPlannableTargeting() {
    return plannableTargeting_ != null;
  }
  /**
   * <pre>
   * The allowed plannable targeting for this product.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.services.PlannableTargeting plannable_targeting = 2;</code>
   * @return The plannableTargeting.
   */
  @java.lang.Override
  public com.google.ads.googleads.v7.services.PlannableTargeting getPlannableTargeting() {
    return plannableTargeting_ == null ? com.google.ads.googleads.v7.services.PlannableTargeting.getDefaultInstance() : plannableTargeting_;
  }
  /**
   * <pre>
   * The allowed plannable targeting for this product.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.services.PlannableTargeting plannable_targeting = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v7.services.PlannableTargetingOrBuilder getPlannableTargetingOrBuilder() {
    return getPlannableTargeting();
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
    if (plannableTargeting_ != null) {
      output.writeMessage(2, getPlannableTargeting());
    }
    if (!getPlannableProductNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, plannableProductName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, plannableProductCode_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (plannableTargeting_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPlannableTargeting());
    }
    if (!getPlannableProductNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, plannableProductName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, plannableProductCode_);
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
    if (!(obj instanceof com.google.ads.googleads.v7.services.ProductMetadata)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v7.services.ProductMetadata other = (com.google.ads.googleads.v7.services.ProductMetadata) obj;

    if (hasPlannableProductCode() != other.hasPlannableProductCode()) return false;
    if (hasPlannableProductCode()) {
      if (!getPlannableProductCode()
          .equals(other.getPlannableProductCode())) return false;
    }
    if (!getPlannableProductName()
        .equals(other.getPlannableProductName())) return false;
    if (hasPlannableTargeting() != other.hasPlannableTargeting()) return false;
    if (hasPlannableTargeting()) {
      if (!getPlannableTargeting()
          .equals(other.getPlannableTargeting())) return false;
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
    if (hasPlannableProductCode()) {
      hash = (37 * hash) + PLANNABLE_PRODUCT_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getPlannableProductCode().hashCode();
    }
    hash = (37 * hash) + PLANNABLE_PRODUCT_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getPlannableProductName().hashCode();
    if (hasPlannableTargeting()) {
      hash = (37 * hash) + PLANNABLE_TARGETING_FIELD_NUMBER;
      hash = (53 * hash) + getPlannableTargeting().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v7.services.ProductMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.services.ProductMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.ProductMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.services.ProductMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.ProductMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.services.ProductMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.ProductMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.services.ProductMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.ProductMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.services.ProductMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.ProductMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.services.ProductMetadata parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v7.services.ProductMetadata prototype) {
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
   * The metadata associated with an available plannable product.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v7.services.ProductMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v7.services.ProductMetadata)
      com.google.ads.googleads.v7.services.ProductMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v7.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v7_services_ProductMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v7.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v7_services_ProductMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v7.services.ProductMetadata.class, com.google.ads.googleads.v7.services.ProductMetadata.Builder.class);
    }

    // Construct using com.google.ads.googleads.v7.services.ProductMetadata.newBuilder()
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
      plannableProductCode_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      plannableProductName_ = "";

      if (plannableTargetingBuilder_ == null) {
        plannableTargeting_ = null;
      } else {
        plannableTargeting_ = null;
        plannableTargetingBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v7.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v7_services_ProductMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.services.ProductMetadata getDefaultInstanceForType() {
      return com.google.ads.googleads.v7.services.ProductMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.services.ProductMetadata build() {
      com.google.ads.googleads.v7.services.ProductMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.services.ProductMetadata buildPartial() {
      com.google.ads.googleads.v7.services.ProductMetadata result = new com.google.ads.googleads.v7.services.ProductMetadata(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.plannableProductCode_ = plannableProductCode_;
      result.plannableProductName_ = plannableProductName_;
      if (plannableTargetingBuilder_ == null) {
        result.plannableTargeting_ = plannableTargeting_;
      } else {
        result.plannableTargeting_ = plannableTargetingBuilder_.build();
      }
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
      if (other instanceof com.google.ads.googleads.v7.services.ProductMetadata) {
        return mergeFrom((com.google.ads.googleads.v7.services.ProductMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v7.services.ProductMetadata other) {
      if (other == com.google.ads.googleads.v7.services.ProductMetadata.getDefaultInstance()) return this;
      if (other.hasPlannableProductCode()) {
        bitField0_ |= 0x00000001;
        plannableProductCode_ = other.plannableProductCode_;
        onChanged();
      }
      if (!other.getPlannableProductName().isEmpty()) {
        plannableProductName_ = other.plannableProductName_;
        onChanged();
      }
      if (other.hasPlannableTargeting()) {
        mergePlannableTargeting(other.getPlannableTargeting());
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
      com.google.ads.googleads.v7.services.ProductMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v7.services.ProductMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object plannableProductCode_ = "";
    /**
     * <pre>
     * The code associated with the ad product. E.g. BUMPER, TRUEVIEW_IN_STREAM
     * To list the available plannable product codes use ListPlannableProducts.
     * </pre>
     *
     * <code>string plannable_product_code = 4;</code>
     * @return Whether the plannableProductCode field is set.
     */
    public boolean hasPlannableProductCode() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The code associated with the ad product. E.g. BUMPER, TRUEVIEW_IN_STREAM
     * To list the available plannable product codes use ListPlannableProducts.
     * </pre>
     *
     * <code>string plannable_product_code = 4;</code>
     * @return The plannableProductCode.
     */
    public java.lang.String getPlannableProductCode() {
      java.lang.Object ref = plannableProductCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        plannableProductCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The code associated with the ad product. E.g. BUMPER, TRUEVIEW_IN_STREAM
     * To list the available plannable product codes use ListPlannableProducts.
     * </pre>
     *
     * <code>string plannable_product_code = 4;</code>
     * @return The bytes for plannableProductCode.
     */
    public com.google.protobuf.ByteString
        getPlannableProductCodeBytes() {
      java.lang.Object ref = plannableProductCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        plannableProductCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The code associated with the ad product. E.g. BUMPER, TRUEVIEW_IN_STREAM
     * To list the available plannable product codes use ListPlannableProducts.
     * </pre>
     *
     * <code>string plannable_product_code = 4;</code>
     * @param value The plannableProductCode to set.
     * @return This builder for chaining.
     */
    public Builder setPlannableProductCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      plannableProductCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The code associated with the ad product. E.g. BUMPER, TRUEVIEW_IN_STREAM
     * To list the available plannable product codes use ListPlannableProducts.
     * </pre>
     *
     * <code>string plannable_product_code = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlannableProductCode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      plannableProductCode_ = getDefaultInstance().getPlannableProductCode();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The code associated with the ad product. E.g. BUMPER, TRUEVIEW_IN_STREAM
     * To list the available plannable product codes use ListPlannableProducts.
     * </pre>
     *
     * <code>string plannable_product_code = 4;</code>
     * @param value The bytes for plannableProductCode to set.
     * @return This builder for chaining.
     */
    public Builder setPlannableProductCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      plannableProductCode_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object plannableProductName_ = "";
    /**
     * <pre>
     * The name associated with the ad product.
     * </pre>
     *
     * <code>string plannable_product_name = 3;</code>
     * @return The plannableProductName.
     */
    public java.lang.String getPlannableProductName() {
      java.lang.Object ref = plannableProductName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        plannableProductName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name associated with the ad product.
     * </pre>
     *
     * <code>string plannable_product_name = 3;</code>
     * @return The bytes for plannableProductName.
     */
    public com.google.protobuf.ByteString
        getPlannableProductNameBytes() {
      java.lang.Object ref = plannableProductName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        plannableProductName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name associated with the ad product.
     * </pre>
     *
     * <code>string plannable_product_name = 3;</code>
     * @param value The plannableProductName to set.
     * @return This builder for chaining.
     */
    public Builder setPlannableProductName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      plannableProductName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name associated with the ad product.
     * </pre>
     *
     * <code>string plannable_product_name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlannableProductName() {
      
      plannableProductName_ = getDefaultInstance().getPlannableProductName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name associated with the ad product.
     * </pre>
     *
     * <code>string plannable_product_name = 3;</code>
     * @param value The bytes for plannableProductName to set.
     * @return This builder for chaining.
     */
    public Builder setPlannableProductNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      plannableProductName_ = value;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v7.services.PlannableTargeting plannableTargeting_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v7.services.PlannableTargeting, com.google.ads.googleads.v7.services.PlannableTargeting.Builder, com.google.ads.googleads.v7.services.PlannableTargetingOrBuilder> plannableTargetingBuilder_;
    /**
     * <pre>
     * The allowed plannable targeting for this product.
     * </pre>
     *
     * <code>.google.ads.googleads.v7.services.PlannableTargeting plannable_targeting = 2;</code>
     * @return Whether the plannableTargeting field is set.
     */
    public boolean hasPlannableTargeting() {
      return plannableTargetingBuilder_ != null || plannableTargeting_ != null;
    }
    /**
     * <pre>
     * The allowed plannable targeting for this product.
     * </pre>
     *
     * <code>.google.ads.googleads.v7.services.PlannableTargeting plannable_targeting = 2;</code>
     * @return The plannableTargeting.
     */
    public com.google.ads.googleads.v7.services.PlannableTargeting getPlannableTargeting() {
      if (plannableTargetingBuilder_ == null) {
        return plannableTargeting_ == null ? com.google.ads.googleads.v7.services.PlannableTargeting.getDefaultInstance() : plannableTargeting_;
      } else {
        return plannableTargetingBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The allowed plannable targeting for this product.
     * </pre>
     *
     * <code>.google.ads.googleads.v7.services.PlannableTargeting plannable_targeting = 2;</code>
     */
    public Builder setPlannableTargeting(com.google.ads.googleads.v7.services.PlannableTargeting value) {
      if (plannableTargetingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        plannableTargeting_ = value;
        onChanged();
      } else {
        plannableTargetingBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The allowed plannable targeting for this product.
     * </pre>
     *
     * <code>.google.ads.googleads.v7.services.PlannableTargeting plannable_targeting = 2;</code>
     */
    public Builder setPlannableTargeting(
        com.google.ads.googleads.v7.services.PlannableTargeting.Builder builderForValue) {
      if (plannableTargetingBuilder_ == null) {
        plannableTargeting_ = builderForValue.build();
        onChanged();
      } else {
        plannableTargetingBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The allowed plannable targeting for this product.
     * </pre>
     *
     * <code>.google.ads.googleads.v7.services.PlannableTargeting plannable_targeting = 2;</code>
     */
    public Builder mergePlannableTargeting(com.google.ads.googleads.v7.services.PlannableTargeting value) {
      if (plannableTargetingBuilder_ == null) {
        if (plannableTargeting_ != null) {
          plannableTargeting_ =
            com.google.ads.googleads.v7.services.PlannableTargeting.newBuilder(plannableTargeting_).mergeFrom(value).buildPartial();
        } else {
          plannableTargeting_ = value;
        }
        onChanged();
      } else {
        plannableTargetingBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The allowed plannable targeting for this product.
     * </pre>
     *
     * <code>.google.ads.googleads.v7.services.PlannableTargeting plannable_targeting = 2;</code>
     */
    public Builder clearPlannableTargeting() {
      if (plannableTargetingBuilder_ == null) {
        plannableTargeting_ = null;
        onChanged();
      } else {
        plannableTargeting_ = null;
        plannableTargetingBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The allowed plannable targeting for this product.
     * </pre>
     *
     * <code>.google.ads.googleads.v7.services.PlannableTargeting plannable_targeting = 2;</code>
     */
    public com.google.ads.googleads.v7.services.PlannableTargeting.Builder getPlannableTargetingBuilder() {
      
      onChanged();
      return getPlannableTargetingFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The allowed plannable targeting for this product.
     * </pre>
     *
     * <code>.google.ads.googleads.v7.services.PlannableTargeting plannable_targeting = 2;</code>
     */
    public com.google.ads.googleads.v7.services.PlannableTargetingOrBuilder getPlannableTargetingOrBuilder() {
      if (plannableTargetingBuilder_ != null) {
        return plannableTargetingBuilder_.getMessageOrBuilder();
      } else {
        return plannableTargeting_ == null ?
            com.google.ads.googleads.v7.services.PlannableTargeting.getDefaultInstance() : plannableTargeting_;
      }
    }
    /**
     * <pre>
     * The allowed plannable targeting for this product.
     * </pre>
     *
     * <code>.google.ads.googleads.v7.services.PlannableTargeting plannable_targeting = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v7.services.PlannableTargeting, com.google.ads.googleads.v7.services.PlannableTargeting.Builder, com.google.ads.googleads.v7.services.PlannableTargetingOrBuilder> 
        getPlannableTargetingFieldBuilder() {
      if (plannableTargetingBuilder_ == null) {
        plannableTargetingBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v7.services.PlannableTargeting, com.google.ads.googleads.v7.services.PlannableTargeting.Builder, com.google.ads.googleads.v7.services.PlannableTargetingOrBuilder>(
                getPlannableTargeting(),
                getParentForChildren(),
                isClean());
        plannableTargeting_ = null;
      }
      return plannableTargetingBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v7.services.ProductMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v7.services.ProductMetadata)
  private static final com.google.ads.googleads.v7.services.ProductMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v7.services.ProductMetadata();
  }

  public static com.google.ads.googleads.v7.services.ProductMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductMetadata>
      PARSER = new com.google.protobuf.AbstractParser<ProductMetadata>() {
    @java.lang.Override
    public ProductMetadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProductMetadata(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProductMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v7.services.ProductMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

