package com.company;

public interface BinarySearchTree<T extends Comparable> {
    void insert(T t);
    void remove(T t);
    boolean contains(T t);
    void printAll();
    void printAllByLevels();
}
