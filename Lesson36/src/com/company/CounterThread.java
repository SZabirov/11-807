package com.company;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterThread extends Thread {
    private int start;
    private int end;
    private int[] arr;

    public CounterThread(int start, int end, int[] arr) {
        this.start = start;
        this.end = end;
        this.arr = arr;
    }

    private static final Object MUTEX = new Object();
    private static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
//            synchronized (MUTEX) {
            lock.lock();
            Main.mainSum = Main.mainSum + arr[i];
            lock.unlock();
//            }
        }
    }
}
