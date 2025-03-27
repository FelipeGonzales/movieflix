package com.felipegonzales.movieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipegonzales.movieflix.entities.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
