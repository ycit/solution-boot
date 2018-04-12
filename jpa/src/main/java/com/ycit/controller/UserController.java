package com.ycit.controller;

import com.ycit.common.BaseController;
import com.ycit.domain.vo.ApiResponse;
import com.ycit.entity.User;
import com.ycit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户控制层
 *
 * @author xlch
 * @Date 2017-12-25 9:51
 */
@RestController
@RequestMapping("/api")
public class UserController extends BaseController{

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public ApiResponse<User> users() {
        List<User> users = userService.finds();
        return success(users, users.size());
    }

}
