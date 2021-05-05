// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/services/customer_asset_service.proto

package com.google.ads.googleads.v7.services;

public final class CustomerAssetServiceProto {
  private CustomerAssetServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_services_GetCustomerAssetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_services_GetCustomerAssetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_services_MutateCustomerAssetsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_services_MutateCustomerAssetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_services_CustomerAssetOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_services_CustomerAssetOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_services_MutateCustomerAssetsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_services_MutateCustomerAssetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_services_MutateCustomerAssetResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_services_MutateCustomerAssetResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v7/services/custo" +
      "mer_asset_service.proto\022 google.ads.goog" +
      "leads.v7.services\0326google/ads/googleads/" +
      "v7/resources/customer_asset.proto\032\034googl" +
      "e/api/annotations.proto\032\027google/api/clie" +
      "nt.proto\032\037google/api/field_behavior.prot" +
      "o\032\031google/api/resource.proto\032 google/pro" +
      "tobuf/field_mask.proto\032\027google/rpc/statu" +
      "s.proto\"`\n\027GetCustomerAssetRequest\022E\n\rre" +
      "source_name\030\001 \001(\tB.\340A\002\372A(\n&googleads.goo" +
      "gleapis.com/CustomerAsset\"\272\001\n\033MutateCust" +
      "omerAssetsRequest\022\030\n\013customer_id\030\001 \001(\tB\003" +
      "\340A\002\022Q\n\noperations\030\002 \003(\01328.google.ads.goo" +
      "gleads.v7.services.CustomerAssetOperatio" +
      "nB\003\340A\002\022\027\n\017partial_failure\030\003 \001(\010\022\025\n\rvalid" +
      "ate_only\030\004 \001(\010\"\360\001\n\026CustomerAssetOperatio" +
      "n\022/\n\013update_mask\030\004 \001(\0132\032.google.protobuf" +
      ".FieldMask\022B\n\006create\030\001 \001(\01320.google.ads." +
      "googleads.v7.resources.CustomerAssetH\000\022B" +
      "\n\006update\030\003 \001(\01320.google.ads.googleads.v7" +
      ".resources.CustomerAssetH\000\022\020\n\006remove\030\002 \001" +
      "(\tH\000B\013\n\toperation\"\237\001\n\034MutateCustomerAsse" +
      "tsResponse\0221\n\025partial_failure_error\030\001 \001(" +
      "\0132\022.google.rpc.Status\022L\n\007results\030\002 \003(\0132;" +
      ".google.ads.googleads.v7.services.Mutate" +
      "CustomerAssetResult\"2\n\031MutateCustomerAss" +
      "etResult\022\025\n\rresource_name\030\001 \001(\t2\232\004\n\024Cust" +
      "omerAssetService\022\311\001\n\020GetCustomerAsset\0229." +
      "google.ads.googleads.v7.services.GetCust" +
      "omerAssetRequest\0320.google.ads.googleads." +
      "v7.resources.CustomerAsset\"H\202\323\344\223\0022\0220/v7/" +
      "{resource_name=customers/*/customerAsset" +
      "s/*}\332A\rresource_name\022\356\001\n\024MutateCustomerA" +
      "ssets\022=.google.ads.googleads.v7.services" +
      ".MutateCustomerAssetsRequest\032>.google.ad" +
      "s.googleads.v7.services.MutateCustomerAs" +
      "setsResponse\"W\202\323\344\223\0028\"3/v7/customers/{cus" +
      "tomer_id=*}/customerAssets:mutate:\001*\332A\026c" +
      "ustomer_id,operations\032E\312A\030googleads.goog" +
      "leapis.com\322A\'https://www.googleapis.com/" +
      "auth/adwordsB\200\002\n$com.google.ads.googlead" +
      "s.v7.servicesB\031CustomerAssetServiceProto" +
      "P\001ZHgoogle.golang.org/genproto/googleapi" +
      "s/ads/googleads/v7/services;services\242\002\003G" +
      "AA\252\002 Google.Ads.GoogleAds.V7.Services\312\002 " +
      "Google\\Ads\\GoogleAds\\V7\\Services\352\002$Googl" +
      "e::Ads::GoogleAds::V7::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v7.resources.CustomerAssetProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v7_services_GetCustomerAssetRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v7_services_GetCustomerAssetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_services_GetCustomerAssetRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v7_services_MutateCustomerAssetsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v7_services_MutateCustomerAssetsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_services_MutateCustomerAssetsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v7_services_CustomerAssetOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v7_services_CustomerAssetOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_services_CustomerAssetOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v7_services_MutateCustomerAssetsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v7_services_MutateCustomerAssetsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_services_MutateCustomerAssetsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v7_services_MutateCustomerAssetResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v7_services_MutateCustomerAssetResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_services_MutateCustomerAssetResult_descriptor,
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
    com.google.ads.googleads.v7.resources.CustomerAssetProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
