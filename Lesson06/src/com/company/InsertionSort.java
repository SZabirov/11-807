package com.company;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 0, 4, 2, 5, 1};
        int[] arr1 = {6, 7, 4, 2, 5};
        int[] arr2 = {8, 7, 4, 2, 5};
        insertionSortAsc(arr);
        insertionSortAsc(arr1);
        insertionSortAsc(arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        insertionSortDesc(arr);
        insertionSortDesc(arr1);
        insertionSortDesc(arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    static void insertionSortDesc(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int indexOfMax = n - 1;
            for (int j = i; j < n; j++) {
                if (arr[indexOfMax] < arr[j]) {
                    indexOfMax = j;
                }
            }
            int buf = arr[indexOfMax];
            arr[indexOfMax] = arr[i];
            arr[i] = buf;
        }
    }
    
    static void insertionSortAsc(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int indexOfMax = 0;
            for (int j = 0; j < n - i; j++) {
                if (arr[indexOfMax] < arr[j]) {
                    indexOfMax = j;
                }
            }
            int buf = arr[indexOfMax];
            arr[indexOfMax] = arr[n - 1 - i];
            arr[n - 1 - i] = buf;
        }
    }
}
