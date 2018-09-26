package com.company;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {8, 3, 1, 2, 5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapHappened = true;
        for (int i = 0; i < n & swapHappened; i++) {
            swapHappened = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapHappened = true;
                }
            }
        }
    }
    static void swap(int[] arr, int i, int j) {
        int buf = arr[j];
        arr[j] = arr[i];
        arr[i] = buf;
    }
}
