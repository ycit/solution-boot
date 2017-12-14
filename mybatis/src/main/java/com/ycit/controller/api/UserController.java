package com.ycit.controller.api;

import com.ycit.controller.BaseController;
import com.ycit.domain.entity.User;
import com.ycit.domain.vo.ApiResponse;
import com.ycit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户控制层
 *
 * @author xlch
 * @Date 2017-12-14 10:07
 */
@RestController
@RequestMapping("/api")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public ApiResponse<User> users() {
        List<User> users = userService.finds() ;
        return success(users, users.size());
    }

}
