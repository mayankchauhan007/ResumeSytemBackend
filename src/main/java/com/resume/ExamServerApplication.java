package com.resume;

import com.resume.model.Role;
import com.resume.model.User;
import com.resume.model.UserRole;
import com.resume.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamServerApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(ExamServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("STARTING_BACKEND");

//		User user = new User();
//
//		user.setUserName("mayank.chauhan");
//		user.setFirstName("Mayank");
//		user.setLastName("Chauhan");
//		user.setEmail("abc@gmail.com");
//		user.setPassword(this.bCryptPasswordEncoder.encode("Mayank@007"));
//
//		Role role1 = new Role();
//		role1.setRoleId(44L);
//		role1.setRoleName("ADMIN");
//
//		Set<UserRole> userRoleSet = new HashSet<>();
//		UserRole userRole = new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		userRoleSet.add(userRole);
//		User user1 = this.userService.createUser(user,userRoleSet);
//		System.out.println(user1.getUserName());

	}
}
