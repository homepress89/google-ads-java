// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/services/account_budget_service.proto

package com.google.ads.googleads.v7.services;

public final class AccountBudgetServiceProto {
  private AccountBudgetServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_services_GetAccountBudgetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_services_GetAccountBudgetRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v7/services/accou" +
      "nt_budget_service.proto\022 google.ads.goog" +
      "leads.v7.services\0326google/ads/googleads/" +
      "v7/resources/account_budget.proto\032\034googl" +
      "e/api/annotations.proto\032\027google/api/clie" +
      "nt.proto\032\037google/api/field_behavior.prot" +
      "o\032\031google/api/resource.proto\"`\n\027GetAccou" +
      "ntBudgetRequest\022E\n\rresource_name\030\001 \001(\tB." +
      "\340A\002\372A(\n&googleads.googleapis.com/Account" +
      "Budget2\251\002\n\024AccountBudgetService\022\311\001\n\020GetA" +
      "ccountBudget\0229.google.ads.googleads.v7.s" +
      "ervices.GetAccountBudgetRequest\0320.google" +
      ".ads.googleads.v7.resources.AccountBudge" +
      "t\"H\202\323\344\223\0022\0220/v7/{resource_name=customers/" +
      "*/accountBudgets/*}\332A\rresource_name\032E\312A\030" +
      "googleads.googleapis.com\322A\'https://www.g" +
      "oogleapis.com/auth/adwordsB\200\002\n$com.googl" +
      "e.ads.googleads.v7.servicesB\031AccountBudg" +
      "etServiceProtoP\001ZHgoogle.golang.org/genp" +
      "roto/googleapis/ads/googleads/v7/service" +
      "s;services\242\002\003GAA\252\002 Google.Ads.GoogleAds." +
      "V7.Services\312\002 Google\\Ads\\GoogleAds\\V7\\Se" +
      "rvices\352\002$Google::Ads::GoogleAds::V7::Ser" +
      "vicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v7.resources.AccountBudgetProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v7_services_GetAccountBudgetRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v7_services_GetAccountBudgetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_services_GetAccountBudgetRequest_descriptor,
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
    com.google.ads.googleads.v7.resources.AccountBudgetProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
