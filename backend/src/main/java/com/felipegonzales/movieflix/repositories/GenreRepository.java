package com.felipegonzales.movieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipegonzales.movieflix.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
