package com.company;

public class Truck {
    int maxCarCount;
    TransportableCar[] cars;
    int currentCarCount;

    public Truck(int maxCarCount) {
        this.maxCarCount = maxCarCount;
        currentCarCount = 0;
        cars = new TransportableCar[maxCarCount];
    }

    void load(TransportableCar transportableCar){
        if (currentCarCount < maxCarCount) {
            cars[currentCarCount] = transportableCar;
            currentCarCount++;
        }
    }
}
