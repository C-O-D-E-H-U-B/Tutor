package com.codehub.tutor.core.service.api;

import com.codehub.tutor.core.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserServiceAPI {

    /**
     * Get all users
     * @return all users
     */
    List<User> getAllUsers();

    /**
     * Get user by id
     * @param id user id
     * @return use
     */
    User getUserById(Long id);

    /**
     * Update user by id
     * @param id user id
     * @return updated user
     */
    User updateUserById(Long id);

    /**
     * Delete User by user
     * @param id user id
     * @return deleted user
     */
    User deleteUserById(Long id);

    /**
     * Add user
     * @param user user
     * @return added user
     */
    User addUser(User user);
}
