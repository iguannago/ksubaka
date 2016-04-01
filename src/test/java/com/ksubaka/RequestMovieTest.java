package com.ksubaka;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by davicres on 01/04/2016.
 */
public class RequestMovieTest {
    @Test
    public void httpCallReturnMovieTitle() {
        RequestMovie requestMovie = new RequestMovie();
        MovieList movieList = requestMovie.call("Indian Jones");
        String movieTitle = movieList.getMovieList().get(0).getTitle();
        assertNotNull(movieTitle);
        assertNotEquals("", movieTitle);
        System.out.println("movieTitle: " + movieTitle);
    }

}
