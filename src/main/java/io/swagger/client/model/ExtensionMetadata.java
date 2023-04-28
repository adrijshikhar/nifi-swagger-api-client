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
import io.swagger.client.model.BundleInfo;
import io.swagger.client.model.DeprecationNotice;
import io.swagger.client.model.JaxbLink;
import io.swagger.client.model.ProvidedServiceAPI;
import io.swagger.client.model.Restricted;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ExtensionMetadata
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-28T15:46:21.208640+05:30[Asia/Kolkata]")
public class ExtensionMetadata {
  @SerializedName("link")
  private JaxbLink link = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("displayName")
  private String displayName = null;

  /**
   * The type of the extension
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PROCESSOR("PROCESSOR"),
    CONTROLLER_SERVICE("CONTROLLER_SERVICE"),
    REPORTING_TASK("REPORTING_TASK");

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

  @SerializedName("description")
  private String description = null;

  @SerializedName("deprecationNotice")
  private DeprecationNotice deprecationNotice = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("restricted")
  private Restricted restricted = null;

  @SerializedName("providedServiceAPIs")
  private List<ProvidedServiceAPI> providedServiceAPIs = null;

  @SerializedName("bundleInfo")
  private BundleInfo bundleInfo = null;

  @SerializedName("hasAdditionalDetails")
  private Boolean hasAdditionalDetails = null;

  @SerializedName("linkDocs")
  private JaxbLink linkDocs = null;

  public ExtensionMetadata link(JaxbLink link) {
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

  public ExtensionMetadata name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the extension
   * @return name
  **/
  @Schema(description = "The name of the extension")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ExtensionMetadata displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of the extension
   * @return displayName
  **/
  @Schema(description = "The display name of the extension")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ExtensionMetadata type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the extension
   * @return type
  **/
  @Schema(description = "The type of the extension")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ExtensionMetadata description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the extension
   * @return description
  **/
  @Schema(description = "The description of the extension")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ExtensionMetadata deprecationNotice(DeprecationNotice deprecationNotice) {
    this.deprecationNotice = deprecationNotice;
    return this;
  }

   /**
   * Get deprecationNotice
   * @return deprecationNotice
  **/
  @Schema(description = "")
  public DeprecationNotice getDeprecationNotice() {
    return deprecationNotice;
  }

  public void setDeprecationNotice(DeprecationNotice deprecationNotice) {
    this.deprecationNotice = deprecationNotice;
  }

  public ExtensionMetadata tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ExtensionMetadata addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The tags of the extension
   * @return tags
  **/
  @Schema(description = "The tags of the extension")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public ExtensionMetadata restricted(Restricted restricted) {
    this.restricted = restricted;
    return this;
  }

   /**
   * Get restricted
   * @return restricted
  **/
  @Schema(description = "")
  public Restricted getRestricted() {
    return restricted;
  }

  public void setRestricted(Restricted restricted) {
    this.restricted = restricted;
  }

  public ExtensionMetadata providedServiceAPIs(List<ProvidedServiceAPI> providedServiceAPIs) {
    this.providedServiceAPIs = providedServiceAPIs;
    return this;
  }

  public ExtensionMetadata addProvidedServiceAPIsItem(ProvidedServiceAPI providedServiceAPIsItem) {
    if (this.providedServiceAPIs == null) {
      this.providedServiceAPIs = new ArrayList<ProvidedServiceAPI>();
    }
    this.providedServiceAPIs.add(providedServiceAPIsItem);
    return this;
  }

   /**
   * The service APIs provided by the extension
   * @return providedServiceAPIs
  **/
  @Schema(description = "The service APIs provided by the extension")
  public List<ProvidedServiceAPI> getProvidedServiceAPIs() {
    return providedServiceAPIs;
  }

  public void setProvidedServiceAPIs(List<ProvidedServiceAPI> providedServiceAPIs) {
    this.providedServiceAPIs = providedServiceAPIs;
  }

  public ExtensionMetadata bundleInfo(BundleInfo bundleInfo) {
    this.bundleInfo = bundleInfo;
    return this;
  }

   /**
   * Get bundleInfo
   * @return bundleInfo
  **/
  @Schema(description = "")
  public BundleInfo getBundleInfo() {
    return bundleInfo;
  }

  public void setBundleInfo(BundleInfo bundleInfo) {
    this.bundleInfo = bundleInfo;
  }

  public ExtensionMetadata hasAdditionalDetails(Boolean hasAdditionalDetails) {
    this.hasAdditionalDetails = hasAdditionalDetails;
    return this;
  }

   /**
   * Whether or not the extension has additional detail documentation
   * @return hasAdditionalDetails
  **/
  @Schema(description = "Whether or not the extension has additional detail documentation")
  public Boolean isHasAdditionalDetails() {
    return hasAdditionalDetails;
  }

  public void setHasAdditionalDetails(Boolean hasAdditionalDetails) {
    this.hasAdditionalDetails = hasAdditionalDetails;
  }

  public ExtensionMetadata linkDocs(JaxbLink linkDocs) {
    this.linkDocs = linkDocs;
    return this;
  }

   /**
   * Get linkDocs
   * @return linkDocs
  **/
  @Schema(description = "")
  public JaxbLink getLinkDocs() {
    return linkDocs;
  }

  public void setLinkDocs(JaxbLink linkDocs) {
    this.linkDocs = linkDocs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionMetadata extensionMetadata = (ExtensionMetadata) o;
    return Objects.equals(this.link, extensionMetadata.link) &&
        Objects.equals(this.name, extensionMetadata.name) &&
        Objects.equals(this.displayName, extensionMetadata.displayName) &&
        Objects.equals(this.type, extensionMetadata.type) &&
        Objects.equals(this.description, extensionMetadata.description) &&
        Objects.equals(this.deprecationNotice, extensionMetadata.deprecationNotice) &&
        Objects.equals(this.tags, extensionMetadata.tags) &&
        Objects.equals(this.restricted, extensionMetadata.restricted) &&
        Objects.equals(this.providedServiceAPIs, extensionMetadata.providedServiceAPIs) &&
        Objects.equals(this.bundleInfo, extensionMetadata.bundleInfo) &&
        Objects.equals(this.hasAdditionalDetails, extensionMetadata.hasAdditionalDetails) &&
        Objects.equals(this.linkDocs, extensionMetadata.linkDocs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, name, displayName, type, description, deprecationNotice, tags, restricted, providedServiceAPIs, bundleInfo, hasAdditionalDetails, linkDocs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionMetadata {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deprecationNotice: ").append(toIndentedString(deprecationNotice)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    restricted: ").append(toIndentedString(restricted)).append("\n");
    sb.append("    providedServiceAPIs: ").append(toIndentedString(providedServiceAPIs)).append("\n");
    sb.append("    bundleInfo: ").append(toIndentedString(bundleInfo)).append("\n");
    sb.append("    hasAdditionalDetails: ").append(toIndentedString(hasAdditionalDetails)).append("\n");
    sb.append("    linkDocs: ").append(toIndentedString(linkDocs)).append("\n");
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
