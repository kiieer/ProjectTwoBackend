package com.tks.project.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tks.project.rest.model.Reservations;

@Repository
public interface ReservationsRepository extends JpaRepository <Reservations, Long>{

}
