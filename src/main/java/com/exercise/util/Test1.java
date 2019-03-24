package com.exercise.util;

import com.exercise.entity.User;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * @Author elead
 * @Date 2019/3/24  11:02
 * @Description TODO
 **/
public class Test1 {


    ObjectMapper objectMapper = new ObjectMapper();

    String userJsonStr = objectMapper.writeValueAsString(user);

    User jsonUser = objectMapper.readValue(userJsonStr, User.class);


    public Test1() throws IOException {
    }
}
