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
 * ExtensionInfoRequestProvisionContactInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class ExtensionInfoRequestProvisionContactInfo {
  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("email")
  private String email = null;

  public ExtensionInfoRequestProvisionContactInfo firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Mandatory. Extension user first name
   * @return firstName
  **/
  @ApiModelProperty(example = "null", value = "Mandatory. Extension user first name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ExtensionInfoRequestProvisionContactInfo lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Mandatory. Extension user last name
   * @return lastName
  **/
  @ApiModelProperty(example = "null", value = "Mandatory. Extension user last name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ExtensionInfoRequestProvisionContactInfo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Mandatory. Extension user contact email
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "Mandatory. Extension user contact email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionInfoRequestProvisionContactInfo extensionInfoRequestProvisionContactInfo = (ExtensionInfoRequestProvisionContactInfo) o;
    return Objects.equals(this.firstName, extensionInfoRequestProvisionContactInfo.firstName) &&
        Objects.equals(this.lastName, extensionInfoRequestProvisionContactInfo.lastName) &&
        Objects.equals(this.email, extensionInfoRequestProvisionContactInfo.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionInfoRequestProvisionContactInfo {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

