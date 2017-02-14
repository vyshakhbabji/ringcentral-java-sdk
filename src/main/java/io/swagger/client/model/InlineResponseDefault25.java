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
import io.swagger.client.model.DeviceInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponseDefault25
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class InlineResponseDefault25 {
  @SerializedName("id")
  private String id = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("devices")
  private List<DeviceInfo> devices = new ArrayList<DeviceInfo>();

  public InlineResponseDefault25 id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of a device
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Identifier of a device")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InlineResponseDefault25 uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Canonical URI of an order resource
   * @return uri
  **/
  @ApiModelProperty(example = "null", value = "Canonical URI of an order resource")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public InlineResponseDefault25 devices(List<DeviceInfo> devices) {
    this.devices = devices;
    return this;
  }

  public InlineResponseDefault25 addDevicesItem(DeviceInfo devicesItem) {
    this.devices.add(devicesItem);
    return this;
  }

   /**
   * List of the ordered devices
   * @return devices
  **/
  @ApiModelProperty(example = "null", value = "List of the ordered devices")
  public List<DeviceInfo> getDevices() {
    return devices;
  }

  public void setDevices(List<DeviceInfo> devices) {
    this.devices = devices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponseDefault25 inlineResponseDefault25 = (InlineResponseDefault25) o;
    return Objects.equals(this.id, inlineResponseDefault25.id) &&
        Objects.equals(this.uri, inlineResponseDefault25.uri) &&
        Objects.equals(this.devices, inlineResponseDefault25.devices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uri, devices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponseDefault25 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
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
