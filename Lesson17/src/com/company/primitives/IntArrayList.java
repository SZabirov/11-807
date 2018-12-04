package com.company.primitives;

public class IntArrayList implements IntList {
    private int[] elements;
    private static final int DEFAULT_CAPACITY = 10;
    private int capacity;
    private int count = 0;
    private static final double EXTENSION_COEF = 1.5;

    public IntArrayList() {
        elements = new int[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean contains() {
        return false;
    }

    @Override
    public void add(int e) {
        if (capacity == count) {
            grow();
        }
        elements[count++] = e;
    }

    private void grow() {
        int newCapacity = (int) (capacity * EXTENSION_COEF);
        int[] newElements = new int[newCapacity];
        for (int i = 0; i < capacity; i++) {
            newElements[i] = elements[i];
        }
        capacity = newCapacity;
        elements = newElements;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("No such index");
        }
        return elements[index];
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void sort() {

    }

    @Override
    public void addAll(IntList intList) {

    }

    @Override
    public void addAll(IntList intList, int startPosition) {

    }

    @Override
    public int[] toArray() {
        return new int[0];
    }

    @Override
    public int indexOf(int value) {
        return 0;
    }

    @Override
    public Iterator iterator() {
        return new MyIter();
    }

    class MyIter implements Iterator {
        private int currentIndex;

        public MyIter() {
            currentIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }

        @Override
        public int next() {
//            int val = elements[currentIndex];
//            currentIndex++;
//            return val;
            return elements[currentIndex++];
        }
    }
}





