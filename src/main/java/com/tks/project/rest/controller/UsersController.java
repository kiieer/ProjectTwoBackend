package com.tks.project.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tks.project.rest.model.Users;
import com.tks.project.rest.repository.LoginRepository;
import com.tks.project.rest.repository.UserRepository;


@RestController
@CrossOrigin(origins = "*")
public class UsersController {


	@Autowired
	UserRepository userRepository;
	
	@Autowired
	LoginRepository loginRepository;
	
	@PostMapping("/user")
	public Users createUser (@RequestBody Users use) {
		return userRepository.save(use);
	}
	
	@GetMapping("/user")
	public List<Users> getAllUsers () {
		return userRepository.findAll();
	}
	
	@CrossOrigin(origins = "http://localhost:4200/")
	  @GetMapping("/user/{username}/{password}") public List<Users>
	  getUsersByName(@PathVariable("username") String username, @PathVariable("password") String password){ return
	  loginRepository.findUserByLogin(username, password); }
	 
}

