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
 * ExternalUserInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class ExternalUserInfo {
  @SerializedName("accountId")
  private String accountId = "~";

  @SerializedName("userId")
  private String userId = null;

  @SerializedName("userToken")
  private String userToken = null;

  @SerializedName("userType")
  private Integer userType = null;

  public ExternalUserInfo accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * User type of a meeting account
   * @return accountId
  **/
  @ApiModelProperty(example = "null", value = "User type of a meeting account")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public ExternalUserInfo userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Meeting account user identifier
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "Meeting account user identifier")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public ExternalUserInfo userToken(String userToken) {
    this.userToken = userToken;
    return this;
  }

   /**
   * Meeting account user token
   * @return userToken
  **/
  @ApiModelProperty(example = "null", value = "Meeting account user token")
  public String getUserToken() {
    return userToken;
  }

  public void setUserToken(String userToken) {
    this.userToken = userToken;
  }

  public ExternalUserInfo userType(Integer userType) {
    this.userType = userType;
    return this;
  }

   /**
   * Meeting account user type
   * @return userType
  **/
  @ApiModelProperty(example = "null", value = "Meeting account user type")
  public Integer getUserType() {
    return userType;
  }

  public void setUserType(Integer userType) {
    this.userType = userType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalUserInfo externalUserInfo = (ExternalUserInfo) o;
    return Objects.equals(this.accountId, externalUserInfo.accountId) &&
        Objects.equals(this.userId, externalUserInfo.userId) &&
        Objects.equals(this.userToken, externalUserInfo.userToken) &&
        Objects.equals(this.userType, externalUserInfo.userType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, userId, userToken, userType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalUserInfo {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userToken: ").append(toIndentedString(userToken)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
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

