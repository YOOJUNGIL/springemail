package com.myalley.springemail.dao.service;

import com.myalley.springemail.dao.dto.EmailDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;
    private static final String fromAddress = "xcon9999@gmail.com";

    public void emailSend(EmailDto emailDto) {
        SimpleMailMessage message = new SimpleMailMessage();
        //message.setFrom(fromAddress);
        message.setTo(emailDto.getAddress());
        message.setSubject(emailDto.getTitle());
        message.setText(emailDto.getMessage());

        javaMailSender.send(message);
    }

}
