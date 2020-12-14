package com.object.serviceweb.controller;

import org.reactivestreams.Publisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @Author Jarrett Luo
 * @Date 2020/12/14 17:24
 * @Version 1.0
 */

@RestController
public class MyControllerFlux {

    @GetMapping("/flux")
    public Publisher<String> home(){
        return Mono.just("Home page");
    }
}
