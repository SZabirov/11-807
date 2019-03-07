package com.company.generators;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class UsersIdGeneratorImpl implements IdGenerator {
    private String filename = "id_generator.txt";

    @Override
    public Long nextId() {
        try {
            Scanner sc = new Scanner(new File(filename));
            Long lastId = sc.nextLong();
            sc.close();
            Long nextId = lastId + 1;
            PrintWriter pw = new PrintWriter(new File(filename));
            pw.println(nextId);
            pw.close();
            return nextId;
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(
                    "file with name = " + filename + " not found"
            );
        }
    }
}



