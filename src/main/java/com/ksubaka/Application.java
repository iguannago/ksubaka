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
        Request request;
        if (System.getProperty("api").equals("imdb")) {
            title = System.getProperty("movie");
            request = new RequestMovie();
            MovieList movieList = (MovieList) request.call(title);
            app.display(movieList.getMovieList());
        }
        if (System.getProperty("api").equals("spotify")) {
            title = System.getProperty("album");
            request = new RequestAlbum();
            AlbumWrapper albums = (AlbumWrapper) request.call(title);
            app.display(albums.getAlbums().getAlbumList());
        }
    }

}
