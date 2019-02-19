package com.company.comparators;

public class AudioTrack implements Comparable<AudioTrack> {
    private int duration;
    private String title;
    private String author;

    public AudioTrack(int duration, String title, String author) {
        this.duration = duration;
        this.title = title;
        this.author = author;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public int compareTo(AudioTrack o) {
        return duration - o.duration;
    }

    @Override
    public String toString() {
        return "AudioTrack{" +
                "duration=" + duration +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}