package com.ycit.domain.vo;

import java.util.List;

/**
 * 统一返回
 *
 * @author xlch
 * @Date 2017-12-14 10:48
 */
public class ApiResponse<T> {

    private List<T> results;
    private int total;
    private int code;
    private String message = "";

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
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
}
