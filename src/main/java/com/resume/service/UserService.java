package com.resume.service;

import com.resume.model.User;
import com.resume.model.UserRole;

import java.util.Set;

public interface UserService {

    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

    public User getUser(String userName);

    public void deleteUser(Long id);

    public User updateUser(String userName, User user) throws Exception;
}
