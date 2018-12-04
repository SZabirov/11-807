package com.company.primitives;

public class Main {
    public static void main(String[] args) {
        IntList list = new IntArrayList();
        list.add(41);
        Iterator iter1 = list.iterator();
        while (iter1.hasNext()) {
            System.out.println(iter1.next());
        }

        Iterator iter2 = list.iterator();
        int sum = 0;
        while (iter2.hasNext()) {
            int e = iter2.next();
            sum += e;
        }
    }
}
