package com.tribrine.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();

        Traveler traveler = new Traveler(vehicle);
        traveler.startTraveling();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        Cycle cycle = applicationContext.getBean(Cycle.class);
        cycle.move();

        Bike bike = applicationContext.getBean(Bike.class);
        bike.move();

        Traveler traveler2 = applicationContext.getBean(Traveler.class);
        traveler2.startTraveling();
    }
}
