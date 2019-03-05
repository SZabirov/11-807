package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main05ISUTF8ToString {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("text2.txt");
        byte[] bytes = new byte[20];
        int length = is.read(bytes);
        System.out.println(length);
        String s = new String(bytes, StandardCharsets.UTF_8);
        String betterStr = new String(bytes, 0, length, StandardCharsets.UTF_8);
        System.out.println("============");
        System.out.println(s);
        System.out.println("============");
        System.out.println(betterStr);
        System.out.println("============");
        System.out.println(Arrays.toString(bytes));
    }
}
