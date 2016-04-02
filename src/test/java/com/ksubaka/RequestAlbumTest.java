package com.ksubaka;

import com.ksubaka.album.Album;
import com.ksubaka.album.Artist;
import com.ksubaka.album.RequestAlbum;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;

/**
 * Created by davicres on 01/04/2016.
 */
public class RequestAlbumTest {

    private RequestAlbum requestAlbum = new RequestAlbum();
    @SuppressWarnings("unchecked") // this is legal at execution time because I am injecting RequestAlbum
    private List<Album> albums = (List<Album>) requestAlbum.call("back to black");

    @Test
    public void httpCallReturnsAlbumTitle() {
        for (Album album : albums) {
            assertNotNull(album.getTitle());
        }
    }

    @Test
    public void httpCallReturnsAlbumYear() {
        for (Album album : albums) {
            assertNotNull(album.getYear());
        }
    }

    @Test
    public void httpCallReturnsAlbumID() {
        for (Album album : albums) {
            assertNotNull(album.getId());
        }
    }

    @Test
    public void httpCallReturnsAlbumArtist() {
        for (Album album : albums) {
            for (Artist artist : album.getArtistList()) {
                assertNotNull(artist.getName());
            }
        }
    }


}
