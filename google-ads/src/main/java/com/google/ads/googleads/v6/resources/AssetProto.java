// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/resources/asset.proto

package com.google.ads.googleads.v6.resources;

public final class AssetProto {
  private AssetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_resources_Asset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_resources_Asset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_resources_AssetPolicySummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_resources_AssetPolicySummary_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/ads/googleads/v6/resources/asse" +
      "t.proto\022!google.ads.googleads.v6.resourc" +
      "es\0320google/ads/googleads/v6/common/asset" +
      "_types.proto\032+google/ads/googleads/v6/co" +
      "mmon/policy.proto\032.google/ads/googleads/" +
      "v6/enums/asset_type.proto\032:google/ads/go" +
      "ogleads/v6/enums/policy_approval_status." +
      "proto\0328google/ads/googleads/v6/enums/pol" +
      "icy_review_status.proto\032\037google/api/fiel" +
      "d_behavior.proto\032\031google/api/resource.pr" +
      "oto\032\034google/api/annotations.proto\"\347\006\n\005As" +
      "set\022=\n\rresource_name\030\001 \001(\tB&\340A\005\372A \n\036goog" +
      "leads.googleapis.com/Asset\022\024\n\002id\030\013 \001(\003B\003" +
      "\340A\003H\001\210\001\001\022\021\n\004name\030\014 \001(\tH\002\210\001\001\022I\n\004type\030\004 \001(" +
      "\01626.google.ads.googleads.v6.enums.AssetT" +
      "ypeEnum.AssetTypeB\003\340A\003\022\022\n\nfinal_urls\030\016 \003" +
      "(\t\022R\n\016policy_summary\030\r \001(\01325.google.ads." +
      "googleads.v6.resources.AssetPolicySummar" +
      "yB\003\340A\003\022U\n\023youtube_video_asset\030\005 \001(\01321.go" +
      "ogle.ads.googleads.v6.common.YoutubeVide" +
      "oAssetB\003\340A\005H\000\022S\n\022media_bundle_asset\030\006 \001(" +
      "\01320.google.ads.googleads.v6.common.Media" +
      "BundleAssetB\003\340A\005H\000\022F\n\013image_asset\030\007 \001(\0132" +
      "*.google.ads.googleads.v6.common.ImageAs" +
      "setB\003\340A\003H\000\022D\n\ntext_asset\030\010 \001(\0132).google." +
      "ads.googleads.v6.common.TextAssetB\003\340A\003H\000" +
      "\022H\n\017lead_form_asset\030\t \001(\0132-.google.ads.g" +
      "oogleads.v6.common.LeadFormAssetH\000\022Q\n\024bo" +
      "ok_on_google_asset\030\n \001(\01321.google.ads.go" +
      "ogleads.v6.common.BookOnGoogleAssetH\000:N\352" +
      "AK\n\036googleads.googleapis.com/Asset\022)cust" +
      "omers/{customer_id}/assets/{asset_id}B\014\n" +
      "\nasset_dataB\005\n\003_idB\007\n\005_name\"\273\002\n\022AssetPol" +
      "icySummary\022S\n\024policy_topic_entries\030\001 \003(\013" +
      "20.google.ads.googleads.v6.common.Policy" +
      "TopicEntryB\003\340A\003\022d\n\rreview_status\030\002 \001(\0162H" +
      ".google.ads.googleads.v6.enums.PolicyRev" +
      "iewStatusEnum.PolicyReviewStatusB\003\340A\003\022j\n" +
      "\017approval_status\030\003 \001(\0162L.google.ads.goog" +
      "leads.v6.enums.PolicyApprovalStatusEnum." +
      "PolicyApprovalStatusB\003\340A\003B\367\001\n%com.google" +
      ".ads.googleads.v6.resourcesB\nAssetProtoP" +
      "\001ZJgoogle.golang.org/genproto/googleapis" +
      "/ads/googleads/v6/resources;resources\242\002\003" +
      "GAA\252\002!Google.Ads.GoogleAds.V6.Resources\312" +
      "\002!Google\\Ads\\GoogleAds\\V6\\Resources\352\002%Go" +
      "ogle::Ads::GoogleAds::V6::Resourcesb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v6.common.AssetTypesProto.getDescriptor(),
          com.google.ads.googleads.v6.common.PolicyProto.getDescriptor(),
          com.google.ads.googleads.v6.enums.AssetTypeProto.getDescriptor(),
          com.google.ads.googleads.v6.enums.PolicyApprovalStatusProto.getDescriptor(),
          com.google.ads.googleads.v6.enums.PolicyReviewStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v6_resources_Asset_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_resources_Asset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_resources_Asset_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Type", "FinalUrls", "PolicySummary", "YoutubeVideoAsset", "MediaBundleAsset", "ImageAsset", "TextAsset", "LeadFormAsset", "BookOnGoogleAsset", "AssetData", "Id", "Name", });
    internal_static_google_ads_googleads_v6_resources_AssetPolicySummary_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v6_resources_AssetPolicySummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_resources_AssetPolicySummary_descriptor,
        new java.lang.String[] { "PolicyTopicEntries", "ReviewStatus", "ApprovalStatus", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v6.common.AssetTypesProto.getDescriptor();
    com.google.ads.googleads.v6.common.PolicyProto.getDescriptor();
    com.google.ads.googleads.v6.enums.AssetTypeProto.getDescriptor();
    com.google.ads.googleads.v6.enums.PolicyApprovalStatusProto.getDescriptor();
    com.google.ads.googleads.v6.enums.PolicyReviewStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
