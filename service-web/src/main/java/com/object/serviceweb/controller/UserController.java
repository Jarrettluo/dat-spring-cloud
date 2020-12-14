package com.object.serviceweb.controller;

import com.netflix.discovery.converters.Auto;
import com.object.servicepayment.controller.ServiceAFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Jarrett Luo
 * @Date 2020/12/4 17:59
 * @Version 1.0
 */
@RestController
public class UserController {

    @Autowired
    private ServiceAFeignClient serviceAFeignClient;

    @RequestMapping(value = "/call", method = RequestMethod.GET)
    public String index(){
        String result = serviceAFeignClient.hello();
        return "b to a的访问结果：" + result;
    }
}
