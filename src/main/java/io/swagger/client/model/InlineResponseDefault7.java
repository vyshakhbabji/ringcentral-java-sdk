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
import io.swagger.client.model.ExtensionInfo;
import io.swagger.client.model.NavigationInfo;
import io.swagger.client.model.PagingInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponseDefault7
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class InlineResponseDefault7 {
  @SerializedName("records")
  private List<ExtensionInfo> records = new ArrayList<ExtensionInfo>();

  @SerializedName("navigation")
  private NavigationInfo navigation = null;

  @SerializedName("paging")
  private PagingInfo paging = null;

  public InlineResponseDefault7 records(List<ExtensionInfo> records) {
    this.records = records;
    return this;
  }

  public InlineResponseDefault7 addRecordsItem(ExtensionInfo recordsItem) {
    this.records.add(recordsItem);
    return this;
  }

   /**
   * List of extensions with extension information
   * @return records
  **/
  @ApiModelProperty(example = "null", value = "List of extensions with extension information")
  public List<ExtensionInfo> getRecords() {
    return records;
  }

  public void setRecords(List<ExtensionInfo> records) {
    this.records = records;
  }

  public InlineResponseDefault7 navigation(NavigationInfo navigation) {
    this.navigation = navigation;
    return this;
  }

   /**
   * Information on navigation
   * @return navigation
  **/
  @ApiModelProperty(example = "null", value = "Information on navigation")
  public NavigationInfo getNavigation() {
    return navigation;
  }

  public void setNavigation(NavigationInfo navigation) {
    this.navigation = navigation;
  }

  public InlineResponseDefault7 paging(PagingInfo paging) {
    this.paging = paging;
    return this;
  }

   /**
   * Information on paging
   * @return paging
  **/
  @ApiModelProperty(example = "null", value = "Information on paging")
  public PagingInfo getPaging() {
    return paging;
  }

  public void setPaging(PagingInfo paging) {
    this.paging = paging;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponseDefault7 inlineResponseDefault7 = (InlineResponseDefault7) o;
    return Objects.equals(this.records, inlineResponseDefault7.records) &&
        Objects.equals(this.navigation, inlineResponseDefault7.navigation) &&
        Objects.equals(this.paging, inlineResponseDefault7.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(records, navigation, paging);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponseDefault7 {\n");
    
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
    sb.append("    navigation: ").append(toIndentedString(navigation)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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

