package com.chapman.ftfcu.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chapman.ftfcu.model.User;
import com.chapman.ftfcu.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

	@Autowired 
	private UserRepository userRepository;
	
	private List<User> users = new ArrayList<>();

	UserController() {
		
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<User> getUsers() {
		LOG.warn("Getting users...");
		System.out.println("Getting users prnt...");
		return userRepository.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public User getUser(@PathVariable("id") Long id) {
		LOG.debug("Get user...");
		return this.users.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
	}

	@RequestMapping(method = RequestMethod.POST)
	public User saveUser(@RequestBody User user) {
		LOG.debug("Save user...");
		Long nextId = 0L;
		if (this.users.size() != 0) {
			User lastUser = this.users.stream().skip(this.users.size() - 1).findFirst().orElse(null);
			nextId = lastUser.getId() + 1;
		}

		user.setId(nextId);
		this.users.add(user);
		return user;

	}

	@RequestMapping(method = RequestMethod.PUT)
	public User updateUser(@RequestBody User user) {
		LOG.debug("Update user...");
		User modifiedUser = this.users.stream().filter(u -> u.getId() == user.getId()).findFirst().orElse(null);
		modifiedUser.setFirstName(user.getFirstName());
		modifiedUser.setLastName(user.getLastName());
		modifiedUser.setEmail(user.getEmail());
		return modifiedUser;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public boolean deleteUser(@PathVariable Long id) {
		LOG.debug("Delete user...");
		User deleteUser = this.users.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
		if (deleteUser != null) {
			this.users.remove(deleteUser);
			return true;
		} else  {
			return false;
		}


	}

}

