package com.example.study.serviceImpl;

import com.example.study.model.User;
import com.example.study.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author ${taoyuan}
 * @date ${taoyuan}23:31
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@MapperScan("com.example.study.dao")
public class UserServiceImplTest {

    @Resource
    private UserService userService;

    @Test
    public void addUser(){
        User user = new User();
        user.setName("qw");
        userService.addUser(user);
    }
}