/*
 * Apache NiFi Registry REST API
 * The REST API provides an interface to a registry with operations for saving, versioning, reading NiFi flows and components.
 *
 * OpenAPI spec version: 2.0.0-SNAPSHOT
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * DefaultSettings
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-28T15:46:21.208640+05:30[Asia/Kolkata]")
public class DefaultSettings {
  @SerializedName("yieldDuration")
  private String yieldDuration = null;

  @SerializedName("penaltyDuration")
  private String penaltyDuration = null;

  @SerializedName("bulletinLevel")
  private String bulletinLevel = null;

  public DefaultSettings yieldDuration(String yieldDuration) {
    this.yieldDuration = yieldDuration;
    return this;
  }

   /**
   * The default yield duration
   * @return yieldDuration
  **/
  @Schema(description = "The default yield duration")
  public String getYieldDuration() {
    return yieldDuration;
  }

  public void setYieldDuration(String yieldDuration) {
    this.yieldDuration = yieldDuration;
  }

  public DefaultSettings penaltyDuration(String penaltyDuration) {
    this.penaltyDuration = penaltyDuration;
    return this;
  }

   /**
   * The default penalty duration
   * @return penaltyDuration
  **/
  @Schema(description = "The default penalty duration")
  public String getPenaltyDuration() {
    return penaltyDuration;
  }

  public void setPenaltyDuration(String penaltyDuration) {
    this.penaltyDuration = penaltyDuration;
  }

  public DefaultSettings bulletinLevel(String bulletinLevel) {
    this.bulletinLevel = bulletinLevel;
    return this;
  }

   /**
   * The default bulletin level
   * @return bulletinLevel
  **/
  @Schema(description = "The default bulletin level")
  public String getBulletinLevel() {
    return bulletinLevel;
  }

  public void setBulletinLevel(String bulletinLevel) {
    this.bulletinLevel = bulletinLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultSettings defaultSettings = (DefaultSettings) o;
    return Objects.equals(this.yieldDuration, defaultSettings.yieldDuration) &&
        Objects.equals(this.penaltyDuration, defaultSettings.penaltyDuration) &&
        Objects.equals(this.bulletinLevel, defaultSettings.bulletinLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(yieldDuration, penaltyDuration, bulletinLevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultSettings {\n");
    
    sb.append("    yieldDuration: ").append(toIndentedString(yieldDuration)).append("\n");
    sb.append("    penaltyDuration: ").append(toIndentedString(penaltyDuration)).append("\n");
    sb.append("    bulletinLevel: ").append(toIndentedString(bulletinLevel)).append("\n");
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
