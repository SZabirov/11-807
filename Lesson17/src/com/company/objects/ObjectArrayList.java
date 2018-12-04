package com.company.objects;

public class ObjectArrayList {
    private Object[] elements;
    private static final int DEFAULT_CAPACITY = 10;
    private int count = 0;

    public ObjectArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    void add(Object e) {
        elements[count++] = e;
    }

    Object get(int index) {
        return elements[index];
    }
}
