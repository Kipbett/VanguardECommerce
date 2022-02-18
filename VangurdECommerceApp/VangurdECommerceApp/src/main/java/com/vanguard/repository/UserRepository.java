package com.vanguard.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;

import com.model.Users;

public interface UserRepository extends MongoRepository<Users, String> {
	
	@Query("{id:'?0'}")
	Users findUserById(int id);
	
	@Query("{id:'?0'}")
	List<Users> findAll(int id);
	
	public long count();
}
