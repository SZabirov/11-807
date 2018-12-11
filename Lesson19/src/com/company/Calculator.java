package com.company;

public class Calculator {
    int fact(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Negative or zero: " + n);
        }
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public boolean isSquare(int n) {
        int s = (int) Math.sqrt(n);
        return s * s == n;
    }
}








