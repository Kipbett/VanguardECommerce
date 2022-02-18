package com.vanguard.repository;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;

import com.model.Users;
import com.mongodb.client.result.UpdateResult;

@Component
public class CustomUserRepositoryImpl implements CustomUserRepository {
	
	@Autowired
	MongoTemplate mongoTemplate;
	

	@Override
	public void updateUserEmail(int id, String Email) {
		org.springframework.data.mongodb.core.query.Query q = new org.springframework.data.mongodb.core.query.Query(Criteria.where("id").is(Email));
		Update update = new Update();
		update.set("id", Email);
		UpdateResult result = mongoTemplate.updateFirst(q, update, Users.class);
		
	}
}