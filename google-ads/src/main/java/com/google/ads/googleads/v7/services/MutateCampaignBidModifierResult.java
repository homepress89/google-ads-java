// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/services/campaign_bid_modifier_service.proto

package com.google.ads.googleads.v7.services;

/**
 * <pre>
 * The result for the criterion mutate.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v7.services.MutateCampaignBidModifierResult}
 */
public final class MutateCampaignBidModifierResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v7.services.MutateCampaignBidModifierResult)
    MutateCampaignBidModifierResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateCampaignBidModifierResult.newBuilder() to construct.
  private MutateCampaignBidModifierResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateCampaignBidModifierResult() {
    resourceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateCampaignBidModifierResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MutateCampaignBidModifierResult(
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
            com.google.ads.googleads.v7.resources.CampaignBidModifier.Builder subBuilder = null;
            if (campaignBidModifier_ != null) {
              subBuilder = campaignBidModifier_.toBuilder();
            }
            campaignBidModifier_ = input.readMessage(com.google.ads.googleads.v7.resources.CampaignBidModifier.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(campaignBidModifier_);
              campaignBidModifier_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v7.services.CampaignBidModifierServiceProto.internal_static_google_ads_googleads_v7_services_MutateCampaignBidModifierResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v7.services.CampaignBidModifierServiceProto.internal_static_google_ads_googleads_v7_services_MutateCampaignBidModifierResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult.class, com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult.Builder.class);
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

  public static final int CAMPAIGN_BID_MODIFIER_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v7.resources.CampaignBidModifier campaignBidModifier_;
  /**
   * <pre>
   * The mutated campaign bid modifier with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v7.resources.CampaignBidModifier campaign_bid_modifier = 2;</code>
   * @return Whether the campaignBidModifier field is set.
   */
  @java.lang.Override
  public boolean hasCampaignBidModifier() {
    return campaignBidModifier_ != null;
  }
  /**
   * <pre>
   * The mutated campaign bid modifier with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v7.resources.CampaignBidModifier campaign_bid_modifier = 2;</code>
   * @return The campaignBidModifier.
   */
  @java.lang.Override
  public com.google.ads.googleads.v7.resources.CampaignBidModifier getCampaignBidModifier() {
    return campaignBidModifier_ == null ? com.google.ads.googleads.v7.resources.CampaignBidModifier.getDefaultInstance() : campaignBidModifier_;
  }
  /**
   * <pre>
   * The mutated campaign bid modifier with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v7.resources.CampaignBidModifier campaign_bid_modifier = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v7.resources.CampaignBidModifierOrBuilder getCampaignBidModifierOrBuilder() {
    return getCampaignBidModifier();
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
    if (campaignBidModifier_ != null) {
      output.writeMessage(2, getCampaignBidModifier());
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
    if (campaignBidModifier_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCampaignBidModifier());
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
    if (!(obj instanceof com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult other = (com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasCampaignBidModifier() != other.hasCampaignBidModifier()) return false;
    if (hasCampaignBidModifier()) {
      if (!getCampaignBidModifier()
          .equals(other.getCampaignBidModifier())) return false;
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
    if (hasCampaignBidModifier()) {
      hash = (37 * hash) + CAMPAIGN_BID_MODIFIER_FIELD_NUMBER;
      hash = (53 * hash) + getCampaignBidModifier().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult prototype) {
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
   * The result for the criterion mutate.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v7.services.MutateCampaignBidModifierResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v7.services.MutateCampaignBidModifierResult)
      com.google.ads.googleads.v7.services.MutateCampaignBidModifierResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v7.services.CampaignBidModifierServiceProto.internal_static_google_ads_googleads_v7_services_MutateCampaignBidModifierResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v7.services.CampaignBidModifierServiceProto.internal_static_google_ads_googleads_v7_services_MutateCampaignBidModifierResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult.class, com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult.Builder.class);
    }

    // Construct using com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult.newBuilder()
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

      if (campaignBidModifierBuilder_ == null) {
        campaignBidModifier_ = null;
      } else {
        campaignBidModifier_ = null;
        campaignBidModifierBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v7.services.CampaignBidModifierServiceProto.internal_static_google_ads_googleads_v7_services_MutateCampaignBidModifierResult_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult getDefaultInstanceForType() {
      return com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult build() {
      com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult buildPartial() {
      com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult result = new com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult(this);
      result.resourceName_ = resourceName_;
      if (campaignBidModifierBuilder_ == null) {
        result.campaignBidModifier_ = campaignBidModifier_;
      } else {
        result.campaignBidModifier_ = campaignBidModifierBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult) {
        return mergeFrom((com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult other) {
      if (other == com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (other.hasCampaignBidModifier()) {
        mergeCampaignBidModifier(other.getCampaignBidModifier());
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
      com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult) e.getUnfinishedMessage();
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

    private com.google.ads.googleads.v7.resources.CampaignBidModifier campaignBidModifier_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v7.resources.CampaignBidModifier, com.google.ads.googleads.v7.resources.CampaignBidModifier.Builder, com.google.ads.googleads.v7.resources.CampaignBidModifierOrBuilder> campaignBidModifierBuilder_;
    /**
     * <pre>
     * The mutated campaign bid modifier with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CampaignBidModifier campaign_bid_modifier = 2;</code>
     * @return Whether the campaignBidModifier field is set.
     */
    public boolean hasCampaignBidModifier() {
      return campaignBidModifierBuilder_ != null || campaignBidModifier_ != null;
    }
    /**
     * <pre>
     * The mutated campaign bid modifier with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CampaignBidModifier campaign_bid_modifier = 2;</code>
     * @return The campaignBidModifier.
     */
    public com.google.ads.googleads.v7.resources.CampaignBidModifier getCampaignBidModifier() {
      if (campaignBidModifierBuilder_ == null) {
        return campaignBidModifier_ == null ? com.google.ads.googleads.v7.resources.CampaignBidModifier.getDefaultInstance() : campaignBidModifier_;
      } else {
        return campaignBidModifierBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The mutated campaign bid modifier with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CampaignBidModifier campaign_bid_modifier = 2;</code>
     */
    public Builder setCampaignBidModifier(com.google.ads.googleads.v7.resources.CampaignBidModifier value) {
      if (campaignBidModifierBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        campaignBidModifier_ = value;
        onChanged();
      } else {
        campaignBidModifierBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mutated campaign bid modifier with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CampaignBidModifier campaign_bid_modifier = 2;</code>
     */
    public Builder setCampaignBidModifier(
        com.google.ads.googleads.v7.resources.CampaignBidModifier.Builder builderForValue) {
      if (campaignBidModifierBuilder_ == null) {
        campaignBidModifier_ = builderForValue.build();
        onChanged();
      } else {
        campaignBidModifierBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The mutated campaign bid modifier with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CampaignBidModifier campaign_bid_modifier = 2;</code>
     */
    public Builder mergeCampaignBidModifier(com.google.ads.googleads.v7.resources.CampaignBidModifier value) {
      if (campaignBidModifierBuilder_ == null) {
        if (campaignBidModifier_ != null) {
          campaignBidModifier_ =
            com.google.ads.googleads.v7.resources.CampaignBidModifier.newBuilder(campaignBidModifier_).mergeFrom(value).buildPartial();
        } else {
          campaignBidModifier_ = value;
        }
        onChanged();
      } else {
        campaignBidModifierBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mutated campaign bid modifier with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CampaignBidModifier campaign_bid_modifier = 2;</code>
     */
    public Builder clearCampaignBidModifier() {
      if (campaignBidModifierBuilder_ == null) {
        campaignBidModifier_ = null;
        onChanged();
      } else {
        campaignBidModifier_ = null;
        campaignBidModifierBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The mutated campaign bid modifier with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CampaignBidModifier campaign_bid_modifier = 2;</code>
     */
    public com.google.ads.googleads.v7.resources.CampaignBidModifier.Builder getCampaignBidModifierBuilder() {
      
      onChanged();
      return getCampaignBidModifierFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The mutated campaign bid modifier with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CampaignBidModifier campaign_bid_modifier = 2;</code>
     */
    public com.google.ads.googleads.v7.resources.CampaignBidModifierOrBuilder getCampaignBidModifierOrBuilder() {
      if (campaignBidModifierBuilder_ != null) {
        return campaignBidModifierBuilder_.getMessageOrBuilder();
      } else {
        return campaignBidModifier_ == null ?
            com.google.ads.googleads.v7.resources.CampaignBidModifier.getDefaultInstance() : campaignBidModifier_;
      }
    }
    /**
     * <pre>
     * The mutated campaign bid modifier with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CampaignBidModifier campaign_bid_modifier = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v7.resources.CampaignBidModifier, com.google.ads.googleads.v7.resources.CampaignBidModifier.Builder, com.google.ads.googleads.v7.resources.CampaignBidModifierOrBuilder> 
        getCampaignBidModifierFieldBuilder() {
      if (campaignBidModifierBuilder_ == null) {
        campaignBidModifierBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v7.resources.CampaignBidModifier, com.google.ads.googleads.v7.resources.CampaignBidModifier.Builder, com.google.ads.googleads.v7.resources.CampaignBidModifierOrBuilder>(
                getCampaignBidModifier(),
                getParentForChildren(),
                isClean());
        campaignBidModifier_ = null;
      }
      return campaignBidModifierBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v7.services.MutateCampaignBidModifierResult)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v7.services.MutateCampaignBidModifierResult)
  private static final com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult();
  }

  public static com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateCampaignBidModifierResult>
      PARSER = new com.google.protobuf.AbstractParser<MutateCampaignBidModifierResult>() {
    @java.lang.Override
    public MutateCampaignBidModifierResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MutateCampaignBidModifierResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MutateCampaignBidModifierResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateCampaignBidModifierResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v7.services.MutateCampaignBidModifierResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

