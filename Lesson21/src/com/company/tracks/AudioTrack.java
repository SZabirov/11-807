package com.company.tracks;

public class AudioTrack implements Comparable<AudioTrack> {
    int duration;
    String title;
    String author;

    @Override
    public int compareTo(AudioTrack o) {
        return duration - o.duration;//сравнение по продолжительности

        //сравнение сначала по продолжительности, а если совпадает, то по имени
//        int d = duration - o.duration;
//        if (d != 0) {
//            return d;
//        } else {
//            return title.compareTo(o.title);
//        }

//        if (duration > o.duration) {
//            return 1;
//        }
//        if (duration < o.duration) {
//            return -1;
//        }
//        if (duration == o.duration) {
//            return 0;
//        }
    }
}
