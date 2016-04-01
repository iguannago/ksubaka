package com.ksubaka;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by davicres on 01/04/2016.
 */
public class RequestMovieTest {

    private RequestMovie requestMovie = new RequestMovie();
    private MovieList movieList = requestMovie.call("Indiana Jones");;

    @Test
    public void httpCallReturnMovieTitle() {
        String movieTitle = movieList.getMovieList().get(0).getTitle();
        assertNotNull(movieTitle);
        assertNotEquals("", movieTitle);
        System.out.println("movieTitle: " + movieTitle);
    }

    @Test
    public void httpCallReturnMovieYear() {
        String movieYear = movieList.getMovieList().get(0).getYear();
        assertNotNull(movieYear);
        assertNotEquals("", movieYear);
        System.out.println("movieYear: " + movieYear);
    }

    @Test
    public void httpCallReturnMovieDirector() {
        String movieDirector = movieList.getMovieList().get(0).getDirector();
        assertNotNull(movieDirector);
        assertNotEquals("", movieDirector);
        System.out.println("movieDirector: " + movieDirector);
    }
    @Test
    public void httpCallReturnMovieImdbID() {
        String movieImdbID = movieList.getMovieList().get(0).getImdbID();
        assertNotNull(movieImdbID);
        assertNotEquals("", movieImdbID);
        System.out.println("movieImdbID: " + movieImdbID);
    }

}
