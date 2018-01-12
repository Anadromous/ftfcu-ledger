package com.chapman.ftfcu.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chapman.ftfcu.model.User;
import com.chapman.ftfcu.repository.UserRepository;
import com.chapman.ftfcu.service.UserService;

/**
 * Created by pchapman@easystreet.net on Jan 12, 2018
 */

@Service
public class UserServiceImpl implements UserService {

	private static final Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private UserRepository userRepository;

	@Override
	public User createUser(User user) {
		User localUser = userRepository.findByUsername(user.getUsername());

		if (localUser != null) {
			LOG.info("User with username {} already exits. Nothing will be done. ", user.getUsername());
		}
		localUser = userRepository.save(user);
		return localUser;
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

}
