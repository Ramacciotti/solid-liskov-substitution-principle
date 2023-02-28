package com.ramacciotti.liskov;

import com.ramacciotti.liskov.children.Bus;
import com.ramacciotti.liskov.children.Car;
import com.ramacciotti.liskov.parent.Vehicle;

public class Application {

    public static void main(String[] args) throws Exception {

        // Vehicle is an PARENT abstract class and it has 2 CHILDREN: Car and Bus
        // This principle states that the children should be able to deliver the SAME RESULT as the parent
        // It aims to enforce consistency so that the parent or its children can be used in the same way without any errors.

        // Car have the same methods as its parent Vehicle
        Vehicle car = new Car(); // We can assign a Car object to its parent Vehicle
        car.start();
        car.stop();

        // Bus have the same methods as its parent Vehicle
        Vehicle bus = new Bus();  // We can assign a Bus object to its parent Vehicle
        bus.start();
        bus.stop();

    }

}
