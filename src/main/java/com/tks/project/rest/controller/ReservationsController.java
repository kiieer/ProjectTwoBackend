package com.tks.project.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tks.project.rest.model.Reservations;
import com.tks.project.rest.repository.ReservationsRepository;

@RestController
public class ReservationsController {

@Autowired
ReservationsRepository reservationRepository; 

@PostMapping("/reserve")
public Reservations createReservation (@RequestBody Reservations reserve) {
	return reservationRepository.save(reserve);
}

@GetMapping("/reserve")
public List<Reservations> getAllReservations () {
	return reservationRepository.findAll();
}
}
