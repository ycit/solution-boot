package com.ycit.common;

import com.ycit.domain.vo.ApiError;
import com.ycit.domain.vo.ApiResponse;

import java.util.List;

/**
 * controller 基类
 *
 * @author xlch
 * @Date 2017-12-25 9:53
 */
public class BaseController<T> {

    protected ApiResponse<T> success(List<T> results, int total) {
        ApiResponse<T> response = new ApiResponse<>();
        response.setResults(results);
        response.setCode(200);
        response.setTotal(total);
        return response;
    }

    protected ApiError error(int code, String message) {
        ApiError apiError = new ApiError();
        apiError.setMessage(message);
        apiError.setCode(code);
        return apiError;
    }
}
