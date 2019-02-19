package com.company.comparators;

import java.util.Comparator;

public class Main2 {
    public static void main(String[] args) {
        AudioTrack a1 = new AudioTrack(120, "aa", "cc");
        AudioTrack a2 = new AudioTrack(201, "ac", "bb");
        AudioTrack a3 = new AudioTrack(60, "qw", "cc");
        AudioTrack a4 = new AudioTrack(42, "fd", "bb");
        Comparator<AudioTrack> c = new ByTitleComparator();
        Comparator<AudioTrack> byDurationComparator =
                (o1, o2) -> o1.getDuration() - o2.getDuration();
        PlayList playList = new PlayList(10, c);
        playList.add(a1);
        playList.add(a2);
        playList.add(a3);
        playList.add(a4);
        playList.show();
    }
}
