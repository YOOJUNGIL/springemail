package com.myalley.springemail.controller;

import com.myalley.springemail.dao.dto.EmailDto;
import com.myalley.springemail.dao.service.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class EmailController {

    @Autowired
    private EmailService emailService;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @ResponseBody
    @PostMapping("/email")
    public void email(@RequestBody EmailDto emailDto) {
        if(log.isDebugEnabled()) {
            log.debug("emailDto : " + emailDto);
        }
        emailService.emailSend(emailDto);
    }

}
