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
import io.swagger.client.model.ShippingAddress;
import io.swagger.client.model.ShippingMethod;
import java.util.ArrayList;
import java.util.List;

/**
 * ShippingInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class ShippingInfo {
  /**
   * Shipping status of the order item. It is set to 'Initial' when the order is submitted. Then it is changed to 'Accepted' when a distributor starts processing the order. Finally it is changed to Shipped which means that distributor has shipped the device.
   */
  public enum StatusEnum {
    @SerializedName("Initial")
    INITIAL("Initial"),
    
    @SerializedName("Accepted")
    ACCEPTED("Accepted"),
    
    @SerializedName("Shipped")
    SHIPPED("Shipped");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("carrier")
  private String carrier = null;

  @SerializedName("trackingNumber")
  private String trackingNumber = null;

  @SerializedName("method")
  private List<ShippingMethod> method = new ArrayList<ShippingMethod>();

  @SerializedName("address")
  private List<ShippingAddress> address = new ArrayList<ShippingAddress>();

  public ShippingInfo status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Shipping status of the order item. It is set to 'Initial' when the order is submitted. Then it is changed to 'Accepted' when a distributor starts processing the order. Finally it is changed to Shipped which means that distributor has shipped the device.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "Shipping status of the order item. It is set to 'Initial' when the order is submitted. Then it is changed to 'Accepted' when a distributor starts processing the order. Finally it is changed to Shipped which means that distributor has shipped the device.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ShippingInfo carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }

   /**
   * Shipping carrier name. Appears only if the device status is \"Shipped\"
   * @return carrier
  **/
  @ApiModelProperty(example = "null", value = "Shipping carrier name. Appears only if the device status is \"Shipped\"")
  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public ShippingInfo trackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    return this;
  }

   /**
   * Carrier-specific tracking number. Appears only if the device status is \"Shipped\"
   * @return trackingNumber
  **/
  @ApiModelProperty(example = "null", value = "Carrier-specific tracking number. Appears only if the device status is \"Shipped\"")
  public String getTrackingNumber() {
    return trackingNumber;
  }

  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  public ShippingInfo method(List<ShippingMethod> method) {
    this.method = method;
    return this;
  }

  public ShippingInfo addMethodItem(ShippingMethod methodItem) {
    this.method.add(methodItem);
    return this;
  }

   /**
   * Shipping method information
   * @return method
  **/
  @ApiModelProperty(example = "null", value = "Shipping method information")
  public List<ShippingMethod> getMethod() {
    return method;
  }

  public void setMethod(List<ShippingMethod> method) {
    this.method = method;
  }

  public ShippingInfo address(List<ShippingAddress> address) {
    this.address = address;
    return this;
  }

  public ShippingInfo addAddressItem(ShippingAddress addressItem) {
    this.address.add(addressItem);
    return this;
  }

   /**
   * Shipping address for the order. If it coincides with the Emergency Service Address, then can be omitted. By default the same value as the emergencyServiceAddress. Multiple addresses can be specified; in case an order contains several devices, they can be delivered to different addresses
   * @return address
  **/
  @ApiModelProperty(example = "null", value = "Shipping address for the order. If it coincides with the Emergency Service Address, then can be omitted. By default the same value as the emergencyServiceAddress. Multiple addresses can be specified; in case an order contains several devices, they can be delivered to different addresses")
  public List<ShippingAddress> getAddress() {
    return address;
  }

  public void setAddress(List<ShippingAddress> address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingInfo shippingInfo = (ShippingInfo) o;
    return Objects.equals(this.status, shippingInfo.status) &&
        Objects.equals(this.carrier, shippingInfo.carrier) &&
        Objects.equals(this.trackingNumber, shippingInfo.trackingNumber) &&
        Objects.equals(this.method, shippingInfo.method) &&
        Objects.equals(this.address, shippingInfo.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, carrier, trackingNumber, method, address);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingInfo {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
