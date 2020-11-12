// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/services/shared_set_service.proto

package com.google.ads.googleads.v6.services;

public final class SharedSetServiceProto {
  private SharedSetServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_GetSharedSetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_GetSharedSetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_MutateSharedSetsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_MutateSharedSetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_SharedSetOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_SharedSetOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_MutateSharedSetsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_MutateSharedSetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_MutateSharedSetResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_MutateSharedSetResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v6/services/share" +
      "d_set_service.proto\022 google.ads.googlead" +
      "s.v6.services\0329google/ads/googleads/v6/e" +
      "nums/response_content_type.proto\0322google" +
      "/ads/googleads/v6/resources/shared_set.p" +
      "roto\032\034google/api/annotations.proto\032\027goog" +
      "le/api/client.proto\032\037google/api/field_be" +
      "havior.proto\032\031google/api/resource.proto\032" +
      " google/protobuf/field_mask.proto\032\027googl" +
      "e/rpc/status.proto\"X\n\023GetSharedSetReques" +
      "t\022A\n\rresource_name\030\001 \001(\tB*\340A\002\372A$\n\"google" +
      "ads.googleapis.com/SharedSet\"\235\002\n\027MutateS" +
      "haredSetsRequest\022\030\n\013customer_id\030\001 \001(\tB\003\340" +
      "A\002\022M\n\noperations\030\002 \003(\01324.google.ads.goog" +
      "leads.v6.services.SharedSetOperationB\003\340A" +
      "\002\022\027\n\017partial_failure\030\003 \001(\010\022\025\n\rvalidate_o" +
      "nly\030\004 \001(\010\022i\n\025response_content_type\030\005 \001(\016" +
      "2J.google.ads.googleads.v6.enums.Respons" +
      "eContentTypeEnum.ResponseContentType\"\344\001\n" +
      "\022SharedSetOperation\022/\n\013update_mask\030\004 \001(\013" +
      "2\032.google.protobuf.FieldMask\022>\n\006create\030\001" +
      " \001(\0132,.google.ads.googleads.v6.resources" +
      ".SharedSetH\000\022>\n\006update\030\002 \001(\0132,.google.ad" +
      "s.googleads.v6.resources.SharedSetH\000\022\020\n\006" +
      "remove\030\003 \001(\tH\000B\013\n\toperation\"\227\001\n\030MutateSh" +
      "aredSetsResponse\0221\n\025partial_failure_erro" +
      "r\030\003 \001(\0132\022.google.rpc.Status\022H\n\007results\030\002" +
      " \003(\01327.google.ads.googleads.v6.services." +
      "MutateSharedSetResult\"p\n\025MutateSharedSet" +
      "Result\022\025\n\rresource_name\030\001 \001(\t\022@\n\nshared_" +
      "set\030\002 \001(\0132,.google.ads.googleads.v6.reso" +
      "urces.SharedSet2\314\003\n\020SharedSetService\022\271\001\n" +
      "\014GetSharedSet\0225.google.ads.googleads.v6." +
      "services.GetSharedSetRequest\032,.google.ad" +
      "s.googleads.v6.resources.SharedSet\"D\202\323\344\223" +
      "\002.\022,/v6/{resource_name=customers/*/share" +
      "dSets/*}\332A\rresource_name\022\336\001\n\020MutateShare" +
      "dSets\0229.google.ads.googleads.v6.services" +
      ".MutateSharedSetsRequest\032:.google.ads.go" +
      "ogleads.v6.services.MutateSharedSetsResp" +
      "onse\"S\202\323\344\223\0024\"//v6/customers/{customer_id" +
      "=*}/sharedSets:mutate:\001*\332A\026customer_id,o" +
      "perations\032\033\312A\030googleads.googleapis.comB\374" +
      "\001\n$com.google.ads.googleads.v6.servicesB" +
      "\025SharedSetServiceProtoP\001ZHgoogle.golang." +
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
          com.google.ads.googleads.v6.resources.SharedSetProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v6_services_GetSharedSetRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_services_GetSharedSetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_GetSharedSetRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v6_services_MutateSharedSetsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v6_services_MutateSharedSetsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_MutateSharedSetsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v6_services_SharedSetOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v6_services_SharedSetOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_SharedSetOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v6_services_MutateSharedSetsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v6_services_MutateSharedSetsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_MutateSharedSetsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v6_services_MutateSharedSetResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v6_services_MutateSharedSetResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_MutateSharedSetResult_descriptor,
        new java.lang.String[] { "ResourceName", "SharedSet", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v6.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v6.resources.SharedSetProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
