/*
 * Copyright 2018 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package com.example.study.serviceImpl;

import com.example.study.dao.UserMapper;
import com.example.study.model.User;
import com.example.study.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ${taoyuan}
 * @date ${taoyuan}22:52
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public Boolean addUser(User user){
        Integer result = userMapper.insertSelective(user);
        return result>0;
    }
}
