package ru.kpfu.itis.textsimilarity;

import java.io.File;

//добавление нового функционала посредством порождения подкласса
public class FileWithNameTextProvider extends FileTextProvider {

    public FileWithNameTextProvider(File input) {
        super(input);
    }

    @Override
    public String getText() {
        return input.getName() + " " + super.getText();
    }
}
