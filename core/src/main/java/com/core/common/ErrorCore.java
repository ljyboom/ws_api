package com.core.common;

/**
 * <p>
 *错误代码
 * </p>
 *
 * @author ljy
 * @version 1.0
 * @date 2019/6/21 0021
 */
public enum ErrorCore {

    EC_10000(10000,"unknown error occurs");


    private int code;
    private String message;

    private ErrorCore(int code, String message){
        this.code=code;
        this.message=message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
