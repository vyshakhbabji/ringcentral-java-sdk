/*
 * RingCentral API
 * RingCentral Connect Platform API
 *
 * OpenAPI spec version: v1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.SubscriptionRequestDeliveryMode;
import java.util.ArrayList;
import java.util.List;

/**
 * Body17
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class Body17 {
  @SerializedName("eventFilters")
  private List<String> eventFilters = new ArrayList<String>();

  @SerializedName("deliveryMode")
  private SubscriptionRequestDeliveryMode deliveryMode = null;

  public Body17 eventFilters(List<String> eventFilters) {
    this.eventFilters = eventFilters;
    return this;
  }

  public Body17 addEventFiltersItem(String eventFiltersItem) {
    this.eventFilters.add(eventFiltersItem);
    return this;
  }

   /**
   * Mandatory. Collection of URIs to API resources (see Event Types for details). For APNS transport type only message event filter is available
   * @return eventFilters
  **/
  @ApiModelProperty(example = "null", value = "Mandatory. Collection of URIs to API resources (see Event Types for details). For APNS transport type only message event filter is available")
  public List<String> getEventFilters() {
    return eventFilters;
  }

  public void setEventFilters(List<String> eventFilters) {
    this.eventFilters = eventFilters;
  }

  public Body17 deliveryMode(SubscriptionRequestDeliveryMode deliveryMode) {
    this.deliveryMode = deliveryMode;
    return this;
  }

   /**
   * Notification delivery settings
   * @return deliveryMode
  **/
  @ApiModelProperty(example = "null", value = "Notification delivery settings")
  public SubscriptionRequestDeliveryMode getDeliveryMode() {
    return deliveryMode;
  }

  public void setDeliveryMode(SubscriptionRequestDeliveryMode deliveryMode) {
    this.deliveryMode = deliveryMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body17 body17 = (Body17) o;
    return Objects.equals(this.eventFilters, body17.eventFilters) &&
        Objects.equals(this.deliveryMode, body17.deliveryMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventFilters, deliveryMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body17 {\n");
    
    sb.append("    eventFilters: ").append(toIndentedString(eventFilters)).append("\n");
    sb.append("    deliveryMode: ").append(toIndentedString(deliveryMode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

