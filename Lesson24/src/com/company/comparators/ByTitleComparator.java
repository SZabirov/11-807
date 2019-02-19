package com.company.comparators;

import java.util.Comparator;

public class ByTitleComparator implements Comparator<AudioTrack> {
    @Override
    public int compare(AudioTrack o1, AudioTrack o2) {
        String title1 = o1.getTitle();
        String title2 = o2.getTitle();
        int i = title1.compareTo(title2);
        return i;
    }
}
