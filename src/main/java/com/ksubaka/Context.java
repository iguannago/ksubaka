package com.ksubaka;

import com.ksubaka.album.RequestAlbum;
import com.ksubaka.movie.RequestMovie;

import java.util.Collection;

/**
 * Created by davicres on 01/04/2016.
 */
public final class Context {
    private Request request;
    private String api = System.getProperty("api");

    public Context() {
        if (api.equals("imdb")) {
            request = new RequestMovie();
        }
        if (api.equals("spotify")) {
            request = new RequestAlbum();
        }
    }

    public Collection<? extends Item> doCall() {
        if (api.equals("imdb")) {
            return request.call(System.getProperty("movie"));
        }
        if (api.equals("spotify")) {
            return request.call(System.getProperty("album"));
        }
        return null;
    }
}
