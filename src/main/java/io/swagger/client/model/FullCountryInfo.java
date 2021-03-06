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
 * FullCountryInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class FullCountryInfo {
  @SerializedName("id")
  private String id = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("callingCode")
  private String callingCode = null;

  @SerializedName("emergencyCalling")
  private Boolean emergencyCalling = null;

  @SerializedName("isoCode")
  private String isoCode = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("numberSelling")
  private Boolean numberSelling = null;

  @SerializedName("loginAllowed")
  private Boolean loginAllowed = null;

  public FullCountryInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Internal identifier of a country
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Internal identifier of a country")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FullCountryInfo uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Canonical URI of a country
   * @return uri
  **/
  @ApiModelProperty(example = "null", value = "Canonical URI of a country")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public FullCountryInfo callingCode(String callingCode) {
    this.callingCode = callingCode;
    return this;
  }

   /**
   * Country calling code defined by ITU-T recommendations E.123 and E.164, see Calling Codes
   * @return callingCode
  **/
  @ApiModelProperty(example = "null", value = "Country calling code defined by ITU-T recommendations E.123 and E.164, see Calling Codes")
  public String getCallingCode() {
    return callingCode;
  }

  public void setCallingCode(String callingCode) {
    this.callingCode = callingCode;
  }

  public FullCountryInfo emergencyCalling(Boolean emergencyCalling) {
    this.emergencyCalling = emergencyCalling;
    return this;
  }

   /**
   * Emergency calling feature availability/emergency address requirement indicator
   * @return emergencyCalling
  **/
  @ApiModelProperty(example = "null", value = "Emergency calling feature availability/emergency address requirement indicator")
  public Boolean getEmergencyCalling() {
    return emergencyCalling;
  }

  public void setEmergencyCalling(Boolean emergencyCalling) {
    this.emergencyCalling = emergencyCalling;
  }

  public FullCountryInfo isoCode(String isoCode) {
    this.isoCode = isoCode;
    return this;
  }

   /**
   * Country code according to the ISO standard, see ISO 3166
   * @return isoCode
  **/
  @ApiModelProperty(example = "null", value = "Country code according to the ISO standard, see ISO 3166")
  public String getIsoCode() {
    return isoCode;
  }

  public void setIsoCode(String isoCode) {
    this.isoCode = isoCode;
  }

  public FullCountryInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Official name of a country
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Official name of a country")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FullCountryInfo numberSelling(Boolean numberSelling) {
    this.numberSelling = numberSelling;
    return this;
  }

   /**
   * Determines whether phone numbers are available for a country
   * @return numberSelling
  **/
  @ApiModelProperty(example = "null", value = "Determines whether phone numbers are available for a country")
  public Boolean getNumberSelling() {
    return numberSelling;
  }

  public void setNumberSelling(Boolean numberSelling) {
    this.numberSelling = numberSelling;
  }

  public FullCountryInfo loginAllowed(Boolean loginAllowed) {
    this.loginAllowed = loginAllowed;
    return this;
  }

   /**
   * Specifies whether login with the phone numbers of this country is enabled or not
   * @return loginAllowed
  **/
  @ApiModelProperty(example = "null", value = "Specifies whether login with the phone numbers of this country is enabled or not")
  public Boolean getLoginAllowed() {
    return loginAllowed;
  }

  public void setLoginAllowed(Boolean loginAllowed) {
    this.loginAllowed = loginAllowed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullCountryInfo fullCountryInfo = (FullCountryInfo) o;
    return Objects.equals(this.id, fullCountryInfo.id) &&
        Objects.equals(this.uri, fullCountryInfo.uri) &&
        Objects.equals(this.callingCode, fullCountryInfo.callingCode) &&
        Objects.equals(this.emergencyCalling, fullCountryInfo.emergencyCalling) &&
        Objects.equals(this.isoCode, fullCountryInfo.isoCode) &&
        Objects.equals(this.name, fullCountryInfo.name) &&
        Objects.equals(this.numberSelling, fullCountryInfo.numberSelling) &&
        Objects.equals(this.loginAllowed, fullCountryInfo.loginAllowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uri, callingCode, emergencyCalling, isoCode, name, numberSelling, loginAllowed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullCountryInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    callingCode: ").append(toIndentedString(callingCode)).append("\n");
    sb.append("    emergencyCalling: ").append(toIndentedString(emergencyCalling)).append("\n");
    sb.append("    isoCode: ").append(toIndentedString(isoCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numberSelling: ").append(toIndentedString(numberSelling)).append("\n");
    sb.append("    loginAllowed: ").append(toIndentedString(loginAllowed)).append("\n");
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

