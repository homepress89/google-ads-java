// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/services/campaign_customizer_service.proto

package com.google.ads.googleads.v10.services;

public final class CampaignCustomizerServiceProto {
  private CampaignCustomizerServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_MutateCampaignCustomizersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_MutateCampaignCustomizersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_CampaignCustomizerOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_CampaignCustomizerOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_MutateCampaignCustomizersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_MutateCampaignCustomizersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_MutateCampaignCustomizerResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_MutateCampaignCustomizerResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/ads/googleads/v10/services/camp" +
      "aign_customizer_service.proto\022!google.ad" +
      "s.googleads.v10.services\032:google/ads/goo" +
      "gleads/v10/enums/response_content_type.p" +
      "roto\032<google/ads/googleads/v10/resources" +
      "/campaign_customizer.proto\032\034google/api/a" +
      "nnotations.proto\032\027google/api/client.prot" +
      "o\032\037google/api/field_behavior.proto\032\031goog" +
      "le/api/resource.proto\032\027google/rpc/status" +
      ".proto\"\261\002\n MutateCampaignCustomizersRequ" +
      "est\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022W\n\noperati" +
      "ons\030\002 \003(\0132>.google.ads.googleads.v10.ser" +
      "vices.CampaignCustomizerOperationB\003\340A\002\022\027" +
      "\n\017partial_failure\030\003 \001(\010\022\025\n\rvalidate_only" +
      "\030\004 \001(\010\022j\n\025response_content_type\030\005 \001(\0162K." +
      "google.ads.googleads.v10.enums.ResponseC" +
      "ontentTypeEnum.ResponseContentType\"\270\001\n\033C" +
      "ampaignCustomizerOperation\022H\n\006create\030\001 \001" +
      "(\01326.google.ads.googleads.v10.resources." +
      "CampaignCustomizerH\000\022B\n\006remove\030\002 \001(\tB0\372A" +
      "-\n+googleads.googleapis.com/CampaignCust" +
      "omizerH\000B\013\n\toperation\"\252\001\n!MutateCampaign" +
      "CustomizersResponse\022R\n\007results\030\001 \003(\0132A.g" +
      "oogle.ads.googleads.v10.services.MutateC" +
      "ampaignCustomizerResult\0221\n\025partial_failu" +
      "re_error\030\002 \001(\0132\022.google.rpc.Status\"\276\001\n\036M" +
      "utateCampaignCustomizerResult\022G\n\rresourc" +
      "e_name\030\001 \001(\tB0\372A-\n+googleads.googleapis." +
      "com/CampaignCustomizer\022S\n\023campaign_custo" +
      "mizer\030\002 \001(\01326.google.ads.googleads.v10.r" +
      "esources.CampaignCustomizer2\352\002\n\031Campaign" +
      "CustomizerService\022\205\002\n\031MutateCampaignCust" +
      "omizers\022C.google.ads.googleads.v10.servi" +
      "ces.MutateCampaignCustomizersRequest\032D.g" +
      "oogle.ads.googleads.v10.services.MutateC" +
      "ampaignCustomizersResponse\"]\202\323\344\223\002>\"9/v10" +
      "/customers/{customer_id=*}/campaignCusto" +
      "mizers:mutate:\001*\332A\026customer_id,operation" +
      "s\032E\312A\030googleads.googleapis.com\322A\'https:/" +
      "/www.googleapis.com/auth/adwordsB\212\002\n%com" +
      ".google.ads.googleads.v10.servicesB\036Camp" +
      "aignCustomizerServiceProtoP\001ZIgoogle.gol" +
      "ang.org/genproto/googleapis/ads/googlead" +
      "s/v10/services;services\242\002\003GAA\252\002!Google.A" +
      "ds.GoogleAds.V10.Services\312\002!Google\\Ads\\G" +
      "oogleAds\\V10\\Services\352\002%Google::Ads::Goo" +
      "gleAds::V10::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.resources.CampaignCustomizerProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_services_MutateCampaignCustomizersRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_services_MutateCampaignCustomizersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_MutateCampaignCustomizersRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v10_services_CampaignCustomizerOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v10_services_CampaignCustomizerOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_CampaignCustomizerOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v10_services_MutateCampaignCustomizersResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v10_services_MutateCampaignCustomizersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_MutateCampaignCustomizersResponse_descriptor,
        new java.lang.String[] { "Results", "PartialFailureError", });
    internal_static_google_ads_googleads_v10_services_MutateCampaignCustomizerResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v10_services_MutateCampaignCustomizerResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_MutateCampaignCustomizerResult_descriptor,
        new java.lang.String[] { "ResourceName", "CampaignCustomizer", });
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
    com.google.ads.googleads.v10.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v10.resources.CampaignCustomizerProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}