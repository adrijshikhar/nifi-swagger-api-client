# AboutApi

All URIs are relative to */nifi-registry-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVersion**](AboutApi.md#getVersion) | **GET** /about | Get version

<a name="getVersion"></a>
# **getVersion**
> RegistryAbout getVersion()

Get version

Gets the NiFi Registry version.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AboutApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

AboutApi apiInstance = new AboutApi();
try {
    RegistryAbout result = apiInstance.getVersion();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AboutApi#getVersion");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RegistryAbout**](RegistryAbout.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

