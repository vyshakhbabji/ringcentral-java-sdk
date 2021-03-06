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

/**
 * AddonInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class AddonInfo {
  @SerializedName("id")
  private String id = null;

  @SerializedName("count")
  private Integer count = null;

  public AddonInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Addon identifier. For HardPhones of certain types, which are compatible with this addon identifier
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Addon identifier. For HardPhones of certain types, which are compatible with this addon identifier")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AddonInfo count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of addons. For HardPhones of certain types, which are compatible with such addon identifier
   * @return count
  **/
  @ApiModelProperty(example = "null", value = "Number of addons. For HardPhones of certain types, which are compatible with such addon identifier")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddonInfo addonInfo = (AddonInfo) o;
    return Objects.equals(this.id, addonInfo.id) &&
        Objects.equals(this.count, addonInfo.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddonInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

