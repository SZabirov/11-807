package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Number> nums = new LinkedList<>();
        nums.add(new Integer(5));
        nums.add(new Double(7.987));

        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(90);
//        sum(integers);
        moreUniversalSum(integers);
    }

    private static double sum(List<Number> nums) {
        double sum = 0;
        for (Number n : nums) {
            sum += n.doubleValue();
        }
        return sum;
    }

    private static double moreUniversalSum(List<? extends Number> nums) {
        double sum = 0;
        for (Number n : nums) {
            sum += n.doubleValue();
        }
        return sum;
    }

    private static void fillList(List<? extends Number> nums) {
        Number d = new Double(0.5);
        //не знаем, какой тип конкретно, поэтому модифицировать не можем!
//        nums.set(0, d);
//        nums.add(d);
    }

    private static void fillIntegerList(List<Integer> nums) {
        nums.add(5);
        //не знаем, какой тип конкретно, поэтому модифицировать не можем!
//        nums.set(0, d);
//        nums.add(d);
    }
}
