package com.object.servicepayment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Jarrett Luo
 * @Date 2020/12/7 16:27
 * @Version 1.0
 */

@RestController
public class Cotrol {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello world";
    }
}
