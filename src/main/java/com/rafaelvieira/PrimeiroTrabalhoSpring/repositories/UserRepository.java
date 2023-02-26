package com.rafaelvieira.PrimeiroTrabalhoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelvieira.PrimeiroTrabalhoSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
