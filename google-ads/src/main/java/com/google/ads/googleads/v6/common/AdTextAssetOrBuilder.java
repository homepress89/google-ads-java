// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/common/ad_asset.proto

package com.google.ads.googleads.v6.common;

public interface AdTextAssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v6.common.AdTextAsset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Asset text.
   * </pre>
   *
   * <code>string text = 4;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <pre>
   * Asset text.
   * </pre>
   *
   * <code>string text = 4;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * Asset text.
   * </pre>
   *
   * <code>string text = 4;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * The pinned field of the asset. This restricts the asset to only serve
   * within this field. Multiple assets can be pinned to the same field. An
   * asset that is unpinned or pinned to a different field will not serve in a
   * field where some other asset has been pinned.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType pinned_field = 2;</code>
   * @return The enum numeric value on the wire for pinnedField.
   */
  int getPinnedFieldValue();
  /**
   * <pre>
   * The pinned field of the asset. This restricts the asset to only serve
   * within this field. Multiple assets can be pinned to the same field. An
   * asset that is unpinned or pinned to a different field will not serve in a
   * field where some other asset has been pinned.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType pinned_field = 2;</code>
   * @return The pinnedField.
   */
  com.google.ads.googleads.v6.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType getPinnedField();

  /**
   * <pre>
   * The performance label of this text asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.enums.AssetPerformanceLabelEnum.AssetPerformanceLabel asset_performance_label = 5;</code>
   * @return The enum numeric value on the wire for assetPerformanceLabel.
   */
  int getAssetPerformanceLabelValue();
  /**
   * <pre>
   * The performance label of this text asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.enums.AssetPerformanceLabelEnum.AssetPerformanceLabel asset_performance_label = 5;</code>
   * @return The assetPerformanceLabel.
   */
  com.google.ads.googleads.v6.enums.AssetPerformanceLabelEnum.AssetPerformanceLabel getAssetPerformanceLabel();

  /**
   * <pre>
   * The policy summary of this text asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.common.AdAssetPolicySummary policy_summary_info = 6;</code>
   * @return Whether the policySummaryInfo field is set.
   */
  boolean hasPolicySummaryInfo();
  /**
   * <pre>
   * The policy summary of this text asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.common.AdAssetPolicySummary policy_summary_info = 6;</code>
   * @return The policySummaryInfo.
   */
  com.google.ads.googleads.v6.common.AdAssetPolicySummary getPolicySummaryInfo();
  /**
   * <pre>
   * The policy summary of this text asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.common.AdAssetPolicySummary policy_summary_info = 6;</code>
   */
  com.google.ads.googleads.v6.common.AdAssetPolicySummaryOrBuilder getPolicySummaryInfoOrBuilder();
}
