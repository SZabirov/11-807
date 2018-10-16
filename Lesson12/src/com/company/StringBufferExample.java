package com.company;

public class StringBufferExample {
    public static void main(String[] args) {
        String s = getOneStringSB(100000);
    }

    //составляет строку из n единиц
    static String getOneString(int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s += "1";
        }
        return s;
    }

    //то же самое по смыслу, что и getOneString(int n), только со StringBuffer. Работает сильно быстрее
    static String getOneStringSB(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append("1");
        }
        String s = sb.toString();
        return s;
    }
}
