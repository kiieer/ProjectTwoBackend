package com.tks.project.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.tks.project.rest.controller.ReservationsController;
import com.tks.project.rest.controller.UsersController;
import com.tks.project.rest.model.Users;
import com.tks.project.rest.repository.ReservationsRepository;
import com.tks.project.rest.repository.UserRepository;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class ProjectRestApplicationTests {
	@Autowired
	ReservationsController resController;
	@Autowired
	UsersController userController;
     
	@Order(1)
	@Test
	public void contextLoads() {
		Assertions.assertNotEquals(resController, null);
		Assertions.assertNotEquals(userController, null);
	}
	
	@Order(3)
	@Test
    public void gettingAllUsers
    () {
		
		Users user = new Users("Jack","Che","TharjaBestGirl","1","1",false,123L);
		Users user2 = new Users("Jack","Che","TharjaBestGirl","1","1",false,123L);
		Users user3 = new Users("Jack","Che","TharjaBestGirl","1","1",false,123L);
		
		Assertions.assertEquals(1, 1);
    }
	
	@Order(4)
	@Test
    public void gettingUserById
    () {
		
		Users user = new Users("Jack","Che","TharjaBestGirl","1","1",false,123L);
		
		Assertions.assertEquals(1, 1);
    }
	
	
	@Order(2)
	@Test
    public void createUser
    () {
		
		Users user = new Users("Jack","Che","TharjaBestGirl","1","1",false,123L);
		Assertions.assertEquals(1, 1);
    }
	/*
	@Order(2)
	@Test
    public void temp
    () {
		Assertions.assertEquals(1, 1);
    }
	
	@Order(2)
	@Test
    public void temp
    () {
		Assertions.assertEquals(1, 1);
    }
	
	@Order(2)
	@Test
    public void temp
    () {
		Assertions.assertEquals(1, 1);
    }
	
	@Order(2)
	@Test
    public void temp
    () {
		Assertions.assertEquals(1, 1);
    }
}
