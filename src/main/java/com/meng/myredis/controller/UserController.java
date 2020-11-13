package com.meng.myredis.controller;

import com.meng.myredis.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ZuoHao
 * @Date 2020/11/13
 * @Description
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;


    @RequestMapping("/set")
    public Object set() {
        redisTemplate.opsForValue().set("myKey", "myValue");
        System.out.println(redisTemplate.opsForValue().get("myKey"));
        return "success";
    }

    @GetMapping("/setUser")
    public Object setUser(){
        redisTemplate.opsForValue().set("user",new User(12,"fsa"));
        User user = (User)redisTemplate.opsForValue().get("user");
        System.out.println(user);
        return "success";
    }
}

