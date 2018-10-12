package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileSort {
    public static void main(String[] args) throws FileNotFoundException {
        int len = length();
        for (int i = 0; i < len; i++) {
            sort(i);
            merge();
        }
    }

    static void merge() throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("in.txt"));
        Scanner[] scanners = new Scanner[10];
        for (int i = 0; i < 10; i++) {
            //Была ошибка: scanners[i] = new Scanner("out" + i + ".txt") - сканнер читал из строки, не из файла!
            scanners[i] = new Scanner(new File("out" + i + ".txt"));
        }
        for (int i = 0; i < 10; i++) {
            while (scanners[i].hasNextInt()) {
                pw.println(scanners[i].nextInt());
            }
        }
        pw.close();
    }

    static void sort(int k) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("in.txt"));
        PrintWriter[] pws = new PrintWriter[10];
        for (int i = 0; i < 10; i++) {
            pws[i] = new PrintWriter(new File("out" + i + ".txt"));
        }
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int c = n;
            for (int i = 0; i < k; i++) {
                c /= 10;
            }
            pws[c % 10].println(n);
        }
        for (int i = 0; i < 10; i++) {
            pws[i].close();
        }
    }

    static int length() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("in.txt"));
        int max = 0;
        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            int digitsNum = (int) Math.log10(x) + 1;
            if (digitsNum > max) {
                max = digitsNum;
            }
        }
        return max;
    }
}
