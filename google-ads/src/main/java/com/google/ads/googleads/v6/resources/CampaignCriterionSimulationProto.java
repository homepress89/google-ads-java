// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/resources/campaign_criterion_simulation.proto

package com.google.ads.googleads.v6.resources;

public final class CampaignCriterionSimulationProto {
  private CampaignCriterionSimulationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_resources_CampaignCriterionSimulation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_resources_CampaignCriterionSimulation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/ads/googleads/v6/resources/camp" +
      "aign_criterion_simulation.proto\022!google." +
      "ads.googleads.v6.resources\032/google/ads/g" +
      "oogleads/v6/common/simulation.proto\032Bgoo" +
      "gle/ads/googleads/v6/enums/simulation_mo" +
      "dification_method.proto\0323google/ads/goog" +
      "leads/v6/enums/simulation_type.proto\032\037go" +
      "ogle/api/field_behavior.proto\032\031google/ap" +
      "i/resource.proto\032\034google/api/annotations" +
      ".proto\"\271\006\n\033CampaignCriterionSimulation\022S" +
      "\n\rresource_name\030\001 \001(\tB<\340A\003\372A6\n4googleads" +
      ".googleapis.com/CampaignCriterionSimulat" +
      "ion\022\035\n\013campaign_id\030\t \001(\003B\003\340A\003H\001\210\001\001\022\036\n\014cr" +
      "iterion_id\030\n \001(\003B\003\340A\003H\002\210\001\001\022S\n\004type\030\004 \001(\016" +
      "2@.google.ads.googleads.v6.enums.Simulat" +
      "ionTypeEnum.SimulationTypeB\003\340A\003\022~\n\023modif" +
      "ication_method\030\005 \001(\0162\\.google.ads.google" +
      "ads.v6.enums.SimulationModificationMetho" +
      "dEnum.SimulationModificationMethodB\003\340A\003\022" +
      "\034\n\nstart_date\030\013 \001(\tB\003\340A\003H\003\210\001\001\022\032\n\010end_dat" +
      "e\030\014 \001(\tB\003\340A\003H\004\210\001\001\022f\n\027bid_modifier_point_" +
      "list\030\010 \001(\0132>.google.ads.googleads.v6.com" +
      "mon.BidModifierSimulationPointListB\003\340A\003H" +
      "\000:\303\001\352A\277\001\n4googleads.googleapis.com/Campa" +
      "ignCriterionSimulation\022\206\001customers/{cust" +
      "omer_id}/campaignCriterionSimulations/{c" +
      "ampaign_id}~{criterion_id}~{type}~{modif" +
      "ication_method}~{start_date}~{end_date}B" +
      "\014\n\npoint_listB\016\n\014_campaign_idB\017\n\r_criter" +
      "ion_idB\r\n\013_start_dateB\013\n\t_end_dateB\215\002\n%c" +
      "om.google.ads.googleads.v6.resourcesB Ca" +
      "mpaignCriterionSimulationProtoP\001ZJgoogle" +
      ".golang.org/genproto/googleapis/ads/goog" +
      "leads/v6/resources;resources\242\002\003GAA\252\002!Goo" +
      "gle.Ads.GoogleAds.V6.Resources\312\002!Google\\" +
      "Ads\\GoogleAds\\V6\\Resources\352\002%Google::Ads" +
      "::GoogleAds::V6::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v6.common.SimulationProto.getDescriptor(),
          com.google.ads.googleads.v6.enums.SimulationModificationMethodProto.getDescriptor(),
          com.google.ads.googleads.v6.enums.SimulationTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v6_resources_CampaignCriterionSimulation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_resources_CampaignCriterionSimulation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_resources_CampaignCriterionSimulation_descriptor,
        new java.lang.String[] { "ResourceName", "CampaignId", "CriterionId", "Type", "ModificationMethod", "StartDate", "EndDate", "BidModifierPointList", "PointList", "CampaignId", "CriterionId", "StartDate", "EndDate", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v6.common.SimulationProto.getDescriptor();
    com.google.ads.googleads.v6.enums.SimulationModificationMethodProto.getDescriptor();
    com.google.ads.googleads.v6.enums.SimulationTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
