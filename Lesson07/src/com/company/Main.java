package com.company;

public class Main {
    public static void main(String[] args) {
        printFrom1ToN(7, 1);
    }

    static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        int f = n * fact(n - 1);
        return f;
    }

    static void printFromNTo1(int n) {
        System.out.println(n);
        if(n > 1) {
            printFromNTo1(n - 1);
        }
    }

    static void printFrom1ToN(int n, int i) {
        System.out.println(i);
        if(i < n) {
            printFrom1ToN(n - 1, i + 1);
        }
    }

    static void printFrom1ToN(int n) {
        if(n > 1) {
            printFrom1ToN(n - 1);
        }
        System.out.println(n);
    }
}





