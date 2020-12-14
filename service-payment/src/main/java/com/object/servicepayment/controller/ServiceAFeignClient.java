package com.object.servicepayment.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Jarrett Luo
 * @Date 2020/12/7 16:30
 * @Version 1.0
 */
@FeignClient("SERVICE-PAYMENT")
public interface ServiceAFeignClient {
    @RequestMapping("/hello")
    public String hello();
}
