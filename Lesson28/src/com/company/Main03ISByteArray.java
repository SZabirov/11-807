package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Main03ISByteArray {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("text1.txt");
        byte[] bytes = new byte[20];
        int length = is.read(bytes);
        System.out.println(length);
        System.out.println(Arrays.toString(bytes));
    }
}
