package com.vanguard.VangurdECommerceApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.model.Users;
import com.vanguard.repository.CustomUserRepository;
import com.vanguard.repository.UserRepository;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = UserRepository.class)
public class VangurdECommerceAppApplication {
	
	@Autowired
	UserRepository userRep;
	
	@Autowired
	CustomUserRepository customUser;

	public static void main(String[] args) {
		SpringApplication.run(VangurdECommerceAppApplication.class, args);
	}
	
	void createUser() {
		userRep.save(null);
	}
	
	public void showAllUsers() {
		userRep.findAll().forEach(null);
	}
	
	public void getUserByID(int id) {
		Users us = userRep.findUserById(id);
	}
	
	public String getUserDetails(Users user) {
		
		return "UserName:"+user.getName()+" User ID: "+user.getId()+" User Email: "+user.getEmail();
	}
	
	public void updateUserPassword(int id) {
		List<Users> user = userRep.findAll(id);
		user.forEach(u ->{
			u.setPassword(null);
		});
		
		List<Users> updateUser = userRep.saveAll(user);
		
		if (updateUser != null) {
			System.out.println("UserPasswordUpdated Succesfully");
		}
	}
	
	public void deleteUser(int id) {
		userRep.deleteById(null);
	}
	
	public void updateUserEmail(int id, String email) {
		customUser.updateUserEmail(id, email);
	}

}
