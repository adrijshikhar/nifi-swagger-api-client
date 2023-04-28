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
import io.swagger.client.model.DependentValues;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Dependency
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-28T15:46:21.208640+05:30[Asia/Kolkata]")
public class Dependency {
  @SerializedName("propertyName")
  private String propertyName = null;

  @SerializedName("propertyDisplayName")
  private String propertyDisplayName = null;

  @SerializedName("dependentValues")
  private DependentValues dependentValues = null;

  public Dependency propertyName(String propertyName) {
    this.propertyName = propertyName;
    return this;
  }

   /**
   * The name of the dependent property
   * @return propertyName
  **/
  @Schema(description = "The name of the dependent property")
  public String getPropertyName() {
    return propertyName;
  }

  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }

  public Dependency propertyDisplayName(String propertyDisplayName) {
    this.propertyDisplayName = propertyDisplayName;
    return this;
  }

   /**
   * The display name of the dependent property
   * @return propertyDisplayName
  **/
  @Schema(description = "The display name of the dependent property")
  public String getPropertyDisplayName() {
    return propertyDisplayName;
  }

  public void setPropertyDisplayName(String propertyDisplayName) {
    this.propertyDisplayName = propertyDisplayName;
  }

  public Dependency dependentValues(DependentValues dependentValues) {
    this.dependentValues = dependentValues;
    return this;
  }

   /**
   * Get dependentValues
   * @return dependentValues
  **/
  @Schema(description = "")
  public DependentValues getDependentValues() {
    return dependentValues;
  }

  public void setDependentValues(DependentValues dependentValues) {
    this.dependentValues = dependentValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dependency dependency = (Dependency) o;
    return Objects.equals(this.propertyName, dependency.propertyName) &&
        Objects.equals(this.propertyDisplayName, dependency.propertyDisplayName) &&
        Objects.equals(this.dependentValues, dependency.dependentValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyName, propertyDisplayName, dependentValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dependency {\n");
    
    sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
    sb.append("    propertyDisplayName: ").append(toIndentedString(propertyDisplayName)).append("\n");
    sb.append("    dependentValues: ").append(toIndentedString(dependentValues)).append("\n");
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
