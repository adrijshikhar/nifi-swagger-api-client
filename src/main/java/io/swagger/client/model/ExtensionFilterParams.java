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
import java.util.ArrayList;
import java.util.List;
/**
 * ExtensionFilterParams
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-28T15:46:21.208640+05:30[Asia/Kolkata]")
public class ExtensionFilterParams {
  /**
   * The type of bundle
   */
  @JsonAdapter(BundleTypeEnum.Adapter.class)
  public enum BundleTypeEnum {
    NIFI_NAR("NIFI_NAR"),
    MINIFI_CPP("MINIFI_CPP");

    private String value;

    BundleTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static BundleTypeEnum fromValue(String input) {
      for (BundleTypeEnum b : BundleTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<BundleTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BundleTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public BundleTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return BundleTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("bundleType")
  private BundleTypeEnum bundleType = null;

  /**
   * The type of extension
   */
  @JsonAdapter(ExtensionTypeEnum.Adapter.class)
  public enum ExtensionTypeEnum {
    PROCESSOR("PROCESSOR"),
    CONTROLLER_SERVICE("CONTROLLER_SERVICE"),
    REPORTING_TASK("REPORTING_TASK");

    private String value;

    ExtensionTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ExtensionTypeEnum fromValue(String input) {
      for (ExtensionTypeEnum b : ExtensionTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ExtensionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExtensionTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ExtensionTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ExtensionTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("extensionType")
  private ExtensionTypeEnum extensionType = null;

  @SerializedName("tags")
  private List<String> tags = null;

  public ExtensionFilterParams bundleType(BundleTypeEnum bundleType) {
    this.bundleType = bundleType;
    return this;
  }

   /**
   * The type of bundle
   * @return bundleType
  **/
  @Schema(description = "The type of bundle")
  public BundleTypeEnum getBundleType() {
    return bundleType;
  }

  public void setBundleType(BundleTypeEnum bundleType) {
    this.bundleType = bundleType;
  }

  public ExtensionFilterParams extensionType(ExtensionTypeEnum extensionType) {
    this.extensionType = extensionType;
    return this;
  }

   /**
   * The type of extension
   * @return extensionType
  **/
  @Schema(description = "The type of extension")
  public ExtensionTypeEnum getExtensionType() {
    return extensionType;
  }

  public void setExtensionType(ExtensionTypeEnum extensionType) {
    this.extensionType = extensionType;
  }

  public ExtensionFilterParams tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ExtensionFilterParams addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The tags
   * @return tags
  **/
  @Schema(description = "The tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionFilterParams extensionFilterParams = (ExtensionFilterParams) o;
    return Objects.equals(this.bundleType, extensionFilterParams.bundleType) &&
        Objects.equals(this.extensionType, extensionFilterParams.extensionType) &&
        Objects.equals(this.tags, extensionFilterParams.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundleType, extensionType, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionFilterParams {\n");
    
    sb.append("    bundleType: ").append(toIndentedString(bundleType)).append("\n");
    sb.append("    extensionType: ").append(toIndentedString(extensionType)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
