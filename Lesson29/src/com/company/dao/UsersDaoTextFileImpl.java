package com.company.dao;

import com.company.generators.IdGenerator;
import com.company.generators.UsersIdGeneratorImpl;
import com.company.models.User;

import java.io.*;

public class UsersDaoTextFileImpl implements UsersDao {
    private String filename;
    private IdGenerator generator;

    public UsersDaoTextFileImpl() {
        this.filename = "users_data.txt";
        this.generator = new UsersIdGeneratorImpl();
    }

    @Override
    public User save(User model) {
        try {
            File f = new File(filename);
            OutputStream os = new FileOutputStream(f, true);
            PrintWriter pw = new PrintWriter(os);
            Long id = generator.nextId();
            pw.println(id + " " + model.getNickname() + " " +
                    model.getPassword());
            pw.close();
            model.setId(id);
            return model;
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(
                    "File with name " + filename + " not found"
            );
        }
    }

    @Override
    public User find(Long id) {
        return null;
    }

    @Override
    public void update(User model) {

    }

    @Override
    public void delete(Long id) {

    }
}
