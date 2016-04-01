package com.ksubaka;

import com.ksubaka.album.AlbumWrapper;
import com.ksubaka.album.RequestAlbum;
import com.ksubaka.movie.MovieList;
import com.ksubaka.movie.RequestMovie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

/**
 * Created by davicres on 01/04/2016.
 */
public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    private void display(Collection<? extends Item> items) {
        for (Item item : items) {
            log.info(item.toString());
        }
    }

    public static void main(String[] args) {
        Application app = new Application();
        String title;
        if (System.getProperty("api").equals("imdb")) {
            title = System.getProperty("movie");
            RequestMovie requestMovie = new RequestMovie();
            MovieList movie = requestMovie.call(title);
            app.display(movie.getMovieList());
        }
        if (System.getProperty("api").equals("spotify")) {
            title = System.getProperty("album");
            RequestAlbum requestAlbum = new RequestAlbum();
            AlbumWrapper albums = requestAlbum.call(title);
            app.display(albums.getAlbums().getAlbumList());
        }
    }

}
