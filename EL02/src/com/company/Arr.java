package com.company;

import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        arr[1][2] = 9;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j][i];
            }
            System.out.print(sum + " ");
        }
        int diagonalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            diagonalSum += arr[i][i];
        }
        System.out.println(diagonalSum);
    }
}
