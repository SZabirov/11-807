package com.company.generics;

import java.util.Iterator;

public class MyArrayList<T> implements Iterable<T> {
    private T[] elements;
    private int count = 0;

    public MyArrayList() {
        this.elements = (T[]) new Object[10];
    }

    public void add(T e) {
        elements[count++] = e;
    }

    public T get(int index) {
        return elements[index];
    }

    //число элементов в списке
    int size() {
        return 0;
    }

    //есть ли в списке такой элемент
    boolean contains(T value) {
        return false;
    }

    //удаление элемента по индекс (со смещением элементов влево)
    void remove(int index) {
    }

    //возвращает все элементы из списка в виде массива
    T[] toArray() {
        return null;
    }

    //добавление всех элементов из списка list в данный список(в конец)
    void addAll(MyArrayList<T> list) {
    }

    //добавление всех элементов из списка list в данный список
    //начиная с позиции index
    void addAll(MyArrayList<T> list, int index) {
    }

    public Iterator<T> iterator() {
        return new MyIter();
    }

    public class MyIter implements Iterator<T> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }

        @Override
        public T next() {
            return elements[currentIndex++];
        }
    }
}
