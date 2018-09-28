package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //int[][] matrix = {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число строк(столбцов):");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        boolean isMagic = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int diagonalSum = 0;
        for (int i = 0; i < n; i++) {
            diagonalSum += matrix[i][i];
        }
        int collateralDiagonalSum = 0;
        if (diagonalSum != collateralDiagonalSum) {
            isMagic = false;
        }

        for (int i = 0; i < n; i++) {
            collateralDiagonalSum += matrix[i][n - i - 1];
        }
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != diagonalSum) {
                isMagic = false;
            }
        }
    }
}
