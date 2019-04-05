package com.company.annotationexample;

public class NotepadImpl implements Notepad {

    public NotepadImpl() {
    }

    @Override
    public void addNote(String note) {
        System.out.println(System.nanoTime() + " " + note);
    }
}
