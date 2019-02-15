package com.company.comare;

public class Main {
    public static void main(String[] args) {
        AudioTrack t1 = new AudioTrack();
        t1.duration = 120;
        AudioTrack t2 = new AudioTrack();
        t2.duration = 120;

        int x = t1.compareTo(t2);

        boolean b = t1.equals(t2);
    }
}
