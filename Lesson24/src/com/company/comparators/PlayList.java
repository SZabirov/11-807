package com.company.comparators;

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
        //то сравниваем через comparator
        int c = 0;
        if (comparator == null) {
            while (c < n && listOfTracks[c].compareTo(track) < 0) {
                c++;
            }
        } else {
            while (c < n &&
                    comparator.compare(listOfTracks[c], track) < 0) {
                c++;
            }
        }
        //выполняем сдвиг
        for (int i = n - 1; i >= c; i--) {
            listOfTracks[i + 1] = listOfTracks[i];
        }
        //вставляем на нужное место
        listOfTracks[c] = track;
        n++;
    }

    public void show() {
        for (int i = 0; i < n; i++) {
            System.out.println(listOfTracks[i]);
        }
    }
}
