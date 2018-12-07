package com.naka.nakaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@Author: Jeason.Law
 *@Date:2018-11-20 9:34
 *@Version: 1.0
 *@Description:
 **/
@RestController
public class HelloController extends BaseController {

    @RequestMapping("/index")
    public String home(String name) {
        return "Hello  "+name+": you port is :"+8921;
    }

}
