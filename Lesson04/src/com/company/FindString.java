package com.company;

import java.util.Scanner;

public class FindString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = sc.next();
        }
        System.out.println("Enter string to find in array");
        String strToFind = sc.next();
        int indexOfString = -1;
        for (int i = 0; i < n; i++) {
            if (strToFind.equals(strings[i])) {
                indexOfString = i;
            }
        }
        System.out.println(indexOfString);
    }
}
