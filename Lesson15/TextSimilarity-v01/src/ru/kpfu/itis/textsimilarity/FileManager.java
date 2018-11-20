package ru.kpfu.itis.textsimilarity;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    List<File> getAllFiles(File f) {
        List<File> allFiles = new ArrayList<>();
        if (f.isFile()) {
            allFiles.add(f);
        } else {
            File[] filesFromFolder = f.listFiles();
            for (File element : filesFromFolder) {
                allFiles.addAll(getAllFiles(element));
            }
        }
        return allFiles;
    }
}





