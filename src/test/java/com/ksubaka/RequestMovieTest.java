package com.ksubaka;

import org.junit.Test;
import org.springframework.http.HttpStatus;

import static org.junit.Assert.assertEquals;

/**
 * Created by davicres on 01/04/2016.
 */
public class RequestMovieTest {
    @Test
    public void httpCallReturn200OK() {
        RequestMovie requestMovie = new RequestMovie();
        HttpStatus httpStatus = requestMovie.call("Indian Jones");
        assertEquals(HttpStatus.OK, httpStatus);
    }
}
