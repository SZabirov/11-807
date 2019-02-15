package com.company.comare;

import java.util.Comparator;

public class PlayList {
    //массив упорядоченных треков
    AudioTrack[] listOfTracks;
    int n = 0;
    Comparator<AudioTrack> comparator;

    public PlayList(int size) {
        this.listOfTracks = new AudioTrack[size];
    }

    public PlayList(int size, Comparator<AudioTrack> comparator) {
        this(size);
        this.comparator = comparator;
    }

    //вставляет новый аудиотрек в нужное место согласно порядку
    public void add(AudioTrack track) {
        //если передали при создании PlayList компаратор,
        //то сравниваем с пом. компаратора, а если нет,
        //то сравниваем через compareTo();
        if (comparator == null) {
            for (int i = 0; i < n; i++) {
                if (track.compareTo(listOfTracks[i]) > 0) {
                    //....
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (comparator.compare(track, listOfTracks[i]) > 0) {
                    //....
                }
            }
        }
        n++;
    }
}
