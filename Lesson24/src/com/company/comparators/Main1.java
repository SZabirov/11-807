package com.company.comparators;

public class Main1 {
    public static void main(String[] args) {
        AudioTrack a1 = new AudioTrack(120, "aa", "cc");
        AudioTrack a2 = new AudioTrack(201, "ac", "bb");
        AudioTrack a3 = new AudioTrack(60, "qw", "cc");
        AudioTrack a4 = new AudioTrack(42, "fd", "bb");
        PlayList playList = new PlayList(10);
        playList.add(a1);
        playList.add(a2);
        playList.add(a3);
        playList.add(a4);
        playList.show();
    }
}
