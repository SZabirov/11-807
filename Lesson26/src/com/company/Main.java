package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = getRandomArr(10000000);
        Sorter.mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] getRandomArr(int size) {
        int[] arr = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(10000);
        }
        return arr;
    }
}







