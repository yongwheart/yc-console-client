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
 * DataIndexCreateParam
 */
@JsonPropertyOrder({
  DataIndexCreateParam.JSON_PROPERTY_ALIAS,
  DataIndexCreateParam.JSON_PROPERTY_APPNAME,
  DataIndexCreateParam.JSON_PROPERTY_TAG_SET,
  DataIndexCreateParam.JSON_PROPERTY_TTL,
  DataIndexCreateParam.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-19T14:34:25.795+08:00[Asia/Shanghai]")
public class DataIndexCreateParam {
  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_APPNAME = "appname";
  private String appname;

  public static final String JSON_PROPERTY_TAG_SET = "tagSet";
  private List<String> tagSet = null;

  public static final String JSON_PROPERTY_TTL = "ttl";
  private Integer ttl;

  /**
   * 数据集类型
   */
  public enum TypeEnum {
    LOG("LOG"),
    
    METRICS("METRICS"),
    
    EVENT("EVENT");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public DataIndexCreateParam() { 
  }

  public DataIndexCreateParam alias(String alias) {
    this.alias = alias;
    return this;
  }

   /**
   * 别名
   * @return alias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alias", value = "别名")
  @JsonProperty(JSON_PROPERTY_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAlias() {
    return alias;
  }


  @JsonProperty(JSON_PROPERTY_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlias(String alias) {
    this.alias = alias;
  }


  public DataIndexCreateParam appname(String appname) {
    this.appname = appname;
    return this;
  }

   /**
   * 用户账号
   * @return appname
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "demo_appname", required = true, value = "用户账号")
  @JsonProperty(JSON_PROPERTY_APPNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAppname() {
    return appname;
  }


  @JsonProperty(JSON_PROPERTY_APPNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAppname(String appname) {
    this.appname = appname;
  }


  public DataIndexCreateParam tagSet(List<String> tagSet) {
    this.tagSet = tagSet;
    return this;
  }

  public DataIndexCreateParam addTagSetItem(String tagSetItem) {
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
  @ApiModelProperty(example = "foo:bar", value = "标签")
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


  public DataIndexCreateParam ttl(Integer ttl) {
    this.ttl = ttl;
    return this;
  }

   /**
   * 数据过期时间，单位：天
   * @return ttl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "7", required = true, value = "数据过期时间，单位：天")
  @JsonProperty(JSON_PROPERTY_TTL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTtl() {
    return ttl;
  }


  @JsonProperty(JSON_PROPERTY_TTL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTtl(Integer ttl) {
    this.ttl = ttl;
  }


  public DataIndexCreateParam type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * 数据集类型
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "LOG", required = true, value = "数据集类型")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this DataIndexCreateParam object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataIndexCreateParam dataIndexCreateParam = (DataIndexCreateParam) o;
    return Objects.equals(this.alias, dataIndexCreateParam.alias) &&
        Objects.equals(this.appname, dataIndexCreateParam.appname) &&
        Objects.equals(this.tagSet, dataIndexCreateParam.tagSet) &&
        Objects.equals(this.ttl, dataIndexCreateParam.ttl) &&
        Objects.equals(this.type, dataIndexCreateParam.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, appname, tagSet, ttl, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataIndexCreateParam {\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    appname: ").append(toIndentedString(appname)).append("\n");
    sb.append("    tagSet: ").append(toIndentedString(tagSet)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

