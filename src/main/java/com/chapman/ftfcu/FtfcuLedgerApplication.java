package com.chapman.ftfcu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.chapman.ftfcu.model.User;
import com.chapman.ftfcu.service.UserService;

@SpringBootApplication
@ComponentScan
public class FtfcuLedgerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FtfcuLedgerApplication.class, args);
	}
	
	/*private final UserService userService;
	
	@Autowired
	public FtfcuLedgerApplication(UserService userService) {
		this.userService = userService;
	}*/
	
	@Override
	public void run(String... args) throws Exception{
		/*User user1 = new User();
		user1.setFirstName("John");
		user1.setLastName("Adams");
		user1.setUsername("jadams");
		user1.setEmail("jadams@gmail.com");
		
		userService.createUser(user1);
		
		User user2 = new User();
		user2.setFirstName("Amy");
		user2.setLastName("Admin");
		user2.setUsername("jadmin");
		user2.setEmail("admin@gmail.com");
		
		userService.createUser(user2);*/
		System.out.println("command line runner...");
		
	}
}
