package com.company;

public class CompareArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        if (arr1 == arr2) {
            System.out.println("Они равны");
        } else {
            System.out.println("Не равны");
        }
        System.out.println(arr1);
    }
}
