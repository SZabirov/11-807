package com.company;

import java.util.Scanner;

public class EvenAndOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < n; i++) {
            int x = 5;
            if (i % 2 == 0) {
                evenSum = evenSum + arr[i];
            } else {
                oddSum += arr[i];
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}
