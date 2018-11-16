package ru.kpfu.itis.exceptionsexcerpts.notes.interfaceimpl;

import ru.kpfu.itis.exceptionsexcerpts.notes.simple.NoteNotExistsException;

public class MyNotes implements Notebook {
    private String[] notes;
    private int count;

    public MyNotes(int maxCapacity) {
        notes = new String[maxCapacity];
        count = 0;
    }

    @Override
    public void setNote(int id, String text) {
        notes[id] = text;
    }

    @Override
    public String getNote(int id) {
        if (id >= notes.length || id < 0) {
            throw new IllegalArgumentException("Такой заметки с номером " + id + " нет");
        }
        return notes[id];
    }

    @Override
    public void addNote(String text) {
        notes[count] = text;
        count++;
    }
}
