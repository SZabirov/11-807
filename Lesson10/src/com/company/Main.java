package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] matrix1 = new int[m][n];
        int[][] matrix2 = new int[n][k];
        int[][] resultMatrix = new int[m][k];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                int sum = 0;
                for (int l = 0; l < n; l++) {
                    sum += matrix1[i][l] * matrix2[l][j];
                }
                resultMatrix[i][j] = sum;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(resultMatrix[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
}




