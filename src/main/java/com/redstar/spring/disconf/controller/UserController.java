package com.redstar.spring.disconf.controller;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;
import com.baidu.disconf.client.common.annotations.DisconfItem;
import com.redstar.spring.disconf.conf.Configuration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = {"/user"})
public class UserController {
    @Resource
    private Configuration configuration;

    @ResponseBody
    @RequestMapping(value = {"/query"})
    public String query() {
        return configuration.getName();
    }
}
