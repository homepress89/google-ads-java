/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.ads.googleads.v6.services;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

/**
 * AUTO-GENERATED DOCUMENTATION AND CLASS
 */
@javax.annotation.Generated("by GAPIC protoc plugin")
public class CampaignFeedName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/campaignFeeds/{campaign_id}~{feed_id}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customerId;
  private final String campaignId;
  private final String feedId;

  public String getCustomerId() {
    return customerId;
  }

  public String getCampaignId() {
    return campaignId;
  }

  public String getFeedId() {
    return feedId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private CampaignFeedName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    campaignId = Preconditions.checkNotNull(builder.getCampaignId());
    feedId = Preconditions.checkNotNull(builder.getFeedId());
  }

  public static CampaignFeedName of(String customerId, String campaignId, String feedId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setCampaignId(campaignId)
      .setFeedId(feedId)
      .build();
  }

  public static String format(String customerId, String campaignId, String feedId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setCampaignId(campaignId)
      .setFeedId(feedId)
      .build()
      .toString();
  }

  public static CampaignFeedName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "CampaignFeedName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("campaign_id"), matchMap.get("feed_id"));
  }

  public static List<CampaignFeedName> parseList(List<String> formattedStrings) {
    List<CampaignFeedName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CampaignFeedName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (CampaignFeedName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("customerId", customerId);
          fieldMapBuilder.put("campaignId", campaignId);
          fieldMapBuilder.put("feedId", feedId);
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("customer_id", customerId, "campaign_id", campaignId, "feed_id", feedId);
  }

  /** Builder for CampaignFeedName. */
  public static class Builder {

    private String customerId;
    private String campaignId;
    private String feedId;

    public String getCustomerId() {
      return customerId;
    }

    public String getCampaignId() {
      return campaignId;
    }

    public String getFeedId() {
      return feedId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setCampaignId(String campaignId) {
      this.campaignId = campaignId;
      return this;
    }

    public Builder setFeedId(String feedId) {
      this.feedId = feedId;
      return this;
    }

    private Builder() {
    }

    private Builder(CampaignFeedName campaignFeedName) {
      customerId = campaignFeedName.customerId;
      campaignId = campaignFeedName.campaignId;
      feedId = campaignFeedName.feedId;
    }

    public CampaignFeedName build() {
      return new CampaignFeedName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CampaignFeedName) {
      CampaignFeedName that = (CampaignFeedName) o;
      return (this.customerId.equals(that.customerId))
          && (this.campaignId.equals(that.campaignId))
          && (this.feedId.equals(that.feedId));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customerId.hashCode();
    h *= 1000003;
    h ^= campaignId.hashCode();
    h *= 1000003;
    h ^= feedId.hashCode();
    return h;
  }
}

