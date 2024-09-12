package com.tribrine.practice.emailsender;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PostgreSqlDS implements DataSource {

    public PostgreSqlDS() {
        System.out.println("PostgreSqlDS created");
    }

    @Override
    public String[] getEmails() {
        return new String[]{"postgre1@gmail.com", "postgre2@gmail.com", "postgre3@gmail.com"};
    }
}
