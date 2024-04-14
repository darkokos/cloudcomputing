package com.example.cloudcomputing.repository;

import com.example.cloudcomputing.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
