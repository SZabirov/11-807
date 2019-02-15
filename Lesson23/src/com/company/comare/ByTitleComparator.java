package com.company.comare;

import java.util.Comparator;

public class ByTitleComparator implements Comparator<AudioTrack> {
    @Override
    public int compare(AudioTrack o1, AudioTrack o2) {
        String title1 = o1.getTitle();
        String title2 = o2.getTitle();

        return title1.compareTo(title2);
    }
}
