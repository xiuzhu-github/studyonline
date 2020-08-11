package com.studyonline.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//返回的是json格式的数据，用RestController;如果返回的是页面，用Controller。

public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "success";
    }
}

