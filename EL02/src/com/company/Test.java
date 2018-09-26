package com.company;

public class Test {
    public static void main(String[] args) {
        String res = deleteSymbols("qwerty", 2);
    }

    static String deleteSymbols(String str, int n) {
        int len = str.length();
        char[] newChars = new char[len - n];
        char[] oldChars = str.toCharArray();
        for (int i = 0; i < len - n; i++) {
            newChars[i] = oldChars[i + n];
        }
        String s = "";
        for (int i = 0; i < newChars.length; i++) {
            s = s + newChars[i];
        }
//        String s = String.valueOf(newChars);
        return s;
    }
}


