package com.exercise.controller;

import com.exercise.entity.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author elead
 * @Date 2019/3/24  10:37
 * @Description TODO
 **/
@RestController
public class JsonTest {


    @GetMapping(value = "/user/{userId}")
    public User getUserInfo(@PathVariable("userId") String userId){
        User user = new User();
        user.setUserName("java技术栈");
        user.setAge(18);
        user.setId(Long.valueOf(userId));
        return user;
    }



}
