package com.vanguardECommerce.VanguardItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.vanguardECommerce.VanguardItem.Item.Item;

@SpringBootApplication
public class VanguardItemApplication implements CommandLineRunner{
	
	@Autowired
	private MongoTemplate mongoTemplate;

	public static void main(String[] args) {
		SpringApplication.run(VanguardItemApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		System.out.println("Connected SucessFully");
		
		Item item = new Item(123456, "Jacket", "Best For the cold", "S001", 2, 250, 300);
		mongoTemplate.insert(item);
	}

}
