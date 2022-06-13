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
import com.dtsre.api.v1.client.model.Webhook;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.dtsre.api.v1.client.JSON;


/**
 * AlertNotifyGroupCreateParam
 */
@JsonPropertyOrder({
  AlertNotifyGroupCreateParam.JSON_PROPERTY_DESCRIPTION,
  AlertNotifyGroupCreateParam.JSON_PROPERTY_NAME,
  AlertNotifyGroupCreateParam.JSON_PROPERTY_TYPE,
  AlertNotifyGroupCreateParam.JSON_PROPERTY_WEBHOOK
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-19T14:34:25.795+08:00[Asia/Shanghai]")
public class AlertNotifyGroupCreateParam {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  /**
   * 通知组类型:WEBHOOK-自定义webhook，DINGDING-钉钉群，WECHAT_ROBOT-企业微信机器人
   */
  public enum TypeEnum {
    CONTACT("CONTACT"),
    
    DINGDING("DINGDING"),
    
    WEBHOOK("WEBHOOK"),
    
    WECHAT_ROBOT("WECHAT_ROBOT"),
    
    OTHER("OTHER");

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

  public static final String JSON_PROPERTY_WEBHOOK = "webhook";
  private Webhook webhook;

  public AlertNotifyGroupCreateParam() { 
  }

  public AlertNotifyGroupCreateParam description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 通知组描述
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "通知组描述")
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


  public AlertNotifyGroupCreateParam name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 通知组名称
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "通知组名称")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public AlertNotifyGroupCreateParam type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * 通知组类型:WEBHOOK-自定义webhook，DINGDING-钉钉群，WECHAT_ROBOT-企业微信机器人
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "通知组类型:WEBHOOK-自定义webhook，DINGDING-钉钉群，WECHAT_ROBOT-企业微信机器人")
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


  public AlertNotifyGroupCreateParam webhook(Webhook webhook) {
    this.webhook = webhook;
    return this;
  }

   /**
   * Get webhook
   * @return webhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WEBHOOK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Webhook getWebhook() {
    return webhook;
  }


  @JsonProperty(JSON_PROPERTY_WEBHOOK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebhook(Webhook webhook) {
    this.webhook = webhook;
  }


  /**
   * Return true if this AlertNotifyGroupCreateParam object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertNotifyGroupCreateParam alertNotifyGroupCreateParam = (AlertNotifyGroupCreateParam) o;
    return Objects.equals(this.description, alertNotifyGroupCreateParam.description) &&
        Objects.equals(this.name, alertNotifyGroupCreateParam.name) &&
        Objects.equals(this.type, alertNotifyGroupCreateParam.type) &&
        Objects.equals(this.webhook, alertNotifyGroupCreateParam.webhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, type, webhook);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertNotifyGroupCreateParam {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
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

