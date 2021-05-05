// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/common/keyword_plan_common.proto

package com.google.ads.googleads.v7.common;

public interface KeywordPlanDeviceSearchesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v7.common.KeywordPlanDeviceSearches)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The device type.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.DeviceEnum.Device device = 1;</code>
   * @return The enum numeric value on the wire for device.
   */
  int getDeviceValue();
  /**
   * <pre>
   * The device type.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.DeviceEnum.Device device = 1;</code>
   * @return The device.
   */
  com.google.ads.googleads.v7.enums.DeviceEnum.Device getDevice();

  /**
   * <pre>
   * The total searches for the device.
   * </pre>
   *
   * <code>int64 search_count = 2;</code>
   * @return Whether the searchCount field is set.
   */
  boolean hasSearchCount();
  /**
   * <pre>
   * The total searches for the device.
   * </pre>
   *
   * <code>int64 search_count = 2;</code>
   * @return The searchCount.
   */
  long getSearchCount();
}
