package com.example.cloudcomputing.controller;

import com.example.cloudcomputing.model.Movie;
import com.example.cloudcomputing.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/movie")
@CrossOrigin
public class MovieController {
    private MovieRepository movieRepository;

    @Autowired
    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Movie>> getMovies() { return ResponseEntity.ok(movieRepository.findAll()); }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
        movie = movieRepository.save(movie);

        return ResponseEntity.ok(movie);
    }

    @Autowired
    public void setMovieRepository(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
}
