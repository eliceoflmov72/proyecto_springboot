package com.eliceo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eliceo.model.User;

@RestController
public class UserController {
	
	@PostMapping
	public User createUser(@RequestBody User user) {
		return user;
	}
}
