package com.canj.springclouddemo.ribbonclient.controller;

import com.canj.springclouddemo.ribbonclient.service.RibbonService;
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
public class RibbonController {
    @Autowired
    RibbonService ribbonService;

    @GetMapping(value = "/getHello")
    public String getHello(@RequestParam String name) {
        return ribbonService.getHello(name);
    }

    @GetMapping(value = "/testzuul")
    public String testzuul(@RequestParam String name) {
        return name +"这是springcloud-ribbon-clientd的服务接口";
    }

}
