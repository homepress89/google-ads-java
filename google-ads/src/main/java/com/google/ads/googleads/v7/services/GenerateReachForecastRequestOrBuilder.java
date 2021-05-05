// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/services/reach_plan_service.proto

package com.google.ads.googleads.v7.services;

public interface GenerateReachForecastRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v7.services.GenerateReachForecastRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * The currency code.
   * Three-character ISO 4217 currency code.
   * </pre>
   *
   * <code>string currency_code = 9;</code>
   * @return Whether the currencyCode field is set.
   */
  boolean hasCurrencyCode();
  /**
   * <pre>
   * The currency code.
   * Three-character ISO 4217 currency code.
   * </pre>
   *
   * <code>string currency_code = 9;</code>
   * @return The currencyCode.
   */
  java.lang.String getCurrencyCode();
  /**
   * <pre>
   * The currency code.
   * Three-character ISO 4217 currency code.
   * </pre>
   *
   * <code>string currency_code = 9;</code>
   * @return The bytes for currencyCode.
   */
  com.google.protobuf.ByteString
      getCurrencyCodeBytes();

  /**
   * <pre>
   * Required. Campaign duration.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.services.CampaignDuration campaign_duration = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the campaignDuration field is set.
   */
  boolean hasCampaignDuration();
  /**
   * <pre>
   * Required. Campaign duration.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.services.CampaignDuration campaign_duration = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The campaignDuration.
   */
  com.google.ads.googleads.v7.services.CampaignDuration getCampaignDuration();
  /**
   * <pre>
   * Required. Campaign duration.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.services.CampaignDuration campaign_duration = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v7.services.CampaignDurationOrBuilder getCampaignDurationOrBuilder();

  /**
   * <pre>
   * Desired cookie frequency cap that will be applied to each planned product.
   * This is equivalent to the frequency cap exposed in Google Ads when creating
   * a campaign, it represents the maximum number of times an ad can be shown to
   * the same user.
   * If not specified no cap is applied.
   * This field is deprecated in v4 and will eventually be removed.
   * Please use cookie_frequency_cap_setting instead.
   * </pre>
   *
   * <code>int32 cookie_frequency_cap = 10;</code>
   * @return Whether the cookieFrequencyCap field is set.
   */
  boolean hasCookieFrequencyCap();
  /**
   * <pre>
   * Desired cookie frequency cap that will be applied to each planned product.
   * This is equivalent to the frequency cap exposed in Google Ads when creating
   * a campaign, it represents the maximum number of times an ad can be shown to
   * the same user.
   * If not specified no cap is applied.
   * This field is deprecated in v4 and will eventually be removed.
   * Please use cookie_frequency_cap_setting instead.
   * </pre>
   *
   * <code>int32 cookie_frequency_cap = 10;</code>
   * @return The cookieFrequencyCap.
   */
  int getCookieFrequencyCap();

  /**
   * <pre>
   * Desired cookie frequency cap that will be applied to each planned product.
   * This is equivalent to the frequency cap exposed in Google Ads when creating
   * a campaign, it represents the maximum number of times an ad can be shown to
   * the same user during a specified time interval.
   * If not specified, no cap is applied.
   * This field replaces the deprecated cookie_frequency_cap field.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.services.FrequencyCap cookie_frequency_cap_setting = 8;</code>
   * @return Whether the cookieFrequencyCapSetting field is set.
   */
  boolean hasCookieFrequencyCapSetting();
  /**
   * <pre>
   * Desired cookie frequency cap that will be applied to each planned product.
   * This is equivalent to the frequency cap exposed in Google Ads when creating
   * a campaign, it represents the maximum number of times an ad can be shown to
   * the same user during a specified time interval.
   * If not specified, no cap is applied.
   * This field replaces the deprecated cookie_frequency_cap field.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.services.FrequencyCap cookie_frequency_cap_setting = 8;</code>
   * @return The cookieFrequencyCapSetting.
   */
  com.google.ads.googleads.v7.services.FrequencyCap getCookieFrequencyCapSetting();
  /**
   * <pre>
   * Desired cookie frequency cap that will be applied to each planned product.
   * This is equivalent to the frequency cap exposed in Google Ads when creating
   * a campaign, it represents the maximum number of times an ad can be shown to
   * the same user during a specified time interval.
   * If not specified, no cap is applied.
   * This field replaces the deprecated cookie_frequency_cap field.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.services.FrequencyCap cookie_frequency_cap_setting = 8;</code>
   */
  com.google.ads.googleads.v7.services.FrequencyCapOrBuilder getCookieFrequencyCapSettingOrBuilder();

  /**
   * <pre>
   * Desired minimum effective frequency (the number of times a person was
   * exposed to the ad) for the reported reach metrics [1-10].
   * This won't affect the targeting, but just the reporting.
   * If not specified, a default of 1 is applied.
   * </pre>
   *
   * <code>int32 min_effective_frequency = 11;</code>
   * @return Whether the minEffectiveFrequency field is set.
   */
  boolean hasMinEffectiveFrequency();
  /**
   * <pre>
   * Desired minimum effective frequency (the number of times a person was
   * exposed to the ad) for the reported reach metrics [1-10].
   * This won't affect the targeting, but just the reporting.
   * If not specified, a default of 1 is applied.
   * </pre>
   *
   * <code>int32 min_effective_frequency = 11;</code>
   * @return The minEffectiveFrequency.
   */
  int getMinEffectiveFrequency();

  /**
   * <pre>
   * The targeting to be applied to all products selected in the product mix.
   * This is planned targeting: execution details might vary based on the
   * advertising product, please consult an implementation specialist.
   * See specific metrics for details on how targeting affects them.
   * In some cases, targeting may be overridden using the
   * PlannedProduct.advanced_product_targeting field.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.services.Targeting targeting = 6;</code>
   * @return Whether the targeting field is set.
   */
  boolean hasTargeting();
  /**
   * <pre>
   * The targeting to be applied to all products selected in the product mix.
   * This is planned targeting: execution details might vary based on the
   * advertising product, please consult an implementation specialist.
   * See specific metrics for details on how targeting affects them.
   * In some cases, targeting may be overridden using the
   * PlannedProduct.advanced_product_targeting field.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.services.Targeting targeting = 6;</code>
   * @return The targeting.
   */
  com.google.ads.googleads.v7.services.Targeting getTargeting();
  /**
   * <pre>
   * The targeting to be applied to all products selected in the product mix.
   * This is planned targeting: execution details might vary based on the
   * advertising product, please consult an implementation specialist.
   * See specific metrics for details on how targeting affects them.
   * In some cases, targeting may be overridden using the
   * PlannedProduct.advanced_product_targeting field.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.services.Targeting targeting = 6;</code>
   */
  com.google.ads.googleads.v7.services.TargetingOrBuilder getTargetingOrBuilder();

  /**
   * <pre>
   * Required. The products to be forecast.
   * The max number of allowed planned products is 15.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.services.PlannedProduct planned_products = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.ads.googleads.v7.services.PlannedProduct> 
      getPlannedProductsList();
  /**
   * <pre>
   * Required. The products to be forecast.
   * The max number of allowed planned products is 15.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.services.PlannedProduct planned_products = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v7.services.PlannedProduct getPlannedProducts(int index);
  /**
   * <pre>
   * Required. The products to be forecast.
   * The max number of allowed planned products is 15.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.services.PlannedProduct planned_products = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getPlannedProductsCount();
  /**
   * <pre>
   * Required. The products to be forecast.
   * The max number of allowed planned products is 15.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.services.PlannedProduct planned_products = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v7.services.PlannedProductOrBuilder> 
      getPlannedProductsOrBuilderList();
  /**
   * <pre>
   * Required. The products to be forecast.
   * The max number of allowed planned products is 15.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.services.PlannedProduct planned_products = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v7.services.PlannedProductOrBuilder getPlannedProductsOrBuilder(
      int index);
}
