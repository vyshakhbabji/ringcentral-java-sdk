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
 * ExtensionInfoRequestPasswordPIN
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class ExtensionInfoRequestPasswordPIN {
  @SerializedName("password")
  private String password = null;

  @SerializedName("ivrPin")
  private String ivrPin = null;

  public ExtensionInfoRequestPasswordPIN password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password for extension
   * @return password
  **/
  @ApiModelProperty(example = "null", value = "Password for extension")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ExtensionInfoRequestPasswordPIN ivrPin(String ivrPin) {
    this.ivrPin = ivrPin;
    return this;
  }

   /**
   * IVR PIN
   * @return ivrPin
  **/
  @ApiModelProperty(example = "null", value = "IVR PIN")
  public String getIvrPin() {
    return ivrPin;
  }

  public void setIvrPin(String ivrPin) {
    this.ivrPin = ivrPin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionInfoRequestPasswordPIN extensionInfoRequestPasswordPIN = (ExtensionInfoRequestPasswordPIN) o;
    return Objects.equals(this.password, extensionInfoRequestPasswordPIN.password) &&
        Objects.equals(this.ivrPin, extensionInfoRequestPasswordPIN.ivrPin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, ivrPin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionInfoRequestPasswordPIN {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    ivrPin: ").append(toIndentedString(ivrPin)).append("\n");
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

