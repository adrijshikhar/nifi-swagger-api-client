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
import io.swagger.client.model.JaxbLink;
import io.swagger.client.model.Permissions;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ExtensionBundle
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-28T15:46:21.208640+05:30[Asia/Kolkata]")
public class ExtensionBundle {
  @SerializedName("link")
  private JaxbLink link = null;

  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("bucketIdentifier")
  private String bucketIdentifier = null;

  @SerializedName("bucketName")
  private String bucketName = null;

  @SerializedName("createdTimestamp")
  private Long createdTimestamp = null;

  @SerializedName("modifiedTimestamp")
  private Long modifiedTimestamp = null;

  /**
   * The type of item.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    FLOW("Flow"),
    BUNDLE("Bundle");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("permissions")
  private Permissions permissions = null;

  /**
   * The type of the extension bundle
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

  @SerializedName("groupId")
  private String groupId = null;

  @SerializedName("artifactId")
  private String artifactId = null;

  @SerializedName("versionCount")
  private Long versionCount = null;

  public ExtensionBundle link(JaxbLink link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @Schema(description = "")
  public JaxbLink getLink() {
    return link;
  }

  public void setLink(JaxbLink link) {
    this.link = link;
  }

   /**
   * An ID to uniquely identify this object.
   * @return identifier
  **/
  @Schema(description = "An ID to uniquely identify this object.")
  public String getIdentifier() {
    return identifier;
  }

  public ExtensionBundle name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the item.
   * @return name
  **/
  @Schema(required = true, description = "The name of the item.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ExtensionBundle description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the item.
   * @return description
  **/
  @Schema(description = "A description of the item.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ExtensionBundle bucketIdentifier(String bucketIdentifier) {
    this.bucketIdentifier = bucketIdentifier;
    return this;
  }

   /**
   * The identifier of the bucket this items belongs to. This cannot be changed after the item is created.
   * @return bucketIdentifier
  **/
  @Schema(required = true, description = "The identifier of the bucket this items belongs to. This cannot be changed after the item is created.")
  public String getBucketIdentifier() {
    return bucketIdentifier;
  }

  public void setBucketIdentifier(String bucketIdentifier) {
    this.bucketIdentifier = bucketIdentifier;
  }

   /**
   * The name of the bucket this items belongs to.
   * @return bucketName
  **/
  @Schema(description = "The name of the bucket this items belongs to.")
  public String getBucketName() {
    return bucketName;
  }

   /**
   * The timestamp of when the item was created, as milliseconds since epoch.
   * minimum: 1
   * @return createdTimestamp
  **/
  @Schema(description = "The timestamp of when the item was created, as milliseconds since epoch.")
  public Long getCreatedTimestamp() {
    return createdTimestamp;
  }

   /**
   * The timestamp of when the item was last modified, as milliseconds since epoch.
   * minimum: 1
   * @return modifiedTimestamp
  **/
  @Schema(description = "The timestamp of when the item was last modified, as milliseconds since epoch.")
  public Long getModifiedTimestamp() {
    return modifiedTimestamp;
  }

  public ExtensionBundle type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of item.
   * @return type
  **/
  @Schema(required = true, description = "The type of item.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ExtensionBundle permissions(Permissions permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @Schema(description = "")
  public Permissions getPermissions() {
    return permissions;
  }

  public void setPermissions(Permissions permissions) {
    this.permissions = permissions;
  }

  public ExtensionBundle bundleType(BundleTypeEnum bundleType) {
    this.bundleType = bundleType;
    return this;
  }

   /**
   * The type of the extension bundle
   * @return bundleType
  **/
  @Schema(required = true, description = "The type of the extension bundle")
  public BundleTypeEnum getBundleType() {
    return bundleType;
  }

  public void setBundleType(BundleTypeEnum bundleType) {
    this.bundleType = bundleType;
  }

  public ExtensionBundle groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * The group id of the extension bundle
   * @return groupId
  **/
  @Schema(description = "The group id of the extension bundle")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public ExtensionBundle artifactId(String artifactId) {
    this.artifactId = artifactId;
    return this;
  }

   /**
   * The artifact id of the extension bundle
   * @return artifactId
  **/
  @Schema(description = "The artifact id of the extension bundle")
  public String getArtifactId() {
    return artifactId;
  }

  public void setArtifactId(String artifactId) {
    this.artifactId = artifactId;
  }

   /**
   * The number of versions of this extension bundle.
   * minimum: 0
   * @return versionCount
  **/
  @Schema(description = "The number of versions of this extension bundle.")
  public Long getVersionCount() {
    return versionCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionBundle extensionBundle = (ExtensionBundle) o;
    return Objects.equals(this.link, extensionBundle.link) &&
        Objects.equals(this.identifier, extensionBundle.identifier) &&
        Objects.equals(this.name, extensionBundle.name) &&
        Objects.equals(this.description, extensionBundle.description) &&
        Objects.equals(this.bucketIdentifier, extensionBundle.bucketIdentifier) &&
        Objects.equals(this.bucketName, extensionBundle.bucketName) &&
        Objects.equals(this.createdTimestamp, extensionBundle.createdTimestamp) &&
        Objects.equals(this.modifiedTimestamp, extensionBundle.modifiedTimestamp) &&
        Objects.equals(this.type, extensionBundle.type) &&
        Objects.equals(this.permissions, extensionBundle.permissions) &&
        Objects.equals(this.bundleType, extensionBundle.bundleType) &&
        Objects.equals(this.groupId, extensionBundle.groupId) &&
        Objects.equals(this.artifactId, extensionBundle.artifactId) &&
        Objects.equals(this.versionCount, extensionBundle.versionCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, identifier, name, description, bucketIdentifier, bucketName, createdTimestamp, modifiedTimestamp, type, permissions, bundleType, groupId, artifactId, versionCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionBundle {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    bucketIdentifier: ").append(toIndentedString(bucketIdentifier)).append("\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    modifiedTimestamp: ").append(toIndentedString(modifiedTimestamp)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    bundleType: ").append(toIndentedString(bundleType)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    artifactId: ").append(toIndentedString(artifactId)).append("\n");
    sb.append("    versionCount: ").append(toIndentedString(versionCount)).append("\n");
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
