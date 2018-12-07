package com.company.castexample;

public class Main {
    public static void main(String[] args) {
        Human simpleHuman = new Human();
        simpleHuman.eat();

        SuperHuman sh = new SuperHuman();
        sh.programming();

        Human h2 = (Human) sh;
        h2.eat();
        SuperHuman h2Super = (SuperHuman) h2;
        h2Super.programming();
    }
}
