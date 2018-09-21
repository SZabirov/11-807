package com.company;

public class TestMain {
    public static void main(String[] args) {
        int x = 0;
        setFortyTwo(x);
        System.out.println(x);

        int[] arr = {0, 1, 2, 3};
        setFortyTwo(arr);
        System.out.println(arr);
        System.out.println(arr[0]);
    }

    static void setFortyTwo(int a) {
        a = 42;
    }

    static void setFortyTwo(int[] array) {
        array[0] = 42;
    }
}
