package com.special.broccoli.tmdb.spring.boot.services;

import com.special.broccoli.tmdb.spring.boot.models.User;

import java.util.List;

public interface IUserService {

    List<User> getAllUsers();
    User saveUser(User user);
}

