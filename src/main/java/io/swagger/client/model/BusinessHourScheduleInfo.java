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
import io.swagger.client.model.WeeklyScheduleInfo;

/**
 * BusinessHourScheduleInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class BusinessHourScheduleInfo {
  @SerializedName("weeklyRanges")
  private WeeklyScheduleInfo weeklyRanges = null;

  public BusinessHourScheduleInfo weeklyRanges(WeeklyScheduleInfo weeklyRanges) {
    this.weeklyRanges = weeklyRanges;
    return this;
  }

   /**
   * Weekly schedule
   * @return weeklyRanges
  **/
  @ApiModelProperty(example = "null", value = "Weekly schedule")
  public WeeklyScheduleInfo getWeeklyRanges() {
    return weeklyRanges;
  }

  public void setWeeklyRanges(WeeklyScheduleInfo weeklyRanges) {
    this.weeklyRanges = weeklyRanges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessHourScheduleInfo businessHourScheduleInfo = (BusinessHourScheduleInfo) o;
    return Objects.equals(this.weeklyRanges, businessHourScheduleInfo.weeklyRanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weeklyRanges);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessHourScheduleInfo {\n");
    
    sb.append("    weeklyRanges: ").append(toIndentedString(weeklyRanges)).append("\n");
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

