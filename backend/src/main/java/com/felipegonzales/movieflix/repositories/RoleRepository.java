package com.felipegonzales.movieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipegonzales.movieflix.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
