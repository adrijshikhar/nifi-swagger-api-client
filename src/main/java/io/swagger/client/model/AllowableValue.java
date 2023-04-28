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
 * AllowableValue
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-28T15:46:21.208640+05:30[Asia/Kolkata]")
public class AllowableValue {
  @SerializedName("value")
  private String value = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("description")
  private String description = null;

  public AllowableValue value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the allowable value
   * @return value
  **/
  @Schema(description = "The value of the allowable value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public AllowableValue displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of the allowable value
   * @return displayName
  **/
  @Schema(description = "The display name of the allowable value")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public AllowableValue description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the allowable value
   * @return description
  **/
  @Schema(description = "The description of the allowable value")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllowableValue allowableValue = (AllowableValue) o;
    return Objects.equals(this.value, allowableValue.value) &&
        Objects.equals(this.displayName, allowableValue.displayName) &&
        Objects.equals(this.description, allowableValue.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, displayName, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllowableValue {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
