package com.ly.controller;

import com.ly.pojo.IMoocJSONResult;
import com.ly.pojo.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ly on 2018/7/23.
 */
@RestController
public class ResourceController {

    @Autowired
    private Resource resource;

    @GetMapping("/getResource")
    public IMoocJSONResult getResource(){

        Resource bean = new Resource();
        BeanUtils.copyProperties(resource,bean);
        return IMoocJSONResult.ok(bean);

    }
}
