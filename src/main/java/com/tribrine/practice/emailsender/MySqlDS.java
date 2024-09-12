package com.tribrine.practice.emailsender;

import org.springframework.stereotype.Component;

@Component
public class MySqlDS implements DataSource {

    public MySqlDS() {
        System.out.println("MySqlDS created");
    }

    @Override
    public String[] getEmails() {

        return new String[]{"mysql1@gmail.com", "mysql2@gmail.com", "mysql3@gmail.com"};
    }
}
