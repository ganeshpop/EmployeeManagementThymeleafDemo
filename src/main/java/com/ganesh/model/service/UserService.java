package com.ganesh.model.service;

import com.ganesh.bean.User;

public interface UserService {

    User getUserByCredentials(User user);
}