package com.company;

public class Sorter {
    private static int[] helper;

    public static void mergeSort(int[] arr) {
        helper = new int[arr.length];
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int low, int high) {
        if (low >= high) {//если в массиве не более одного элемента, то он уже отсортирован
            return;
        }
        int mid = low + (high - low) / 2;//нашли середину
        sort(arr, low, mid);//отсортировали левую часть
        sort(arr, mid + 1, high);//отсортировали правую часть
        merge(arr, low, mid, high);//слияние двух частей
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        //копируем обе части, которые нужно слить, в массив helper
        for (int k = low; k <= high; k++) {
            helper[k] = arr[k];
        }
        int k = low;//куда вставлять элемент в массив
        while (i <= mid && j <= high) {
            if (helper[i] < helper[j]) {
                arr[k++] = helper[i++];
            } else {
                arr[k++] = helper[j++];
            }
        }
        //либо из левой части дописываем оставшиеся
        while (i <= mid) {
            arr[k++] = helper[i++];
        }
        //либо из правой части дописываем оставшиеся
        while (j <= high) {
            arr[k++] = helper[j++];
        }
    }
}






