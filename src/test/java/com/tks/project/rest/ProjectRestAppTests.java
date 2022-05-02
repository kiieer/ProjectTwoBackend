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
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.tks.project.rest.controller.ReservationsController;
import com.tks.project.rest.controller.UsersController;
import com.tks.project.rest.model.Users;
import com.tks.project.rest.repository.ReservationsRepository;
import com.tks.project.rest.repository.UserRepository;

@ExtendWith(SpringExtension.class)
@WebMvcTest(ReservationsController.class)
public class ProjectRestAppTests {
	//@MockBean
    //UserRepository userRepository;
	@Autowired
	ReservationsController resController;
	@Autowired
	UsersController userController;
	//@Autowired
	//private MockMvc mockMvc;
	
	@Test
    public void contextLoads() {
		Assertions.assertEquals(1, 1);
    }
	
	/*@MockBean
    ReservationsRepository resRepository;
	@MockBean
    UserRepository userRepository;
	
	@Order(2)
	@Test
    public void testfindAll() throws Exception {
        Users user = new Users("Jack" , "Che" , "TharjaBestGirl", "123456" , "j@k.com" , false, 1234567890L);
        List<Users> users = Arrays.asList(user);

        Mockito.when(userRepository.findAll()).thenReturn(users);

        mockMvc.perform(get("/api/v1/Users"))
                .andExpect(status().isOk())
                //.andExpect(jsonPath("$", Matchers.hasSize(1)))
                //.andExpect(jsonPath("$[0].firstname", Matchers.is("Jack")))
                ;
    }
	*/
}