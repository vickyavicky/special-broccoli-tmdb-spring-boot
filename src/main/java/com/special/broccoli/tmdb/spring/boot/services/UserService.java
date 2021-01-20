package com.special.broccoli.tmdb.spring.boot.services;

import com.special.broccoli.tmdb.spring.boot.models.User;
import com.special.broccoli.tmdb.spring.boot.repositories.IUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{

    private final IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        userRepository.save(user);
        return user;
    }

}
