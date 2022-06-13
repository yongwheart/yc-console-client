package com.dtsre.api.v1.client.api;

import com.dtsre.api.v1.client.ApiException;
import com.dtsre.api.v1.client.ApiClient;
import com.dtsre.api.v1.client.ApiResponse;
import com.dtsre.api.v1.client.Configuration;
import com.dtsre.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.dtsre.api.v1.client.model.ROfListOfWebAppVO;
import com.dtsre.api.v1.client.model.ROfTimeseriesVO;
import com.dtsre.api.v1.client.model.ROfstring;
import com.dtsre.api.v1.client.model.WebAppCreateParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-19T14:34:25.795+08:00[Asia/Shanghai]")
public class WebAppApi {
  private ApiClient apiClient;

  public WebAppApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WebAppApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 创建应用站点
   * 
   * @param param param (required)
   * @return ROfstring
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ROfstring createWebApp(WebAppCreateParam param) throws ApiException {
    return createWebAppWithHttpInfo(param).getData();
  }

  /**
   * 创建应用站点
   * 
   * @param param param (required)
   * @return ApiResponse&lt;ROfstring&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ROfstring> createWebAppWithHttpInfo(WebAppCreateParam param) throws ApiException {
    Object localVarPostBody = param;
    
    // verify the required parameter 'param' is set
    if (param == null) {
      throw new ApiException(400, "Missing the required parameter 'param' when calling createWebApp");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/arms/web-app/create";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "API_KEY" };

    GenericType<ROfstring> localVarReturnType = new GenericType<ROfstring>() {};

    return apiClient.invokeAPI("WebAppApi.createWebApp", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 应用列表
   * 
   * @return ROfListOfWebAppVO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ROfListOfWebAppVO listWebApps() throws ApiException {
    return listWebAppsWithHttpInfo().getData();
  }

  /**
   * 应用列表
   * 
   * @return ApiResponse&lt;ROfListOfWebAppVO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ROfListOfWebAppVO> listWebAppsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/arms/web-app/list";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "API_KEY" };

    GenericType<ROfListOfWebAppVO> localVarReturnType = new GenericType<ROfListOfWebAppVO>() {};

    return apiClient.invokeAPI("WebAppApi.listWebApps", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 查询指标时间序列
   * 
   * @param end 结束时间（单位：秒） (required)
   * @param measures 指标对应的测量数据，请参见可查询的应用监控指标。最多可添加5个 (required)
   * @param metric 需要查询的指标，不可自定义输入，请参见可查询的应用监控指标 (required)
   * @param start 开始时间（单位：秒） (required)
   * @param dimensions 分组维度 (optional)
   * @param direction 排序，默认值：asc (optional)
   * @param filter 过滤条件 (optional)
   * @param interval 数据点时间间隔， 单位：秒，为null时系统根据查询时间范围计算interval (optional)
   * @param limit 限制大小，默认值：1000 (optional)
   * @param sort 排序字段，默认值：date (optional)
   * @return ROfTimeseriesVO
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ROfTimeseriesVO queryWebAppMetrics(Long end, List<String> measures, String metric, Long start, List<String> dimensions, String direction, String filter, Long interval, Integer limit, String sort) throws ApiException {
    return queryWebAppMetricsWithHttpInfo(end, measures, metric, start, dimensions, direction, filter, interval, limit, sort).getData();
  }

  /**
   * 查询指标时间序列
   * 
   * @param end 结束时间（单位：秒） (required)
   * @param measures 指标对应的测量数据，请参见可查询的应用监控指标。最多可添加5个 (required)
   * @param metric 需要查询的指标，不可自定义输入，请参见可查询的应用监控指标 (required)
   * @param start 开始时间（单位：秒） (required)
   * @param dimensions 分组维度 (optional)
   * @param direction 排序，默认值：asc (optional)
   * @param filter 过滤条件 (optional)
   * @param interval 数据点时间间隔， 单位：秒，为null时系统根据查询时间范围计算interval (optional)
   * @param limit 限制大小，默认值：1000 (optional)
   * @param sort 排序字段，默认值：date (optional)
   * @return ApiResponse&lt;ROfTimeseriesVO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ROfTimeseriesVO> queryWebAppMetricsWithHttpInfo(Long end, List<String> measures, String metric, Long start, List<String> dimensions, String direction, String filter, Long interval, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'end' is set
    if (end == null) {
      throw new ApiException(400, "Missing the required parameter 'end' when calling queryWebAppMetrics");
    }
    
    // verify the required parameter 'measures' is set
    if (measures == null) {
      throw new ApiException(400, "Missing the required parameter 'measures' when calling queryWebAppMetrics");
    }
    
    // verify the required parameter 'metric' is set
    if (metric == null) {
      throw new ApiException(400, "Missing the required parameter 'metric' when calling queryWebAppMetrics");
    }
    
    // verify the required parameter 'start' is set
    if (start == null) {
      throw new ApiException(400, "Missing the required parameter 'start' when calling queryWebAppMetrics");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/arms/web-app/query-metrics";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "dimensions", dimensions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "direction", direction));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "interval", interval));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "measures", measures));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metric", metric));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "API_KEY" };

    GenericType<ROfTimeseriesVO> localVarReturnType = new GenericType<ROfTimeseriesVO>() {};

    return apiClient.invokeAPI("WebAppApi.queryWebAppMetrics", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
