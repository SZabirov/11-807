package com.company;

import java.util.*;

//меняем значения 100000 случайных элементов массива, затем то же со связным списком. Сравниваем затраченное время
public class Сomplexity {
    static final int N = 1000000;

    public static void main(String[] args) {
        Integer[] arr = new Integer[N];
        Arrays.fill(arr, 0);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(0);
        }

        Random r = new Random();

        long start1 = System.nanoTime();
        for (int i = 0; i < N; i++) {
            int x = r.nextInt(N);
            arr[x] = x;
        }
        long end1 = System.nanoTime();
        long time1 = end1 - start1;
        System.out.println(time1 + " наносекунд (массив)");

        long start2 = System.nanoTime();
        for (int i = 0; i < N; i++) {
            int x = r.nextInt(N);
            list.set(x, x);
        }
        long end2 = System.nanoTime();
        long time2 = end2 - start2;
        System.out.println(time2 + " наносекунд (LinkedList)");

        System.out.println("\nС массивом в " + (double) time2 / time1 + " раз быстрее");
    }
}
