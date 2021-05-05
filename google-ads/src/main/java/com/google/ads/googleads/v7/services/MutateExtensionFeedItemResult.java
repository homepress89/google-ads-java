// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/services/extension_feed_item_service.proto

package com.google.ads.googleads.v7.services;

/**
 * <pre>
 * The result for the extension feed item mutate.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v7.services.MutateExtensionFeedItemResult}
 */
public final class MutateExtensionFeedItemResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v7.services.MutateExtensionFeedItemResult)
    MutateExtensionFeedItemResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateExtensionFeedItemResult.newBuilder() to construct.
  private MutateExtensionFeedItemResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateExtensionFeedItemResult() {
    resourceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateExtensionFeedItemResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MutateExtensionFeedItemResult(
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
            com.google.ads.googleads.v7.resources.ExtensionFeedItem.Builder subBuilder = null;
            if (extensionFeedItem_ != null) {
              subBuilder = extensionFeedItem_.toBuilder();
            }
            extensionFeedItem_ = input.readMessage(com.google.ads.googleads.v7.resources.ExtensionFeedItem.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(extensionFeedItem_);
              extensionFeedItem_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v7.services.ExtensionFeedItemServiceProto.internal_static_google_ads_googleads_v7_services_MutateExtensionFeedItemResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v7.services.ExtensionFeedItemServiceProto.internal_static_google_ads_googleads_v7_services_MutateExtensionFeedItemResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult.class, com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult.Builder.class);
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

  public static final int EXTENSION_FEED_ITEM_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v7.resources.ExtensionFeedItem extensionFeedItem_;
  /**
   * <pre>
   * The mutated extension feed item with only mutable fields after mutate. The
   * field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v7.resources.ExtensionFeedItem extension_feed_item = 2;</code>
   * @return Whether the extensionFeedItem field is set.
   */
  @java.lang.Override
  public boolean hasExtensionFeedItem() {
    return extensionFeedItem_ != null;
  }
  /**
   * <pre>
   * The mutated extension feed item with only mutable fields after mutate. The
   * field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v7.resources.ExtensionFeedItem extension_feed_item = 2;</code>
   * @return The extensionFeedItem.
   */
  @java.lang.Override
  public com.google.ads.googleads.v7.resources.ExtensionFeedItem getExtensionFeedItem() {
    return extensionFeedItem_ == null ? com.google.ads.googleads.v7.resources.ExtensionFeedItem.getDefaultInstance() : extensionFeedItem_;
  }
  /**
   * <pre>
   * The mutated extension feed item with only mutable fields after mutate. The
   * field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v7.resources.ExtensionFeedItem extension_feed_item = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v7.resources.ExtensionFeedItemOrBuilder getExtensionFeedItemOrBuilder() {
    return getExtensionFeedItem();
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
    if (extensionFeedItem_ != null) {
      output.writeMessage(2, getExtensionFeedItem());
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
    if (extensionFeedItem_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getExtensionFeedItem());
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
    if (!(obj instanceof com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult other = (com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasExtensionFeedItem() != other.hasExtensionFeedItem()) return false;
    if (hasExtensionFeedItem()) {
      if (!getExtensionFeedItem()
          .equals(other.getExtensionFeedItem())) return false;
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
    if (hasExtensionFeedItem()) {
      hash = (37 * hash) + EXTENSION_FEED_ITEM_FIELD_NUMBER;
      hash = (53 * hash) + getExtensionFeedItem().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult prototype) {
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
   * The result for the extension feed item mutate.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v7.services.MutateExtensionFeedItemResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v7.services.MutateExtensionFeedItemResult)
      com.google.ads.googleads.v7.services.MutateExtensionFeedItemResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v7.services.ExtensionFeedItemServiceProto.internal_static_google_ads_googleads_v7_services_MutateExtensionFeedItemResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v7.services.ExtensionFeedItemServiceProto.internal_static_google_ads_googleads_v7_services_MutateExtensionFeedItemResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult.class, com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult.Builder.class);
    }

    // Construct using com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult.newBuilder()
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

      if (extensionFeedItemBuilder_ == null) {
        extensionFeedItem_ = null;
      } else {
        extensionFeedItem_ = null;
        extensionFeedItemBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v7.services.ExtensionFeedItemServiceProto.internal_static_google_ads_googleads_v7_services_MutateExtensionFeedItemResult_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult getDefaultInstanceForType() {
      return com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult build() {
      com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult buildPartial() {
      com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult result = new com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult(this);
      result.resourceName_ = resourceName_;
      if (extensionFeedItemBuilder_ == null) {
        result.extensionFeedItem_ = extensionFeedItem_;
      } else {
        result.extensionFeedItem_ = extensionFeedItemBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult) {
        return mergeFrom((com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult other) {
      if (other == com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (other.hasExtensionFeedItem()) {
        mergeExtensionFeedItem(other.getExtensionFeedItem());
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
      com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult) e.getUnfinishedMessage();
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

    private com.google.ads.googleads.v7.resources.ExtensionFeedItem extensionFeedItem_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v7.resources.ExtensionFeedItem, com.google.ads.googleads.v7.resources.ExtensionFeedItem.Builder, com.google.ads.googleads.v7.resources.ExtensionFeedItemOrBuilder> extensionFeedItemBuilder_;
    /**
     * <pre>
     * The mutated extension feed item with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.ExtensionFeedItem extension_feed_item = 2;</code>
     * @return Whether the extensionFeedItem field is set.
     */
    public boolean hasExtensionFeedItem() {
      return extensionFeedItemBuilder_ != null || extensionFeedItem_ != null;
    }
    /**
     * <pre>
     * The mutated extension feed item with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.ExtensionFeedItem extension_feed_item = 2;</code>
     * @return The extensionFeedItem.
     */
    public com.google.ads.googleads.v7.resources.ExtensionFeedItem getExtensionFeedItem() {
      if (extensionFeedItemBuilder_ == null) {
        return extensionFeedItem_ == null ? com.google.ads.googleads.v7.resources.ExtensionFeedItem.getDefaultInstance() : extensionFeedItem_;
      } else {
        return extensionFeedItemBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The mutated extension feed item with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.ExtensionFeedItem extension_feed_item = 2;</code>
     */
    public Builder setExtensionFeedItem(com.google.ads.googleads.v7.resources.ExtensionFeedItem value) {
      if (extensionFeedItemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        extensionFeedItem_ = value;
        onChanged();
      } else {
        extensionFeedItemBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mutated extension feed item with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.ExtensionFeedItem extension_feed_item = 2;</code>
     */
    public Builder setExtensionFeedItem(
        com.google.ads.googleads.v7.resources.ExtensionFeedItem.Builder builderForValue) {
      if (extensionFeedItemBuilder_ == null) {
        extensionFeedItem_ = builderForValue.build();
        onChanged();
      } else {
        extensionFeedItemBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The mutated extension feed item with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.ExtensionFeedItem extension_feed_item = 2;</code>
     */
    public Builder mergeExtensionFeedItem(com.google.ads.googleads.v7.resources.ExtensionFeedItem value) {
      if (extensionFeedItemBuilder_ == null) {
        if (extensionFeedItem_ != null) {
          extensionFeedItem_ =
            com.google.ads.googleads.v7.resources.ExtensionFeedItem.newBuilder(extensionFeedItem_).mergeFrom(value).buildPartial();
        } else {
          extensionFeedItem_ = value;
        }
        onChanged();
      } else {
        extensionFeedItemBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mutated extension feed item with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.ExtensionFeedItem extension_feed_item = 2;</code>
     */
    public Builder clearExtensionFeedItem() {
      if (extensionFeedItemBuilder_ == null) {
        extensionFeedItem_ = null;
        onChanged();
      } else {
        extensionFeedItem_ = null;
        extensionFeedItemBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The mutated extension feed item with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.ExtensionFeedItem extension_feed_item = 2;</code>
     */
    public com.google.ads.googleads.v7.resources.ExtensionFeedItem.Builder getExtensionFeedItemBuilder() {
      
      onChanged();
      return getExtensionFeedItemFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The mutated extension feed item with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.ExtensionFeedItem extension_feed_item = 2;</code>
     */
    public com.google.ads.googleads.v7.resources.ExtensionFeedItemOrBuilder getExtensionFeedItemOrBuilder() {
      if (extensionFeedItemBuilder_ != null) {
        return extensionFeedItemBuilder_.getMessageOrBuilder();
      } else {
        return extensionFeedItem_ == null ?
            com.google.ads.googleads.v7.resources.ExtensionFeedItem.getDefaultInstance() : extensionFeedItem_;
      }
    }
    /**
     * <pre>
     * The mutated extension feed item with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.ExtensionFeedItem extension_feed_item = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v7.resources.ExtensionFeedItem, com.google.ads.googleads.v7.resources.ExtensionFeedItem.Builder, com.google.ads.googleads.v7.resources.ExtensionFeedItemOrBuilder> 
        getExtensionFeedItemFieldBuilder() {
      if (extensionFeedItemBuilder_ == null) {
        extensionFeedItemBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v7.resources.ExtensionFeedItem, com.google.ads.googleads.v7.resources.ExtensionFeedItem.Builder, com.google.ads.googleads.v7.resources.ExtensionFeedItemOrBuilder>(
                getExtensionFeedItem(),
                getParentForChildren(),
                isClean());
        extensionFeedItem_ = null;
      }
      return extensionFeedItemBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v7.services.MutateExtensionFeedItemResult)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v7.services.MutateExtensionFeedItemResult)
  private static final com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult();
  }

  public static com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateExtensionFeedItemResult>
      PARSER = new com.google.protobuf.AbstractParser<MutateExtensionFeedItemResult>() {
    @java.lang.Override
    public MutateExtensionFeedItemResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MutateExtensionFeedItemResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MutateExtensionFeedItemResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateExtensionFeedItemResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v7.services.MutateExtensionFeedItemResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

