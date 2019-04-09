package com.company;

public class CounterThread extends Thread {
    private int start;
    private int end;
    private int[] arr;

    public CounterThread(int start, int end, int[] arr) {
        this.start = start;
        this.end = end;
        this.arr = arr;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            Main.mainSum += arr[i];
        }
    }
}
