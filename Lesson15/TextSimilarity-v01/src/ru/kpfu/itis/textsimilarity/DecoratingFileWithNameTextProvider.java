package ru.kpfu.itis.textsimilarity;

import java.io.File;

public class DecoratingFileWithNameTextProvider implements TextProvider {
    FileTextProvider fileTextProvider;

    public DecoratingFileWithNameTextProvider(File input) {
        this.fileTextProvider = new FileTextProvider(input);
    }

    public DecoratingFileWithNameTextProvider(FileTextProvider fileTextProvider) {
        this.fileTextProvider = fileTextProvider;
    }

    @Override
    public String getText() {
        return fileTextProvider.input.getName() + fileTextProvider.getText();
    }
}
