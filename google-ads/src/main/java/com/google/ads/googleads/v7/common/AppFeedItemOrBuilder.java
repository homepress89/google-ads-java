// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/common/extensions.proto

package com.google.ads.googleads.v7.common;

public interface AppFeedItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v7.common.AppFeedItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The visible text displayed when the link is rendered in an ad.
   * This string must not be empty, and the length of this string should
   * be between 1 and 25, inclusive.
   * </pre>
   *
   * <code>string link_text = 9;</code>
   * @return Whether the linkText field is set.
   */
  boolean hasLinkText();
  /**
   * <pre>
   * The visible text displayed when the link is rendered in an ad.
   * This string must not be empty, and the length of this string should
   * be between 1 and 25, inclusive.
   * </pre>
   *
   * <code>string link_text = 9;</code>
   * @return The linkText.
   */
  java.lang.String getLinkText();
  /**
   * <pre>
   * The visible text displayed when the link is rendered in an ad.
   * This string must not be empty, and the length of this string should
   * be between 1 and 25, inclusive.
   * </pre>
   *
   * <code>string link_text = 9;</code>
   * @return The bytes for linkText.
   */
  com.google.protobuf.ByteString
      getLinkTextBytes();

  /**
   * <pre>
   * The store-specific ID for the target application.
   * This string must not be empty.
   * </pre>
   *
   * <code>string app_id = 10;</code>
   * @return Whether the appId field is set.
   */
  boolean hasAppId();
  /**
   * <pre>
   * The store-specific ID for the target application.
   * This string must not be empty.
   * </pre>
   *
   * <code>string app_id = 10;</code>
   * @return The appId.
   */
  java.lang.String getAppId();
  /**
   * <pre>
   * The store-specific ID for the target application.
   * This string must not be empty.
   * </pre>
   *
   * <code>string app_id = 10;</code>
   * @return The bytes for appId.
   */
  com.google.protobuf.ByteString
      getAppIdBytes();

  /**
   * <pre>
   * The application store that the target application belongs to.
   * This field is required.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.AppStoreEnum.AppStore app_store = 3;</code>
   * @return The enum numeric value on the wire for appStore.
   */
  int getAppStoreValue();
  /**
   * <pre>
   * The application store that the target application belongs to.
   * This field is required.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.AppStoreEnum.AppStore app_store = 3;</code>
   * @return The appStore.
   */
  com.google.ads.googleads.v7.enums.AppStoreEnum.AppStore getAppStore();

  /**
   * <pre>
   * A list of possible final URLs after all cross domain redirects.
   * This list must not be empty.
   * </pre>
   *
   * <code>repeated string final_urls = 11;</code>
   * @return A list containing the finalUrls.
   */
  java.util.List<java.lang.String>
      getFinalUrlsList();
  /**
   * <pre>
   * A list of possible final URLs after all cross domain redirects.
   * This list must not be empty.
   * </pre>
   *
   * <code>repeated string final_urls = 11;</code>
   * @return The count of finalUrls.
   */
  int getFinalUrlsCount();
  /**
   * <pre>
   * A list of possible final URLs after all cross domain redirects.
   * This list must not be empty.
   * </pre>
   *
   * <code>repeated string final_urls = 11;</code>
   * @param index The index of the element to return.
   * @return The finalUrls at the given index.
   */
  java.lang.String getFinalUrls(int index);
  /**
   * <pre>
   * A list of possible final URLs after all cross domain redirects.
   * This list must not be empty.
   * </pre>
   *
   * <code>repeated string final_urls = 11;</code>
   * @param index The index of the value to return.
   * @return The bytes of the finalUrls at the given index.
   */
  com.google.protobuf.ByteString
      getFinalUrlsBytes(int index);

  /**
   * <pre>
   * A list of possible final mobile URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated string final_mobile_urls = 12;</code>
   * @return A list containing the finalMobileUrls.
   */
  java.util.List<java.lang.String>
      getFinalMobileUrlsList();
  /**
   * <pre>
   * A list of possible final mobile URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated string final_mobile_urls = 12;</code>
   * @return The count of finalMobileUrls.
   */
  int getFinalMobileUrlsCount();
  /**
   * <pre>
   * A list of possible final mobile URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated string final_mobile_urls = 12;</code>
   * @param index The index of the element to return.
   * @return The finalMobileUrls at the given index.
   */
  java.lang.String getFinalMobileUrls(int index);
  /**
   * <pre>
   * A list of possible final mobile URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated string final_mobile_urls = 12;</code>
   * @param index The index of the value to return.
   * @return The bytes of the finalMobileUrls at the given index.
   */
  com.google.protobuf.ByteString
      getFinalMobileUrlsBytes(int index);

  /**
   * <pre>
   * URL template for constructing a tracking URL. Default value is "{lpurl}".
   * </pre>
   *
   * <code>string tracking_url_template = 13;</code>
   * @return Whether the trackingUrlTemplate field is set.
   */
  boolean hasTrackingUrlTemplate();
  /**
   * <pre>
   * URL template for constructing a tracking URL. Default value is "{lpurl}".
   * </pre>
   *
   * <code>string tracking_url_template = 13;</code>
   * @return The trackingUrlTemplate.
   */
  java.lang.String getTrackingUrlTemplate();
  /**
   * <pre>
   * URL template for constructing a tracking URL. Default value is "{lpurl}".
   * </pre>
   *
   * <code>string tracking_url_template = 13;</code>
   * @return The bytes for trackingUrlTemplate.
   */
  com.google.protobuf.ByteString
      getTrackingUrlTemplateBytes();

  /**
   * <pre>
   * A list of mappings to be used for substituting URL custom parameter tags in
   * the tracking_url_template, final_urls, and/or final_mobile_urls.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.common.CustomParameter url_custom_parameters = 7;</code>
   */
  java.util.List<com.google.ads.googleads.v7.common.CustomParameter> 
      getUrlCustomParametersList();
  /**
   * <pre>
   * A list of mappings to be used for substituting URL custom parameter tags in
   * the tracking_url_template, final_urls, and/or final_mobile_urls.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.common.CustomParameter url_custom_parameters = 7;</code>
   */
  com.google.ads.googleads.v7.common.CustomParameter getUrlCustomParameters(int index);
  /**
   * <pre>
   * A list of mappings to be used for substituting URL custom parameter tags in
   * the tracking_url_template, final_urls, and/or final_mobile_urls.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.common.CustomParameter url_custom_parameters = 7;</code>
   */
  int getUrlCustomParametersCount();
  /**
   * <pre>
   * A list of mappings to be used for substituting URL custom parameter tags in
   * the tracking_url_template, final_urls, and/or final_mobile_urls.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.common.CustomParameter url_custom_parameters = 7;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v7.common.CustomParameterOrBuilder> 
      getUrlCustomParametersOrBuilderList();
  /**
   * <pre>
   * A list of mappings to be used for substituting URL custom parameter tags in
   * the tracking_url_template, final_urls, and/or final_mobile_urls.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.common.CustomParameter url_custom_parameters = 7;</code>
   */
  com.google.ads.googleads.v7.common.CustomParameterOrBuilder getUrlCustomParametersOrBuilder(
      int index);

  /**
   * <pre>
   * URL template for appending params to landing page URLs served with parallel
   * tracking.
   * </pre>
   *
   * <code>string final_url_suffix = 14;</code>
   * @return Whether the finalUrlSuffix field is set.
   */
  boolean hasFinalUrlSuffix();
  /**
   * <pre>
   * URL template for appending params to landing page URLs served with parallel
   * tracking.
   * </pre>
   *
   * <code>string final_url_suffix = 14;</code>
   * @return The finalUrlSuffix.
   */
  java.lang.String getFinalUrlSuffix();
  /**
   * <pre>
   * URL template for appending params to landing page URLs served with parallel
   * tracking.
   * </pre>
   *
   * <code>string final_url_suffix = 14;</code>
   * @return The bytes for finalUrlSuffix.
   */
  com.google.protobuf.ByteString
      getFinalUrlSuffixBytes();
}
