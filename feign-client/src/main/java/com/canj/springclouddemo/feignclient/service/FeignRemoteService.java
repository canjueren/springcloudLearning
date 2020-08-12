package com.canj.springclouddemo.feignclient.service;

import com.canj.springclouddemo.feignclient.service.hystrix.HystrixFeignRemoteCallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author:mzh
 * @Description:TODO
 * @Date:2020/7/10$
 **/
@FeignClient(value = "eureka-client",fallback = HystrixFeignRemoteCallBack.class)
public interface FeignRemoteService {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(@RequestParam(value = "name") String name);

}
