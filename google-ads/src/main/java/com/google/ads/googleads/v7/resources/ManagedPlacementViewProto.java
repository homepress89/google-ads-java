// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/resources/managed_placement_view.proto

package com.google.ads.googleads.v7.resources;

public final class ManagedPlacementViewProto {
  private ManagedPlacementViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_resources_ManagedPlacementView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_resources_ManagedPlacementView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/ads/googleads/v7/resources/mana" +
      "ged_placement_view.proto\022!google.ads.goo" +
      "gleads.v7.resources\032\037google/api/field_be" +
      "havior.proto\032\031google/api/resource.proto\032" +
      "\034google/api/annotations.proto\"\344\001\n\024Manage" +
      "dPlacementView\022L\n\rresource_name\030\001 \001(\tB5\340" +
      "A\003\372A/\n-googleads.googleapis.com/ManagedP" +
      "lacementView:~\352A{\n-googleads.googleapis." +
      "com/ManagedPlacementView\022Jcustomers/{cus" +
      "tomer_id}/managedPlacementViews/{ad_grou" +
      "p_id}~{criterion_id}B\206\002\n%com.google.ads." +
      "googleads.v7.resourcesB\031ManagedPlacement" +
      "ViewProtoP\001ZJgoogle.golang.org/genproto/" +
      "googleapis/ads/googleads/v7/resources;re" +
      "sources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V7." +
      "Resources\312\002!Google\\Ads\\GoogleAds\\V7\\Reso" +
      "urces\352\002%Google::Ads::GoogleAds::V7::Reso" +
      "urcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v7_resources_ManagedPlacementView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v7_resources_ManagedPlacementView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_resources_ManagedPlacementView_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
