// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/services/asset_service.proto

package com.google.ads.googleads.v6.services;

public final class AssetServiceProto {
  private AssetServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_GetAssetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_GetAssetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_MutateAssetsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_MutateAssetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_AssetOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_AssetOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_MutateAssetsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_MutateAssetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_MutateAssetResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_MutateAssetResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/ads/googleads/v6/services/asset" +
      "_service.proto\022 google.ads.googleads.v6." +
      "services\0329google/ads/googleads/v6/enums/" +
      "response_content_type.proto\032-google/ads/" +
      "googleads/v6/resources/asset.proto\032\034goog" +
      "le/api/annotations.proto\032\027google/api/cli" +
      "ent.proto\032\037google/api/field_behavior.pro" +
      "to\032\031google/api/resource.proto\032 google/pr" +
      "otobuf/field_mask.proto\"P\n\017GetAssetReque" +
      "st\022=\n\rresource_name\030\001 \001(\tB&\340A\002\372A \n\036googl" +
      "eads.googleapis.com/Asset\"\345\001\n\023MutateAsse" +
      "tsRequest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022I\n\no" +
      "perations\030\002 \003(\01320.google.ads.googleads.v" +
      "6.services.AssetOperationB\003\340A\002\022i\n\025respon" +
      "se_content_type\030\003 \001(\0162J.google.ads.googl" +
      "eads.v6.enums.ResponseContentTypeEnum.Re" +
      "sponseContentType\"\306\001\n\016AssetOperation\022/\n\013" +
      "update_mask\030\003 \001(\0132\032.google.protobuf.Fiel" +
      "dMask\022:\n\006create\030\001 \001(\0132(.google.ads.googl" +
      "eads.v6.resources.AssetH\000\022:\n\006update\030\002 \001(" +
      "\0132(.google.ads.googleads.v6.resources.As" +
      "setH\000B\013\n\toperation\"\\\n\024MutateAssetsRespon" +
      "se\022D\n\007results\030\002 \003(\01323.google.ads.googlea" +
      "ds.v6.services.MutateAssetResult\"c\n\021Muta" +
      "teAssetResult\022\025\n\rresource_name\030\001 \001(\t\0227\n\005" +
      "asset\030\002 \001(\0132(.google.ads.googleads.v6.re" +
      "sources.Asset2\322\003\n\014AssetService\022\251\001\n\010GetAs" +
      "set\0221.google.ads.googleads.v6.services.G" +
      "etAssetRequest\032(.google.ads.googleads.v6" +
      ".resources.Asset\"@\202\323\344\223\002*\022(/v6/{resource_" +
      "name=customers/*/assets/*}\332A\rresource_na" +
      "me\022\316\001\n\014MutateAssets\0225.google.ads.googlea" +
      "ds.v6.services.MutateAssetsRequest\0326.goo" +
      "gle.ads.googleads.v6.services.MutateAsse" +
      "tsResponse\"O\202\323\344\223\0020\"+/v6/customers/{custo" +
      "mer_id=*}/assets:mutate:\001*\332A\026customer_id" +
      ",operations\032E\312A\030googleads.googleapis.com" +
      "\322A\'https://www.googleapis.com/auth/adwor" +
      "dsB\370\001\n$com.google.ads.googleads.v6.servi" +
      "cesB\021AssetServiceProtoP\001ZHgoogle.golang." +
      "org/genproto/googleapis/ads/googleads/v6" +
      "/services;services\242\002\003GAA\252\002 Google.Ads.Go" +
      "ogleAds.V6.Services\312\002 Google\\Ads\\GoogleA" +
      "ds\\V6\\Services\352\002$Google::Ads::GoogleAds:" +
      ":V6::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v6.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v6.resources.AssetProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v6_services_GetAssetRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_services_GetAssetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_GetAssetRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v6_services_MutateAssetsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v6_services_MutateAssetsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_MutateAssetsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "ResponseContentType", });
    internal_static_google_ads_googleads_v6_services_AssetOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v6_services_AssetOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_AssetOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Operation", });
    internal_static_google_ads_googleads_v6_services_MutateAssetsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v6_services_MutateAssetsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_MutateAssetsResponse_descriptor,
        new java.lang.String[] { "Results", });
    internal_static_google_ads_googleads_v6_services_MutateAssetResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v6_services_MutateAssetResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_MutateAssetResult_descriptor,
        new java.lang.String[] { "ResourceName", "Asset", });
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
    com.google.ads.googleads.v6.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v6.resources.AssetProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
