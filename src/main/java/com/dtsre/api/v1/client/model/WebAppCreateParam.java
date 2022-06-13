/*
 * 开放API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: V1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dtsre.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.dtsre.api.v1.client.JSON;


/**
 * WebAppCreateParam
 */
@JsonPropertyOrder({
  WebAppCreateParam.JSON_PROPERTY_APP_NAME,
  WebAppCreateParam.JSON_PROPERTY_SITE_TYPE,
  WebAppCreateParam.JSON_PROPERTY_TAG_SET
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-19T14:34:25.795+08:00[Asia/Shanghai]")
public class WebAppCreateParam {
  public static final String JSON_PROPERTY_APP_NAME = "appName";
  private String appName;

  /**
   * 站点类型
   */
  public enum SiteTypeEnum {
    WEB("web"),
    
    MINI_WX("mini_wx"),
    
    MINI_ALIPAY("mini_alipay");

    private String value;

    SiteTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SiteTypeEnum fromValue(String value) {
      for (SiteTypeEnum b : SiteTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SITE_TYPE = "siteType";
  private SiteTypeEnum siteType;

  public static final String JSON_PROPERTY_TAG_SET = "tagSet";
  private List<String> tagSet = null;

  public WebAppCreateParam() { 
  }

  public WebAppCreateParam appName(String appName) {
    this.appName = appName;
    return this;
  }

   /**
   * 应用名称
   * @return appName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "应用名称")
  @JsonProperty(JSON_PROPERTY_APP_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAppName() {
    return appName;
  }


  @JsonProperty(JSON_PROPERTY_APP_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAppName(String appName) {
    this.appName = appName;
  }


  public WebAppCreateParam siteType(SiteTypeEnum siteType) {
    this.siteType = siteType;
    return this;
  }

   /**
   * 站点类型
   * @return siteType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "站点类型")
  @JsonProperty(JSON_PROPERTY_SITE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SiteTypeEnum getSiteType() {
    return siteType;
  }


  @JsonProperty(JSON_PROPERTY_SITE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSiteType(SiteTypeEnum siteType) {
    this.siteType = siteType;
  }


  public WebAppCreateParam tagSet(List<String> tagSet) {
    this.tagSet = tagSet;
    return this;
  }

  public WebAppCreateParam addTagSetItem(String tagSetItem) {
    if (this.tagSet == null) {
      this.tagSet = new ArrayList<>();
    }
    this.tagSet.add(tagSetItem);
    return this;
  }

   /**
   * 标签
   * @return tagSet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标签")
  @JsonProperty(JSON_PROPERTY_TAG_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTagSet() {
    return tagSet;
  }


  @JsonProperty(JSON_PROPERTY_TAG_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTagSet(List<String> tagSet) {
    this.tagSet = tagSet;
  }


  /**
   * Return true if this WebAppCreateParam object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebAppCreateParam webAppCreateParam = (WebAppCreateParam) o;
    return Objects.equals(this.appName, webAppCreateParam.appName) &&
        Objects.equals(this.siteType, webAppCreateParam.siteType) &&
        Objects.equals(this.tagSet, webAppCreateParam.tagSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, siteType, tagSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebAppCreateParam {\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    siteType: ").append(toIndentedString(siteType)).append("\n");
    sb.append("    tagSet: ").append(toIndentedString(tagSet)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

