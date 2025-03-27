package com.felipegonzales.movieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipegonzales.movieflix.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
