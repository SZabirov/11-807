package com.company.tracks;

public class PlayList {
    //массив упорядоченных треков
    AudioTrack[] listOfTracks;
    int n = 0;

    public PlayList(int size) {
        this.listOfTracks = new AudioTrack[size];
    }

    //вставляет новый аудиотрек в нужное место согласно порядку
    public void add(AudioTrack track) {
        for (int i = 0; i < n; i++) {
            if (track.compareTo(listOfTracks[i]) < 0) {

            }
        }
        n++;
    }
}
