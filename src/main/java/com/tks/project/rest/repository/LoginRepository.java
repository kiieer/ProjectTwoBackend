package com.tks.project.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.tks.project.rest.model.FilteredReservations;
import com.tks.project.rest.model.Reservations;
import com.tks.project.rest.model.Users;

@CrossOrigin(origins = "http://localhost:4200/")
public interface LoginRepository extends JpaRepository<Users, Long> {

	  @Query("select e from Users e where e.username = :username and e.password = :password") List<Users>
	  findUserByLogin(@Param("username") String userName, @Param("password") String password);
	
	  @Query(value="select e.user_id from Users e where e.username = :username and e.password = :password", nativeQuery = true) Long
	  findUserIdByLogin(@Param("username") String userName, @Param("password") String password);
	  	  
//	  @Query("select new com.tks.project.rest.model.FilteredReservations(e.checkinDate, e.checkoutDate, e.reservationNo) from Reservations e where e.users.id = :id") List<FilteredReservations>
//	  findReservationsById(@Param("id") Long id);
	  @Query("select e from Reservations e where e.users.id= :id") List<Reservations>
	  findReservationsById(@Param("id") Long id);
}
