// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/services/campaign_simulation_service.proto

package com.google.ads.googleads.v7.services;

public final class CampaignSimulationServiceProto {
  private CampaignSimulationServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_services_GetCampaignSimulationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_services_GetCampaignSimulationRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBgoogle/ads/googleads/v7/services/campa" +
      "ign_simulation_service.proto\022 google.ads" +
      ".googleads.v7.services\032;google/ads/googl" +
      "eads/v7/resources/campaign_simulation.pr" +
      "oto\032\034google/api/annotations.proto\032\027googl" +
      "e/api/client.proto\032\037google/api/field_beh" +
      "avior.proto\032\031google/api/resource.proto\"j" +
      "\n\034GetCampaignSimulationRequest\022J\n\rresour" +
      "ce_name\030\001 \001(\tB3\340A\002\372A-\n+googleads.googlea" +
      "pis.com/CampaignSimulation2\302\002\n\031CampaignS" +
      "imulationService\022\335\001\n\025GetCampaignSimulati" +
      "on\022>.google.ads.googleads.v7.services.Ge" +
      "tCampaignSimulationRequest\0325.google.ads." +
      "googleads.v7.resources.CampaignSimulatio" +
      "n\"M\202\323\344\223\0027\0225/v7/{resource_name=customers/" +
      "*/campaignSimulations/*}\332A\rresource_name" +
      "\032E\312A\030googleads.googleapis.com\322A\'https://" +
      "www.googleapis.com/auth/adwordsB\205\002\n$com." +
      "google.ads.googleads.v7.servicesB\036Campai" +
      "gnSimulationServiceProtoP\001ZHgoogle.golan" +
      "g.org/genproto/googleapis/ads/googleads/" +
      "v7/services;services\242\002\003GAA\252\002 Google.Ads." +
      "GoogleAds.V7.Services\312\002 Google\\Ads\\Googl" +
      "eAds\\V7\\Services\352\002$Google::Ads::GoogleAd" +
      "s::V7::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v7.resources.CampaignSimulationProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v7_services_GetCampaignSimulationRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v7_services_GetCampaignSimulationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_services_GetCampaignSimulationRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
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
    com.google.ads.googleads.v7.resources.CampaignSimulationProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
