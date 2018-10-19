package com.company.cars;

public class Bus extends Vehicle {
    int passengersCapacity;

    Bus(String registrationNumber, int passengersCapacity) {
        super();
        this.passengersCapacity = passengersCapacity;
    }

    @Override
    void drive() {
        System.out.println("Осторожно, двери закрываются...");
        super.drive();
    }
}
