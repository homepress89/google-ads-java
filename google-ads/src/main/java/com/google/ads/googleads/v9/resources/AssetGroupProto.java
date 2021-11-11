// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/asset_group.proto

package com.google.ads.googleads.v9.resources;

public final class AssetGroupProto {
  private AssetGroupProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_resources_AssetGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_resources_AssetGroup_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/ads/googleads/v9/resources/asse" +
      "t_group.proto\022!google.ads.googleads.v9.r" +
      "esources\0326google/ads/googleads/v9/enums/" +
      "asset_group_status.proto\032\037google/api/fie" +
      "ld_behavior.proto\032\031google/api/resource.p" +
      "roto\032\034google/api/annotations.proto\"\264\003\n\nA" +
      "ssetGroup\022B\n\rresource_name\030\001 \001(\tB+\340A\005\372A%" +
      "\n#googleads.googleapis.com/AssetGroup\022\017\n" +
      "\002id\030\t \001(\003B\003\340A\003\022;\n\010campaign\030\002 \001(\tB)\340A\005\372A#" +
      "\n!googleads.googleapis.com/Campaign\022\021\n\004n" +
      "ame\030\003 \001(\tB\003\340A\002\022\022\n\nfinal_urls\030\004 \003(\t\022\031\n\021fi" +
      "nal_mobile_urls\030\005 \003(\t\022T\n\006status\030\006 \001(\0162D." +
      "google.ads.googleads.v9.enums.AssetGroup" +
      "StatusEnum.AssetGroupStatus\022\r\n\005path1\030\007 \001" +
      "(\t\022\r\n\005path2\030\010 \001(\t:^\352A[\n#googleads.google" +
      "apis.com/AssetGroup\0224customers/{customer" +
      "_id}/assetGroups/{asset_group_id}B\374\001\n%co" +
      "m.google.ads.googleads.v9.resourcesB\017Ass" +
      "etGroupProtoP\001ZJgoogle.golang.org/genpro" +
      "to/googleapis/ads/googleads/v9/resources" +
      ";resources\242\002\003GAA\252\002!Google.Ads.GoogleAds." +
      "V9.Resources\312\002!Google\\Ads\\GoogleAds\\V9\\R" +
      "esources\352\002%Google::Ads::GoogleAds::V9::R" +
      "esourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.enums.AssetGroupStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_resources_AssetGroup_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_resources_AssetGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_resources_AssetGroup_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Campaign", "Name", "FinalUrls", "FinalMobileUrls", "Status", "Path1", "Path2", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v9.enums.AssetGroupStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}