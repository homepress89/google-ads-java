// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/errors/internal_error.proto

package com.google.ads.googleads.v6.errors;

public final class InternalErrorProto {
  private InternalErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_errors_InternalErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_errors_InternalErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/ads/googleads/v6/errors/interna" +
      "l_error.proto\022\036google.ads.googleads.v6.e" +
      "rrors\032\034google/api/annotations.proto\"\241\001\n\021" +
      "InternalErrorEnum\"\213\001\n\rInternalError\022\017\n\013U" +
      "NSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022\022\n\016INTERNAL_ER" +
      "ROR\020\002\022\034\n\030ERROR_CODE_NOT_PUBLISHED\020\003\022\023\n\017T" +
      "RANSIENT_ERROR\020\004\022\025\n\021DEADLINE_EXCEEDED\020\005B" +
      "\355\001\n\"com.google.ads.googleads.v6.errorsB\022" +
      "InternalErrorProtoP\001ZDgoogle.golang.org/" +
      "genproto/googleapis/ads/googleads/v6/err" +
      "ors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds." +
      "V6.Errors\312\002\036Google\\Ads\\GoogleAds\\V6\\Erro" +
      "rs\352\002\"Google::Ads::GoogleAds::V6::Errorsb" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v6_errors_InternalErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_errors_InternalErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_errors_InternalErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}