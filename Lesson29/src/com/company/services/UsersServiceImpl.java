package com.company.services;

import com.company.dao.UsersDao;
import com.company.dao.UsersDaoTextFileImpl;
import com.company.models.User;

public class UsersServiceImpl implements UsersService {
    private UsersDao usersDao;

    public UsersServiceImpl() {
        this.usersDao = new UsersDaoTextFileImpl();
    }

    @Override
    public User signUp(User user) {
        if (user.getPassword().length() < 8) {
            throw new IllegalArgumentException(
                    "Password should not be shorter than 8 symbols");
        }
        return usersDao.save(user);
    }

    @Override
    public void signIn(User user) {

    }
}
