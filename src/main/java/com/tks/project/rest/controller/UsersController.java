package com.tks.project.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tks.project.rest.model.Users;
import com.tks.project.rest.repository.LoginRepository;
import com.tks.project.rest.repository.UserRepository;
import com.tks.project.rest.services.UserServiceImp;


@RestController
@CrossOrigin(origins = "*")
public class UsersController {


	@Autowired
	UserRepository userRepository;
	
	@Autowired
	LoginRepository loginRepository;
	
	@Autowired
    private UserServiceImp userServiceImp;

    @PostMapping("/forgot-password")
    public String forgotPassword(@RequestParam (defaultValue = "unknown") String email) {

        String response = userServiceImp.forgotPassword(email);

        if (!response.startsWith("Invalid")) {
            response = "http://localhost:8081/reset-password?token=" + response;
        }
        return response;
    }

    @PutMapping("/reset-password")
    public String resetPassword(@RequestParam String token,
            @RequestParam (defaultValue= "unknown") String password) {
        System.out.println(token);
        System.out.println(password);
        return userServiceImp.resetPassword(token, password);
    }

	
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
	
	@CrossOrigin(origins = "http://localhost:4200/")
	  @GetMapping("/id/{username}/{password}") public Long
	  getUsersById(@PathVariable("username") String username, @PathVariable("password") String password){ return
	  loginRepository.findUserIdByLogin(username, password); }
	 
}

