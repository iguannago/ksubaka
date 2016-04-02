package com.ksubaka;

import com.ksubaka.movie.RequestMovie;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertNotNull;

/**
 * Created by davicres on 01/04/2016.
 */
public class RequestMovieTest {

    private RequestMovie requestMovie = new RequestMovie();
    private Collection<? extends Item> movieList = requestMovie.call("Indiana Jones");

    @Test
    public void httpCallReturnMovieTitle() {
        for (Item movie: movieList) {
            assertNotNull(movie.getTitle());
        }
    }

    @Test
    public void httpCallReturnMovieYear() {
        for (Item movie: movieList) {
            assertNotNull(movie.getYear());
        }
    }

    @Test
    public void httpCallReturnMovieDirector() {
        for (Item movie: movieList) {
            assertNotNull(movie.getDirector());
        }
    }
    @Test
    public void httpCallReturnMovieImdbID() {
        for (Item movie: movieList) {
            assertNotNull(movie.getImdbID());
        }
    }

}
