package com.tribrine.practice;

//import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("traveler")
//@AllArgsConstructor
public class Traveler {

    private final Vehicle vehicle;

    @Autowired
    public Traveler(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void startTraveling() {
        this.vehicle.move();
    }
}
