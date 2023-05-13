package com.resume.controller;

import com.resume.model.Role;
import com.resume.model.User;
import com.resume.model.UserRole;
import com.resume.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@CrossOrigin("*")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping("/")
    public User createUser(@RequestBody User user) throws Exception {

        //encoding password with bcryptPasswordEncoder

        user.setPassword(this.bCryptPasswordEncoder.encode(user.getPassword()));


        Set<UserRole> roles = new HashSet<>();

        Role role = new Role();
        role.setRoleName("Normal");
        role.setRoleId(45L);

        UserRole userRole = new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);

        roles.add(userRole);

        return this.userService.createUser(user,roles);

    }

    @GetMapping("/{userName}")
    public User getUser(@PathVariable("userName") String userName ){
        return this.userService.getUser(userName);

    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        this.userService.deleteUser(id);
    }

    @PutMapping("/{userName}")
    public User updateUser(  @PathVariable("userName") String userName, @RequestBody User user) throws Exception {
        return this.userService.updateUser(userName,user);
    }


}
