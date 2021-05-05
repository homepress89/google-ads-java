// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/resources/ad_group.proto

package com.google.ads.googleads.v7.resources;

public interface AdGroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v7.resources.AdGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the ad group.
   * Ad group resource names have the form:
   * `customers/{customer_id}/adGroups/{ad_group_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the ad group.
   * Ad group resource names have the form:
   * `customers/{customer_id}/adGroups/{ad_group_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the ad group.
   * </pre>
   *
   * <code>int64 id = 34 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the ad group.
   * </pre>
   *
   * <code>int64 id = 34 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * The name of the ad group.
   * This field is required and should not be empty when creating new ad
   * groups.
   * It must contain fewer than 255 UTF-8 full-width characters.
   * It must not contain any null (code point 0x0), NL line feed
   * (code point 0xA) or carriage return (code point 0xD) characters.
   * </pre>
   *
   * <code>string name = 35;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * The name of the ad group.
   * This field is required and should not be empty when creating new ad
   * groups.
   * It must contain fewer than 255 UTF-8 full-width characters.
   * It must not contain any null (code point 0x0), NL line feed
   * (code point 0xA) or carriage return (code point 0xD) characters.
   * </pre>
   *
   * <code>string name = 35;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the ad group.
   * This field is required and should not be empty when creating new ad
   * groups.
   * It must contain fewer than 255 UTF-8 full-width characters.
   * It must not contain any null (code point 0x0), NL line feed
   * (code point 0xA) or carriage return (code point 0xD) characters.
   * </pre>
   *
   * <code>string name = 35;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The status of the ad group.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.AdGroupStatusEnum.AdGroupStatus status = 5;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * The status of the ad group.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.AdGroupStatusEnum.AdGroupStatus status = 5;</code>
   * @return The status.
   */
  com.google.ads.googleads.v7.enums.AdGroupStatusEnum.AdGroupStatus getStatus();

  /**
   * <pre>
   * Immutable. The type of the ad group.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.AdGroupTypeEnum.AdGroupType type = 12 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Immutable. The type of the ad group.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.AdGroupTypeEnum.AdGroupType type = 12 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The type.
   */
  com.google.ads.googleads.v7.enums.AdGroupTypeEnum.AdGroupType getType();

  /**
   * <pre>
   * The ad rotation mode of the ad group.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.AdGroupAdRotationModeEnum.AdGroupAdRotationMode ad_rotation_mode = 22;</code>
   * @return The enum numeric value on the wire for adRotationMode.
   */
  int getAdRotationModeValue();
  /**
   * <pre>
   * The ad rotation mode of the ad group.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.AdGroupAdRotationModeEnum.AdGroupAdRotationMode ad_rotation_mode = 22;</code>
   * @return The adRotationMode.
   */
  com.google.ads.googleads.v7.enums.AdGroupAdRotationModeEnum.AdGroupAdRotationMode getAdRotationMode();

  /**
   * <pre>
   * Output only. For draft or experiment ad groups, this field is the resource name of the
   * base ad group from which this ad group was created. If a draft or
   * experiment ad group does not have a base ad group, then this field is null.
   * For base ad groups, this field equals the ad group resource name.
   * This field is read-only.
   * </pre>
   *
   * <code>string base_ad_group = 36 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the baseAdGroup field is set.
   */
  boolean hasBaseAdGroup();
  /**
   * <pre>
   * Output only. For draft or experiment ad groups, this field is the resource name of the
   * base ad group from which this ad group was created. If a draft or
   * experiment ad group does not have a base ad group, then this field is null.
   * For base ad groups, this field equals the ad group resource name.
   * This field is read-only.
   * </pre>
   *
   * <code>string base_ad_group = 36 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The baseAdGroup.
   */
  java.lang.String getBaseAdGroup();
  /**
   * <pre>
   * Output only. For draft or experiment ad groups, this field is the resource name of the
   * base ad group from which this ad group was created. If a draft or
   * experiment ad group does not have a base ad group, then this field is null.
   * For base ad groups, this field equals the ad group resource name.
   * This field is read-only.
   * </pre>
   *
   * <code>string base_ad_group = 36 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for baseAdGroup.
   */
  com.google.protobuf.ByteString
      getBaseAdGroupBytes();

  /**
   * <pre>
   * The URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>string tracking_url_template = 37;</code>
   * @return Whether the trackingUrlTemplate field is set.
   */
  boolean hasTrackingUrlTemplate();
  /**
   * <pre>
   * The URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>string tracking_url_template = 37;</code>
   * @return The trackingUrlTemplate.
   */
  java.lang.String getTrackingUrlTemplate();
  /**
   * <pre>
   * The URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>string tracking_url_template = 37;</code>
   * @return The bytes for trackingUrlTemplate.
   */
  com.google.protobuf.ByteString
      getTrackingUrlTemplateBytes();

  /**
   * <pre>
   * The list of mappings used to substitute custom parameter tags in a
   * `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.common.CustomParameter url_custom_parameters = 6;</code>
   */
  java.util.List<com.google.ads.googleads.v7.common.CustomParameter> 
      getUrlCustomParametersList();
  /**
   * <pre>
   * The list of mappings used to substitute custom parameter tags in a
   * `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.common.CustomParameter url_custom_parameters = 6;</code>
   */
  com.google.ads.googleads.v7.common.CustomParameter getUrlCustomParameters(int index);
  /**
   * <pre>
   * The list of mappings used to substitute custom parameter tags in a
   * `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.common.CustomParameter url_custom_parameters = 6;</code>
   */
  int getUrlCustomParametersCount();
  /**
   * <pre>
   * The list of mappings used to substitute custom parameter tags in a
   * `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.common.CustomParameter url_custom_parameters = 6;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v7.common.CustomParameterOrBuilder> 
      getUrlCustomParametersOrBuilderList();
  /**
   * <pre>
   * The list of mappings used to substitute custom parameter tags in a
   * `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.common.CustomParameter url_custom_parameters = 6;</code>
   */
  com.google.ads.googleads.v7.common.CustomParameterOrBuilder getUrlCustomParametersOrBuilder(
      int index);

  /**
   * <pre>
   * Immutable. The campaign to which the ad group belongs.
   * </pre>
   *
   * <code>string campaign = 38 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the campaign field is set.
   */
  boolean hasCampaign();
  /**
   * <pre>
   * Immutable. The campaign to which the ad group belongs.
   * </pre>
   *
   * <code>string campaign = 38 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The campaign.
   */
  java.lang.String getCampaign();
  /**
   * <pre>
   * Immutable. The campaign to which the ad group belongs.
   * </pre>
   *
   * <code>string campaign = 38 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for campaign.
   */
  com.google.protobuf.ByteString
      getCampaignBytes();

  /**
   * <pre>
   * The maximum CPC (cost-per-click) bid.
   * </pre>
   *
   * <code>int64 cpc_bid_micros = 39;</code>
   * @return Whether the cpcBidMicros field is set.
   */
  boolean hasCpcBidMicros();
  /**
   * <pre>
   * The maximum CPC (cost-per-click) bid.
   * </pre>
   *
   * <code>int64 cpc_bid_micros = 39;</code>
   * @return The cpcBidMicros.
   */
  long getCpcBidMicros();

  /**
   * <pre>
   * The maximum CPM (cost-per-thousand viewable impressions) bid.
   * </pre>
   *
   * <code>int64 cpm_bid_micros = 40;</code>
   * @return Whether the cpmBidMicros field is set.
   */
  boolean hasCpmBidMicros();
  /**
   * <pre>
   * The maximum CPM (cost-per-thousand viewable impressions) bid.
   * </pre>
   *
   * <code>int64 cpm_bid_micros = 40;</code>
   * @return The cpmBidMicros.
   */
  long getCpmBidMicros();

  /**
   * <pre>
   * The target CPA (cost-per-acquisition).
   * </pre>
   *
   * <code>int64 target_cpa_micros = 41;</code>
   * @return Whether the targetCpaMicros field is set.
   */
  boolean hasTargetCpaMicros();
  /**
   * <pre>
   * The target CPA (cost-per-acquisition).
   * </pre>
   *
   * <code>int64 target_cpa_micros = 41;</code>
   * @return The targetCpaMicros.
   */
  long getTargetCpaMicros();

  /**
   * <pre>
   * Output only. The CPV (cost-per-view) bid.
   * </pre>
   *
   * <code>int64 cpv_bid_micros = 42 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the cpvBidMicros field is set.
   */
  boolean hasCpvBidMicros();
  /**
   * <pre>
   * Output only. The CPV (cost-per-view) bid.
   * </pre>
   *
   * <code>int64 cpv_bid_micros = 42 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The cpvBidMicros.
   */
  long getCpvBidMicros();

  /**
   * <pre>
   * Average amount in micros that the advertiser is willing to pay for every
   * thousand times the ad is shown.
   * </pre>
   *
   * <code>int64 target_cpm_micros = 43;</code>
   * @return Whether the targetCpmMicros field is set.
   */
  boolean hasTargetCpmMicros();
  /**
   * <pre>
   * Average amount in micros that the advertiser is willing to pay for every
   * thousand times the ad is shown.
   * </pre>
   *
   * <code>int64 target_cpm_micros = 43;</code>
   * @return The targetCpmMicros.
   */
  long getTargetCpmMicros();

  /**
   * <pre>
   * The target ROAS (return-on-ad-spend) override. If the ad group's campaign
   * bidding strategy is a standard Target ROAS strategy, then this field
   * overrides the target ROAS specified in the campaign's bidding strategy.
   * Otherwise, this value is ignored.
   * </pre>
   *
   * <code>double target_roas = 44;</code>
   * @return Whether the targetRoas field is set.
   */
  boolean hasTargetRoas();
  /**
   * <pre>
   * The target ROAS (return-on-ad-spend) override. If the ad group's campaign
   * bidding strategy is a standard Target ROAS strategy, then this field
   * overrides the target ROAS specified in the campaign's bidding strategy.
   * Otherwise, this value is ignored.
   * </pre>
   *
   * <code>double target_roas = 44;</code>
   * @return The targetRoas.
   */
  double getTargetRoas();

  /**
   * <pre>
   * The percent cpc bid amount, expressed as a fraction of the advertised price
   * for some good or service. The valid range for the fraction is [0,1) and the
   * value stored here is 1,000,000 * [fraction].
   * </pre>
   *
   * <code>int64 percent_cpc_bid_micros = 45;</code>
   * @return Whether the percentCpcBidMicros field is set.
   */
  boolean hasPercentCpcBidMicros();
  /**
   * <pre>
   * The percent cpc bid amount, expressed as a fraction of the advertised price
   * for some good or service. The valid range for the fraction is [0,1) and the
   * value stored here is 1,000,000 * [fraction].
   * </pre>
   *
   * <code>int64 percent_cpc_bid_micros = 45;</code>
   * @return The percentCpcBidMicros.
   */
  long getPercentCpcBidMicros();

  /**
   * <pre>
   * Settings for the Display Campaign Optimizer, initially termed "Explorer".
   * </pre>
   *
   * <code>.google.ads.googleads.v7.common.ExplorerAutoOptimizerSetting explorer_auto_optimizer_setting = 21;</code>
   * @return Whether the explorerAutoOptimizerSetting field is set.
   */
  boolean hasExplorerAutoOptimizerSetting();
  /**
   * <pre>
   * Settings for the Display Campaign Optimizer, initially termed "Explorer".
   * </pre>
   *
   * <code>.google.ads.googleads.v7.common.ExplorerAutoOptimizerSetting explorer_auto_optimizer_setting = 21;</code>
   * @return The explorerAutoOptimizerSetting.
   */
  com.google.ads.googleads.v7.common.ExplorerAutoOptimizerSetting getExplorerAutoOptimizerSetting();
  /**
   * <pre>
   * Settings for the Display Campaign Optimizer, initially termed "Explorer".
   * </pre>
   *
   * <code>.google.ads.googleads.v7.common.ExplorerAutoOptimizerSetting explorer_auto_optimizer_setting = 21;</code>
   */
  com.google.ads.googleads.v7.common.ExplorerAutoOptimizerSettingOrBuilder getExplorerAutoOptimizerSettingOrBuilder();

  /**
   * <pre>
   * Allows advertisers to specify a targeting dimension on which to place
   * absolute bids. This is only applicable for campaigns that target only the
   * display network and not search.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.TargetingDimensionEnum.TargetingDimension display_custom_bid_dimension = 23;</code>
   * @return The enum numeric value on the wire for displayCustomBidDimension.
   */
  int getDisplayCustomBidDimensionValue();
  /**
   * <pre>
   * Allows advertisers to specify a targeting dimension on which to place
   * absolute bids. This is only applicable for campaigns that target only the
   * display network and not search.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.TargetingDimensionEnum.TargetingDimension display_custom_bid_dimension = 23;</code>
   * @return The displayCustomBidDimension.
   */
  com.google.ads.googleads.v7.enums.TargetingDimensionEnum.TargetingDimension getDisplayCustomBidDimension();

  /**
   * <pre>
   * URL template for appending params to Final URL.
   * </pre>
   *
   * <code>string final_url_suffix = 46;</code>
   * @return Whether the finalUrlSuffix field is set.
   */
  boolean hasFinalUrlSuffix();
  /**
   * <pre>
   * URL template for appending params to Final URL.
   * </pre>
   *
   * <code>string final_url_suffix = 46;</code>
   * @return The finalUrlSuffix.
   */
  java.lang.String getFinalUrlSuffix();
  /**
   * <pre>
   * URL template for appending params to Final URL.
   * </pre>
   *
   * <code>string final_url_suffix = 46;</code>
   * @return The bytes for finalUrlSuffix.
   */
  com.google.protobuf.ByteString
      getFinalUrlSuffixBytes();

  /**
   * <pre>
   * Setting for targeting related features.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.common.TargetingSetting targeting_setting = 25;</code>
   * @return Whether the targetingSetting field is set.
   */
  boolean hasTargetingSetting();
  /**
   * <pre>
   * Setting for targeting related features.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.common.TargetingSetting targeting_setting = 25;</code>
   * @return The targetingSetting.
   */
  com.google.ads.googleads.v7.common.TargetingSetting getTargetingSetting();
  /**
   * <pre>
   * Setting for targeting related features.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.common.TargetingSetting targeting_setting = 25;</code>
   */
  com.google.ads.googleads.v7.common.TargetingSettingOrBuilder getTargetingSettingOrBuilder();

  /**
   * <pre>
   * Output only. The effective target CPA (cost-per-acquisition).
   * This field is read-only.
   * </pre>
   *
   * <code>int64 effective_target_cpa_micros = 47 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the effectiveTargetCpaMicros field is set.
   */
  boolean hasEffectiveTargetCpaMicros();
  /**
   * <pre>
   * Output only. The effective target CPA (cost-per-acquisition).
   * This field is read-only.
   * </pre>
   *
   * <code>int64 effective_target_cpa_micros = 47 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The effectiveTargetCpaMicros.
   */
  long getEffectiveTargetCpaMicros();

  /**
   * <pre>
   * Output only. Source of the effective target CPA.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.BiddingSourceEnum.BiddingSource effective_target_cpa_source = 29 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for effectiveTargetCpaSource.
   */
  int getEffectiveTargetCpaSourceValue();
  /**
   * <pre>
   * Output only. Source of the effective target CPA.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.BiddingSourceEnum.BiddingSource effective_target_cpa_source = 29 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The effectiveTargetCpaSource.
   */
  com.google.ads.googleads.v7.enums.BiddingSourceEnum.BiddingSource getEffectiveTargetCpaSource();

  /**
   * <pre>
   * Output only. The effective target ROAS (return-on-ad-spend).
   * This field is read-only.
   * </pre>
   *
   * <code>double effective_target_roas = 48 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the effectiveTargetRoas field is set.
   */
  boolean hasEffectiveTargetRoas();
  /**
   * <pre>
   * Output only. The effective target ROAS (return-on-ad-spend).
   * This field is read-only.
   * </pre>
   *
   * <code>double effective_target_roas = 48 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The effectiveTargetRoas.
   */
  double getEffectiveTargetRoas();

  /**
   * <pre>
   * Output only. Source of the effective target ROAS.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.BiddingSourceEnum.BiddingSource effective_target_roas_source = 32 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for effectiveTargetRoasSource.
   */
  int getEffectiveTargetRoasSourceValue();
  /**
   * <pre>
   * Output only. Source of the effective target ROAS.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.BiddingSourceEnum.BiddingSource effective_target_roas_source = 32 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The effectiveTargetRoasSource.
   */
  com.google.ads.googleads.v7.enums.BiddingSourceEnum.BiddingSource getEffectiveTargetRoasSource();

  /**
   * <pre>
   * Output only. The resource names of labels attached to this ad group.
   * </pre>
   *
   * <code>repeated string labels = 49 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return A list containing the labels.
   */
  java.util.List<java.lang.String>
      getLabelsList();
  /**
   * <pre>
   * Output only. The resource names of labels attached to this ad group.
   * </pre>
   *
   * <code>repeated string labels = 49 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The count of labels.
   */
  int getLabelsCount();
  /**
   * <pre>
   * Output only. The resource names of labels attached to this ad group.
   * </pre>
   *
   * <code>repeated string labels = 49 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @param index The index of the element to return.
   * @return The labels at the given index.
   */
  java.lang.String getLabels(int index);
  /**
   * <pre>
   * Output only. The resource names of labels attached to this ad group.
   * </pre>
   *
   * <code>repeated string labels = 49 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the labels at the given index.
   */
  com.google.protobuf.ByteString
      getLabelsBytes(int index);

  /**
   * <pre>
   * The asset field types that should be excluded from this ad group. Asset
   * links with these field types will not be inherited by this ad group from
   * the upper levels.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.enums.AssetFieldTypeEnum.AssetFieldType excluded_parent_asset_field_types = 54;</code>
   * @return A list containing the excludedParentAssetFieldTypes.
   */
  java.util.List<com.google.ads.googleads.v7.enums.AssetFieldTypeEnum.AssetFieldType> getExcludedParentAssetFieldTypesList();
  /**
   * <pre>
   * The asset field types that should be excluded from this ad group. Asset
   * links with these field types will not be inherited by this ad group from
   * the upper levels.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.enums.AssetFieldTypeEnum.AssetFieldType excluded_parent_asset_field_types = 54;</code>
   * @return The count of excludedParentAssetFieldTypes.
   */
  int getExcludedParentAssetFieldTypesCount();
  /**
   * <pre>
   * The asset field types that should be excluded from this ad group. Asset
   * links with these field types will not be inherited by this ad group from
   * the upper levels.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.enums.AssetFieldTypeEnum.AssetFieldType excluded_parent_asset_field_types = 54;</code>
   * @param index The index of the element to return.
   * @return The excludedParentAssetFieldTypes at the given index.
   */
  com.google.ads.googleads.v7.enums.AssetFieldTypeEnum.AssetFieldType getExcludedParentAssetFieldTypes(int index);
  /**
   * <pre>
   * The asset field types that should be excluded from this ad group. Asset
   * links with these field types will not be inherited by this ad group from
   * the upper levels.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.enums.AssetFieldTypeEnum.AssetFieldType excluded_parent_asset_field_types = 54;</code>
   * @return A list containing the enum numeric values on the wire for excludedParentAssetFieldTypes.
   */
  java.util.List<java.lang.Integer>
  getExcludedParentAssetFieldTypesValueList();
  /**
   * <pre>
   * The asset field types that should be excluded from this ad group. Asset
   * links with these field types will not be inherited by this ad group from
   * the upper levels.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.enums.AssetFieldTypeEnum.AssetFieldType excluded_parent_asset_field_types = 54;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of excludedParentAssetFieldTypes at the given index.
   */
  int getExcludedParentAssetFieldTypesValue(int index);
}
