package com.company.objects;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ObjectArrayList oal = new ObjectArrayList();
        oal.add("abc");
        oal.add("ha-ha");
        oal.add("qwerty");
        oal.add("0987");
        String s = (String) oal.get(2);

//        Iterator iter = oal.iterator();
//        while (iter.hasNext()) {
//            String str = (String) iter.next();
//            System.out.println(str.toUpperCase());
//        }

        for(Object o : oal) {
            String str = (String) o;
            System.out.println(str.toUpperCase());
        }
    }
}
