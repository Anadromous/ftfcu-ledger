package com.chapman.ftfcu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chapman.ftfcu.model.User;

/**
 * Created by pchapman@easystreet.net on Jan 12, 2018
 */

@Service
public interface UserService {

	List<User> findAll();
	User createUser(User user);
}
