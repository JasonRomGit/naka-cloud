package com.naka.nakaribbon.controller;/**
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @author Jeason.Law
 * @date 2018-11-1916:43
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.xml.ws.Response;

/**
 *@Author: Jeason.Law
 *@Date:2018-11-19 16:43
 *@Version: 1.0
 *@Description:
 **/
@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String getc1(String name){
        ResponseEntity<String> res=restTemplate.getForEntity("http://XDD-BOSS-CLIENT-PROVIDER/index?name="+name,String.class);
        String msg=res.getBody();
        return msg;
    }
}
