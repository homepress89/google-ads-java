// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/services/detail_placement_view_service.proto

package com.google.ads.googleads.v7.services;

public final class DetailPlacementViewServiceProto {
  private DetailPlacementViewServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_services_GetDetailPlacementViewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_services_GetDetailPlacementViewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDgoogle/ads/googleads/v7/services/detai" +
      "l_placement_view_service.proto\022 google.a" +
      "ds.googleads.v7.services\032=google/ads/goo" +
      "gleads/v7/resources/detail_placement_vie" +
      "w.proto\032\034google/api/annotations.proto\032\027g" +
      "oogle/api/client.proto\032\037google/api/field" +
      "_behavior.proto\032\031google/api/resource.pro" +
      "to\"l\n\035GetDetailPlacementViewRequest\022K\n\rr" +
      "esource_name\030\001 \001(\tB4\340A\002\372A.\n,googleads.go" +
      "ogleapis.com/DetailPlacementView2\307\002\n\032Det" +
      "ailPlacementViewService\022\341\001\n\026GetDetailPla" +
      "cementView\022?.google.ads.googleads.v7.ser" +
      "vices.GetDetailPlacementViewRequest\0326.go" +
      "ogle.ads.googleads.v7.resources.DetailPl" +
      "acementView\"N\202\323\344\223\0028\0226/v7/{resource_name=" +
      "customers/*/detailPlacementViews/*}\332A\rre" +
      "source_name\032E\312A\030googleads.googleapis.com" +
      "\322A\'https://www.googleapis.com/auth/adwor" +
      "dsB\206\002\n$com.google.ads.googleads.v7.servi" +
      "cesB\037DetailPlacementViewServiceProtoP\001ZH" +
      "google.golang.org/genproto/googleapis/ad" +
      "s/googleads/v7/services;services\242\002\003GAA\252\002" +
      " Google.Ads.GoogleAds.V7.Services\312\002 Goog" +
      "le\\Ads\\GoogleAds\\V7\\Services\352\002$Google::A" +
      "ds::GoogleAds::V7::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v7.resources.DetailPlacementViewProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v7_services_GetDetailPlacementViewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v7_services_GetDetailPlacementViewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_services_GetDetailPlacementViewRequest_descriptor,
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
    com.google.ads.googleads.v7.resources.DetailPlacementViewProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
