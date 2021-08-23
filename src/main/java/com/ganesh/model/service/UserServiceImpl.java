package com.ganesh.model.service;


import com.ganesh.bean.User;
import com.ganesh.model.persistence.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserByCredentials(User user) {
        System.out.println(user);
        User newUser = userDao.getUser(user.getUsername(), user.getPassword());
        System.out.println("---------------");
        System.out.println(newUser);
        return newUser;
    }

}