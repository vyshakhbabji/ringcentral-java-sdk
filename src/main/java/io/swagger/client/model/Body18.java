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
import java.util.ArrayList;
import java.util.List;

/**
 * Body18
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class Body18 {
  @SerializedName("eventFilters")
  private List<String> eventFilters = new ArrayList<String>();

  public Body18 eventFilters(List<String> eventFilters) {
    this.eventFilters = eventFilters;
    return this;
  }

  public Body18 addEventFiltersItem(String eventFiltersItem) {
    this.eventFilters.add(eventFiltersItem);
    return this;
  }

   /**
   * Collection of URIs to API resources (see Event Types). Mandatory field
   * @return eventFilters
  **/
  @ApiModelProperty(example = "null", value = "Collection of URIs to API resources (see Event Types). Mandatory field")
  public List<String> getEventFilters() {
    return eventFilters;
  }

  public void setEventFilters(List<String> eventFilters) {
    this.eventFilters = eventFilters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body18 body18 = (Body18) o;
    return Objects.equals(this.eventFilters, body18.eventFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventFilters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body18 {\n");
    
    sb.append("    eventFilters: ").append(toIndentedString(eventFilters)).append("\n");
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

