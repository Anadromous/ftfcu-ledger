package com.chapman.ftfcu.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.chapman.ftfcu.model.User;

/**
 * Created by pchapman@easystreet.net on Jan 12, 2018
 *
 */
@Component
public interface UserRepository extends CrudRepository<User, Long> {

	User findByUsername(String username);
	User findByEmail(String email);
	List<User> findAll();	
}
