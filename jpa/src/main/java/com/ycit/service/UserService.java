package com.ycit.service;

import com.ycit.entity.User;
import com.ycit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * user service
 *
 * @author xlch
 * @Date 2017-12-25 11:27
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> finds() {
        List<User> users = userRepository.findAll();
        return users;
    }

}
