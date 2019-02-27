package com.company;

public class Main1 {
    public static void main(String[] args) {
        Integer i1 = 0;
        Integer i2 = 0;
        Double d3 = 0.0;
	    Main1.sum1(i1, i2, d3);
//	    Main1.<Integer>sum1(i1, i2, d3);

        Main1.sum2(i1, i2, d3);
    }

    private static <T> double sum1(T n1, T n2, T n3) {
        return 0;
    }


    private static <T extends Number> double sum2(T n1, T n2, T n3) {
        double s = n1.doubleValue() + n2.doubleValue() + n3.doubleValue();
        return s;
    }

    private static <T extends Number & Comparable<T>> double max(T n1, T n2, T n3) {
        double s = n1.doubleValue() + n2.doubleValue() + n3.doubleValue();
        return s;
    }
}
