package com.tribrine.practice.emailsender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private final DataSource dataSource;

    @Autowired
    public EmailService(DataSource dataSource) {
        this.dataSource = dataSource;
        System.out.println("EmailService created");
    }

    public void sendEmail() {
        for(String mail : dataSource.getEmails()) {
            System.out.println(mail);
        }
    }
}
