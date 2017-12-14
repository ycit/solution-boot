package com.ycit.service;

import com.ycit.domain.entity.User;
import com.ycit.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * user service
 *
 * @author xlch
 * @Date 2017-12-14 15:50
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> finds() {
        return userMapper.finds();
    }

}
