package com.ksubaka;

import com.ksubaka.movie.Movie;
import com.ksubaka.movie.RequestMovie;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;

/**
 * Created by davicres on 01/04/2016.
 */
public class RequestMovieTest {

    private RequestMovie requestMovie = new RequestMovie();
    @SuppressWarnings("unchecked") // this is legal at execution time because I am injecting RequestMovie
    private List<Movie> movieList = (List<Movie>) requestMovie.call("Indiana Jones");

    @Test
    public void httpCallReturnMovieTitle() {
        for (Movie movie: movieList) {
            assertNotNull(movie.getTitle());
        }
    }

    @Test
    public void httpCallReturnMovieYear() {
        for (Movie movie: movieList) {
            assertNotNull(movie.getYear());
        }
    }

    @Test
    public void httpCallReturnMovieDirector() {
        for (Movie movie: movieList) {
            assertNotNull(movie.getDirector());
        }
    }
    @Test
    public void httpCallReturnMovieImdbID() {
        for (Movie movie: movieList) {
            assertNotNull(movie.getImdbID());
        }
    }

}
