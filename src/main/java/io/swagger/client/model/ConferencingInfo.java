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
import io.swagger.client.model.ConferencingInfoPhoneNumberInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * ConferencingInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class ConferencingInfo {
  @SerializedName("uri")
  private String uri = null;

  @SerializedName("allowJoinBeforeHost")
  private Boolean allowJoinBeforeHost = null;

  @SerializedName("hostCode")
  private String hostCode = null;

  @SerializedName("mode")
  private String mode = null;

  @SerializedName("participantCode")
  private String participantCode = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("tapToJoinUri")
  private String tapToJoinUri = null;

  @SerializedName("phoneNumbers")
  private List<ConferencingInfoPhoneNumberInfo> phoneNumbers = new ArrayList<ConferencingInfoPhoneNumberInfo>();

  public ConferencingInfo uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Canonical URI of a conferencing
   * @return uri
  **/
  @ApiModelProperty(example = "null", value = "Canonical URI of a conferencing")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public ConferencingInfo allowJoinBeforeHost(Boolean allowJoinBeforeHost) {
    this.allowJoinBeforeHost = allowJoinBeforeHost;
    return this;
  }

   /**
   * Determines if host user allows conference participants to join before the host
   * @return allowJoinBeforeHost
  **/
  @ApiModelProperty(example = "null", value = "Determines if host user allows conference participants to join before the host")
  public Boolean getAllowJoinBeforeHost() {
    return allowJoinBeforeHost;
  }

  public void setAllowJoinBeforeHost(Boolean allowJoinBeforeHost) {
    this.allowJoinBeforeHost = allowJoinBeforeHost;
  }

  public ConferencingInfo hostCode(String hostCode) {
    this.hostCode = hostCode;
    return this;
  }

   /**
   * Access code for a host user
   * @return hostCode
  **/
  @ApiModelProperty(example = "null", value = "Access code for a host user")
  public String getHostCode() {
    return hostCode;
  }

  public void setHostCode(String hostCode) {
    this.hostCode = hostCode;
  }

  public ConferencingInfo mode(String mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Internal parameter specifying conferencing engine
   * @return mode
  **/
  @ApiModelProperty(example = "null", value = "Internal parameter specifying conferencing engine")
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public ConferencingInfo participantCode(String participantCode) {
    this.participantCode = participantCode;
    return this;
  }

   /**
   * Access code for any participant
   * @return participantCode
  **/
  @ApiModelProperty(example = "null", value = "Access code for any participant")
  public String getParticipantCode() {
    return participantCode;
  }

  public void setParticipantCode(String participantCode) {
    this.participantCode = participantCode;
  }

  public ConferencingInfo phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Primary conference phone number for user's home country returned in E.164 (11-digits) format
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "null", value = "Primary conference phone number for user's home country returned in E.164 (11-digits) format")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public ConferencingInfo tapToJoinUri(String tapToJoinUri) {
    this.tapToJoinUri = tapToJoinUri;
    return this;
  }

   /**
   * Short URL leading to the service web page Tap to Join for audio conference bridge
   * @return tapToJoinUri
  **/
  @ApiModelProperty(example = "null", value = "Short URL leading to the service web page Tap to Join for audio conference bridge")
  public String getTapToJoinUri() {
    return tapToJoinUri;
  }

  public void setTapToJoinUri(String tapToJoinUri) {
    this.tapToJoinUri = tapToJoinUri;
  }

  public ConferencingInfo phoneNumbers(List<ConferencingInfoPhoneNumberInfo> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public ConferencingInfo addPhoneNumbersItem(ConferencingInfoPhoneNumberInfo phoneNumbersItem) {
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * List of multiple dial-in phone numbers to connect to audio conference service, relevant for user's brand. Each number is given with the country and location information, in order to let the user choose the less expensive way to connect to a conference. The first number in the list is the primary conference number, that is default and domestic
   * @return phoneNumbers
  **/
  @ApiModelProperty(example = "null", value = "List of multiple dial-in phone numbers to connect to audio conference service, relevant for user's brand. Each number is given with the country and location information, in order to let the user choose the less expensive way to connect to a conference. The first number in the list is the primary conference number, that is default and domestic")
  public List<ConferencingInfoPhoneNumberInfo> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<ConferencingInfoPhoneNumberInfo> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConferencingInfo conferencingInfo = (ConferencingInfo) o;
    return Objects.equals(this.uri, conferencingInfo.uri) &&
        Objects.equals(this.allowJoinBeforeHost, conferencingInfo.allowJoinBeforeHost) &&
        Objects.equals(this.hostCode, conferencingInfo.hostCode) &&
        Objects.equals(this.mode, conferencingInfo.mode) &&
        Objects.equals(this.participantCode, conferencingInfo.participantCode) &&
        Objects.equals(this.phoneNumber, conferencingInfo.phoneNumber) &&
        Objects.equals(this.tapToJoinUri, conferencingInfo.tapToJoinUri) &&
        Objects.equals(this.phoneNumbers, conferencingInfo.phoneNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, allowJoinBeforeHost, hostCode, mode, participantCode, phoneNumber, tapToJoinUri, phoneNumbers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConferencingInfo {\n");
    
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    allowJoinBeforeHost: ").append(toIndentedString(allowJoinBeforeHost)).append("\n");
    sb.append("    hostCode: ").append(toIndentedString(hostCode)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    participantCode: ").append(toIndentedString(participantCode)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    tapToJoinUri: ").append(toIndentedString(tapToJoinUri)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
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
