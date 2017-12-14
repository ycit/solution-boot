package com.ycit.controller;

import com.ycit.domain.vo.ApiError;
import com.ycit.domain.vo.ApiResponse;

import java.util.List;

/**
 * controller 父类
 *
 * @author xlch
 * @Date 2017-12-14 10:08
 */
public class BaseController {

    protected <T> ApiResponse<T> success(List<T> results, int total) {
        ApiResponse<T> response = new ApiResponse<>();
        response.setResults(results);
        response.setTotal(total);
        response.setCode(200);
        return response;
    }

    protected ApiError error(int code, String message) {
        ApiError apiError = new ApiError();
        apiError.setCode(code);
        apiError.setMessage(message);
        return apiError;
    }

}
