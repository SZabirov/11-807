package com.company;

public class Main02HashCodeCollision {
    public static void main(String[] args) {
        int arr[] = new int[16];
        for (int i = 0; i < 100000; i++) {
            String s = getRandomString();
            int hash = s.hashCode();
            int index = Math.abs(hash) % 16;
            arr[index]++;
        }
    }

    static String getRandomString() {
        //fixme добавить случайную генерацию
        return "abcd";
    }
}
