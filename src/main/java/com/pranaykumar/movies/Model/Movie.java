package com.pranaykumar.movies.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
//Annotate this class a Document. This will let the framework know that this class represent each document in the movies collection
@Data
//Instead of writing getters & setters, we can use @Data annotation from lombok. It takes care of all the getters & setters & toString methods.
@AllArgsConstructor //for creating a parameterized constructor
@NoArgsConstructor //for creating a parameterless constructor
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference
    private List<Review> reviewIds;
}
