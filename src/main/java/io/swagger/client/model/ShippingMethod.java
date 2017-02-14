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
 * ShippingMethod
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class ShippingMethod {
  /**
   * Method identifier. The default value is \"1\" (Ground)
   */
  public enum IdEnum {
    @SerializedName("1")
    _1("1"),
    
    @SerializedName("2")
    _2("2"),
    
    @SerializedName("3")
    _3("3");

    private String value;

    IdEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("id")
  private IdEnum id = null;

  /**
   * Method name, corresponding to the identifier
   */
  public enum NameEnum {
    @SerializedName("Ground")
    GROUND("Ground"),
    
    @SerializedName("2 Day")
    _2_DAY("2 Day"),
    
    @SerializedName("Overnight")
    OVERNIGHT("Overnight");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("name")
  private NameEnum name = null;

  public ShippingMethod id(IdEnum id) {
    this.id = id;
    return this;
  }

   /**
   * Method identifier. The default value is \"1\" (Ground)
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Method identifier. The default value is \"1\" (Ground)")
  public IdEnum getId() {
    return id;
  }

  public void setId(IdEnum id) {
    this.id = id;
  }

  public ShippingMethod name(NameEnum name) {
    this.name = name;
    return this;
  }

   /**
   * Method name, corresponding to the identifier
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Method name, corresponding to the identifier")
  public NameEnum getName() {
    return name;
  }

  public void setName(NameEnum name) {
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
    ShippingMethod shippingMethod = (ShippingMethod) o;
    return Objects.equals(this.id, shippingMethod.id) &&
        Objects.equals(this.name, shippingMethod.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingMethod {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
