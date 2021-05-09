package com.rao.demo.service;

import com.rao.demo.bean.User;
import com.rao.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImp implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User gerUser(Integer id) {
        return userMapper.findById(id);
    }
}
