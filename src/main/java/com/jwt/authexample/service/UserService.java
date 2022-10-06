package com.jwt.authexample.service;

import java.util.List;

import com.jwt.authexample.entity.User;

public interface UserService {
	User saveUser(User user);

	User getUser(String username);

	List<User> getUsers();
}
