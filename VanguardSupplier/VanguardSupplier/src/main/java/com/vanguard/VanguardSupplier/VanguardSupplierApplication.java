package com.vanguard.VanguardSupplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.vanguard.VanguardSupplier.Supplier.Supplier;

@SpringBootApplication
public class VanguardSupplierApplication implements CommandLineRunner{
	
	@Autowired
	private MongoTemplate mongoTemplate;

	public static void main(String[] args) {
		SpringApplication.run(VanguardSupplierApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		System.out.println("--------------------"+mongoTemplate.getCollectionNames());
		
		Supplier suppliers = new Supplier("S002", "Bansi", "1234 India", "bansi@gmail.com");
		mongoTemplate.insert(suppliers);
		System.out.println("Inserted Successfully");
	}

}
