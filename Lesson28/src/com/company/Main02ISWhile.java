package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main02ISWhile {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("text1.txt");
        int i;
        while ((i = is.read()) != -1) {
            System.out.println((char)i);
        }
        char c = '\n';
    }
}
