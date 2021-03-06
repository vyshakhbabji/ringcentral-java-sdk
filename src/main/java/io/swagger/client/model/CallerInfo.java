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
 * CallerInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class CallerInfo {
  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("extensionNumber")
  private String extensionNumber = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("name")
  private String name = null;

  public CallerInfo phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Phone number of a party. Usually it is a plain number including country and area code like 18661234567. But sometimes it could be returned from database with some formatting applied, for example (866)123-4567. This property is filled in all cases where parties communicate by means of global phone numbers, for example when calling to direct numbers or sending/receiving SMS
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "null", value = "Phone number of a party. Usually it is a plain number including country and area code like 18661234567. But sometimes it could be returned from database with some formatting applied, for example (866)123-4567. This property is filled in all cases where parties communicate by means of global phone numbers, for example when calling to direct numbers or sending/receiving SMS")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public CallerInfo extensionNumber(String extensionNumber) {
    this.extensionNumber = extensionNumber;
    return this;
  }

   /**
   * Extension short number (usually 3 or 4 digits). This property is filled when parties communicate by means of short internal numbers, for example when calling to other extension or sending/receiving Company Pager message
   * @return extensionNumber
  **/
  @ApiModelProperty(example = "null", value = "Extension short number (usually 3 or 4 digits). This property is filled when parties communicate by means of short internal numbers, for example when calling to other extension or sending/receiving Company Pager message")
  public String getExtensionNumber() {
    return extensionNumber;
  }

  public void setExtensionNumber(String extensionNumber) {
    this.extensionNumber = extensionNumber;
  }

  public CallerInfo location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Contains party location (city, state) if one can be determined from phoneNumber. This property is filled only when phoneNumber is not empty and server can calculate location information from it (for example, this information is unavailable for US toll-free numbers)
   * @return location
  **/
  @ApiModelProperty(example = "null", value = "Contains party location (city, state) if one can be determined from phoneNumber. This property is filled only when phoneNumber is not empty and server can calculate location information from it (for example, this information is unavailable for US toll-free numbers)")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public CallerInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Symbolic name associated with a party. If the phone does not belong to the known extension, only the location is returned, the name is not determined then
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Symbolic name associated with a party. If the phone does not belong to the known extension, only the location is returned, the name is not determined then")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallerInfo callerInfo = (CallerInfo) o;
    return Objects.equals(this.phoneNumber, callerInfo.phoneNumber) &&
        Objects.equals(this.extensionNumber, callerInfo.extensionNumber) &&
        Objects.equals(this.location, callerInfo.location) &&
        Objects.equals(this.name, callerInfo.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, extensionNumber, location, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallerInfo {\n");
    
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    extensionNumber: ").append(toIndentedString(extensionNumber)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

