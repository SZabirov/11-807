package com.company;

public class Fill {
    public static void main(String[] args) {
        int n = 7;
        int[][] matrix = new int[n][n];
        fillSpiral(matrix);
        int[][] oneMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                }
            }
        }
        multiply(matrix, oneMatrix);
    }

    static void multiply(int[][] matrix1, int[][] matrix2) {

    }

    static void fillSpiral(int[][] matrix) {
        int n = matrix.length;
        int count = 1;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - 1 - i; j++) {
                matrix[i][j] = count++;
            }
            for (int j = i; j < n - 1 - i; j++) {
                matrix[j][n - 1 - i] = count++;
            }
            for (int j = n - 1 - i; j > i; j--) {
                matrix[n - 1 - i][j] = count++;
            }
            for (int j = n - 1 - i; j > i; j--) {
                matrix[j][i] = count++;
            }
        }
        if (n % 2 == 1) {
            matrix[n / 2][n / 2] = count;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}








