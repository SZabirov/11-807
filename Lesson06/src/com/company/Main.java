package com.company;

public class Main {
    public static void main(String[] args) {
	    int x = sum(7, 6);
        System.out.println(x);
        sayHello("Petr");
        System.out.println(fact(5));
    }

    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    static int sum(int a, int b) {
        int s = a + b;
        return s;
    }

    static void sayHello(String name) {
        System.out.println("Hello, " + name);
    }
}
