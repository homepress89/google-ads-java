// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/common/criteria.proto

package com.google.ads.googleads.v7.common;

/**
 * <pre>
 * A topic criterion. Use topics to target or exclude placements in the
 * Google Display Network based on the category into which the placement falls
 * (for example, "Pets &amp; Animals/Pets/Dogs").
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v7.common.TopicInfo}
 */
public final class TopicInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v7.common.TopicInfo)
    TopicInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TopicInfo.newBuilder() to construct.
  private TopicInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TopicInfo() {
    topicConstant_ = "";
    path_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TopicInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TopicInfo(
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
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            topicConstant_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              path_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            path_.add(s);
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
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        path_ = path_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v7.common.CriteriaProto.internal_static_google_ads_googleads_v7_common_TopicInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v7.common.CriteriaProto.internal_static_google_ads_googleads_v7_common_TopicInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v7.common.TopicInfo.class, com.google.ads.googleads.v7.common.TopicInfo.Builder.class);
  }

  private int bitField0_;
  public static final int TOPIC_CONSTANT_FIELD_NUMBER = 3;
  private volatile java.lang.Object topicConstant_;
  /**
   * <pre>
   * The Topic Constant resource name.
   * </pre>
   *
   * <code>string topic_constant = 3;</code>
   * @return Whether the topicConstant field is set.
   */
  @java.lang.Override
  public boolean hasTopicConstant() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The Topic Constant resource name.
   * </pre>
   *
   * <code>string topic_constant = 3;</code>
   * @return The topicConstant.
   */
  @java.lang.Override
  public java.lang.String getTopicConstant() {
    java.lang.Object ref = topicConstant_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      topicConstant_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The Topic Constant resource name.
   * </pre>
   *
   * <code>string topic_constant = 3;</code>
   * @return The bytes for topicConstant.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTopicConstantBytes() {
    java.lang.Object ref = topicConstant_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      topicConstant_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PATH_FIELD_NUMBER = 4;
  private com.google.protobuf.LazyStringList path_;
  /**
   * <pre>
   * The category to target or exclude. Each subsequent element in the array
   * describes a more specific sub-category. For example,
   * "Pets &amp; Animals", "Pets", "Dogs" represents the "Pets &amp; Animals/Pets/Dogs"
   * category.
   * </pre>
   *
   * <code>repeated string path = 4;</code>
   * @return A list containing the path.
   */
  public com.google.protobuf.ProtocolStringList
      getPathList() {
    return path_;
  }
  /**
   * <pre>
   * The category to target or exclude. Each subsequent element in the array
   * describes a more specific sub-category. For example,
   * "Pets &amp; Animals", "Pets", "Dogs" represents the "Pets &amp; Animals/Pets/Dogs"
   * category.
   * </pre>
   *
   * <code>repeated string path = 4;</code>
   * @return The count of path.
   */
  public int getPathCount() {
    return path_.size();
  }
  /**
   * <pre>
   * The category to target or exclude. Each subsequent element in the array
   * describes a more specific sub-category. For example,
   * "Pets &amp; Animals", "Pets", "Dogs" represents the "Pets &amp; Animals/Pets/Dogs"
   * category.
   * </pre>
   *
   * <code>repeated string path = 4;</code>
   * @param index The index of the element to return.
   * @return The path at the given index.
   */
  public java.lang.String getPath(int index) {
    return path_.get(index);
  }
  /**
   * <pre>
   * The category to target or exclude. Each subsequent element in the array
   * describes a more specific sub-category. For example,
   * "Pets &amp; Animals", "Pets", "Dogs" represents the "Pets &amp; Animals/Pets/Dogs"
   * category.
   * </pre>
   *
   * <code>repeated string path = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the path at the given index.
   */
  public com.google.protobuf.ByteString
      getPathBytes(int index) {
    return path_.getByteString(index);
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, topicConstant_);
    }
    for (int i = 0; i < path_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, path_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, topicConstant_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < path_.size(); i++) {
        dataSize += computeStringSizeNoTag(path_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPathList().size();
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
    if (!(obj instanceof com.google.ads.googleads.v7.common.TopicInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v7.common.TopicInfo other = (com.google.ads.googleads.v7.common.TopicInfo) obj;

    if (hasTopicConstant() != other.hasTopicConstant()) return false;
    if (hasTopicConstant()) {
      if (!getTopicConstant()
          .equals(other.getTopicConstant())) return false;
    }
    if (!getPathList()
        .equals(other.getPathList())) return false;
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
    if (hasTopicConstant()) {
      hash = (37 * hash) + TOPIC_CONSTANT_FIELD_NUMBER;
      hash = (53 * hash) + getTopicConstant().hashCode();
    }
    if (getPathCount() > 0) {
      hash = (37 * hash) + PATH_FIELD_NUMBER;
      hash = (53 * hash) + getPathList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v7.common.TopicInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.common.TopicInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.TopicInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.common.TopicInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.TopicInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.common.TopicInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.TopicInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.common.TopicInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.TopicInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.common.TopicInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.TopicInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.common.TopicInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v7.common.TopicInfo prototype) {
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
   * A topic criterion. Use topics to target or exclude placements in the
   * Google Display Network based on the category into which the placement falls
   * (for example, "Pets &amp; Animals/Pets/Dogs").
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v7.common.TopicInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v7.common.TopicInfo)
      com.google.ads.googleads.v7.common.TopicInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v7.common.CriteriaProto.internal_static_google_ads_googleads_v7_common_TopicInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v7.common.CriteriaProto.internal_static_google_ads_googleads_v7_common_TopicInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v7.common.TopicInfo.class, com.google.ads.googleads.v7.common.TopicInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v7.common.TopicInfo.newBuilder()
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
      topicConstant_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      path_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v7.common.CriteriaProto.internal_static_google_ads_googleads_v7_common_TopicInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.common.TopicInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v7.common.TopicInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.common.TopicInfo build() {
      com.google.ads.googleads.v7.common.TopicInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.common.TopicInfo buildPartial() {
      com.google.ads.googleads.v7.common.TopicInfo result = new com.google.ads.googleads.v7.common.TopicInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.topicConstant_ = topicConstant_;
      if (((bitField0_ & 0x00000002) != 0)) {
        path_ = path_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.path_ = path_;
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
      if (other instanceof com.google.ads.googleads.v7.common.TopicInfo) {
        return mergeFrom((com.google.ads.googleads.v7.common.TopicInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v7.common.TopicInfo other) {
      if (other == com.google.ads.googleads.v7.common.TopicInfo.getDefaultInstance()) return this;
      if (other.hasTopicConstant()) {
        bitField0_ |= 0x00000001;
        topicConstant_ = other.topicConstant_;
        onChanged();
      }
      if (!other.path_.isEmpty()) {
        if (path_.isEmpty()) {
          path_ = other.path_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensurePathIsMutable();
          path_.addAll(other.path_);
        }
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
      com.google.ads.googleads.v7.common.TopicInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v7.common.TopicInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object topicConstant_ = "";
    /**
     * <pre>
     * The Topic Constant resource name.
     * </pre>
     *
     * <code>string topic_constant = 3;</code>
     * @return Whether the topicConstant field is set.
     */
    public boolean hasTopicConstant() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The Topic Constant resource name.
     * </pre>
     *
     * <code>string topic_constant = 3;</code>
     * @return The topicConstant.
     */
    public java.lang.String getTopicConstant() {
      java.lang.Object ref = topicConstant_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        topicConstant_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The Topic Constant resource name.
     * </pre>
     *
     * <code>string topic_constant = 3;</code>
     * @return The bytes for topicConstant.
     */
    public com.google.protobuf.ByteString
        getTopicConstantBytes() {
      java.lang.Object ref = topicConstant_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        topicConstant_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The Topic Constant resource name.
     * </pre>
     *
     * <code>string topic_constant = 3;</code>
     * @param value The topicConstant to set.
     * @return This builder for chaining.
     */
    public Builder setTopicConstant(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      topicConstant_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Topic Constant resource name.
     * </pre>
     *
     * <code>string topic_constant = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTopicConstant() {
      bitField0_ = (bitField0_ & ~0x00000001);
      topicConstant_ = getDefaultInstance().getTopicConstant();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Topic Constant resource name.
     * </pre>
     *
     * <code>string topic_constant = 3;</code>
     * @param value The bytes for topicConstant to set.
     * @return This builder for chaining.
     */
    public Builder setTopicConstantBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      topicConstant_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList path_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensurePathIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        path_ = new com.google.protobuf.LazyStringArrayList(path_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * The category to target or exclude. Each subsequent element in the array
     * describes a more specific sub-category. For example,
     * "Pets &amp; Animals", "Pets", "Dogs" represents the "Pets &amp; Animals/Pets/Dogs"
     * category.
     * </pre>
     *
     * <code>repeated string path = 4;</code>
     * @return A list containing the path.
     */
    public com.google.protobuf.ProtocolStringList
        getPathList() {
      return path_.getUnmodifiableView();
    }
    /**
     * <pre>
     * The category to target or exclude. Each subsequent element in the array
     * describes a more specific sub-category. For example,
     * "Pets &amp; Animals", "Pets", "Dogs" represents the "Pets &amp; Animals/Pets/Dogs"
     * category.
     * </pre>
     *
     * <code>repeated string path = 4;</code>
     * @return The count of path.
     */
    public int getPathCount() {
      return path_.size();
    }
    /**
     * <pre>
     * The category to target or exclude. Each subsequent element in the array
     * describes a more specific sub-category. For example,
     * "Pets &amp; Animals", "Pets", "Dogs" represents the "Pets &amp; Animals/Pets/Dogs"
     * category.
     * </pre>
     *
     * <code>repeated string path = 4;</code>
     * @param index The index of the element to return.
     * @return The path at the given index.
     */
    public java.lang.String getPath(int index) {
      return path_.get(index);
    }
    /**
     * <pre>
     * The category to target or exclude. Each subsequent element in the array
     * describes a more specific sub-category. For example,
     * "Pets &amp; Animals", "Pets", "Dogs" represents the "Pets &amp; Animals/Pets/Dogs"
     * category.
     * </pre>
     *
     * <code>repeated string path = 4;</code>
     * @param index The index of the value to return.
     * @return The bytes of the path at the given index.
     */
    public com.google.protobuf.ByteString
        getPathBytes(int index) {
      return path_.getByteString(index);
    }
    /**
     * <pre>
     * The category to target or exclude. Each subsequent element in the array
     * describes a more specific sub-category. For example,
     * "Pets &amp; Animals", "Pets", "Dogs" represents the "Pets &amp; Animals/Pets/Dogs"
     * category.
     * </pre>
     *
     * <code>repeated string path = 4;</code>
     * @param index The index to set the value at.
     * @param value The path to set.
     * @return This builder for chaining.
     */
    public Builder setPath(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePathIsMutable();
      path_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The category to target or exclude. Each subsequent element in the array
     * describes a more specific sub-category. For example,
     * "Pets &amp; Animals", "Pets", "Dogs" represents the "Pets &amp; Animals/Pets/Dogs"
     * category.
     * </pre>
     *
     * <code>repeated string path = 4;</code>
     * @param value The path to add.
     * @return This builder for chaining.
     */
    public Builder addPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePathIsMutable();
      path_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The category to target or exclude. Each subsequent element in the array
     * describes a more specific sub-category. For example,
     * "Pets &amp; Animals", "Pets", "Dogs" represents the "Pets &amp; Animals/Pets/Dogs"
     * category.
     * </pre>
     *
     * <code>repeated string path = 4;</code>
     * @param values The path to add.
     * @return This builder for chaining.
     */
    public Builder addAllPath(
        java.lang.Iterable<java.lang.String> values) {
      ensurePathIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, path_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The category to target or exclude. Each subsequent element in the array
     * describes a more specific sub-category. For example,
     * "Pets &amp; Animals", "Pets", "Dogs" represents the "Pets &amp; Animals/Pets/Dogs"
     * category.
     * </pre>
     *
     * <code>repeated string path = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPath() {
      path_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The category to target or exclude. Each subsequent element in the array
     * describes a more specific sub-category. For example,
     * "Pets &amp; Animals", "Pets", "Dogs" represents the "Pets &amp; Animals/Pets/Dogs"
     * category.
     * </pre>
     *
     * <code>repeated string path = 4;</code>
     * @param value The bytes of the path to add.
     * @return This builder for chaining.
     */
    public Builder addPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensurePathIsMutable();
      path_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v7.common.TopicInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v7.common.TopicInfo)
  private static final com.google.ads.googleads.v7.common.TopicInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v7.common.TopicInfo();
  }

  public static com.google.ads.googleads.v7.common.TopicInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TopicInfo>
      PARSER = new com.google.protobuf.AbstractParser<TopicInfo>() {
    @java.lang.Override
    public TopicInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TopicInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TopicInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TopicInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v7.common.TopicInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

