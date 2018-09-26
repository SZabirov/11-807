package com.company;

import java.util.Scanner;

public class RecTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        printFromAToB(n1, n2);
    }

    static int fact(int n) {
        if (n == 1) {
            return 1;
        } else {
            int f = n * fact(n - 1);
            return f;
        }
    }

    static void printFromAToB(int a, int b){
        System.out.println(a);
        if (a < b) {
            printFromAToB(a + 1, b);
        }
        if (a > b) {
            printFromAToB(a - 1, b);
        }
    }
}











