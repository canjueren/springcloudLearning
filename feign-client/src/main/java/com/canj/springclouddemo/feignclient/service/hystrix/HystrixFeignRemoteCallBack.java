package com.canj.springclouddemo.feignclient.service.hystrix;

import com.canj.springclouddemo.feignclient.service.FeignRemoteService;
import org.springframework.stereotype.Component;

/**
 * @Author:mzh
 * @Description:TODO
 * @Date:2020/7/10$
 **/
@Component
public class HystrixFeignRemoteCallBack implements FeignRemoteService{

    @Override
    public String hello(String name) {
        return name + ",Due error,enter Hystrix";
    }

}
