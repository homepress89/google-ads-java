// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/services/domain_category_service.proto

package com.google.ads.googleads.v8.services;

public final class DomainCategoryServiceProto {
  private DomainCategoryServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_services_GetDomainCategoryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_services_GetDomainCategoryRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/ads/googleads/v8/services/domai" +
      "n_category_service.proto\022 google.ads.goo" +
      "gleads.v8.services\0327google/ads/googleads" +
      "/v8/resources/domain_category.proto\032\034goo" +
      "gle/api/annotations.proto\032\027google/api/cl" +
      "ient.proto\032\037google/api/field_behavior.pr" +
      "oto\032\031google/api/resource.proto\"b\n\030GetDom" +
      "ainCategoryRequest\022F\n\rresource_name\030\001 \001(" +
      "\tB/\340A\002\372A)\n\'googleads.googleapis.com/Doma" +
      "inCategory2\257\002\n\025DomainCategoryService\022\316\001\n" +
      "\021GetDomainCategory\022:.google.ads.googlead" +
      "s.v8.services.GetDomainCategoryRequest\0321" +
      ".google.ads.googleads.v8.resources.Domai" +
      "nCategory\"J\202\323\344\223\0024\0222/v8/{resource_name=cu" +
      "stomers/*/domainCategories/*}\332A\rresource" +
      "_name\032E\312A\030googleads.googleapis.com\322A\'htt" +
      "ps://www.googleapis.com/auth/adwordsB\201\002\n" +
      "$com.google.ads.googleads.v8.servicesB\032D" +
      "omainCategoryServiceProtoP\001ZHgoogle.gola" +
      "ng.org/genproto/googleapis/ads/googleads" +
      "/v8/services;services\242\002\003GAA\252\002 Google.Ads" +
      ".GoogleAds.V8.Services\312\002 Google\\Ads\\Goog" +
      "leAds\\V8\\Services\352\002$Google::Ads::GoogleA" +
      "ds::V8::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v8.resources.DomainCategoryProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v8_services_GetDomainCategoryRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v8_services_GetDomainCategoryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_services_GetDomainCategoryRequest_descriptor,
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
    com.google.ads.googleads.v8.resources.DomainCategoryProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}