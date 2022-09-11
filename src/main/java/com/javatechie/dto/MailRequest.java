package com.javatechie.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MailRequest implements Serializable {


    private String to;
    private String messageBody;
    private String subject;
    private String attachment;
}
