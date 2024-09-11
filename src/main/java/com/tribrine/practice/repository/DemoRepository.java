package com.tribrine.practice.repository;

import org.springframework.stereotype.Repository;

@Repository
public class DemoRepository {

    public String hello() {
        return "hello repository";
    }
}
