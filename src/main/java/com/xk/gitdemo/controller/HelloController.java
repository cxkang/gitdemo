package com.xk.gitdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
@RequestMapping("/info")
    public String info(){
        return "git   demo  项目经理123";
    }
    //test  开发人员提交的；

}
