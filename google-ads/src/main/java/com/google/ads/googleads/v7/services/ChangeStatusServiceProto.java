// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/services/change_status_service.proto

package com.google.ads.googleads.v7.services;

public final class ChangeStatusServiceProto {
  private ChangeStatusServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_services_GetChangeStatusRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_services_GetChangeStatusRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v7/services/chang" +
      "e_status_service.proto\022 google.ads.googl" +
      "eads.v7.services\0325google/ads/googleads/v" +
      "7/resources/change_status.proto\032\034google/" +
      "api/annotations.proto\032\027google/api/client" +
      ".proto\032\037google/api/field_behavior.proto\032" +
      "\031google/api/resource.proto\"^\n\026GetChangeS" +
      "tatusRequest\022D\n\rresource_name\030\001 \001(\tB-\340A\002" +
      "\372A\'\n%googleads.googleapis.com/ChangeStat" +
      "us2\243\002\n\023ChangeStatusService\022\304\001\n\017GetChange" +
      "Status\0228.google.ads.googleads.v7.service" +
      "s.GetChangeStatusRequest\032/.google.ads.go" +
      "ogleads.v7.resources.ChangeStatus\"F\202\323\344\223\002" +
      "0\022./v7/{resource_name=customers/*/change" +
      "Status/*}\332A\rresource_name\032E\312A\030googleads." +
      "googleapis.com\322A\'https://www.googleapis." +
      "com/auth/adwordsB\377\001\n$com.google.ads.goog" +
      "leads.v7.servicesB\030ChangeStatusServicePr" +
      "otoP\001ZHgoogle.golang.org/genproto/google" +
      "apis/ads/googleads/v7/services;services\242" +
      "\002\003GAA\252\002 Google.Ads.GoogleAds.V7.Services" +
      "\312\002 Google\\Ads\\GoogleAds\\V7\\Services\352\002$Go" +
      "ogle::Ads::GoogleAds::V7::Servicesb\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v7.resources.ChangeStatusProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v7_services_GetChangeStatusRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v7_services_GetChangeStatusRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_services_GetChangeStatusRequest_descriptor,
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
    com.google.ads.googleads.v7.resources.ChangeStatusProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
