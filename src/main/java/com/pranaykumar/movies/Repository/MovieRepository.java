package com.pranaykumar.movies.Repository;

import com.pranaykumar.movies.Model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    //Optional<Movie> findMovieById(ObjectId id);
    Optional<Movie> findMovieByImdbId(String imdbId);
}

// A repository is a mechanism for encapsulating storage, retrieval, and search behavior which emulates a collection of objects.
// It is the Data access layer for interaction with the database for DML operations like update, insert, delete, etc.