package com.vanguard.user.VanguardUser.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vanguard.user.VanguardUser.poj.UserPojo;

@RestController
public class RegUser {
	
	@GetMapping("/reg")
	String regUser() {
		return "Hello User";
	}
	
	@PostMapping("/user/reg")
	public ResponseEntity<Void> createUser(@Validated @RequestBody UserPojo user) {
		return null;
		
	}
	
	@GetMapping("/allUsers")
	public List<UserPojo> getAllUsers(){
		return null;
		
	}
	
	@DeleteMapping("/user/delete-user/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id") long id) {
		return new ResponseEntity<>("User Deleted Successfully", HttpStatus.OK);
		
	}
	
}
