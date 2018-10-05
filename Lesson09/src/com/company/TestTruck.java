package com.company;

public class TestTruck {
    public static void main(String[] args) {
        TransportableCar lada = new TransportableCar(1200, 3, 2, 2, "а123ва", "A124824212");
        TransportableCar volvo = new TransportableCar(1200, 3, 2, 2, "а143ва", "A124824312");
        Truck truck = new Truck(6);
        truck.load(lada);
        truck.load(volvo);
    }
}
