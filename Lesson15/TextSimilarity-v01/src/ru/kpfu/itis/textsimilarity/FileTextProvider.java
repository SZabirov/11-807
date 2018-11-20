package ru.kpfu.itis.textsimilarity;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class FileTextProvider implements TextProvider {
    //    Logger logger = new Logger();
    BetterLogger logger = BetterLogger.getInstance();

    protected File input;

    public FileTextProvider(File input) {
        this.input = input;
    }

    @Override
    public String getText() {
        StringBuilder sb = new StringBuilder();
        Scanner sc = null;
        try {
            sc = new Scanner(input);
            while (sc.hasNextLine()) {
                sb.append(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            logger.error("Файл не был найден");
            throw new IllegalArgumentException(e);
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
        return sb.toString();
    }
}
