package com.ksubaka;

import com.ksubaka.movie.Movie;
import com.ksubaka.movie.MovieList;
import com.ksubaka.movie.RequestMovie;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by davicres on 01/04/2016.
 */
public class RequestMovieTest {

    private RequestMovie requestMovie = new RequestMovie();
    private MovieList movieList = requestMovie.call("Indiana Jones");;

    @Test
    public void httpCallReturnMovieTitle() {
        for (Movie movie: movieList.getMovieList()) {
            assertNotNull(movie.getTitle());
        }
    }

    @Test
    public void httpCallReturnMovieYear() {
        for (Movie movie: movieList.getMovieList()) {
            assertNotNull(movie.getYear());
        }
    }

    @Test
    public void httpCallReturnMovieDirector() {
        for (Movie movie: movieList.getMovieList()) {
            assertNotNull(movie.getDirector());
        }
    }
    @Test
    public void httpCallReturnMovieImdbID() {
        for (Movie movie: movieList.getMovieList()) {
            assertNotNull(movie.getImdbID());
        }
    }

}
