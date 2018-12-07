package com.company.generics;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> l = new MyArrayList<String>();
        //l.add(5); не скомпилируется
        l.add("abc");
        l.add("qwerty");
        l.add("xzcvxcv");
        String s = l.get(0);
        MyArrayList<Integer> l2 = new MyArrayList<>();

        //classic using iterator of MyArrayList
        Iterator<String> iter = l.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        //foreach using iterator
        for(String str : l) {
            System.out.println(str.toUpperCase());
        }

    }
}
