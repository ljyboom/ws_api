package com.core.http;
import com.core.common.ErrorCore;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author ljy
 * @version 1.0
 * @date 2019/6/21 0021
 */
//@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CommonResponse<T> implements Serializable {
    private int code;
    private String message;
    private T data;

    public static CommonResponse err(ErrorCore errorCore){
        CommonResponse response=new CommonResponse();
        response.code=errorCore.getCode();
        response.message=errorCore.getMessage();
        return response;
    }

    public static CommonResponse ok(Object data){
        CommonResponse response=new CommonResponse();
        response.code=200;
        response.message="Success";
        response.data=data;
        return response;
    }

    public static CommonResponse ok(){
        CommonResponse response=new CommonResponse();
        response.code=200;
        response.message="Success";
        return response;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
