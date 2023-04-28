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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ExtensionRepoVersion
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-28T15:46:21.208640+05:30[Asia/Kolkata]")
public class ExtensionRepoVersion {
  @SerializedName("extensionsLink")
  private JaxbLink extensionsLink = null;

  @SerializedName("downloadLink")
  private JaxbLink downloadLink = null;

  @SerializedName("sha256Link")
  private JaxbLink sha256Link = null;

  @SerializedName("sha256Supplied")
  private JaxbLink sha256Supplied = null;

  public ExtensionRepoVersion extensionsLink(JaxbLink extensionsLink) {
    this.extensionsLink = extensionsLink;
    return this;
  }

   /**
   * Get extensionsLink
   * @return extensionsLink
  **/
  @Schema(description = "")
  public JaxbLink getExtensionsLink() {
    return extensionsLink;
  }

  public void setExtensionsLink(JaxbLink extensionsLink) {
    this.extensionsLink = extensionsLink;
  }

  public ExtensionRepoVersion downloadLink(JaxbLink downloadLink) {
    this.downloadLink = downloadLink;
    return this;
  }

   /**
   * Get downloadLink
   * @return downloadLink
  **/
  @Schema(description = "")
  public JaxbLink getDownloadLink() {
    return downloadLink;
  }

  public void setDownloadLink(JaxbLink downloadLink) {
    this.downloadLink = downloadLink;
  }

  public ExtensionRepoVersion sha256Link(JaxbLink sha256Link) {
    this.sha256Link = sha256Link;
    return this;
  }

   /**
   * Get sha256Link
   * @return sha256Link
  **/
  @Schema(description = "")
  public JaxbLink getSha256Link() {
    return sha256Link;
  }

  public void setSha256Link(JaxbLink sha256Link) {
    this.sha256Link = sha256Link;
  }

  public ExtensionRepoVersion sha256Supplied(JaxbLink sha256Supplied) {
    this.sha256Supplied = sha256Supplied;
    return this;
  }

   /**
   * Get sha256Supplied
   * @return sha256Supplied
  **/
  @Schema(description = "")
  public JaxbLink getSha256Supplied() {
    return sha256Supplied;
  }

  public void setSha256Supplied(JaxbLink sha256Supplied) {
    this.sha256Supplied = sha256Supplied;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionRepoVersion extensionRepoVersion = (ExtensionRepoVersion) o;
    return Objects.equals(this.extensionsLink, extensionRepoVersion.extensionsLink) &&
        Objects.equals(this.downloadLink, extensionRepoVersion.downloadLink) &&
        Objects.equals(this.sha256Link, extensionRepoVersion.sha256Link) &&
        Objects.equals(this.sha256Supplied, extensionRepoVersion.sha256Supplied);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extensionsLink, downloadLink, sha256Link, sha256Supplied);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionRepoVersion {\n");
    
    sb.append("    extensionsLink: ").append(toIndentedString(extensionsLink)).append("\n");
    sb.append("    downloadLink: ").append(toIndentedString(downloadLink)).append("\n");
    sb.append("    sha256Link: ").append(toIndentedString(sha256Link)).append("\n");
    sb.append("    sha256Supplied: ").append(toIndentedString(sha256Supplied)).append("\n");
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
