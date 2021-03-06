package com.tks.project.rest.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tks.project.rest.model.FilteredReservations;
import com.tks.project.rest.model.Reservations;
import com.tks.project.rest.model.Users;
import com.tks.project.rest.repository.LoginRepository;
import com.tks.project.rest.repository.ReservationsRepository;
import com.tks.project.rest.repository.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class ReservationsController {

@Autowired
ReservationsRepository reservationRepository; 

@Autowired
UserRepository userRepository; 

@Autowired
LoginRepository loginRepository; 


//@PostMapping("/reserve")
//public Reservations createReservation (@RequestBody Reservations reserve) {
//	return reservationRepository.save(reserve);
//}

@PostMapping("/post/{userId}/reserve")
public void createReservation(@PathVariable("userId") Long userId, @RequestBody Reservations reserve) {
	System.out.println(userId);
	System.out.println(reserve);
	Users users = userRepository.getById(userId);
	System.out.println(users);
	reserve.setUsers(users);
	users.getReservations().add(reserve);
	reservationRepository.save(reserve);
}

@GetMapping("/reserve")
public List<Reservations> getAllReservations () {
	return reservationRepository.findAll();
}
	
	@CrossOrigin(origins = "http://localhost:4200/")
	  @GetMapping("/reserve/{id}") public List<Reservations>
	  getReservationsById(@PathVariable("id") Long id){ return
	  loginRepository.findReservationsById(id); }

}
