package com.felipegonzales.movieflix.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.felipegonzales.movieflix.entities.Genre;
import com.felipegonzales.movieflix.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
	@Query("SELECT obj FROM Movie obj WHERE :genre IS NULL OR obj.genre = :genre")
	Page<Movie> find(Genre genre, Pageable pageable);

}
