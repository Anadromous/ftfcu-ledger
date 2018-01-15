package com.chapman.ftfcu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.chapman.ftfcu.model.User;
import com.chapman.ftfcu.service.UserService;

@SpringBootApplication
public class FtfcuLedgerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FtfcuLedgerApplication.class, args);
	}
	
	@Autowired
	private UserService userService;
	
	@Override
	public void run(String... args) throws Exception{
//		User user1 = new User();
//		user1.setFirstName("John");
//		user1.setLastName("Adams");
//		user1.setUsername("jadams");
//		user1.setEmail("jadams@gmail.com");
//		
//		userService.createUser(user1);
//		
//		User user2 = new User();
//		user2.setFirstName("John");
//		user2.setLastName("Admin");
//		user2.setUsername("jadmin");
//		user2.setEmail("jadmin@gmail.com");
//		
//		userService.createUser(user2);
		System.out.println("command line runner...");
		
	}
}
