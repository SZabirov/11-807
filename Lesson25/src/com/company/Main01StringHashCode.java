package com.company;

import java.util.Scanner;

public class Main01StringHashCode {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("cdegds");
        String s3 = new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println("======");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int x1 = sc1.hashCode();
        int x2 = sc2.hashCode();
        System.out.println(x1);
        System.out.println(x2);
    }
}
