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
import com.dtsre.api.v1.client.model.Option;
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
 * MetricVO
 */
@JsonPropertyOrder({
  MetricVO.JSON_PROPERTY_CATEGORY,
  MetricVO.JSON_PROPERTY_CODE,
  MetricVO.JSON_PROPERTY_DESCRIPTION,
  MetricVO.JSON_PROPERTY_NAME,
  MetricVO.JSON_PROPERTY_OPTIONS,
  MetricVO.JSON_PROPERTY_SOURCE,
  MetricVO.JSON_PROPERTY_UNIT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-19T14:34:25.795+08:00[Asia/Shanghai]")
public class MetricVO {
  /**
   * 分类，NUMERICAL-数值类型，STRING-string类型指标
   */
  public enum CategoryEnum {
    NUMERICAL("NUMERICAL"),
    
    STRING("STRING");

    private String value;

    CategoryEnum(String value) {
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
    public static CategoryEnum fromValue(String value) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private CategoryEnum category;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private List<Option> options = null;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private String unit;

  public MetricVO() { 
  }

  public MetricVO category(CategoryEnum category) {
    this.category = category;
    return this;
  }

   /**
   * 分类，NUMERICAL-数值类型，STRING-string类型指标
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分类，NUMERICAL-数值类型，STRING-string类型指标")
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CategoryEnum getCategory() {
    return category;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategory(CategoryEnum category) {
    this.category = category;
  }


  public MetricVO code(String code) {
    this.code = code;
    return this;
  }

   /**
   * 指标code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "aliyun.ecs.cpu_system", value = "指标code")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(String code) {
    this.code = code;
  }


  public MetricVO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 指标描述
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "系统CPU使用率描述信息", value = "指标描述")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public MetricVO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 指标中文名
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "系统CPU使用率", value = "指标中文名")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public MetricVO options(List<Option> options) {
    this.options = options;
    return this;
  }

  public MetricVO addOptionsItem(Option optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * 指标的状态类型
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "指标的状态类型")
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Option> getOptions() {
    return options;
  }


  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptions(List<Option> options) {
    this.options = options;
  }


  public MetricVO source(String source) {
    this.source = source;
    return this;
  }

   /**
   * 资源
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "aliyun_ecs", value = "资源")
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSource(String source) {
    this.source = source;
  }


  public MetricVO unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * 指标单位
   * @return unit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "%", value = "指标单位")
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUnit() {
    return unit;
  }


  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnit(String unit) {
    this.unit = unit;
  }


  /**
   * Return true if this MetricVO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricVO metricVO = (MetricVO) o;
    return Objects.equals(this.category, metricVO.category) &&
        Objects.equals(this.code, metricVO.code) &&
        Objects.equals(this.description, metricVO.description) &&
        Objects.equals(this.name, metricVO.name) &&
        Objects.equals(this.options, metricVO.options) &&
        Objects.equals(this.source, metricVO.source) &&
        Objects.equals(this.unit, metricVO.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, code, description, name, options, source, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricVO {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

