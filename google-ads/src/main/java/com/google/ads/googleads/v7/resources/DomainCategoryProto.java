// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/resources/domain_category.proto

package com.google.ads.googleads.v7.resources;

public final class DomainCategoryProto {
  private DomainCategoryProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_resources_DomainCategory_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_resources_DomainCategory_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v7/resources/doma" +
      "in_category.proto\022!google.ads.googleads." +
      "v7.resources\032\037google/api/field_behavior." +
      "proto\032\031google/api/resource.proto\032\034google" +
      "/api/annotations.proto\"\236\005\n\016DomainCategor" +
      "y\022F\n\rresource_name\030\001 \001(\tB/\340A\003\372A)\n\'google" +
      "ads.googleapis.com/DomainCategory\022@\n\010cam" +
      "paign\030\n \001(\tB)\340A\003\372A#\n!googleads.googleapi" +
      "s.com/CampaignH\000\210\001\001\022\032\n\010category\030\013 \001(\tB\003\340" +
      "A\003H\001\210\001\001\022\037\n\rlanguage_code\030\014 \001(\tB\003\340A\003H\002\210\001\001" +
      "\022\030\n\006domain\030\r \001(\tB\003\340A\003H\003\210\001\001\022#\n\021coverage_f" +
      "raction\030\016 \001(\001B\003\340A\003H\004\210\001\001\022\037\n\rcategory_rank" +
      "\030\017 \001(\003B\003\340A\003H\005\210\001\001\022\036\n\014has_children\030\020 \001(\010B\003" +
      "\340A\003H\006\210\001\001\022,\n\032recommended_cpc_bid_micros\030\021" +
      " \001(\003B\003\340A\003H\007\210\001\001:\207\001\352A\203\001\n\'googleads.googlea" +
      "pis.com/DomainCategory\022Xcustomers/{custo" +
      "mer_id}/domainCategories/{campaign_id}~{" +
      "base64_category}~{language_code}B\013\n\t_cam" +
      "paignB\013\n\t_categoryB\020\n\016_language_codeB\t\n\007" +
      "_domainB\024\n\022_coverage_fractionB\020\n\016_catego" +
      "ry_rankB\017\n\r_has_childrenB\035\n\033_recommended" +
      "_cpc_bid_microsB\200\002\n%com.google.ads.googl" +
      "eads.v7.resourcesB\023DomainCategoryProtoP\001" +
      "ZJgoogle.golang.org/genproto/googleapis/" +
      "ads/googleads/v7/resources;resources\242\002\003G" +
      "AA\252\002!Google.Ads.GoogleAds.V7.Resources\312\002" +
      "!Google\\Ads\\GoogleAds\\V7\\Resources\352\002%Goo" +
      "gle::Ads::GoogleAds::V7::Resourcesb\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v7_resources_DomainCategory_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v7_resources_DomainCategory_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_resources_DomainCategory_descriptor,
        new java.lang.String[] { "ResourceName", "Campaign", "Category", "LanguageCode", "Domain", "CoverageFraction", "CategoryRank", "HasChildren", "RecommendedCpcBidMicros", "Campaign", "Category", "LanguageCode", "Domain", "CoverageFraction", "CategoryRank", "HasChildren", "RecommendedCpcBidMicros", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
