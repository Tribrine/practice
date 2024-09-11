package com.tribrine.practice.di;

import org.springframework.stereotype.Component;

@Component("sms")
public class SmsService implements MessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println(message + " SMS");
    }
}
