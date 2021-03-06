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
import io.swagger.client.model.BusinessAddressInfo;

/**
 * Body3
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class Body3 {
  @SerializedName("company")
  private String company = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("businessAddress")
  private BusinessAddressInfo businessAddress = null;

  public Body3 company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Company business name
   * @return company
  **/
  @ApiModelProperty(example = "null", value = "Company business name")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public Body3 email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Company business email address
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "Company business email address")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Body3 businessAddress(BusinessAddressInfo businessAddress) {
    this.businessAddress = businessAddress;
    return this;
  }

   /**
   * Company business address
   * @return businessAddress
  **/
  @ApiModelProperty(example = "null", value = "Company business address")
  public BusinessAddressInfo getBusinessAddress() {
    return businessAddress;
  }

  public void setBusinessAddress(BusinessAddressInfo businessAddress) {
    this.businessAddress = businessAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body3 body3 = (Body3) o;
    return Objects.equals(this.company, body3.company) &&
        Objects.equals(this.email, body3.email) &&
        Objects.equals(this.businessAddress, body3.businessAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, email, businessAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body3 {\n");
    
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    businessAddress: ").append(toIndentedString(businessAddress)).append("\n");
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

