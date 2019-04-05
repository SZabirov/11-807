package com.company.annotationexample;

public class MyNotepadUser {
    @InjectImpl
    private Notepad notepad;

    private String userName;

    public MyNotepadUser(String userName) {
        this.userName = userName;
    }

    public void writeSomething(int count) {
        for (int i = 0; i < count; i++) {
            notepad.addNote("My note");
        }
    }
}
