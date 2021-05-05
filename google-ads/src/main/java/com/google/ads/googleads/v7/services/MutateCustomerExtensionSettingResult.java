// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/services/customer_extension_setting_service.proto

package com.google.ads.googleads.v7.services;

/**
 * <pre>
 * The result for the customer extension setting mutate.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult}
 */
public final class MutateCustomerExtensionSettingResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult)
    MutateCustomerExtensionSettingResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateCustomerExtensionSettingResult.newBuilder() to construct.
  private MutateCustomerExtensionSettingResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateCustomerExtensionSettingResult() {
    resourceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateCustomerExtensionSettingResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MutateCustomerExtensionSettingResult(
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

            resourceName_ = s;
            break;
          }
          case 18: {
            com.google.ads.googleads.v7.resources.CustomerExtensionSetting.Builder subBuilder = null;
            if (customerExtensionSetting_ != null) {
              subBuilder = customerExtensionSetting_.toBuilder();
            }
            customerExtensionSetting_ = input.readMessage(com.google.ads.googleads.v7.resources.CustomerExtensionSetting.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(customerExtensionSetting_);
              customerExtensionSetting_ = subBuilder.buildPartial();
            }

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
    return com.google.ads.googleads.v7.services.CustomerExtensionSettingServiceProto.internal_static_google_ads_googleads_v7_services_MutateCustomerExtensionSettingResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v7.services.CustomerExtensionSettingServiceProto.internal_static_google_ads_googleads_v7_services_MutateCustomerExtensionSettingResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult.class, com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   * @return The resourceName.
   */
  @java.lang.Override
  public java.lang.String getResourceName() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   * @return The bytes for resourceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceNameBytes() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CUSTOMER_EXTENSION_SETTING_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v7.resources.CustomerExtensionSetting customerExtensionSetting_;
  /**
   * <pre>
   * The mutated CustomerExtensionSetting with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v7.resources.CustomerExtensionSetting customer_extension_setting = 2;</code>
   * @return Whether the customerExtensionSetting field is set.
   */
  @java.lang.Override
  public boolean hasCustomerExtensionSetting() {
    return customerExtensionSetting_ != null;
  }
  /**
   * <pre>
   * The mutated CustomerExtensionSetting with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v7.resources.CustomerExtensionSetting customer_extension_setting = 2;</code>
   * @return The customerExtensionSetting.
   */
  @java.lang.Override
  public com.google.ads.googleads.v7.resources.CustomerExtensionSetting getCustomerExtensionSetting() {
    return customerExtensionSetting_ == null ? com.google.ads.googleads.v7.resources.CustomerExtensionSetting.getDefaultInstance() : customerExtensionSetting_;
  }
  /**
   * <pre>
   * The mutated CustomerExtensionSetting with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v7.resources.CustomerExtensionSetting customer_extension_setting = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v7.resources.CustomerExtensionSettingOrBuilder getCustomerExtensionSettingOrBuilder() {
    return getCustomerExtensionSetting();
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
    if (!getResourceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceName_);
    }
    if (customerExtensionSetting_ != null) {
      output.writeMessage(2, getCustomerExtensionSetting());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getResourceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceName_);
    }
    if (customerExtensionSetting_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCustomerExtensionSetting());
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
    if (!(obj instanceof com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult other = (com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasCustomerExtensionSetting() != other.hasCustomerExtensionSetting()) return false;
    if (hasCustomerExtensionSetting()) {
      if (!getCustomerExtensionSetting()
          .equals(other.getCustomerExtensionSetting())) return false;
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
    hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceName().hashCode();
    if (hasCustomerExtensionSetting()) {
      hash = (37 * hash) + CUSTOMER_EXTENSION_SETTING_FIELD_NUMBER;
      hash = (53 * hash) + getCustomerExtensionSetting().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult prototype) {
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
   * The result for the customer extension setting mutate.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult)
      com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v7.services.CustomerExtensionSettingServiceProto.internal_static_google_ads_googleads_v7_services_MutateCustomerExtensionSettingResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v7.services.CustomerExtensionSettingServiceProto.internal_static_google_ads_googleads_v7_services_MutateCustomerExtensionSettingResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult.class, com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult.Builder.class);
    }

    // Construct using com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult.newBuilder()
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
      resourceName_ = "";

      if (customerExtensionSettingBuilder_ == null) {
        customerExtensionSetting_ = null;
      } else {
        customerExtensionSetting_ = null;
        customerExtensionSettingBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v7.services.CustomerExtensionSettingServiceProto.internal_static_google_ads_googleads_v7_services_MutateCustomerExtensionSettingResult_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult getDefaultInstanceForType() {
      return com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult build() {
      com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult buildPartial() {
      com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult result = new com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult(this);
      result.resourceName_ = resourceName_;
      if (customerExtensionSettingBuilder_ == null) {
        result.customerExtensionSetting_ = customerExtensionSetting_;
      } else {
        result.customerExtensionSetting_ = customerExtensionSettingBuilder_.build();
      }
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
      if (other instanceof com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult) {
        return mergeFrom((com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult other) {
      if (other == com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (other.hasCustomerExtensionSetting()) {
        mergeCustomerExtensionSetting(other.getCustomerExtensionSetting());
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
      com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     * @return The resourceName.
     */
    public java.lang.String getResourceName() {
      java.lang.Object ref = resourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     * @return The bytes for resourceName.
     */
    public com.google.protobuf.ByteString
        getResourceNameBytes() {
      java.lang.Object ref = resourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     * @param value The resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      
      resourceName_ = getDefaultInstance().getResourceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     * @param value The bytes for resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceName_ = value;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v7.resources.CustomerExtensionSetting customerExtensionSetting_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v7.resources.CustomerExtensionSetting, com.google.ads.googleads.v7.resources.CustomerExtensionSetting.Builder, com.google.ads.googleads.v7.resources.CustomerExtensionSettingOrBuilder> customerExtensionSettingBuilder_;
    /**
     * <pre>
     * The mutated CustomerExtensionSetting with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CustomerExtensionSetting customer_extension_setting = 2;</code>
     * @return Whether the customerExtensionSetting field is set.
     */
    public boolean hasCustomerExtensionSetting() {
      return customerExtensionSettingBuilder_ != null || customerExtensionSetting_ != null;
    }
    /**
     * <pre>
     * The mutated CustomerExtensionSetting with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CustomerExtensionSetting customer_extension_setting = 2;</code>
     * @return The customerExtensionSetting.
     */
    public com.google.ads.googleads.v7.resources.CustomerExtensionSetting getCustomerExtensionSetting() {
      if (customerExtensionSettingBuilder_ == null) {
        return customerExtensionSetting_ == null ? com.google.ads.googleads.v7.resources.CustomerExtensionSetting.getDefaultInstance() : customerExtensionSetting_;
      } else {
        return customerExtensionSettingBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The mutated CustomerExtensionSetting with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CustomerExtensionSetting customer_extension_setting = 2;</code>
     */
    public Builder setCustomerExtensionSetting(com.google.ads.googleads.v7.resources.CustomerExtensionSetting value) {
      if (customerExtensionSettingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        customerExtensionSetting_ = value;
        onChanged();
      } else {
        customerExtensionSettingBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mutated CustomerExtensionSetting with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CustomerExtensionSetting customer_extension_setting = 2;</code>
     */
    public Builder setCustomerExtensionSetting(
        com.google.ads.googleads.v7.resources.CustomerExtensionSetting.Builder builderForValue) {
      if (customerExtensionSettingBuilder_ == null) {
        customerExtensionSetting_ = builderForValue.build();
        onChanged();
      } else {
        customerExtensionSettingBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The mutated CustomerExtensionSetting with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CustomerExtensionSetting customer_extension_setting = 2;</code>
     */
    public Builder mergeCustomerExtensionSetting(com.google.ads.googleads.v7.resources.CustomerExtensionSetting value) {
      if (customerExtensionSettingBuilder_ == null) {
        if (customerExtensionSetting_ != null) {
          customerExtensionSetting_ =
            com.google.ads.googleads.v7.resources.CustomerExtensionSetting.newBuilder(customerExtensionSetting_).mergeFrom(value).buildPartial();
        } else {
          customerExtensionSetting_ = value;
        }
        onChanged();
      } else {
        customerExtensionSettingBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mutated CustomerExtensionSetting with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CustomerExtensionSetting customer_extension_setting = 2;</code>
     */
    public Builder clearCustomerExtensionSetting() {
      if (customerExtensionSettingBuilder_ == null) {
        customerExtensionSetting_ = null;
        onChanged();
      } else {
        customerExtensionSetting_ = null;
        customerExtensionSettingBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The mutated CustomerExtensionSetting with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CustomerExtensionSetting customer_extension_setting = 2;</code>
     */
    public com.google.ads.googleads.v7.resources.CustomerExtensionSetting.Builder getCustomerExtensionSettingBuilder() {
      
      onChanged();
      return getCustomerExtensionSettingFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The mutated CustomerExtensionSetting with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CustomerExtensionSetting customer_extension_setting = 2;</code>
     */
    public com.google.ads.googleads.v7.resources.CustomerExtensionSettingOrBuilder getCustomerExtensionSettingOrBuilder() {
      if (customerExtensionSettingBuilder_ != null) {
        return customerExtensionSettingBuilder_.getMessageOrBuilder();
      } else {
        return customerExtensionSetting_ == null ?
            com.google.ads.googleads.v7.resources.CustomerExtensionSetting.getDefaultInstance() : customerExtensionSetting_;
      }
    }
    /**
     * <pre>
     * The mutated CustomerExtensionSetting with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CustomerExtensionSetting customer_extension_setting = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v7.resources.CustomerExtensionSetting, com.google.ads.googleads.v7.resources.CustomerExtensionSetting.Builder, com.google.ads.googleads.v7.resources.CustomerExtensionSettingOrBuilder> 
        getCustomerExtensionSettingFieldBuilder() {
      if (customerExtensionSettingBuilder_ == null) {
        customerExtensionSettingBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v7.resources.CustomerExtensionSetting, com.google.ads.googleads.v7.resources.CustomerExtensionSetting.Builder, com.google.ads.googleads.v7.resources.CustomerExtensionSettingOrBuilder>(
                getCustomerExtensionSetting(),
                getParentForChildren(),
                isClean());
        customerExtensionSetting_ = null;
      }
      return customerExtensionSettingBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult)
  private static final com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult();
  }

  public static com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateCustomerExtensionSettingResult>
      PARSER = new com.google.protobuf.AbstractParser<MutateCustomerExtensionSettingResult>() {
    @java.lang.Override
    public MutateCustomerExtensionSettingResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MutateCustomerExtensionSettingResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MutateCustomerExtensionSettingResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateCustomerExtensionSettingResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v7.services.MutateCustomerExtensionSettingResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

