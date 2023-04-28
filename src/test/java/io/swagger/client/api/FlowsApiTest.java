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

package io.swagger.client.api;

import io.swagger.client.model.Fields;
import io.swagger.client.model.VersionedFlow;
import io.swagger.client.model.VersionedFlowSnapshot;
import io.swagger.client.model.VersionedFlowSnapshotMetadata;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for FlowsApi
 */
@Ignore
public class FlowsApiTest {

    private final FlowsApi api = new FlowsApi();

    /**
     * Get flow fields
     *
     * Retrieves the flow field names that can be used for searching or sorting on flows.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAvailableFlowFieldsTest() throws Exception {
        Fields response = api.getAvailableFlowFields();

        // TODO: test validations
    }
    /**
     * Get flow
     *
     * Gets a flow by id.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void globalGetFlowTest() throws Exception {
        String flowId = null;
        VersionedFlow response = api.globalGetFlow(flowId);

        // TODO: test validations
    }
    /**
     * Get flow version
     *
     * Gets the given version of a flow, including metadata and flow content.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void globalGetFlowVersionTest() throws Exception {
        String flowId = null;
        Integer versionNumber = null;
        VersionedFlowSnapshot response = api.globalGetFlowVersion(flowId, versionNumber);

        // TODO: test validations
    }
    /**
     * Get flow versions
     *
     * Gets summary information for all versions of a given flow. Versions are ordered newest-&gt;oldest.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void globalGetFlowVersionsTest() throws Exception {
        String flowId = null;
        List<VersionedFlowSnapshotMetadata> response = api.globalGetFlowVersions(flowId);

        // TODO: test validations
    }
    /**
     * Get latest flow version
     *
     * Gets the latest version of a flow, including metadata and flow content.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void globalGetLatestFlowVersionTest() throws Exception {
        String flowId = null;
        VersionedFlowSnapshot response = api.globalGetLatestFlowVersion(flowId);

        // TODO: test validations
    }
    /**
     * Get latest flow version metadata
     *
     * Gets the metadata for the latest version of a flow.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void globalGetLatestFlowVersionMetadataTest() throws Exception {
        String flowId = null;
        VersionedFlowSnapshotMetadata response = api.globalGetLatestFlowVersionMetadata(flowId);

        // TODO: test validations
    }
}
