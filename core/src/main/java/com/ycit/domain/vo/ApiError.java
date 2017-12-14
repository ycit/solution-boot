package com.ycit.domain.vo;

/**
 * 错误返回
 *
 * @author xlch
 * @Date 2017-12-14 10:54
 */
public class ApiError {

    private int code;
    private String message;

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
}
