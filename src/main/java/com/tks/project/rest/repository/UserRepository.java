package com.tks.project.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tks.project.rest.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long>{
}
