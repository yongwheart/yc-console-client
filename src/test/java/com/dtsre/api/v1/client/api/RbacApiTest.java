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


package com.dtsre.api.v1.client.api;

import com.dtsre.api.v1.client.*;
import com.dtsre.api.v1.client.auth.*;
import com.dtsre.api.v1.client.model.DataRoleCreate;
import com.dtsre.api.v1.client.model.DataRoleUpdate;
import com.dtsre.api.v1.client.model.FunctionRoleCreate;
import com.dtsre.api.v1.client.model.FunctionRoleUpdate;
import com.dtsre.api.v1.client.model.ROfListOfOpenDataItemVO;
import com.dtsre.api.v1.client.model.ROfListOfOpenFuncTreeNodeVO;
import com.dtsre.api.v1.client.model.ROfboolean;
import com.dtsre.api.v1.client.model.ROflong;
import com.dtsre.api.v1.client.model.UserRoleAdd;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RbacApi
 */
public class RbacApiTest {

    private final RbacApi api = new RbacApi();

    /**
     * 新增数据权限角色
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDataRoleTest() throws ApiException {
        //DataRoleCreate param = null;
        //ROflong response = api.createDataRole(param);
        // TODO: test validations
    }

    /**
     * 创建功能权限角色
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFunctionRoleTest() throws ApiException {
        //FunctionRoleCreate param = null;
        //ROflong response = api.createFunctionRole(param);
        // TODO: test validations
    }

    /**
     * 删除角色
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRoleTest() throws ApiException {
        //String roleId = null;
        //ROfboolean response = api.deleteRole(roleId);
        // TODO: test validations
    }

    /**
     * 获取数据节点集合
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDataItemTest() throws ApiException {
        //ROfListOfOpenDataItemVO response = api.getDataItem();
        // TODO: test validations
    }

    /**
     * 获取功能模块集合
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFunctionItemTest() throws ApiException {
        //Long roleId = null;
        //ROfListOfOpenFuncTreeNodeVO response = api.getFunctionItem(roleId);
        // TODO: test validations
    }

    /**
     * 数据权限角色分配用户
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setDataRoleUserTest() throws ApiException {
        //UserRoleAdd param = null;
        //ROfboolean response = api.setDataRoleUser(param);
        // TODO: test validations
    }

    /**
     * 功能权限角色分配用户
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setFunctionRoleUserTest() throws ApiException {
        //UserRoleAdd param = null;
        //ROfboolean response = api.setFunctionRoleUser(param);
        // TODO: test validations
    }

    /**
     * 修改数据权限角色
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDataRoleTest() throws ApiException {
        //DataRoleUpdate param = null;
        //ROfboolean response = api.updateDataRole(param);
        // TODO: test validations
    }

    /**
     * 修改功能权限角色
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFunctionRoleTest() throws ApiException {
        //FunctionRoleUpdate param = null;
        //ROfboolean response = api.updateFunctionRole(param);
        // TODO: test validations
    }

}