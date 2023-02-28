package com.ramacciotti.liskov.children;

import com.ramacciotti.liskov.parent.Vehicle;

public class Car extends Vehicle {

    @Override
    public void start() {
        System.out.println("Starting car...");
    }

    @Override
    public void stop() {
        System.out.println("Stoping car...");
    }

}
