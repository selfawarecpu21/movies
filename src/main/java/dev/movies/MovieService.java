package dev.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {


    @Autowired
    private MovieRepository moviesRepository;

    public List<Movie> allMovies(){
        return moviesRepository.findAll();
    }

    public Optional<Movie> singleMovie(ObjectId id){
        return moviesRepository.findById(id);
    }

}
