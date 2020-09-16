package com.ycit.service;

import com.ycit.entity.User;
import com.ycit.repository.UserRepository;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
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

    @Resource
    private UserService self;

    public List<User> finds() {
        List<User> users = userRepository.findAll();
        return users;
    }

    public int createUserWrong1(String name) {
        try {
            this.createUserPrivate(new User(name));
        } catch (Exception ex) {
            System.out.println("create user failed because {}" + ex.getMessage());
        }
        return userRepository.findByName(name).size();
    }

    //标记了@Transactional的private方法
    @Transactional
    public void createUserPrivate(User entity) {
        userRepository.save(entity);
        if (entity.getName().contains("test")) {
            throw new RuntimeException("invalid username!");
        }
    }
    //根据用户名查询用户数 public int getUserCount(String name) { return userRepository.findByName(name).size(); }

}
