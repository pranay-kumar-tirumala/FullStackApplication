package com.pranaykumar.movies.Service;

import com.pranaykumar.movies.Model.Movie;
import com.pranaykumar.movies.Repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }
//    public Optional<Movie> singleMovie(ObjectId id){
//        return movieRepository.findMovieById(id);
//    }
    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}

//Service is where all the business logic resides.