// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/common/ad_asset.proto

package com.google.ads.googleads.v7.common;

public final class AdAssetProto {
  private AdAssetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_common_AdTextAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_common_AdTextAsset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_common_AdImageAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_common_AdImageAsset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_common_AdVideoAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_common_AdVideoAsset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_common_AdMediaBundleAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_common_AdMediaBundleAsset_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/ads/googleads/v7/common/ad_asse" +
      "t.proto\022\036google.ads.googleads.v7.common\032" +
      "1google/ads/googleads/v7/common/asset_po" +
      "licy.proto\032;google/ads/googleads/v7/enum" +
      "s/asset_performance_label.proto\032;google/" +
      "ads/googleads/v7/enums/served_asset_fiel" +
      "d_type.proto\032\034google/api/annotations.pro" +
      "to\"\321\002\n\013AdTextAsset\022\021\n\004text\030\004 \001(\tH\000\210\001\001\022b\n" +
      "\014pinned_field\030\002 \001(\0162L.google.ads.googlea" +
      "ds.v7.enums.ServedAssetFieldTypeEnum.Ser" +
      "vedAssetFieldType\022o\n\027asset_performance_l" +
      "abel\030\005 \001(\0162N.google.ads.googleads.v7.enu" +
      "ms.AssetPerformanceLabelEnum.AssetPerfor" +
      "manceLabel\022Q\n\023policy_summary_info\030\006 \001(\0132" +
      "4.google.ads.googleads.v7.common.AdAsset" +
      "PolicySummaryB\007\n\005_text\",\n\014AdImageAsset\022\022" +
      "\n\005asset\030\002 \001(\tH\000\210\001\001B\010\n\006_asset\",\n\014AdVideoA" +
      "sset\022\022\n\005asset\030\002 \001(\tH\000\210\001\001B\010\n\006_asset\"2\n\022Ad" +
      "MediaBundleAsset\022\022\n\005asset\030\002 \001(\tH\000\210\001\001B\010\n\006" +
      "_assetB\347\001\n\"com.google.ads.googleads.v7.c" +
      "ommonB\014AdAssetProtoP\001ZDgoogle.golang.org" +
      "/genproto/googleapis/ads/googleads/v7/co" +
      "mmon;common\242\002\003GAA\252\002\036Google.Ads.GoogleAds" +
      ".V7.Common\312\002\036Google\\Ads\\GoogleAds\\V7\\Com" +
      "mon\352\002\"Google::Ads::GoogleAds::V7::Common" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v7.common.AssetPolicyProto.getDescriptor(),
          com.google.ads.googleads.v7.enums.AssetPerformanceLabelProto.getDescriptor(),
          com.google.ads.googleads.v7.enums.ServedAssetFieldTypeProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v7_common_AdTextAsset_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v7_common_AdTextAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_common_AdTextAsset_descriptor,
        new java.lang.String[] { "Text", "PinnedField", "AssetPerformanceLabel", "PolicySummaryInfo", "Text", });
    internal_static_google_ads_googleads_v7_common_AdImageAsset_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v7_common_AdImageAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_common_AdImageAsset_descriptor,
        new java.lang.String[] { "Asset", "Asset", });
    internal_static_google_ads_googleads_v7_common_AdVideoAsset_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v7_common_AdVideoAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_common_AdVideoAsset_descriptor,
        new java.lang.String[] { "Asset", "Asset", });
    internal_static_google_ads_googleads_v7_common_AdMediaBundleAsset_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v7_common_AdMediaBundleAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_common_AdMediaBundleAsset_descriptor,
        new java.lang.String[] { "Asset", "Asset", });
    com.google.ads.googleads.v7.common.AssetPolicyProto.getDescriptor();
    com.google.ads.googleads.v7.enums.AssetPerformanceLabelProto.getDescriptor();
    com.google.ads.googleads.v7.enums.ServedAssetFieldTypeProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
