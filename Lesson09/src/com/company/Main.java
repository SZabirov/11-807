package com.company;

public class Main {
    public static void main(String[] args) {
        RacingCar rc = new RacingCar("red", 500, 1000);
        RacingCar c = new RacingCar(450);
        System.out.println(rc.color);
        rc.accelerate(400);
        System.out.println(rc.currentSpeed);
    }
}
