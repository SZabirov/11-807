package com.company;

public class Main {
    public static void main(String[] args) {
        char c1 = 68;
        System.out.println(c1);

        //получение кода символа
        char c2 = 'p';
        //System.out.println((int) c2);
        int intC2 = c2;
        System.out.println(intC2);

        int x = 100;
        char charX = (char) x;

        String s = "abcd";
        int stringLen = s.length();
        char[] chars = s.toCharArray();

        char[] arr = {'c', 'd', '7'};
        int arrLen = arr.length;
        String strArr = String.valueOf(arr);
    }
}




