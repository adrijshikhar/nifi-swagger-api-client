# ConfigApi

All URIs are relative to */nifi-registry-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getConfiguration**](ConfigApi.md#getConfiguration) | **GET** /config | Get configration

<a name="getConfiguration"></a>
# **getConfiguration**
> RegistryConfiguration getConfiguration()

Get configration

Gets the NiFi Registry configurations.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ConfigApi apiInstance = new ConfigApi();
try {
    RegistryConfiguration result = apiInstance.getConfiguration();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigApi#getConfiguration");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RegistryConfiguration**](RegistryConfiguration.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

