package com.mingle.boot.restful.common;

import lombok.Data;

/**
 * @author mingle
 * @date 2022/3/10 16:40
 * @description
 */
@Data
public class AjaxResponse {
    private Integer code;
    private String message;
    private Object data;

    private AjaxResponse(){

    }
    /**
     * 请求成功响应，返回的不带参数的查询
     * @return AjaxResponse
     **/
    public static AjaxResponse success(){
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求响应成功");
        return ajaxResponse;
    }
    /**
     * 请求成功响应，返回的不带参数的查询
     * @param data 返回数据
     * @return AjaxResponse
     **/
    public static AjaxResponse success(Object data){
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求响应成功");
        ajaxResponse.setData(data);
        return ajaxResponse;
    }
}
