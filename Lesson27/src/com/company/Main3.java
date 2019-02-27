package com.company;

import java.util.List;

public class Main3 {
    public static void main(String[] args) {

    }

    private static <T> void fillWithIntegers(List<? super Integer> list) {
        //можем модифицировать, используя Integer
        list.add(5);
    }

    private static void fill(List<? super Number> list) {
        //модифицировать можем
        Integer i = 6;
        list.add(i);
        list.add(0.7);

        list.add(new Number() {
            @Override
            public int intValue() {
                return 42;
            }

            @Override
            public long longValue() {
                return 42;
            }

            @Override
            public float floatValue() {
                return 42;
            }

            @Override
            public double doubleValue() {
                return 42;
            }
        });

//        Object o = new Object();
//        list.add(o);
    }


    private static double sum(List<? super Number> list) {
        double sum = 0;
//        for (int i = 0; i < list.size(); i++) {
//              sum += ((Number) list.get(i)).doubleValue();
//        }

//        for (Object n : list) {
//            ((Number) n).doubleValue();
//        }

        return sum;
    }

    private static void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

}











