package com.canj.springclouddemo.feignclient.controller;

import com.canj.springclouddemo.feignclient.service.FeignRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:mzh
 * @Description:TODO
 * @Date:2020/7/10$
 **/
@RestController
public class FeignController {

    @Autowired
    FeignRemoteService feignRemoteService;

    @GetMapping(value = "/getHello")
    public String getHello(@RequestParam String name) {
        return feignRemoteService.hello(name);
    }

    @GetMapping(value = "/testzuul")
    public String testzuul(@RequestParam String name) {
        return name +",这是springcloud-feign-client的服务接口";
    }
}
