package com.ksubaka;

import com.ksubaka.movie.Movie;
import com.ksubaka.movie.MovieList;
import com.ksubaka.movie.RequestMovie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by davicres on 01/04/2016.
 */
public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    private void displayMovies(MovieList movieList) {
        for (Movie movie: movieList.getMovieList()) {
            log.info(movie.toString());
        }
    }

    public static void main(String[] args) {
        Application app = new Application();
        if (System.getProperty("api").equals("imdb")) {
            RequestMovie requestMovie = new RequestMovie();
            MovieList movieList = requestMovie.call((System.getProperty("movie")));
            app.displayMovies(movieList);
        }
    }

}
