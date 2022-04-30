package com.tks.project.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tks.project.rest.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long>{

	 
}
