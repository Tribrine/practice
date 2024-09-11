package com.tribrine.practice;

import org.springframework.stereotype.Component;

@Component("cycle")
public class Cycle implements Vehicle {

    @Override
    public void move() {
        System.out.println("Cycle is moving");
    }
}
