package com.company.staticexample;

public class CalculatorTest {
    public static void main(String[] args) {
//        int s = sum(1, 3);
//        System.out.println(s);
        Calculator c = new Calculator();
        int s = c.sum(1, 3);
        System.out.println(s);
    }
}
