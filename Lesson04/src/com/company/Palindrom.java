package com.company;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] symbols = str.toCharArray();
        int n = symbols.length;
        boolean isPalindrom = true;
        for (int i = 0; i < n / 2 & isPalindrom; i++) {
            if (symbols[i] != symbols[n - 1 - i]) {
                isPalindrom = false;
            }
        }
        if (isPalindrom) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }
}
