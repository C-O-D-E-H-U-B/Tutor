package com.codehub.tutor.core.service.impl;

import com.codehub.tutor.core.dao.UserDAO;
import com.codehub.tutor.core.model.User;
import com.codehub.tutor.core.service.api.UserServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserServiceAPI {
    @Autowired
    private UserDAO userDAO;

    @Override
    public List<User> getAllUsers() {
        return userDAO.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userDAO.findById(id).orElse(new User());
    }

    @Override
    public User updateUserById(User user) {
        return userDAO.save(user);
    }

    @Override
    public void deleteUserById(User user) {
        userDAO.delete(user);
    }

    @Override
    public User addUser(User user) {
        return userDAO.save(user);
    }
}