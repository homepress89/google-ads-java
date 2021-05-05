// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/errors/errors.proto

package com.google.ads.googleads.v7.errors;

/**
 * <pre>
 * Error details returned when an resource count limit was exceeded.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v7.errors.ResourceCountDetails}
 */
public final class ResourceCountDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v7.errors.ResourceCountDetails)
    ResourceCountDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResourceCountDetails.newBuilder() to construct.
  private ResourceCountDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResourceCountDetails() {
    enclosingId_ = "";
    enclosingResource_ = "";
    limitType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResourceCountDetails();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ResourceCountDetails(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            enclosingId_ = s;
            break;
          }
          case 16: {

            limit_ = input.readInt32();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            limitType_ = rawValue;
            break;
          }
          case 32: {

            existingCount_ = input.readInt32();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            enclosingResource_ = s;
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
    return com.google.ads.googleads.v7.errors.ErrorsProto.internal_static_google_ads_googleads_v7_errors_ResourceCountDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v7.errors.ErrorsProto.internal_static_google_ads_googleads_v7_errors_ResourceCountDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v7.errors.ResourceCountDetails.class, com.google.ads.googleads.v7.errors.ResourceCountDetails.Builder.class);
  }

  public static final int ENCLOSING_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object enclosingId_;
  /**
   * <pre>
   * The ID of the resource whose limit was exceeded.
   * External customer ID if the limit is for a customer.
   * </pre>
   *
   * <code>string enclosing_id = 1;</code>
   * @return The enclosingId.
   */
  @java.lang.Override
  public java.lang.String getEnclosingId() {
    java.lang.Object ref = enclosingId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      enclosingId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The ID of the resource whose limit was exceeded.
   * External customer ID if the limit is for a customer.
   * </pre>
   *
   * <code>string enclosing_id = 1;</code>
   * @return The bytes for enclosingId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEnclosingIdBytes() {
    java.lang.Object ref = enclosingId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      enclosingId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENCLOSING_RESOURCE_FIELD_NUMBER = 5;
  private volatile java.lang.Object enclosingResource_;
  /**
   * <pre>
   * The name of the resource (Customer, Campaign etc.) whose limit was
   * exceeded.
   * </pre>
   *
   * <code>string enclosing_resource = 5;</code>
   * @return The enclosingResource.
   */
  @java.lang.Override
  public java.lang.String getEnclosingResource() {
    java.lang.Object ref = enclosingResource_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      enclosingResource_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the resource (Customer, Campaign etc.) whose limit was
   * exceeded.
   * </pre>
   *
   * <code>string enclosing_resource = 5;</code>
   * @return The bytes for enclosingResource.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEnclosingResourceBytes() {
    java.lang.Object ref = enclosingResource_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      enclosingResource_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LIMIT_FIELD_NUMBER = 2;
  private int limit_;
  /**
   * <pre>
   * The limit which was exceeded.
   * </pre>
   *
   * <code>int32 limit = 2;</code>
   * @return The limit.
   */
  @java.lang.Override
  public int getLimit() {
    return limit_;
  }

  public static final int LIMIT_TYPE_FIELD_NUMBER = 3;
  private int limitType_;
  /**
   * <pre>
   * The resource limit type which was exceeded.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.ResourceLimitTypeEnum.ResourceLimitType limit_type = 3;</code>
   * @return The enum numeric value on the wire for limitType.
   */
  @java.lang.Override public int getLimitTypeValue() {
    return limitType_;
  }
  /**
   * <pre>
   * The resource limit type which was exceeded.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.ResourceLimitTypeEnum.ResourceLimitType limit_type = 3;</code>
   * @return The limitType.
   */
  @java.lang.Override public com.google.ads.googleads.v7.enums.ResourceLimitTypeEnum.ResourceLimitType getLimitType() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v7.enums.ResourceLimitTypeEnum.ResourceLimitType result = com.google.ads.googleads.v7.enums.ResourceLimitTypeEnum.ResourceLimitType.valueOf(limitType_);
    return result == null ? com.google.ads.googleads.v7.enums.ResourceLimitTypeEnum.ResourceLimitType.UNRECOGNIZED : result;
  }

  public static final int EXISTING_COUNT_FIELD_NUMBER = 4;
  private int existingCount_;
  /**
   * <pre>
   * The count of existing entities.
   * </pre>
   *
   * <code>int32 existing_count = 4;</code>
   * @return The existingCount.
   */
  @java.lang.Override
  public int getExistingCount() {
    return existingCount_;
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
    if (!getEnclosingIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, enclosingId_);
    }
    if (limit_ != 0) {
      output.writeInt32(2, limit_);
    }
    if (limitType_ != com.google.ads.googleads.v7.enums.ResourceLimitTypeEnum.ResourceLimitType.UNSPECIFIED.getNumber()) {
      output.writeEnum(3, limitType_);
    }
    if (existingCount_ != 0) {
      output.writeInt32(4, existingCount_);
    }
    if (!getEnclosingResourceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, enclosingResource_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getEnclosingIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, enclosingId_);
    }
    if (limit_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, limit_);
    }
    if (limitType_ != com.google.ads.googleads.v7.enums.ResourceLimitTypeEnum.ResourceLimitType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, limitType_);
    }
    if (existingCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, existingCount_);
    }
    if (!getEnclosingResourceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, enclosingResource_);
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
    if (!(obj instanceof com.google.ads.googleads.v7.errors.ResourceCountDetails)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v7.errors.ResourceCountDetails other = (com.google.ads.googleads.v7.errors.ResourceCountDetails) obj;

    if (!getEnclosingId()
        .equals(other.getEnclosingId())) return false;
    if (!getEnclosingResource()
        .equals(other.getEnclosingResource())) return false;
    if (getLimit()
        != other.getLimit()) return false;
    if (limitType_ != other.limitType_) return false;
    if (getExistingCount()
        != other.getExistingCount()) return false;
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
    hash = (37 * hash) + ENCLOSING_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEnclosingId().hashCode();
    hash = (37 * hash) + ENCLOSING_RESOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getEnclosingResource().hashCode();
    hash = (37 * hash) + LIMIT_FIELD_NUMBER;
    hash = (53 * hash) + getLimit();
    hash = (37 * hash) + LIMIT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + limitType_;
    hash = (37 * hash) + EXISTING_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getExistingCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v7.errors.ResourceCountDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.errors.ResourceCountDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.errors.ResourceCountDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.errors.ResourceCountDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.errors.ResourceCountDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.errors.ResourceCountDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.errors.ResourceCountDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.errors.ResourceCountDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.errors.ResourceCountDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.errors.ResourceCountDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.errors.ResourceCountDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.errors.ResourceCountDetails parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v7.errors.ResourceCountDetails prototype) {
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
   * Error details returned when an resource count limit was exceeded.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v7.errors.ResourceCountDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v7.errors.ResourceCountDetails)
      com.google.ads.googleads.v7.errors.ResourceCountDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v7.errors.ErrorsProto.internal_static_google_ads_googleads_v7_errors_ResourceCountDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v7.errors.ErrorsProto.internal_static_google_ads_googleads_v7_errors_ResourceCountDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v7.errors.ResourceCountDetails.class, com.google.ads.googleads.v7.errors.ResourceCountDetails.Builder.class);
    }

    // Construct using com.google.ads.googleads.v7.errors.ResourceCountDetails.newBuilder()
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
      enclosingId_ = "";

      enclosingResource_ = "";

      limit_ = 0;

      limitType_ = 0;

      existingCount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v7.errors.ErrorsProto.internal_static_google_ads_googleads_v7_errors_ResourceCountDetails_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.errors.ResourceCountDetails getDefaultInstanceForType() {
      return com.google.ads.googleads.v7.errors.ResourceCountDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.errors.ResourceCountDetails build() {
      com.google.ads.googleads.v7.errors.ResourceCountDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.errors.ResourceCountDetails buildPartial() {
      com.google.ads.googleads.v7.errors.ResourceCountDetails result = new com.google.ads.googleads.v7.errors.ResourceCountDetails(this);
      result.enclosingId_ = enclosingId_;
      result.enclosingResource_ = enclosingResource_;
      result.limit_ = limit_;
      result.limitType_ = limitType_;
      result.existingCount_ = existingCount_;
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
      if (other instanceof com.google.ads.googleads.v7.errors.ResourceCountDetails) {
        return mergeFrom((com.google.ads.googleads.v7.errors.ResourceCountDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v7.errors.ResourceCountDetails other) {
      if (other == com.google.ads.googleads.v7.errors.ResourceCountDetails.getDefaultInstance()) return this;
      if (!other.getEnclosingId().isEmpty()) {
        enclosingId_ = other.enclosingId_;
        onChanged();
      }
      if (!other.getEnclosingResource().isEmpty()) {
        enclosingResource_ = other.enclosingResource_;
        onChanged();
      }
      if (other.getLimit() != 0) {
        setLimit(other.getLimit());
      }
      if (other.limitType_ != 0) {
        setLimitTypeValue(other.getLimitTypeValue());
      }
      if (other.getExistingCount() != 0) {
        setExistingCount(other.getExistingCount());
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
      com.google.ads.googleads.v7.errors.ResourceCountDetails parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v7.errors.ResourceCountDetails) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object enclosingId_ = "";
    /**
     * <pre>
     * The ID of the resource whose limit was exceeded.
     * External customer ID if the limit is for a customer.
     * </pre>
     *
     * <code>string enclosing_id = 1;</code>
     * @return The enclosingId.
     */
    public java.lang.String getEnclosingId() {
      java.lang.Object ref = enclosingId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        enclosingId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The ID of the resource whose limit was exceeded.
     * External customer ID if the limit is for a customer.
     * </pre>
     *
     * <code>string enclosing_id = 1;</code>
     * @return The bytes for enclosingId.
     */
    public com.google.protobuf.ByteString
        getEnclosingIdBytes() {
      java.lang.Object ref = enclosingId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        enclosingId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The ID of the resource whose limit was exceeded.
     * External customer ID if the limit is for a customer.
     * </pre>
     *
     * <code>string enclosing_id = 1;</code>
     * @param value The enclosingId to set.
     * @return This builder for chaining.
     */
    public Builder setEnclosingId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      enclosingId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the resource whose limit was exceeded.
     * External customer ID if the limit is for a customer.
     * </pre>
     *
     * <code>string enclosing_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnclosingId() {
      
      enclosingId_ = getDefaultInstance().getEnclosingId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the resource whose limit was exceeded.
     * External customer ID if the limit is for a customer.
     * </pre>
     *
     * <code>string enclosing_id = 1;</code>
     * @param value The bytes for enclosingId to set.
     * @return This builder for chaining.
     */
    public Builder setEnclosingIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      enclosingId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object enclosingResource_ = "";
    /**
     * <pre>
     * The name of the resource (Customer, Campaign etc.) whose limit was
     * exceeded.
     * </pre>
     *
     * <code>string enclosing_resource = 5;</code>
     * @return The enclosingResource.
     */
    public java.lang.String getEnclosingResource() {
      java.lang.Object ref = enclosingResource_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        enclosingResource_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the resource (Customer, Campaign etc.) whose limit was
     * exceeded.
     * </pre>
     *
     * <code>string enclosing_resource = 5;</code>
     * @return The bytes for enclosingResource.
     */
    public com.google.protobuf.ByteString
        getEnclosingResourceBytes() {
      java.lang.Object ref = enclosingResource_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        enclosingResource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the resource (Customer, Campaign etc.) whose limit was
     * exceeded.
     * </pre>
     *
     * <code>string enclosing_resource = 5;</code>
     * @param value The enclosingResource to set.
     * @return This builder for chaining.
     */
    public Builder setEnclosingResource(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      enclosingResource_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the resource (Customer, Campaign etc.) whose limit was
     * exceeded.
     * </pre>
     *
     * <code>string enclosing_resource = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnclosingResource() {
      
      enclosingResource_ = getDefaultInstance().getEnclosingResource();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the resource (Customer, Campaign etc.) whose limit was
     * exceeded.
     * </pre>
     *
     * <code>string enclosing_resource = 5;</code>
     * @param value The bytes for enclosingResource to set.
     * @return This builder for chaining.
     */
    public Builder setEnclosingResourceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      enclosingResource_ = value;
      onChanged();
      return this;
    }

    private int limit_ ;
    /**
     * <pre>
     * The limit which was exceeded.
     * </pre>
     *
     * <code>int32 limit = 2;</code>
     * @return The limit.
     */
    @java.lang.Override
    public int getLimit() {
      return limit_;
    }
    /**
     * <pre>
     * The limit which was exceeded.
     * </pre>
     *
     * <code>int32 limit = 2;</code>
     * @param value The limit to set.
     * @return This builder for chaining.
     */
    public Builder setLimit(int value) {
      
      limit_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The limit which was exceeded.
     * </pre>
     *
     * <code>int32 limit = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLimit() {
      
      limit_ = 0;
      onChanged();
      return this;
    }

    private int limitType_ = 0;
    /**
     * <pre>
     * The resource limit type which was exceeded.
     * </pre>
     *
     * <code>.google.ads.googleads.v7.enums.ResourceLimitTypeEnum.ResourceLimitType limit_type = 3;</code>
     * @return The enum numeric value on the wire for limitType.
     */
    @java.lang.Override public int getLimitTypeValue() {
      return limitType_;
    }
    /**
     * <pre>
     * The resource limit type which was exceeded.
     * </pre>
     *
     * <code>.google.ads.googleads.v7.enums.ResourceLimitTypeEnum.ResourceLimitType limit_type = 3;</code>
     * @param value The enum numeric value on the wire for limitType to set.
     * @return This builder for chaining.
     */
    public Builder setLimitTypeValue(int value) {
      
      limitType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource limit type which was exceeded.
     * </pre>
     *
     * <code>.google.ads.googleads.v7.enums.ResourceLimitTypeEnum.ResourceLimitType limit_type = 3;</code>
     * @return The limitType.
     */
    @java.lang.Override
    public com.google.ads.googleads.v7.enums.ResourceLimitTypeEnum.ResourceLimitType getLimitType() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v7.enums.ResourceLimitTypeEnum.ResourceLimitType result = com.google.ads.googleads.v7.enums.ResourceLimitTypeEnum.ResourceLimitType.valueOf(limitType_);
      return result == null ? com.google.ads.googleads.v7.enums.ResourceLimitTypeEnum.ResourceLimitType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The resource limit type which was exceeded.
     * </pre>
     *
     * <code>.google.ads.googleads.v7.enums.ResourceLimitTypeEnum.ResourceLimitType limit_type = 3;</code>
     * @param value The limitType to set.
     * @return This builder for chaining.
     */
    public Builder setLimitType(com.google.ads.googleads.v7.enums.ResourceLimitTypeEnum.ResourceLimitType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      limitType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource limit type which was exceeded.
     * </pre>
     *
     * <code>.google.ads.googleads.v7.enums.ResourceLimitTypeEnum.ResourceLimitType limit_type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLimitType() {
      
      limitType_ = 0;
      onChanged();
      return this;
    }

    private int existingCount_ ;
    /**
     * <pre>
     * The count of existing entities.
     * </pre>
     *
     * <code>int32 existing_count = 4;</code>
     * @return The existingCount.
     */
    @java.lang.Override
    public int getExistingCount() {
      return existingCount_;
    }
    /**
     * <pre>
     * The count of existing entities.
     * </pre>
     *
     * <code>int32 existing_count = 4;</code>
     * @param value The existingCount to set.
     * @return This builder for chaining.
     */
    public Builder setExistingCount(int value) {
      
      existingCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The count of existing entities.
     * </pre>
     *
     * <code>int32 existing_count = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearExistingCount() {
      
      existingCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v7.errors.ResourceCountDetails)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v7.errors.ResourceCountDetails)
  private static final com.google.ads.googleads.v7.errors.ResourceCountDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v7.errors.ResourceCountDetails();
  }

  public static com.google.ads.googleads.v7.errors.ResourceCountDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResourceCountDetails>
      PARSER = new com.google.protobuf.AbstractParser<ResourceCountDetails>() {
    @java.lang.Override
    public ResourceCountDetails parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ResourceCountDetails(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResourceCountDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResourceCountDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v7.errors.ResourceCountDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

