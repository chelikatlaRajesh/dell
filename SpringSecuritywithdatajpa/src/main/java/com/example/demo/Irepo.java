package com.example.demo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Irepo  extends JpaRepository<user, Integer>{

	
	@Query("select u from user u where u.username=?1")
	public abstract Optional<user>findbyusername(String username);
}
