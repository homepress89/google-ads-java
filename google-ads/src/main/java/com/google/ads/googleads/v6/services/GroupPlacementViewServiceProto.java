// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/services/group_placement_view_service.proto

package com.google.ads.googleads.v6.services;

public final class GroupPlacementViewServiceProto {
  private GroupPlacementViewServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_GetGroupPlacementViewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_GetGroupPlacementViewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/ads/googleads/v6/services/group" +
      "_placement_view_service.proto\022 google.ad" +
      "s.googleads.v6.services\032<google/ads/goog" +
      "leads/v6/resources/group_placement_view." +
      "proto\032\034google/api/annotations.proto\032\027goo" +
      "gle/api/client.proto\032\037google/api/field_b" +
      "ehavior.proto\032\031google/api/resource.proto" +
      "\"j\n\034GetGroupPlacementViewRequest\022J\n\rreso" +
      "urce_name\030\001 \001(\tB3\340A\002\372A-\n+googleads.googl" +
      "eapis.com/GroupPlacementView2\302\002\n\031GroupPl" +
      "acementViewService\022\335\001\n\025GetGroupPlacement" +
      "View\022>.google.ads.googleads.v6.services." +
      "GetGroupPlacementViewRequest\0325.google.ad" +
      "s.googleads.v6.resources.GroupPlacementV" +
      "iew\"M\202\323\344\223\0027\0225/v6/{resource_name=customer" +
      "s/*/groupPlacementViews/*}\332A\rresource_na" +
      "me\032E\312A\030googleads.googleapis.com\322A\'https:" +
      "//www.googleapis.com/auth/adwordsB\205\002\n$co" +
      "m.google.ads.googleads.v6.servicesB\036Grou" +
      "pPlacementViewServiceProtoP\001ZHgoogle.gol" +
      "ang.org/genproto/googleapis/ads/googlead" +
      "s/v6/services;services\242\002\003GAA\252\002 Google.Ad" +
      "s.GoogleAds.V6.Services\312\002 Google\\Ads\\Goo" +
      "gleAds\\V6\\Services\352\002$Google::Ads::Google" +
      "Ads::V6::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v6.resources.GroupPlacementViewProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v6_services_GetGroupPlacementViewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_services_GetGroupPlacementViewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_GetGroupPlacementViewRequest_descriptor,
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
    com.google.ads.googleads.v6.resources.GroupPlacementViewProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
