// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/resources/bidding_strategy.proto

package com.google.ads.googleads.v7.resources;

public final class BiddingStrategyProto {
  private BiddingStrategyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_resources_BiddingStrategy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_resources_BiddingStrategy_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v7/resources/bidd" +
      "ing_strategy.proto\022!google.ads.googleads" +
      ".v7.resources\032,google/ads/googleads/v7/c" +
      "ommon/bidding.proto\032;google/ads/googlead" +
      "s/v7/enums/bidding_strategy_status.proto" +
      "\0329google/ads/googleads/v7/enums/bidding_" +
      "strategy_type.proto\032\037google/api/field_be" +
      "havior.proto\032\031google/api/resource.proto\032" +
      "\034google/api/annotations.proto\"\265\t\n\017Biddin" +
      "gStrategy\022G\n\rresource_name\030\001 \001(\tB0\340A\005\372A*" +
      "\n(googleads.googleapis.com/BiddingStrate" +
      "gy\022\024\n\002id\030\020 \001(\003B\003\340A\003H\001\210\001\001\022\021\n\004name\030\021 \001(\tH\002" +
      "\210\001\001\022c\n\006status\030\017 \001(\0162N.google.ads.googlea" +
      "ds.v7.enums.BiddingStrategyStatusEnum.Bi" +
      "ddingStrategyStatusB\003\340A\003\022]\n\004type\030\005 \001(\0162J" +
      ".google.ads.googleads.v7.enums.BiddingSt" +
      "rategyTypeEnum.BiddingStrategyTypeB\003\340A\003\022" +
      ")\n\027effective_currency_code\030\024 \001(\tB\003\340A\003H\003\210" +
      "\001\001\022 \n\016campaign_count\030\022 \001(\003B\003\340A\003H\004\210\001\001\022,\n\032" +
      "non_removed_campaign_count\030\023 \001(\003B\003\340A\003H\005\210" +
      "\001\001\022C\n\014enhanced_cpc\030\007 \001(\0132+.google.ads.go" +
      "ogleads.v7.common.EnhancedCpcH\000\022\\\n\031maxim" +
      "ize_conversion_value\030\025 \001(\01327.google.ads." +
      "googleads.v7.common.MaximizeConversionVa" +
      "lueH\000\022S\n\024maximize_conversions\030\026 \001(\01323.go" +
      "ogle.ads.googleads.v7.common.MaximizeCon" +
      "versionsH\000\022?\n\ntarget_cpa\030\t \001(\0132).google." +
      "ads.googleads.v7.common.TargetCpaH\000\022X\n\027t" +
      "arget_impression_share\0300 \001(\01325.google.ad" +
      "s.googleads.v7.common.TargetImpressionSh" +
      "areH\000\022A\n\013target_roas\030\013 \001(\0132*.google.ads." +
      "googleads.v7.common.TargetRoasH\000\022C\n\014targ" +
      "et_spend\030\014 \001(\0132+.google.ads.googleads.v7" +
      ".common.TargetSpendH\000:n\352Ak\n(googleads.go" +
      "ogleapis.com/BiddingStrategy\022?customers/" +
      "{customer_id}/biddingStrategies/{bidding" +
      "_strategy_id}B\010\n\006schemeB\005\n\003_idB\007\n\005_nameB" +
      "\032\n\030_effective_currency_codeB\021\n\017_campaign" +
      "_countB\035\n\033_non_removed_campaign_countB\201\002" +
      "\n%com.google.ads.googleads.v7.resourcesB" +
      "\024BiddingStrategyProtoP\001ZJgoogle.golang.o" +
      "rg/genproto/googleapis/ads/googleads/v7/" +
      "resources;resources\242\002\003GAA\252\002!Google.Ads.G" +
      "oogleAds.V7.Resources\312\002!Google\\Ads\\Googl" +
      "eAds\\V7\\Resources\352\002%Google::Ads::GoogleA" +
      "ds::V7::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v7.common.BiddingProto.getDescriptor(),
          com.google.ads.googleads.v7.enums.BiddingStrategyStatusProto.getDescriptor(),
          com.google.ads.googleads.v7.enums.BiddingStrategyTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v7_resources_BiddingStrategy_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v7_resources_BiddingStrategy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_resources_BiddingStrategy_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Status", "Type", "EffectiveCurrencyCode", "CampaignCount", "NonRemovedCampaignCount", "EnhancedCpc", "MaximizeConversionValue", "MaximizeConversions", "TargetCpa", "TargetImpressionShare", "TargetRoas", "TargetSpend", "Scheme", "Id", "Name", "EffectiveCurrencyCode", "CampaignCount", "NonRemovedCampaignCount", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v7.common.BiddingProto.getDescriptor();
    com.google.ads.googleads.v7.enums.BiddingStrategyStatusProto.getDescriptor();
    com.google.ads.googleads.v7.enums.BiddingStrategyTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
