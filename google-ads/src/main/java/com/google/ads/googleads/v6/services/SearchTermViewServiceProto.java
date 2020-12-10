// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/services/search_term_view_service.proto

package com.google.ads.googleads.v6.services;

public final class SearchTermViewServiceProto {
  private SearchTermViewServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_GetSearchTermViewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_GetSearchTermViewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/ads/googleads/v6/services/searc" +
      "h_term_view_service.proto\022 google.ads.go" +
      "ogleads.v6.services\0328google/ads/googlead" +
      "s/v6/resources/search_term_view.proto\032\034g" +
      "oogle/api/annotations.proto\032\027google/api/" +
      "client.proto\032\037google/api/field_behavior." +
      "proto\032\031google/api/resource.proto\"b\n\030GetS" +
      "earchTermViewRequest\022F\n\rresource_name\030\001 " +
      "\001(\tB/\340A\002\372A)\n\'googleads.googleapis.com/Se" +
      "archTermView2\256\002\n\025SearchTermViewService\022\315" +
      "\001\n\021GetSearchTermView\022:.google.ads.google" +
      "ads.v6.services.GetSearchTermViewRequest" +
      "\0321.google.ads.googleads.v6.resources.Sea" +
      "rchTermView\"I\202\323\344\223\0023\0221/v6/{resource_name=" +
      "customers/*/searchTermViews/*}\332A\rresourc" +
      "e_name\032E\312A\030googleads.googleapis.com\322A\'ht" +
      "tps://www.googleapis.com/auth/adwordsB\201\002" +
      "\n$com.google.ads.googleads.v6.servicesB\032" +
      "SearchTermViewServiceProtoP\001ZHgoogle.gol" +
      "ang.org/genproto/googleapis/ads/googlead" +
      "s/v6/services;services\242\002\003GAA\252\002 Google.Ad" +
      "s.GoogleAds.V6.Services\312\002 Google\\Ads\\Goo" +
      "gleAds\\V6\\Services\352\002$Google::Ads::Google" +
      "Ads::V6::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v6.resources.SearchTermViewProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v6_services_GetSearchTermViewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_services_GetSearchTermViewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_GetSearchTermViewRequest_descriptor,
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
    com.google.ads.googleads.v6.resources.SearchTermViewProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
