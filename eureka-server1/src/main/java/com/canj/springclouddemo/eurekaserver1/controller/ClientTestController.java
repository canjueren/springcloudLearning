package com.canj.springclouddemo.eurekaserver1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:mzh
 * @Description:TODO
 * @Date:2020/7/10$
 **/
@RestController
public class ClientTestController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue= "canj") String name) {
        return name + ",welcome to springcloud! server port:" + port;
    }
}
