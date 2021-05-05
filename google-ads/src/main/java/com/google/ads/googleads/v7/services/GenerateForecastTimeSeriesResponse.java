// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/services/keyword_plan_service.proto

package com.google.ads.googleads.v7.services;

/**
 * <pre>
 * Response message for [KeywordPlanService.GenerateForecastTimeSeries][google.ads.googleads.v7.services.KeywordPlanService.GenerateForecastTimeSeries].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse}
 */
public final class GenerateForecastTimeSeriesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse)
    GenerateForecastTimeSeriesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenerateForecastTimeSeriesResponse.newBuilder() to construct.
  private GenerateForecastTimeSeriesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenerateForecastTimeSeriesResponse() {
    weeklyTimeSeriesForecasts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenerateForecastTimeSeriesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GenerateForecastTimeSeriesResponse(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              weeklyTimeSeriesForecasts_ = new java.util.ArrayList<com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast>();
              mutable_bitField0_ |= 0x00000001;
            }
            weeklyTimeSeriesForecasts_.add(
                input.readMessage(com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        weeklyTimeSeriesForecasts_ = java.util.Collections.unmodifiableList(weeklyTimeSeriesForecasts_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v7.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v7_services_GenerateForecastTimeSeriesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v7.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v7_services_GenerateForecastTimeSeriesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse.class, com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse.Builder.class);
  }

  public static final int WEEKLY_TIME_SERIES_FORECASTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast> weeklyTimeSeriesForecasts_;
  /**
   * <pre>
   * List of weekly time series forecasts for the keyword plan campaign.
   * One maximum.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast weekly_time_series_forecasts = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast> getWeeklyTimeSeriesForecastsList() {
    return weeklyTimeSeriesForecasts_;
  }
  /**
   * <pre>
   * List of weekly time series forecasts for the keyword plan campaign.
   * One maximum.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast weekly_time_series_forecasts = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecastOrBuilder> 
      getWeeklyTimeSeriesForecastsOrBuilderList() {
    return weeklyTimeSeriesForecasts_;
  }
  /**
   * <pre>
   * List of weekly time series forecasts for the keyword plan campaign.
   * One maximum.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast weekly_time_series_forecasts = 1;</code>
   */
  @java.lang.Override
  public int getWeeklyTimeSeriesForecastsCount() {
    return weeklyTimeSeriesForecasts_.size();
  }
  /**
   * <pre>
   * List of weekly time series forecasts for the keyword plan campaign.
   * One maximum.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast weekly_time_series_forecasts = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast getWeeklyTimeSeriesForecasts(int index) {
    return weeklyTimeSeriesForecasts_.get(index);
  }
  /**
   * <pre>
   * List of weekly time series forecasts for the keyword plan campaign.
   * One maximum.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast weekly_time_series_forecasts = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecastOrBuilder getWeeklyTimeSeriesForecastsOrBuilder(
      int index) {
    return weeklyTimeSeriesForecasts_.get(index);
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
    for (int i = 0; i < weeklyTimeSeriesForecasts_.size(); i++) {
      output.writeMessage(1, weeklyTimeSeriesForecasts_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < weeklyTimeSeriesForecasts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, weeklyTimeSeriesForecasts_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse other = (com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse) obj;

    if (!getWeeklyTimeSeriesForecastsList()
        .equals(other.getWeeklyTimeSeriesForecastsList())) return false;
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
    if (getWeeklyTimeSeriesForecastsCount() > 0) {
      hash = (37 * hash) + WEEKLY_TIME_SERIES_FORECASTS_FIELD_NUMBER;
      hash = (53 * hash) + getWeeklyTimeSeriesForecastsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse prototype) {
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
   * Response message for [KeywordPlanService.GenerateForecastTimeSeries][google.ads.googleads.v7.services.KeywordPlanService.GenerateForecastTimeSeries].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse)
      com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v7.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v7_services_GenerateForecastTimeSeriesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v7.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v7_services_GenerateForecastTimeSeriesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse.class, com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse.newBuilder()
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
        getWeeklyTimeSeriesForecastsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (weeklyTimeSeriesForecastsBuilder_ == null) {
        weeklyTimeSeriesForecasts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        weeklyTimeSeriesForecastsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v7.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v7_services_GenerateForecastTimeSeriesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse build() {
      com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse buildPartial() {
      com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse result = new com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse(this);
      int from_bitField0_ = bitField0_;
      if (weeklyTimeSeriesForecastsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          weeklyTimeSeriesForecasts_ = java.util.Collections.unmodifiableList(weeklyTimeSeriesForecasts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.weeklyTimeSeriesForecasts_ = weeklyTimeSeriesForecasts_;
      } else {
        result.weeklyTimeSeriesForecasts_ = weeklyTimeSeriesForecastsBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse) {
        return mergeFrom((com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse other) {
      if (other == com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse.getDefaultInstance()) return this;
      if (weeklyTimeSeriesForecastsBuilder_ == null) {
        if (!other.weeklyTimeSeriesForecasts_.isEmpty()) {
          if (weeklyTimeSeriesForecasts_.isEmpty()) {
            weeklyTimeSeriesForecasts_ = other.weeklyTimeSeriesForecasts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureWeeklyTimeSeriesForecastsIsMutable();
            weeklyTimeSeriesForecasts_.addAll(other.weeklyTimeSeriesForecasts_);
          }
          onChanged();
        }
      } else {
        if (!other.weeklyTimeSeriesForecasts_.isEmpty()) {
          if (weeklyTimeSeriesForecastsBuilder_.isEmpty()) {
            weeklyTimeSeriesForecastsBuilder_.dispose();
            weeklyTimeSeriesForecastsBuilder_ = null;
            weeklyTimeSeriesForecasts_ = other.weeklyTimeSeriesForecasts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            weeklyTimeSeriesForecastsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getWeeklyTimeSeriesForecastsFieldBuilder() : null;
          } else {
            weeklyTimeSeriesForecastsBuilder_.addAllMessages(other.weeklyTimeSeriesForecasts_);
          }
        }
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
      com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast> weeklyTimeSeriesForecasts_ =
      java.util.Collections.emptyList();
    private void ensureWeeklyTimeSeriesForecastsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        weeklyTimeSeriesForecasts_ = new java.util.ArrayList<com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast>(weeklyTimeSeriesForecasts_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast, com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast.Builder, com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecastOrBuilder> weeklyTimeSeriesForecastsBuilder_;

    /**
     * <pre>
     * List of weekly time series forecasts for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast weekly_time_series_forecasts = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast> getWeeklyTimeSeriesForecastsList() {
      if (weeklyTimeSeriesForecastsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(weeklyTimeSeriesForecasts_);
      } else {
        return weeklyTimeSeriesForecastsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of weekly time series forecasts for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast weekly_time_series_forecasts = 1;</code>
     */
    public int getWeeklyTimeSeriesForecastsCount() {
      if (weeklyTimeSeriesForecastsBuilder_ == null) {
        return weeklyTimeSeriesForecasts_.size();
      } else {
        return weeklyTimeSeriesForecastsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of weekly time series forecasts for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast weekly_time_series_forecasts = 1;</code>
     */
    public com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast getWeeklyTimeSeriesForecasts(int index) {
      if (weeklyTimeSeriesForecastsBuilder_ == null) {
        return weeklyTimeSeriesForecasts_.get(index);
      } else {
        return weeklyTimeSeriesForecastsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of weekly time series forecasts for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast weekly_time_series_forecasts = 1;</code>
     */
    public Builder setWeeklyTimeSeriesForecasts(
        int index, com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast value) {
      if (weeklyTimeSeriesForecastsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWeeklyTimeSeriesForecastsIsMutable();
        weeklyTimeSeriesForecasts_.set(index, value);
        onChanged();
      } else {
        weeklyTimeSeriesForecastsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of weekly time series forecasts for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast weekly_time_series_forecasts = 1;</code>
     */
    public Builder setWeeklyTimeSeriesForecasts(
        int index, com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast.Builder builderForValue) {
      if (weeklyTimeSeriesForecastsBuilder_ == null) {
        ensureWeeklyTimeSeriesForecastsIsMutable();
        weeklyTimeSeriesForecasts_.set(index, builderForValue.build());
        onChanged();
      } else {
        weeklyTimeSeriesForecastsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of weekly time series forecasts for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast weekly_time_series_forecasts = 1;</code>
     */
    public Builder addWeeklyTimeSeriesForecasts(com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast value) {
      if (weeklyTimeSeriesForecastsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWeeklyTimeSeriesForecastsIsMutable();
        weeklyTimeSeriesForecasts_.add(value);
        onChanged();
      } else {
        weeklyTimeSeriesForecastsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of weekly time series forecasts for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast weekly_time_series_forecasts = 1;</code>
     */
    public Builder addWeeklyTimeSeriesForecasts(
        int index, com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast value) {
      if (weeklyTimeSeriesForecastsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWeeklyTimeSeriesForecastsIsMutable();
        weeklyTimeSeriesForecasts_.add(index, value);
        onChanged();
      } else {
        weeklyTimeSeriesForecastsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of weekly time series forecasts for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast weekly_time_series_forecasts = 1;</code>
     */
    public Builder addWeeklyTimeSeriesForecasts(
        com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast.Builder builderForValue) {
      if (weeklyTimeSeriesForecastsBuilder_ == null) {
        ensureWeeklyTimeSeriesForecastsIsMutable();
        weeklyTimeSeriesForecasts_.add(builderForValue.build());
        onChanged();
      } else {
        weeklyTimeSeriesForecastsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of weekly time series forecasts for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast weekly_time_series_forecasts = 1;</code>
     */
    public Builder addWeeklyTimeSeriesForecasts(
        int index, com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast.Builder builderForValue) {
      if (weeklyTimeSeriesForecastsBuilder_ == null) {
        ensureWeeklyTimeSeriesForecastsIsMutable();
        weeklyTimeSeriesForecasts_.add(index, builderForValue.build());
        onChanged();
      } else {
        weeklyTimeSeriesForecastsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of weekly time series forecasts for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast weekly_time_series_forecasts = 1;</code>
     */
    public Builder addAllWeeklyTimeSeriesForecasts(
        java.lang.Iterable<? extends com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast> values) {
      if (weeklyTimeSeriesForecastsBuilder_ == null) {
        ensureWeeklyTimeSeriesForecastsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, weeklyTimeSeriesForecasts_);
        onChanged();
      } else {
        weeklyTimeSeriesForecastsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of weekly time series forecasts for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast weekly_time_series_forecasts = 1;</code>
     */
    public Builder clearWeeklyTimeSeriesForecasts() {
      if (weeklyTimeSeriesForecastsBuilder_ == null) {
        weeklyTimeSeriesForecasts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        weeklyTimeSeriesForecastsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of weekly time series forecasts for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast weekly_time_series_forecasts = 1;</code>
     */
    public Builder removeWeeklyTimeSeriesForecasts(int index) {
      if (weeklyTimeSeriesForecastsBuilder_ == null) {
        ensureWeeklyTimeSeriesForecastsIsMutable();
        weeklyTimeSeriesForecasts_.remove(index);
        onChanged();
      } else {
        weeklyTimeSeriesForecastsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of weekly time series forecasts for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast weekly_time_series_forecasts = 1;</code>
     */
    public com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast.Builder getWeeklyTimeSeriesForecastsBuilder(
        int index) {
      return getWeeklyTimeSeriesForecastsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of weekly time series forecasts for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast weekly_time_series_forecasts = 1;</code>
     */
    public com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecastOrBuilder getWeeklyTimeSeriesForecastsOrBuilder(
        int index) {
      if (weeklyTimeSeriesForecastsBuilder_ == null) {
        return weeklyTimeSeriesForecasts_.get(index);  } else {
        return weeklyTimeSeriesForecastsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of weekly time series forecasts for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast weekly_time_series_forecasts = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecastOrBuilder> 
         getWeeklyTimeSeriesForecastsOrBuilderList() {
      if (weeklyTimeSeriesForecastsBuilder_ != null) {
        return weeklyTimeSeriesForecastsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(weeklyTimeSeriesForecasts_);
      }
    }
    /**
     * <pre>
     * List of weekly time series forecasts for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast weekly_time_series_forecasts = 1;</code>
     */
    public com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast.Builder addWeeklyTimeSeriesForecastsBuilder() {
      return getWeeklyTimeSeriesForecastsFieldBuilder().addBuilder(
          com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast.getDefaultInstance());
    }
    /**
     * <pre>
     * List of weekly time series forecasts for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast weekly_time_series_forecasts = 1;</code>
     */
    public com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast.Builder addWeeklyTimeSeriesForecastsBuilder(
        int index) {
      return getWeeklyTimeSeriesForecastsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast.getDefaultInstance());
    }
    /**
     * <pre>
     * List of weekly time series forecasts for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast weekly_time_series_forecasts = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast.Builder> 
         getWeeklyTimeSeriesForecastsBuilderList() {
      return getWeeklyTimeSeriesForecastsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast, com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast.Builder, com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecastOrBuilder> 
        getWeeklyTimeSeriesForecastsFieldBuilder() {
      if (weeklyTimeSeriesForecastsBuilder_ == null) {
        weeklyTimeSeriesForecastsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast, com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecast.Builder, com.google.ads.googleads.v7.services.KeywordPlanWeeklyTimeSeriesForecastOrBuilder>(
                weeklyTimeSeriesForecasts_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        weeklyTimeSeriesForecasts_ = null;
      }
      return weeklyTimeSeriesForecastsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse)
  private static final com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse();
  }

  public static com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateForecastTimeSeriesResponse>
      PARSER = new com.google.protobuf.AbstractParser<GenerateForecastTimeSeriesResponse>() {
    @java.lang.Override
    public GenerateForecastTimeSeriesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GenerateForecastTimeSeriesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GenerateForecastTimeSeriesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateForecastTimeSeriesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v7.services.GenerateForecastTimeSeriesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

