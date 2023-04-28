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
import io.swagger.client.model.BatchSize;
import io.swagger.client.model.Position;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * VersionedRemoteGroupPort
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-28T15:46:21.208640+05:30[Asia/Kolkata]")
public class VersionedRemoteGroupPort {
  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("instanceIdentifier")
  private String instanceIdentifier = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("comments")
  private String comments = null;

  @SerializedName("position")
  private Position position = null;

  @SerializedName("remoteGroupId")
  private String remoteGroupId = null;

  @SerializedName("concurrentlySchedulableTaskCount")
  private Integer concurrentlySchedulableTaskCount = null;

  @SerializedName("useCompression")
  private Boolean useCompression = null;

  @SerializedName("batchSize")
  private BatchSize batchSize = null;

  /**
   * Gets or Sets componentType
   */
  @JsonAdapter(ComponentTypeEnum.Adapter.class)
  public enum ComponentTypeEnum {
    CONNECTION("CONNECTION"),
    PROCESSOR("PROCESSOR"),
    PROCESS_GROUP("PROCESS_GROUP"),
    REMOTE_PROCESS_GROUP("REMOTE_PROCESS_GROUP"),
    INPUT_PORT("INPUT_PORT"),
    OUTPUT_PORT("OUTPUT_PORT"),
    REMOTE_INPUT_PORT("REMOTE_INPUT_PORT"),
    REMOTE_OUTPUT_PORT("REMOTE_OUTPUT_PORT"),
    FUNNEL("FUNNEL"),
    LABEL("LABEL"),
    CONTROLLER_SERVICE("CONTROLLER_SERVICE"),
    REPORTING_TASK("REPORTING_TASK"),
    PARAMETER_CONTEXT("PARAMETER_CONTEXT"),
    PARAMETER_PROVIDER("PARAMETER_PROVIDER"),
    TEMPLATE("TEMPLATE"),
    FLOW_REGISTRY_CLIENT("FLOW_REGISTRY_CLIENT");

    private String value;

    ComponentTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ComponentTypeEnum fromValue(String input) {
      for (ComponentTypeEnum b : ComponentTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ComponentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ComponentTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ComponentTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ComponentTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("componentType")
  private ComponentTypeEnum componentType = null;

  @SerializedName("targetId")
  private String targetId = null;

  /**
   * The scheduled state of the component
   */
  @JsonAdapter(ScheduledStateEnum.Adapter.class)
  public enum ScheduledStateEnum {
    ENABLED("ENABLED"),
    DISABLED("DISABLED"),
    RUNNING("RUNNING");

    private String value;

    ScheduledStateEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ScheduledStateEnum fromValue(String input) {
      for (ScheduledStateEnum b : ScheduledStateEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ScheduledStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScheduledStateEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ScheduledStateEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ScheduledStateEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("scheduledState")
  private ScheduledStateEnum scheduledState = null;

  @SerializedName("groupIdentifier")
  private String groupIdentifier = null;

  public VersionedRemoteGroupPort identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * The component&#x27;s unique identifier
   * @return identifier
  **/
  @Schema(description = "The component's unique identifier")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public VersionedRemoteGroupPort instanceIdentifier(String instanceIdentifier) {
    this.instanceIdentifier = instanceIdentifier;
    return this;
  }

   /**
   * The instance ID of an existing component that is described by this VersionedComponent, or null if this is not mapped to an instantiated component
   * @return instanceIdentifier
  **/
  @Schema(description = "The instance ID of an existing component that is described by this VersionedComponent, or null if this is not mapped to an instantiated component")
  public String getInstanceIdentifier() {
    return instanceIdentifier;
  }

  public void setInstanceIdentifier(String instanceIdentifier) {
    this.instanceIdentifier = instanceIdentifier;
  }

  public VersionedRemoteGroupPort name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The component&#x27;s name
   * @return name
  **/
  @Schema(description = "The component's name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VersionedRemoteGroupPort comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * The user-supplied comments for the component
   * @return comments
  **/
  @Schema(description = "The user-supplied comments for the component")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public VersionedRemoteGroupPort position(Position position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @Schema(description = "")
  public Position getPosition() {
    return position;
  }

  public void setPosition(Position position) {
    this.position = position;
  }

  public VersionedRemoteGroupPort remoteGroupId(String remoteGroupId) {
    this.remoteGroupId = remoteGroupId;
    return this;
  }

   /**
   * The id of the remote process group that the port resides in.
   * @return remoteGroupId
  **/
  @Schema(description = "The id of the remote process group that the port resides in.")
  public String getRemoteGroupId() {
    return remoteGroupId;
  }

  public void setRemoteGroupId(String remoteGroupId) {
    this.remoteGroupId = remoteGroupId;
  }

  public VersionedRemoteGroupPort concurrentlySchedulableTaskCount(Integer concurrentlySchedulableTaskCount) {
    this.concurrentlySchedulableTaskCount = concurrentlySchedulableTaskCount;
    return this;
  }

   /**
   * The number of task that may transmit flowfiles to the target port concurrently.
   * @return concurrentlySchedulableTaskCount
  **/
  @Schema(description = "The number of task that may transmit flowfiles to the target port concurrently.")
  public Integer getConcurrentlySchedulableTaskCount() {
    return concurrentlySchedulableTaskCount;
  }

  public void setConcurrentlySchedulableTaskCount(Integer concurrentlySchedulableTaskCount) {
    this.concurrentlySchedulableTaskCount = concurrentlySchedulableTaskCount;
  }

  public VersionedRemoteGroupPort useCompression(Boolean useCompression) {
    this.useCompression = useCompression;
    return this;
  }

   /**
   * Whether the flowfiles are compressed when sent to the target port.
   * @return useCompression
  **/
  @Schema(description = "Whether the flowfiles are compressed when sent to the target port.")
  public Boolean isUseCompression() {
    return useCompression;
  }

  public void setUseCompression(Boolean useCompression) {
    this.useCompression = useCompression;
  }

  public VersionedRemoteGroupPort batchSize(BatchSize batchSize) {
    this.batchSize = batchSize;
    return this;
  }

   /**
   * Get batchSize
   * @return batchSize
  **/
  @Schema(description = "")
  public BatchSize getBatchSize() {
    return batchSize;
  }

  public void setBatchSize(BatchSize batchSize) {
    this.batchSize = batchSize;
  }

  public VersionedRemoteGroupPort componentType(ComponentTypeEnum componentType) {
    this.componentType = componentType;
    return this;
  }

   /**
   * Get componentType
   * @return componentType
  **/
  @Schema(description = "")
  public ComponentTypeEnum getComponentType() {
    return componentType;
  }

  public void setComponentType(ComponentTypeEnum componentType) {
    this.componentType = componentType;
  }

  public VersionedRemoteGroupPort targetId(String targetId) {
    this.targetId = targetId;
    return this;
  }

   /**
   * The ID of the port on the target NiFi instance
   * @return targetId
  **/
  @Schema(description = "The ID of the port on the target NiFi instance")
  public String getTargetId() {
    return targetId;
  }

  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }

  public VersionedRemoteGroupPort scheduledState(ScheduledStateEnum scheduledState) {
    this.scheduledState = scheduledState;
    return this;
  }

   /**
   * The scheduled state of the component
   * @return scheduledState
  **/
  @Schema(description = "The scheduled state of the component")
  public ScheduledStateEnum getScheduledState() {
    return scheduledState;
  }

  public void setScheduledState(ScheduledStateEnum scheduledState) {
    this.scheduledState = scheduledState;
  }

  public VersionedRemoteGroupPort groupIdentifier(String groupIdentifier) {
    this.groupIdentifier = groupIdentifier;
    return this;
  }

   /**
   * The ID of the Process Group that this component belongs to
   * @return groupIdentifier
  **/
  @Schema(description = "The ID of the Process Group that this component belongs to")
  public String getGroupIdentifier() {
    return groupIdentifier;
  }

  public void setGroupIdentifier(String groupIdentifier) {
    this.groupIdentifier = groupIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionedRemoteGroupPort versionedRemoteGroupPort = (VersionedRemoteGroupPort) o;
    return Objects.equals(this.identifier, versionedRemoteGroupPort.identifier) &&
        Objects.equals(this.instanceIdentifier, versionedRemoteGroupPort.instanceIdentifier) &&
        Objects.equals(this.name, versionedRemoteGroupPort.name) &&
        Objects.equals(this.comments, versionedRemoteGroupPort.comments) &&
        Objects.equals(this.position, versionedRemoteGroupPort.position) &&
        Objects.equals(this.remoteGroupId, versionedRemoteGroupPort.remoteGroupId) &&
        Objects.equals(this.concurrentlySchedulableTaskCount, versionedRemoteGroupPort.concurrentlySchedulableTaskCount) &&
        Objects.equals(this.useCompression, versionedRemoteGroupPort.useCompression) &&
        Objects.equals(this.batchSize, versionedRemoteGroupPort.batchSize) &&
        Objects.equals(this.componentType, versionedRemoteGroupPort.componentType) &&
        Objects.equals(this.targetId, versionedRemoteGroupPort.targetId) &&
        Objects.equals(this.scheduledState, versionedRemoteGroupPort.scheduledState) &&
        Objects.equals(this.groupIdentifier, versionedRemoteGroupPort.groupIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, instanceIdentifier, name, comments, position, remoteGroupId, concurrentlySchedulableTaskCount, useCompression, batchSize, componentType, targetId, scheduledState, groupIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionedRemoteGroupPort {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    instanceIdentifier: ").append(toIndentedString(instanceIdentifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    remoteGroupId: ").append(toIndentedString(remoteGroupId)).append("\n");
    sb.append("    concurrentlySchedulableTaskCount: ").append(toIndentedString(concurrentlySchedulableTaskCount)).append("\n");
    sb.append("    useCompression: ").append(toIndentedString(useCompression)).append("\n");
    sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
    sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    scheduledState: ").append(toIndentedString(scheduledState)).append("\n");
    sb.append("    groupIdentifier: ").append(toIndentedString(groupIdentifier)).append("\n");
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
