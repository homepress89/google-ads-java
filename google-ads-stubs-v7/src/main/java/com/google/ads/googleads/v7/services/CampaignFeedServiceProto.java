// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/services/campaign_feed_service.proto

package com.google.ads.googleads.v7.services;

public final class CampaignFeedServiceProto {
  private CampaignFeedServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_services_GetCampaignFeedRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_services_GetCampaignFeedRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_services_MutateCampaignFeedsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_services_MutateCampaignFeedsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_services_CampaignFeedOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_services_CampaignFeedOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_services_MutateCampaignFeedsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_services_MutateCampaignFeedsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_services_MutateCampaignFeedResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_services_MutateCampaignFeedResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v7/services/campa" +
      "ign_feed_service.proto\022 google.ads.googl" +
      "eads.v7.services\0329google/ads/googleads/v" +
      "7/enums/response_content_type.proto\0325goo" +
      "gle/ads/googleads/v7/resources/campaign_" +
      "feed.proto\032\034google/api/annotations.proto" +
      "\032\027google/api/client.proto\032\037google/api/fi" +
      "eld_behavior.proto\032\031google/api/resource." +
      "proto\032 google/protobuf/field_mask.proto\032" +
      "\027google/rpc/status.proto\"^\n\026GetCampaignF" +
      "eedRequest\022D\n\rresource_name\030\001 \001(\tB-\340A\002\372A" +
      "\'\n%googleads.googleapis.com/CampaignFeed" +
      "\"\243\002\n\032MutateCampaignFeedsRequest\022\030\n\013custo" +
      "mer_id\030\001 \001(\tB\003\340A\002\022P\n\noperations\030\002 \003(\01327." +
      "google.ads.googleads.v7.services.Campaig" +
      "nFeedOperationB\003\340A\002\022\027\n\017partial_failure\030\003" +
      " \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\022i\n\025response_" +
      "content_type\030\005 \001(\0162J.google.ads.googlead" +
      "s.v7.enums.ResponseContentTypeEnum.Respo" +
      "nseContentType\"\355\001\n\025CampaignFeedOperation" +
      "\022/\n\013update_mask\030\004 \001(\0132\032.google.protobuf." +
      "FieldMask\022A\n\006create\030\001 \001(\0132/.google.ads.g" +
      "oogleads.v7.resources.CampaignFeedH\000\022A\n\006" +
      "update\030\002 \001(\0132/.google.ads.googleads.v7.r" +
      "esources.CampaignFeedH\000\022\020\n\006remove\030\003 \001(\tH" +
      "\000B\013\n\toperation\"\235\001\n\033MutateCampaignFeedsRe" +
      "sponse\0221\n\025partial_failure_error\030\003 \001(\0132\022." +
      "google.rpc.Status\022K\n\007results\030\002 \003(\0132:.goo" +
      "gle.ads.googleads.v7.services.MutateCamp" +
      "aignFeedResult\"y\n\030MutateCampaignFeedResu" +
      "lt\022\025\n\rresource_name\030\001 \001(\t\022F\n\rcampaign_fe" +
      "ed\030\002 \001(\0132/.google.ads.googleads.v7.resou" +
      "rces.CampaignFeed2\221\004\n\023CampaignFeedServic" +
      "e\022\305\001\n\017GetCampaignFeed\0228.google.ads.googl" +
      "eads.v7.services.GetCampaignFeedRequest\032" +
      "/.google.ads.googleads.v7.resources.Camp" +
      "aignFeed\"G\202\323\344\223\0021\022//v7/{resource_name=cus" +
      "tomers/*/campaignFeeds/*}\332A\rresource_nam" +
      "e\022\352\001\n\023MutateCampaignFeeds\022<.google.ads.g" +
      "oogleads.v7.services.MutateCampaignFeeds" +
      "Request\032=.google.ads.googleads.v7.servic" +
      "es.MutateCampaignFeedsResponse\"V\202\323\344\223\0027\"2" +
      "/v7/customers/{customer_id=*}/campaignFe" +
      "eds:mutate:\001*\332A\026customer_id,operations\032E" +
      "\312A\030googleads.googleapis.com\322A\'https://ww" +
      "w.googleapis.com/auth/adwordsB\377\001\n$com.go" +
      "ogle.ads.googleads.v7.servicesB\030Campaign" +
      "FeedServiceProtoP\001ZHgoogle.golang.org/ge" +
      "nproto/googleapis/ads/googleads/v7/servi" +
      "ces;services\242\002\003GAA\252\002 Google.Ads.GoogleAd" +
      "s.V7.Services\312\002 Google\\Ads\\GoogleAds\\V7\\" +
      "Services\352\002$Google::Ads::GoogleAds::V7::S" +
      "ervicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v7.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v7.resources.CampaignFeedProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v7_services_GetCampaignFeedRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v7_services_GetCampaignFeedRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_services_GetCampaignFeedRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v7_services_MutateCampaignFeedsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v7_services_MutateCampaignFeedsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_services_MutateCampaignFeedsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v7_services_CampaignFeedOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v7_services_CampaignFeedOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_services_CampaignFeedOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v7_services_MutateCampaignFeedsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v7_services_MutateCampaignFeedsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_services_MutateCampaignFeedsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v7_services_MutateCampaignFeedResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v7_services_MutateCampaignFeedResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_services_MutateCampaignFeedResult_descriptor,
        new java.lang.String[] { "ResourceName", "CampaignFeed", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v7.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v7.resources.CampaignFeedProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}