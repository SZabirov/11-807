package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IntListTestMain {
    public static void main(String[] args) {
        IntLinkedList list = new IntLinkedList();
        list.add(4);
        list.add(7);
        list.add(1);
        list.remove(0);
        System.out.println(list.get(1));
    }
}
