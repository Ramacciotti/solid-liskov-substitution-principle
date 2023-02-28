package com.ramacciotti.liskov.children;

import com.ramacciotti.liskov.parent.Vehicle;

public class Bus extends Vehicle {

    @Override
    public void start() {
        System.out.println("Starting bus...");
    }

    @Override
    public void stop() {
        System.out.println("Stoping bus...");
    }

}
