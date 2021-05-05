/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.ads.googleads.v7.resources;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
@Generated("by gapic-generator-java")
public class MerchantCenterLinkName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_MERCHANT_CENTER_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/merchantCenterLinks/{merchant_center_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String merchantCenterId;

  @Deprecated
  protected MerchantCenterLinkName() {
    customerId = null;
    merchantCenterId = null;
  }

  private MerchantCenterLinkName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    merchantCenterId = Preconditions.checkNotNull(builder.getMerchantCenterId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getMerchantCenterId() {
    return merchantCenterId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static MerchantCenterLinkName of(String customerId, String merchantCenterId) {
    return newBuilder().setCustomerId(customerId).setMerchantCenterId(merchantCenterId).build();
  }

  public static String format(String customerId, String merchantCenterId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setMerchantCenterId(merchantCenterId)
        .build()
        .toString();
  }

  public static MerchantCenterLinkName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_MERCHANT_CENTER_ID.validatedMatch(
            formattedString, "MerchantCenterLinkName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("merchant_center_id"));
  }

  public static List<MerchantCenterLinkName> parseList(List<String> formattedStrings) {
    List<MerchantCenterLinkName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<MerchantCenterLinkName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (MerchantCenterLinkName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_MERCHANT_CENTER_ID.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (customerId != null) {
            fieldMapBuilder.put("customer_id", customerId);
          }
          if (merchantCenterId != null) {
            fieldMapBuilder.put("merchant_center_id", merchantCenterId);
          }
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
    return CUSTOMER_ID_MERCHANT_CENTER_ID.instantiate(
        "customer_id", customerId, "merchant_center_id", merchantCenterId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      MerchantCenterLinkName that = ((MerchantCenterLinkName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.merchantCenterId, that.merchantCenterId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(merchantCenterId);
    return h;
  }

  /** Builder for customers/{customer_id}/merchantCenterLinks/{merchant_center_id}. */
  public static class Builder {
    private String customerId;
    private String merchantCenterId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getMerchantCenterId() {
      return merchantCenterId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setMerchantCenterId(String merchantCenterId) {
      this.merchantCenterId = merchantCenterId;
      return this;
    }

    private Builder(MerchantCenterLinkName merchantCenterLinkName) {
      customerId = merchantCenterLinkName.customerId;
      merchantCenterId = merchantCenterLinkName.merchantCenterId;
    }

    public MerchantCenterLinkName build() {
      return new MerchantCenterLinkName(this);
    }
  }
}
