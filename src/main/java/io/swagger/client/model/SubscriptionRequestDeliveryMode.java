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
 * SubscriptionRequestDeliveryMode
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class SubscriptionRequestDeliveryMode {
  /**
   * Notifications transportation provider name. 'APNS' (Apple Push Notifications Service)
   */
  public enum TransportTypeEnum {
    @SerializedName("PubNub")
    PUBNUB("PubNub"),
    
    @SerializedName("APNS")
    APNS("APNS"),
    
    @SerializedName("PubNub/APNS/VoIP")
    PUBNUB_APNS_VOIP("PubNub/APNS/VoIP");

    private String value;

    TransportTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("transportType")
  private TransportTypeEnum transportType = null;

  @SerializedName("encryption")
  private Boolean encryption = null;

  public SubscriptionRequestDeliveryMode transportType(TransportTypeEnum transportType) {
    this.transportType = transportType;
    return this;
  }

   /**
   * Notifications transportation provider name. 'APNS' (Apple Push Notifications Service)
   * @return transportType
  **/
  @ApiModelProperty(example = "null", value = "Notifications transportation provider name. 'APNS' (Apple Push Notifications Service)")
  public TransportTypeEnum getTransportType() {
    return transportType;
  }

  public void setTransportType(TransportTypeEnum transportType) {
    this.transportType = transportType;
  }

  public SubscriptionRequestDeliveryMode encryption(Boolean encryption) {
    this.encryption = encryption;
    return this;
  }

   /**
   * Optional parameter. Specifies if the message will be encrypted or not. If request contains any presence event filter the value by default is 'True' (even if specified as 'false'). If request contains only message event filters the value by default is 'False'
   * @return encryption
  **/
  @ApiModelProperty(example = "null", value = "Optional parameter. Specifies if the message will be encrypted or not. If request contains any presence event filter the value by default is 'True' (even if specified as 'false'). If request contains only message event filters the value by default is 'False'")
  public Boolean getEncryption() {
    return encryption;
  }

  public void setEncryption(Boolean encryption) {
    this.encryption = encryption;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionRequestDeliveryMode subscriptionRequestDeliveryMode = (SubscriptionRequestDeliveryMode) o;
    return Objects.equals(this.transportType, subscriptionRequestDeliveryMode.transportType) &&
        Objects.equals(this.encryption, subscriptionRequestDeliveryMode.encryption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transportType, encryption);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionRequestDeliveryMode {\n");
    
    sb.append("    transportType: ").append(toIndentedString(transportType)).append("\n");
    sb.append("    encryption: ").append(toIndentedString(encryption)).append("\n");
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
