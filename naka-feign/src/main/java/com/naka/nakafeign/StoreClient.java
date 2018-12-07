package com.naka.nakafeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
/**
 *@Author: Jeason.Law
 *@Date:2018-11-20 9:46
 *@Version: 1.0
 *@Description:
 **/
@FeignClient("index")
public interface StoreClient {
    @RequestMapping(method = RequestMethod.GET, value = "/index")
    String home(String name);


}
