package com.tribrine.practice.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {

        String message = "Hello World!";

//        SmsService smsService = new SmsService();
//        MessageSender messageSender = new MessageSender(smsService);
//
//        EmailService emailService = new EmailService();
//        MessageSender messageSender2 = new MessageSender(emailService);
//
//        messageSender.sendMessage(message);
//        messageSender2.sendMessage(message);

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        MessageSender sender = context.getBean(MessageSender.class);
        sender.sendMessage(message);
    }
}
