package com.vanguard.user.VanguardUser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

//@ComponentScan("com.vanguard.user.VanguardUser.controller")
@SpringBootApplication
public class VanguardUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(VanguardUserApplication.class, args);
	}

}
