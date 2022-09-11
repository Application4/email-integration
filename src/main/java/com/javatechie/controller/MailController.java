package com.javatechie.controller;

import com.javatechie.dto.MailRequest;
import com.javatechie.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import java.io.IOException;

@RestController
public class MailController {

    @Autowired
    private EmailService service;

    @PostMapping("/sendEMail")
    public String sendSimpleEmail(@RequestBody MailRequest request) {
        return service.sendSimpleMail(request);
    }

    @PostMapping("/sendEMailWithAttachment")
    public String sendSimpleEmailWithAttachment(@RequestBody MailRequest request) {
        try {
            return service.sendSimpleMailWithAttachment(request);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return null;
    }

    //sendEmailWithDynamicData
    @PostMapping("/sendEmailWithDynamicData")
    public String sendEmailWithDynamicData() throws MessagingException, IOException {
        return service.sendEmailWithDynamicData();
    }
}
