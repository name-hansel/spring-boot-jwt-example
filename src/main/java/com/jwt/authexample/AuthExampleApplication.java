package com.jwt.authexample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.jwt.authexample.entity.User;
import com.jwt.authexample.service.UserService;

@SpringBootApplication
public class AuthExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthExampleApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	CommandLineRunner run(UserService userService) {
		return args -> {
			userService.saveUser(new User(null, "Snehal", "snehalmane", "password123"));
		};
	}

}
