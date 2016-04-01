package com.ksubaka;

import org.junit.Test;
import org.springframework.http.HttpStatus;

import static org.junit.Assert.assertEquals;

/**
 * Created by davicres on 01/04/2016.
 */
public class RequestAlbumTest {
    @Test
    public void httpCallReturn200OK() {
        RequestAlbum requestAlbum = new RequestAlbum();
        HttpStatus httpStatus = requestAlbum.call("album");
        assertEquals(HttpStatus.OK, httpStatus);
    }
}
