package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class Main06Reader {
    public static void main(String[] args) throws IOException {
        Reader r = new FileReader("text2.txt");
        char[] chars = new char[20];
        int length = r.read(chars);
        System.out.println(Arrays.toString(chars));
    }
}
