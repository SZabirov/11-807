package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main01InputStream {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("text1.txt");
        System.out.println((char)is.read());
        System.out.println((char)is.read());
        System.out.println((char)is.read());
        System.out.println((char)is.read());

    }
}
