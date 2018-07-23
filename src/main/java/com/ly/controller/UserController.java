package com.ly.controller;

import com.ly.pojo.IMoocJSONResult;
import com.ly.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by ly on 2018/7/19.
 */
@RestController
public class UserController {

    @GetMapping("/getUser")
    public User getUser(){

        User user = new User();
        user.setAge(18);
        user.setBirthday(new Date());
        user.setName("翠花");
        user.setDesc("娃哈哈啊娃哈哈！！");
        return  user;
    }

    @PostMapping("/getJson")
    public IMoocJSONResult getJson(){
        User user = new User();
        user.setAge(18);
        user.setBirthday(new Date());
        user.setName("翠花");
        user.setDesc("娃哈哈啊娃哈哈！！");
        return IMoocJSONResult.ok(user);
    }
}
