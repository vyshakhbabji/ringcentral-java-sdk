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
 * LinksInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class LinksInfo {
  @SerializedName("startUri")
  private String startUri = null;

  @SerializedName("joinUri")
  private String joinUri = null;

  public LinksInfo startUri(String startUri) {
    this.startUri = startUri;
    return this;
  }

   /**
   * Link to start a meeting
   * @return startUri
  **/
  @ApiModelProperty(example = "null", value = "Link to start a meeting")
  public String getStartUri() {
    return startUri;
  }

  public void setStartUri(String startUri) {
    this.startUri = startUri;
  }

  public LinksInfo joinUri(String joinUri) {
    this.joinUri = joinUri;
    return this;
  }

   /**
   * Link to join a meeting
   * @return joinUri
  **/
  @ApiModelProperty(example = "null", value = "Link to join a meeting")
  public String getJoinUri() {
    return joinUri;
  }

  public void setJoinUri(String joinUri) {
    this.joinUri = joinUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinksInfo linksInfo = (LinksInfo) o;
    return Objects.equals(this.startUri, linksInfo.startUri) &&
        Objects.equals(this.joinUri, linksInfo.joinUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startUri, joinUri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinksInfo {\n");
    
    sb.append("    startUri: ").append(toIndentedString(startUri)).append("\n");
    sb.append("    joinUri: ").append(toIndentedString(joinUri)).append("\n");
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

