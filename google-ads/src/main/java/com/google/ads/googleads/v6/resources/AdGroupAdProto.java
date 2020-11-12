// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/resources/ad_group_ad.proto

package com.google.ads.googleads.v6.resources;

public final class AdGroupAdProto {
  private AdGroupAdProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_resources_AdGroupAd_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_resources_AdGroupAd_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_resources_AdGroupAdPolicySummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_resources_AdGroupAdPolicySummary_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/ads/googleads/v6/resources/ad_g" +
      "roup_ad.proto\022!google.ads.googleads.v6.r" +
      "esources\032+google/ads/googleads/v6/common" +
      "/policy.proto\0326google/ads/googleads/v6/e" +
      "nums/ad_group_ad_status.proto\032/google/ad" +
      "s/googleads/v6/enums/ad_strength.proto\032:" +
      "google/ads/googleads/v6/enums/policy_app" +
      "roval_status.proto\0328google/ads/googleads" +
      "/v6/enums/policy_review_status.proto\032*go" +
      "ogle/ads/googleads/v6/resources/ad.proto" +
      "\032\037google/api/field_behavior.proto\032\031googl" +
      "e/api/resource.proto\032\034google/api/annotat" +
      "ions.proto\"\267\004\n\tAdGroupAd\022A\n\rresource_nam" +
      "e\030\001 \001(\tB*\340A\005\372A$\n\"googleads.googleapis.co" +
      "m/AdGroupAd\022R\n\006status\030\003 \001(\0162B.google.ads" +
      ".googleads.v6.enums.AdGroupAdStatusEnum." +
      "AdGroupAdStatus\022?\n\010ad_group\030\t \001(\tB(\340A\005\372A" +
      "\"\n googleads.googleapis.com/AdGroupH\000\210\001\001" +
      "\0226\n\002ad\030\005 \001(\0132%.google.ads.googleads.v6.r" +
      "esources.AdB\003\340A\005\022V\n\016policy_summary\030\006 \001(\013" +
      "29.google.ads.googleads.v6.resources.AdG" +
      "roupAdPolicySummaryB\003\340A\003\022R\n\013ad_strength\030" +
      "\007 \001(\01628.google.ads.googleads.v6.enums.Ad" +
      "StrengthEnum.AdStrengthB\003\340A\003:a\352A^\n\"googl" +
      "eads.googleapis.com/AdGroupAd\0228customers" +
      "/{customer_id}/adGroupAds/{ad_group_id}~" +
      "{ad_id}B\013\n\t_ad_group\"\277\002\n\026AdGroupAdPolicy" +
      "Summary\022S\n\024policy_topic_entries\030\001 \003(\01320." +
      "google.ads.googleads.v6.common.PolicyTop" +
      "icEntryB\003\340A\003\022d\n\rreview_status\030\002 \001(\0162H.go" +
      "ogle.ads.googleads.v6.enums.PolicyReview" +
      "StatusEnum.PolicyReviewStatusB\003\340A\003\022j\n\017ap" +
      "proval_status\030\003 \001(\0162L.google.ads.googlea" +
      "ds.v6.enums.PolicyApprovalStatusEnum.Pol" +
      "icyApprovalStatusB\003\340A\003B\373\001\n%com.google.ad" +
      "s.googleads.v6.resourcesB\016AdGroupAdProto" +
      "P\001ZJgoogle.golang.org/genproto/googleapi" +
      "s/ads/googleads/v6/resources;resources\242\002" +
      "\003GAA\252\002!Google.Ads.GoogleAds.V6.Resources" +
      "\312\002!Google\\Ads\\GoogleAds\\V6\\Resources\352\002%G" +
      "oogle::Ads::GoogleAds::V6::Resourcesb\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v6.common.PolicyProto.getDescriptor(),
          com.google.ads.googleads.v6.enums.AdGroupAdStatusProto.getDescriptor(),
          com.google.ads.googleads.v6.enums.AdStrengthProto.getDescriptor(),
          com.google.ads.googleads.v6.enums.PolicyApprovalStatusProto.getDescriptor(),
          com.google.ads.googleads.v6.enums.PolicyReviewStatusProto.getDescriptor(),
          com.google.ads.googleads.v6.resources.AdProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v6_resources_AdGroupAd_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_resources_AdGroupAd_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_resources_AdGroupAd_descriptor,
        new java.lang.String[] { "ResourceName", "Status", "AdGroup", "Ad", "PolicySummary", "AdStrength", "AdGroup", });
    internal_static_google_ads_googleads_v6_resources_AdGroupAdPolicySummary_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v6_resources_AdGroupAdPolicySummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_resources_AdGroupAdPolicySummary_descriptor,
        new java.lang.String[] { "PolicyTopicEntries", "ReviewStatus", "ApprovalStatus", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v6.common.PolicyProto.getDescriptor();
    com.google.ads.googleads.v6.enums.AdGroupAdStatusProto.getDescriptor();
    com.google.ads.googleads.v6.enums.AdStrengthProto.getDescriptor();
    com.google.ads.googleads.v6.enums.PolicyApprovalStatusProto.getDescriptor();
    com.google.ads.googleads.v6.enums.PolicyReviewStatusProto.getDescriptor();
    com.google.ads.googleads.v6.resources.AdProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
