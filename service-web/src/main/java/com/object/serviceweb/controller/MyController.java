package com.object.serviceweb.controller;

import com.object.serviceweb.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Jarrett Luo
 * @Date 2020/12/14 16:38
 * @Version 1.0
 */
@Controller
public class MyController {

    @Autowired
    private EmailService emailService;


    @GetMapping(value = "/sendmail")
    public String sendmail() {
        emailService.sendMail("jiarui.luo@hirain.com", "Test subject", "Test mail");
        return "mailsent";
    }

}
