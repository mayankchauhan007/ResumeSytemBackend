package com.resume.service.impl;

import com.resume.model.User;
import com.resume.model.UserRole;
import com.resume.repo.RoleRepository;
import com.resume.repo.UserRepository;
import com.resume.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {
        User local = this.userRepository.findByUserName(user.getUserName());
        if(local!=null){
            System.out.println("User is already present !!");
            throw new Exception("User is already present !!");

        }
        else {
            //create user
            for (UserRole ur : userRoles){
                roleRepository.save(ur.getRole());

            }
            user.getUserRoles().addAll(userRoles);
            local = this.userRepository.save(user);

        }
        return local;
    }
    @Override
    public User getUser(String userName) {
        return this.userRepository.findByUserName(userName);

    }

    @Override
    public void deleteUser(Long id) {
        this.userRepository.deleteById(id);
    }

    @Override
    public User updateUser(String userName, User user) throws Exception {
        User presentUser = this.userRepository.findByUserName(userName);
        if(presentUser==null){
            System.out.println("User is not there !!");
            throw new Exception("User with given username is not present !!");
        }
        else {
            presentUser.setUserName(user.getUserName());
            presentUser.setPassword(user.getPassword());
            presentUser.setEmail(user.getEmail());
            presentUser.setFirstName(user.getFirstName());
            presentUser.setLastName(user.getLastName());
            presentUser = this.userRepository.save(presentUser);
        }
        return presentUser;
    }

}
