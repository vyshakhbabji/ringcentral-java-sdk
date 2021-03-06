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
 * ReferenceInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class ReferenceInfo {
  @SerializedName("ref")
  private String ref = null;

  /**
   * Type of external identifier
   */
  public enum TypeEnum {
    @SerializedName("PartnerId")
    PARTNERID("PartnerId"),
    
    @SerializedName("CustomerDirectoryId")
    CUSTOMERDIRECTORYID("CustomerDirectoryId");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  public ReferenceInfo ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * Non-RC identifier of an extension
   * @return ref
  **/
  @ApiModelProperty(example = "null", value = "Non-RC identifier of an extension")
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public ReferenceInfo type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of external identifier
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Type of external identifier")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferenceInfo referenceInfo = (ReferenceInfo) o;
    return Objects.equals(this.ref, referenceInfo.ref) &&
        Objects.equals(this.type, referenceInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenceInfo {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

