package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("weather.txt"));
        double sum = 0;
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] elems = s.split(" ");
            int t = Integer.parseInt(elems[2]);
            sum += t;
        }
        System.out.println(sum / 7);
    }
}












