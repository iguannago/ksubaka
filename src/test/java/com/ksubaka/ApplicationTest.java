package com.ksubaka;

import org.junit.Test;

/**
 * Created by davicres on 01/04/2016.
 */
public class ApplicationTest {

    @Test
    public void requestMovieApiTest() {
        System.setProperty("api", "imdb");
        System.setProperty("movie", "Indiana Jones");
        Application.main(null);
    }

    @Test
    public void requestAlbumApiTest() {
        System.setProperty("api", "spotify");
        System.setProperty("album", "back to black");
        Application.main(null);
    }

}
