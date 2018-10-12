package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File f1 = new File("in1.txt");
        File f2 = new File("in2.txt");
        Scanner sc1 = new Scanner(f1);
        Scanner sc2 = new Scanner(f2);
        File out = new File("out.txt");
        PrintWriter pw = new PrintWriter(out);
        while (sc1.hasNextInt() && sc2.hasNextInt()) {
            int a = sc1.nextInt();
            int b = sc2.nextInt();
            int sum = a + b;
            pw.println(sum);
        }
        while (sc1.hasNextInt()) {
            pw.println(sc1.nextInt());
        }
        while (sc2.hasNextInt()) {
            pw.println(sc2.nextInt());
        }
        pw.close();
    }
}




