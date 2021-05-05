// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/resources/campaign.proto

package com.google.ads.googleads.v7.resources;

public final class CampaignProto {
  private CampaignProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_resources_Campaign_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_resources_Campaign_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_resources_Campaign_NetworkSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_resources_Campaign_NetworkSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_resources_Campaign_HotelSettingInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_resources_Campaign_HotelSettingInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_resources_Campaign_LocalCampaignSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_resources_Campaign_LocalCampaignSetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_resources_Campaign_DynamicSearchAdsSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_resources_Campaign_DynamicSearchAdsSetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_resources_Campaign_TrackingSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_resources_Campaign_TrackingSetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_resources_Campaign_VanityPharma_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_resources_Campaign_VanityPharma_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_resources_Campaign_ShoppingSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_resources_Campaign_ShoppingSetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_resources_Campaign_OptimizationGoalSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_resources_Campaign_OptimizationGoalSetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_resources_Campaign_GeoTargetTypeSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_resources_Campaign_GeoTargetTypeSetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_resources_Campaign_SelectiveOptimization_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_resources_Campaign_SelectiveOptimization_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_resources_Campaign_AppCampaignSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_resources_Campaign_AppCampaignSetting_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/ads/googleads/v7/resources/camp" +
      "aign.proto\022!google.ads.googleads.v7.reso" +
      "urces\032,google/ads/googleads/v7/common/bi" +
      "dding.proto\0325google/ads/googleads/v7/com" +
      "mon/custom_parameter.proto\0322google/ads/g" +
      "oogleads/v7/common/frequency_cap.proto\032>" +
      "google/ads/googleads/v7/common/real_time" +
      "_bidding_setting.proto\0326google/ads/googl" +
      "eads/v7/common/targeting_setting.proto\032B" +
      "google/ads/googleads/v7/enums/ad_serving" +
      "_optimization_status.proto\032@google/ads/g" +
      "oogleads/v7/enums/advertising_channel_su" +
      "b_type.proto\032<google/ads/googleads/v7/en" +
      "ums/advertising_channel_type.proto\032:goog" +
      "le/ads/googleads/v7/enums/app_campaign_a" +
      "pp_store.proto\032Kgoogle/ads/googleads/v7/" +
      "enums/app_campaign_bidding_strategy_goal" +
      "_type.proto\0324google/ads/googleads/v7/enu" +
      "ms/asset_field_type.proto\0329google/ads/go" +
      "ogleads/v7/enums/bidding_strategy_type.p" +
      "roto\032<google/ads/googleads/v7/enums/bran" +
      "d_safety_suitability.proto\032<google/ads/g" +
      "oogleads/v7/enums/campaign_experiment_ty" +
      "pe.proto\032;google/ads/googleads/v7/enums/" +
      "campaign_serving_status.proto\0323google/ad" +
      "s/googleads/v7/enums/campaign_status.pro" +
      "to\0328google/ads/googleads/v7/enums/locati" +
      "on_source_type.proto\032<google/ads/googlea" +
      "ds/v7/enums/negative_geo_target_type.pro" +
      "to\032:google/ads/googleads/v7/enums/optimi" +
      "zation_goal_type.proto\0320google/ads/googl" +
      "eads/v7/enums/payment_mode.proto\032<google" +
      "/ads/googleads/v7/enums/positive_geo_tar" +
      "get_type.proto\032Bgoogle/ads/googleads/v7/" +
      "enums/vanity_pharma_display_url_mode.pro" +
      "to\0326google/ads/googleads/v7/enums/vanity" +
      "_pharma_text.proto\032\037google/api/field_beh" +
      "avior.proto\032\031google/api/resource.proto\032\034" +
      "google/api/annotations.proto\"\2460\n\010Campaig" +
      "n\022@\n\rresource_name\030\001 \001(\tB)\340A\005\372A#\n!google" +
      "ads.googleapis.com/Campaign\022\024\n\002id\030; \001(\003B" +
      "\003\340A\003H\001\210\001\001\022\021\n\004name\030: \001(\tH\002\210\001\001\022P\n\006status\030\005" +
      " \001(\0162@.google.ads.googleads.v7.enums.Cam" +
      "paignStatusEnum.CampaignStatus\022k\n\016servin" +
      "g_status\030\025 \001(\0162N.google.ads.googleads.v7" +
      ".enums.CampaignServingStatusEnum.Campaig" +
      "nServingStatusB\003\340A\003\022\202\001\n\036ad_serving_optim" +
      "ization_status\030\010 \001(\0162Z.google.ads.google" +
      "ads.v7.enums.AdServingOptimizationStatus" +
      "Enum.AdServingOptimizationStatus\022w\n\030adve" +
      "rtising_channel_type\030\t \001(\0162P.google.ads." +
      "googleads.v7.enums.AdvertisingChannelTyp" +
      "eEnum.AdvertisingChannelTypeB\003\340A\005\022\201\001\n\034ad" +
      "vertising_channel_sub_type\030\n \001(\0162V.googl" +
      "e.ads.googleads.v7.enums.AdvertisingChan" +
      "nelSubTypeEnum.AdvertisingChannelSubType" +
      "B\003\340A\005\022\"\n\025tracking_url_template\030< \001(\tH\003\210\001" +
      "\001\022N\n\025url_custom_parameters\030\014 \003(\0132/.googl" +
      "e.ads.googleads.v7.common.CustomParamete" +
      "r\022Y\n\031real_time_bidding_setting\030\' \001(\01326.g" +
      "oogle.ads.googleads.v7.common.RealTimeBi" +
      "ddingSetting\022U\n\020network_settings\030\016 \001(\0132;" +
      ".google.ads.googleads.v7.resources.Campa" +
      "ign.NetworkSettings\022X\n\rhotel_setting\030  \001" +
      "(\0132<.google.ads.googleads.v7.resources.C" +
      "ampaign.HotelSettingInfoB\003\340A\005\022g\n\032dynamic" +
      "_search_ads_setting\030! \001(\0132C.google.ads.g" +
      "oogleads.v7.resources.Campaign.DynamicSe" +
      "archAdsSetting\022U\n\020shopping_setting\030$ \001(\013" +
      "2;.google.ads.googleads.v7.resources.Cam" +
      "paign.ShoppingSetting\022K\n\021targeting_setti" +
      "ng\030+ \001(\01320.google.ads.googleads.v7.commo" +
      "n.TargetingSetting\022a\n\027geo_target_type_se" +
      "tting\030/ \001(\0132@.google.ads.googleads.v7.re" +
      "sources.Campaign.GeoTargetTypeSetting\022`\n" +
      "\026local_campaign_setting\0302 \001(\0132@.google.a" +
      "ds.googleads.v7.resources.Campaign.Local" +
      "CampaignSetting\022\\\n\024app_campaign_setting\030" +
      "3 \001(\0132>.google.ads.googleads.v7.resource" +
      "s.Campaign.AppCampaignSetting\022>\n\006labels\030" +
      "= \003(\tB.\340A\003\372A(\n&googleads.googleapis.com/" +
      "CampaignLabel\022n\n\017experiment_type\030\021 \001(\0162P" +
      ".google.ads.googleads.v7.enums.CampaignE" +
      "xperimentTypeEnum.CampaignExperimentType" +
      "B\003\340A\003\022E\n\rbase_campaign\0308 \001(\tB)\340A\003\372A#\n!go" +
      "ogleads.googleapis.com/CampaignH\004\210\001\001\022J\n\017" +
      "campaign_budget\030> \001(\tB,\372A)\n\'googleads.go" +
      "ogleapis.com/CampaignBudgetH\005\210\001\001\022n\n\025bidd" +
      "ing_strategy_type\030\026 \001(\0162J.google.ads.goo" +
      "gleads.v7.enums.BiddingStrategyTypeEnum." +
      "BiddingStrategyTypeB\003\340A\003\022\027\n\nstart_date\030?" +
      " \001(\tH\006\210\001\001\022\025\n\010end_date\030@ \001(\tH\007\210\001\001\022\035\n\020fina" +
      "l_url_suffix\030A \001(\tH\010\210\001\001\022I\n\016frequency_cap" +
      "s\030( \003(\01321.google.ads.googleads.v7.common" +
      ".FrequencyCapEntry\022}\n\036video_brand_safety" +
      "_suitability\030* \001(\0162P.google.ads.googlead" +
      "s.v7.enums.BrandSafetySuitabilityEnum.Br" +
      "andSafetySuitabilityB\003\340A\003\022O\n\rvanity_phar" +
      "ma\030, \001(\01328.google.ads.googleads.v7.resou" +
      "rces.Campaign.VanityPharma\022a\n\026selective_" +
      "optimization\030- \001(\0132A.google.ads.googlead" +
      "s.v7.resources.Campaign.SelectiveOptimiz" +
      "ation\022f\n\031optimization_goal_setting\0306 \001(\013" +
      "2C.google.ads.googleads.v7.resources.Cam" +
      "paign.OptimizationGoalSetting\022Z\n\020trackin" +
      "g_setting\030. \001(\0132;.google.ads.googleads.v" +
      "7.resources.Campaign.TrackingSettingB\003\340A" +
      "\003\022P\n\014payment_mode\0304 \001(\0162:.google.ads.goo" +
      "gleads.v7.enums.PaymentModeEnum.PaymentM" +
      "ode\022$\n\022optimization_score\030B \001(\001B\003\340A\003H\t\210\001" +
      "\001\022k\n!excluded_parent_asset_field_types\030E" +
      " \003(\0162@.google.ads.googleads.v7.enums.Ass" +
      "etFieldTypeEnum.AssetFieldType\022I\n\020biddin" +
      "g_strategy\030C \001(\tB-\372A*\n(googleads.googlea" +
      "pis.com/BiddingStrategyH\000\022@\n\ncommission\030" +
      "1 \001(\0132*.google.ads.googleads.v7.common.C" +
      "ommissionH\000\022?\n\nmanual_cpc\030\030 \001(\0132).google" +
      ".ads.googleads.v7.common.ManualCpcH\000\022?\n\n" +
      "manual_cpm\030\031 \001(\0132).google.ads.googleads." +
      "v7.common.ManualCpmH\000\022D\n\nmanual_cpv\030% \001(" +
      "\0132).google.ads.googleads.v7.common.Manua" +
      "lCpvB\003\340A\003H\000\022S\n\024maximize_conversions\030\036 \001(" +
      "\01323.google.ads.googleads.v7.common.Maxim" +
      "izeConversionsH\000\022\\\n\031maximize_conversion_" +
      "value\030\037 \001(\01327.google.ads.googleads.v7.co" +
      "mmon.MaximizeConversionValueH\000\022?\n\ntarget" +
      "_cpa\030\032 \001(\0132).google.ads.googleads.v7.com" +
      "mon.TargetCpaH\000\022X\n\027target_impression_sha" +
      "re\0300 \001(\01325.google.ads.googleads.v7.commo" +
      "n.TargetImpressionShareH\000\022A\n\013target_roas" +
      "\030\035 \001(\0132*.google.ads.googleads.v7.common." +
      "TargetRoasH\000\022C\n\014target_spend\030\033 \001(\0132+.goo" +
      "gle.ads.googleads.v7.common.TargetSpendH" +
      "\000\022A\n\013percent_cpc\030\" \001(\0132*.google.ads.goog" +
      "leads.v7.common.PercentCpcH\000\022?\n\ntarget_c" +
      "pm\030) \001(\0132).google.ads.googleads.v7.commo" +
      "n.TargetCpmH\000\032\231\002\n\017NetworkSettings\022!\n\024tar" +
      "get_google_search\030\005 \001(\010H\000\210\001\001\022\"\n\025target_s" +
      "earch_network\030\006 \001(\010H\001\210\001\001\022#\n\026target_conte" +
      "nt_network\030\007 \001(\010H\002\210\001\001\022*\n\035target_partner_" +
      "search_network\030\010 \001(\010H\003\210\001\001B\027\n\025_target_goo" +
      "gle_searchB\030\n\026_target_search_networkB\031\n\027" +
      "_target_content_networkB \n\036_target_partn" +
      "er_search_network\032I\n\020HotelSettingInfo\022!\n" +
      "\017hotel_center_id\030\002 \001(\003B\003\340A\005H\000\210\001\001B\022\n\020_hot" +
      "el_center_id\032~\n\024LocalCampaignSetting\022f\n\024" +
      "location_source_type\030\001 \001(\0162H.google.ads." +
      "googleads.v7.enums.LocationSourceTypeEnu" +
      "m.LocationSourceType\032\302\001\n\027DynamicSearchAd" +
      "sSetting\022\030\n\013domain_name\030\006 \001(\tB\003\340A\002\022\032\n\rla" +
      "nguage_code\030\007 \001(\tB\003\340A\002\022#\n\026use_supplied_u" +
      "rls_only\030\010 \001(\010H\000\210\001\001\0221\n\005feeds\030\t \003(\tB\"\372A\037\n" +
      "\035googleads.googleapis.com/FeedB\031\n\027_use_s" +
      "upplied_urls_only\032B\n\017TrackingSetting\022\036\n\014" +
      "tracking_url\030\002 \001(\tB\003\340A\003H\000\210\001\001B\017\n\r_trackin" +
      "g_url\032\363\001\n\014VanityPharma\022\200\001\n\036vanity_pharma" +
      "_display_url_mode\030\001 \001(\0162X.google.ads.goo" +
      "gleads.v7.enums.VanityPharmaDisplayUrlMo" +
      "deEnum.VanityPharmaDisplayUrlMode\022`\n\022van" +
      "ity_pharma_text\030\002 \001(\0162D.google.ads.googl" +
      "eads.v7.enums.VanityPharmaTextEnum.Vanit" +
      "yPharmaText\032\325\001\n\017ShoppingSetting\022\035\n\013merch" +
      "ant_id\030\005 \001(\003B\003\340A\005H\000\210\001\001\022\037\n\rsales_country\030" +
      "\006 \001(\tB\003\340A\005H\001\210\001\001\022\036\n\021campaign_priority\030\007 \001" +
      "(\005H\002\210\001\001\022\031\n\014enable_local\030\010 \001(\010H\003\210\001\001B\016\n\014_m" +
      "erchant_idB\020\n\016_sales_countryB\024\n\022_campaig" +
      "n_priorityB\017\n\r_enable_local\032\210\001\n\027Optimiza" +
      "tionGoalSetting\022m\n\027optimization_goal_typ" +
      "es\030\001 \003(\0162L.google.ads.googleads.v7.enums" +
      ".OptimizationGoalTypeEnum.OptimizationGo" +
      "alType\032\372\001\n\024GeoTargetTypeSetting\022p\n\030posit" +
      "ive_geo_target_type\030\001 \001(\0162N.google.ads.g" +
      "oogleads.v7.enums.PositiveGeoTargetTypeE" +
      "num.PositiveGeoTargetType\022p\n\030negative_ge" +
      "o_target_type\030\002 \001(\0162N.google.ads.googlea" +
      "ds.v7.enums.NegativeGeoTargetTypeEnum.Ne" +
      "gativeGeoTargetType\032c\n\025SelectiveOptimiza" +
      "tion\022J\n\022conversion_actions\030\002 \003(\tB.\372A+\n)g" +
      "oogleads.googleapis.com/ConversionAction" +
      "\032\254\002\n\022AppCampaignSetting\022\214\001\n\032bidding_stra" +
      "tegy_goal_type\030\001 \001(\0162h.google.ads.google" +
      "ads.v7.enums.AppCampaignBiddingStrategyG" +
      "oalTypeEnum.AppCampaignBiddingStrategyGo" +
      "alType\022\030\n\006app_id\030\004 \001(\tB\003\340A\005H\000\210\001\001\022b\n\tapp_" +
      "store\030\003 \001(\0162J.google.ads.googleads.v7.en" +
      "ums.AppCampaignAppStoreEnum.AppCampaignA" +
      "ppStoreB\003\340A\005B\t\n\007_app_id:W\352AT\n!googleads." +
      "googleapis.com/Campaign\022/customers/{cust" +
      "omer_id}/campaigns/{campaign_id}B\033\n\031camp" +
      "aign_bidding_strategyB\005\n\003_idB\007\n\005_nameB\030\n" +
      "\026_tracking_url_templateB\020\n\016_base_campaig" +
      "nB\022\n\020_campaign_budgetB\r\n\013_start_dateB\013\n\t" +
      "_end_dateB\023\n\021_final_url_suffixB\025\n\023_optim" +
      "ization_scoreB\372\001\n%com.google.ads.googlea" +
      "ds.v7.resourcesB\rCampaignProtoP\001ZJgoogle" +
      ".golang.org/genproto/googleapis/ads/goog" +
      "leads/v7/resources;resources\242\002\003GAA\252\002!Goo" +
      "gle.Ads.GoogleAds.V7.Resources\312\002!Google\\" +
      "Ads\\GoogleAds\\V7\\Resources\352\002%Google::Ads" +
      "::GoogleAds::V7::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v7.common.BiddingProto.getDescriptor(),
          com.google.ads.googleads.v7.common.CustomParameterProto.getDescriptor(),
          com.google.ads.googleads.v7.common.FrequencyCapProto.getDescriptor(),
          com.google.ads.googleads.v7.common.RealTimeBiddingSettingProto.getDescriptor(),
          com.google.ads.googleads.v7.common.TargetingSettingProto.getDescriptor(),
          com.google.ads.googleads.v7.enums.AdServingOptimizationStatusProto.getDescriptor(),
          com.google.ads.googleads.v7.enums.AdvertisingChannelSubTypeProto.getDescriptor(),
          com.google.ads.googleads.v7.enums.AdvertisingChannelTypeProto.getDescriptor(),
          com.google.ads.googleads.v7.enums.AppCampaignAppStoreProto.getDescriptor(),
          com.google.ads.googleads.v7.enums.AppCampaignBiddingStrategyGoalTypeProto.getDescriptor(),
          com.google.ads.googleads.v7.enums.AssetFieldTypeProto.getDescriptor(),
          com.google.ads.googleads.v7.enums.BiddingStrategyTypeProto.getDescriptor(),
          com.google.ads.googleads.v7.enums.BrandSafetySuitabilityProto.getDescriptor(),
          com.google.ads.googleads.v7.enums.CampaignExperimentTypeProto.getDescriptor(),
          com.google.ads.googleads.v7.enums.CampaignServingStatusProto.getDescriptor(),
          com.google.ads.googleads.v7.enums.CampaignStatusProto.getDescriptor(),
          com.google.ads.googleads.v7.enums.LocationSourceTypeProto.getDescriptor(),
          com.google.ads.googleads.v7.enums.NegativeGeoTargetTypeProto.getDescriptor(),
          com.google.ads.googleads.v7.enums.OptimizationGoalTypeProto.getDescriptor(),
          com.google.ads.googleads.v7.enums.PaymentModeProto.getDescriptor(),
          com.google.ads.googleads.v7.enums.PositiveGeoTargetTypeProto.getDescriptor(),
          com.google.ads.googleads.v7.enums.VanityPharmaDisplayUrlModeProto.getDescriptor(),
          com.google.ads.googleads.v7.enums.VanityPharmaTextProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v7_resources_Campaign_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v7_resources_Campaign_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_resources_Campaign_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Status", "ServingStatus", "AdServingOptimizationStatus", "AdvertisingChannelType", "AdvertisingChannelSubType", "TrackingUrlTemplate", "UrlCustomParameters", "RealTimeBiddingSetting", "NetworkSettings", "HotelSetting", "DynamicSearchAdsSetting", "ShoppingSetting", "TargetingSetting", "GeoTargetTypeSetting", "LocalCampaignSetting", "AppCampaignSetting", "Labels", "ExperimentType", "BaseCampaign", "CampaignBudget", "BiddingStrategyType", "StartDate", "EndDate", "FinalUrlSuffix", "FrequencyCaps", "VideoBrandSafetySuitability", "VanityPharma", "SelectiveOptimization", "OptimizationGoalSetting", "TrackingSetting", "PaymentMode", "OptimizationScore", "ExcludedParentAssetFieldTypes", "BiddingStrategy", "Commission", "ManualCpc", "ManualCpm", "ManualCpv", "MaximizeConversions", "MaximizeConversionValue", "TargetCpa", "TargetImpressionShare", "TargetRoas", "TargetSpend", "PercentCpc", "TargetCpm", "CampaignBiddingStrategy", "Id", "Name", "TrackingUrlTemplate", "BaseCampaign", "CampaignBudget", "StartDate", "EndDate", "FinalUrlSuffix", "OptimizationScore", });
    internal_static_google_ads_googleads_v7_resources_Campaign_NetworkSettings_descriptor =
      internal_static_google_ads_googleads_v7_resources_Campaign_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v7_resources_Campaign_NetworkSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_resources_Campaign_NetworkSettings_descriptor,
        new java.lang.String[] { "TargetGoogleSearch", "TargetSearchNetwork", "TargetContentNetwork", "TargetPartnerSearchNetwork", "TargetGoogleSearch", "TargetSearchNetwork", "TargetContentNetwork", "TargetPartnerSearchNetwork", });
    internal_static_google_ads_googleads_v7_resources_Campaign_HotelSettingInfo_descriptor =
      internal_static_google_ads_googleads_v7_resources_Campaign_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v7_resources_Campaign_HotelSettingInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_resources_Campaign_HotelSettingInfo_descriptor,
        new java.lang.String[] { "HotelCenterId", "HotelCenterId", });
    internal_static_google_ads_googleads_v7_resources_Campaign_LocalCampaignSetting_descriptor =
      internal_static_google_ads_googleads_v7_resources_Campaign_descriptor.getNestedTypes().get(2);
    internal_static_google_ads_googleads_v7_resources_Campaign_LocalCampaignSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_resources_Campaign_LocalCampaignSetting_descriptor,
        new java.lang.String[] { "LocationSourceType", });
    internal_static_google_ads_googleads_v7_resources_Campaign_DynamicSearchAdsSetting_descriptor =
      internal_static_google_ads_googleads_v7_resources_Campaign_descriptor.getNestedTypes().get(3);
    internal_static_google_ads_googleads_v7_resources_Campaign_DynamicSearchAdsSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_resources_Campaign_DynamicSearchAdsSetting_descriptor,
        new java.lang.String[] { "DomainName", "LanguageCode", "UseSuppliedUrlsOnly", "Feeds", "UseSuppliedUrlsOnly", });
    internal_static_google_ads_googleads_v7_resources_Campaign_TrackingSetting_descriptor =
      internal_static_google_ads_googleads_v7_resources_Campaign_descriptor.getNestedTypes().get(4);
    internal_static_google_ads_googleads_v7_resources_Campaign_TrackingSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_resources_Campaign_TrackingSetting_descriptor,
        new java.lang.String[] { "TrackingUrl", "TrackingUrl", });
    internal_static_google_ads_googleads_v7_resources_Campaign_VanityPharma_descriptor =
      internal_static_google_ads_googleads_v7_resources_Campaign_descriptor.getNestedTypes().get(5);
    internal_static_google_ads_googleads_v7_resources_Campaign_VanityPharma_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_resources_Campaign_VanityPharma_descriptor,
        new java.lang.String[] { "VanityPharmaDisplayUrlMode", "VanityPharmaText", });
    internal_static_google_ads_googleads_v7_resources_Campaign_ShoppingSetting_descriptor =
      internal_static_google_ads_googleads_v7_resources_Campaign_descriptor.getNestedTypes().get(6);
    internal_static_google_ads_googleads_v7_resources_Campaign_ShoppingSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_resources_Campaign_ShoppingSetting_descriptor,
        new java.lang.String[] { "MerchantId", "SalesCountry", "CampaignPriority", "EnableLocal", "MerchantId", "SalesCountry", "CampaignPriority", "EnableLocal", });
    internal_static_google_ads_googleads_v7_resources_Campaign_OptimizationGoalSetting_descriptor =
      internal_static_google_ads_googleads_v7_resources_Campaign_descriptor.getNestedTypes().get(7);
    internal_static_google_ads_googleads_v7_resources_Campaign_OptimizationGoalSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_resources_Campaign_OptimizationGoalSetting_descriptor,
        new java.lang.String[] { "OptimizationGoalTypes", });
    internal_static_google_ads_googleads_v7_resources_Campaign_GeoTargetTypeSetting_descriptor =
      internal_static_google_ads_googleads_v7_resources_Campaign_descriptor.getNestedTypes().get(8);
    internal_static_google_ads_googleads_v7_resources_Campaign_GeoTargetTypeSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_resources_Campaign_GeoTargetTypeSetting_descriptor,
        new java.lang.String[] { "PositiveGeoTargetType", "NegativeGeoTargetType", });
    internal_static_google_ads_googleads_v7_resources_Campaign_SelectiveOptimization_descriptor =
      internal_static_google_ads_googleads_v7_resources_Campaign_descriptor.getNestedTypes().get(9);
    internal_static_google_ads_googleads_v7_resources_Campaign_SelectiveOptimization_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_resources_Campaign_SelectiveOptimization_descriptor,
        new java.lang.String[] { "ConversionActions", });
    internal_static_google_ads_googleads_v7_resources_Campaign_AppCampaignSetting_descriptor =
      internal_static_google_ads_googleads_v7_resources_Campaign_descriptor.getNestedTypes().get(10);
    internal_static_google_ads_googleads_v7_resources_Campaign_AppCampaignSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_resources_Campaign_AppCampaignSetting_descriptor,
        new java.lang.String[] { "BiddingStrategyGoalType", "AppId", "AppStore", "AppId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v7.common.BiddingProto.getDescriptor();
    com.google.ads.googleads.v7.common.CustomParameterProto.getDescriptor();
    com.google.ads.googleads.v7.common.FrequencyCapProto.getDescriptor();
    com.google.ads.googleads.v7.common.RealTimeBiddingSettingProto.getDescriptor();
    com.google.ads.googleads.v7.common.TargetingSettingProto.getDescriptor();
    com.google.ads.googleads.v7.enums.AdServingOptimizationStatusProto.getDescriptor();
    com.google.ads.googleads.v7.enums.AdvertisingChannelSubTypeProto.getDescriptor();
    com.google.ads.googleads.v7.enums.AdvertisingChannelTypeProto.getDescriptor();
    com.google.ads.googleads.v7.enums.AppCampaignAppStoreProto.getDescriptor();
    com.google.ads.googleads.v7.enums.AppCampaignBiddingStrategyGoalTypeProto.getDescriptor();
    com.google.ads.googleads.v7.enums.AssetFieldTypeProto.getDescriptor();
    com.google.ads.googleads.v7.enums.BiddingStrategyTypeProto.getDescriptor();
    com.google.ads.googleads.v7.enums.BrandSafetySuitabilityProto.getDescriptor();
    com.google.ads.googleads.v7.enums.CampaignExperimentTypeProto.getDescriptor();
    com.google.ads.googleads.v7.enums.CampaignServingStatusProto.getDescriptor();
    com.google.ads.googleads.v7.enums.CampaignStatusProto.getDescriptor();
    com.google.ads.googleads.v7.enums.LocationSourceTypeProto.getDescriptor();
    com.google.ads.googleads.v7.enums.NegativeGeoTargetTypeProto.getDescriptor();
    com.google.ads.googleads.v7.enums.OptimizationGoalTypeProto.getDescriptor();
    com.google.ads.googleads.v7.enums.PaymentModeProto.getDescriptor();
    com.google.ads.googleads.v7.enums.PositiveGeoTargetTypeProto.getDescriptor();
    com.google.ads.googleads.v7.enums.VanityPharmaDisplayUrlModeProto.getDescriptor();
    com.google.ads.googleads.v7.enums.VanityPharmaTextProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
