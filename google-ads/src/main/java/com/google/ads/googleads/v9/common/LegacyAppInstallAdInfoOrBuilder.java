// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/common/ad_type_infos.proto

package com.google.ads.googleads.v9.common;

public interface LegacyAppInstallAdInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v9.common.LegacyAppInstallAdInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the mobile app.
   * </pre>
   *
   * <code>optional string app_id = 6;</code>
   * @return Whether the appId field is set.
   */
  boolean hasAppId();
  /**
   * <pre>
   * The ID of the mobile app.
   * </pre>
   *
   * <code>optional string app_id = 6;</code>
   * @return The appId.
   */
  java.lang.String getAppId();
  /**
   * <pre>
   * The ID of the mobile app.
   * </pre>
   *
   * <code>optional string app_id = 6;</code>
   * @return The bytes for appId.
   */
  com.google.protobuf.ByteString
      getAppIdBytes();

  /**
   * <pre>
   * The app store the mobile app is available in.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.LegacyAppInstallAdAppStoreEnum.LegacyAppInstallAdAppStore app_store = 2;</code>
   * @return The enum numeric value on the wire for appStore.
   */
  int getAppStoreValue();
  /**
   * <pre>
   * The app store the mobile app is available in.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.LegacyAppInstallAdAppStoreEnum.LegacyAppInstallAdAppStore app_store = 2;</code>
   * @return The appStore.
   */
  com.google.ads.googleads.v9.enums.LegacyAppInstallAdAppStoreEnum.LegacyAppInstallAdAppStore getAppStore();

  /**
   * <pre>
   * The headline of the ad.
   * </pre>
   *
   * <code>optional string headline = 7;</code>
   * @return Whether the headline field is set.
   */
  boolean hasHeadline();
  /**
   * <pre>
   * The headline of the ad.
   * </pre>
   *
   * <code>optional string headline = 7;</code>
   * @return The headline.
   */
  java.lang.String getHeadline();
  /**
   * <pre>
   * The headline of the ad.
   * </pre>
   *
   * <code>optional string headline = 7;</code>
   * @return The bytes for headline.
   */
  com.google.protobuf.ByteString
      getHeadlineBytes();

  /**
   * <pre>
   * The first description line of the ad.
   * </pre>
   *
   * <code>optional string description1 = 8;</code>
   * @return Whether the description1 field is set.
   */
  boolean hasDescription1();
  /**
   * <pre>
   * The first description line of the ad.
   * </pre>
   *
   * <code>optional string description1 = 8;</code>
   * @return The description1.
   */
  java.lang.String getDescription1();
  /**
   * <pre>
   * The first description line of the ad.
   * </pre>
   *
   * <code>optional string description1 = 8;</code>
   * @return The bytes for description1.
   */
  com.google.protobuf.ByteString
      getDescription1Bytes();

  /**
   * <pre>
   * The second description line of the ad.
   * </pre>
   *
   * <code>optional string description2 = 9;</code>
   * @return Whether the description2 field is set.
   */
  boolean hasDescription2();
  /**
   * <pre>
   * The second description line of the ad.
   * </pre>
   *
   * <code>optional string description2 = 9;</code>
   * @return The description2.
   */
  java.lang.String getDescription2();
  /**
   * <pre>
   * The second description line of the ad.
   * </pre>
   *
   * <code>optional string description2 = 9;</code>
   * @return The bytes for description2.
   */
  com.google.protobuf.ByteString
      getDescription2Bytes();
}