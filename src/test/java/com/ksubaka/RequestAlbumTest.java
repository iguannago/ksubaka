package com.ksubaka;

import com.ksubaka.album.Album;
import com.ksubaka.album.Artist;
import com.ksubaka.album.RequestAlbum;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertNotNull;

/**
 * Created by davicres on 01/04/2016.
 */
public class RequestAlbumTest {

    private RequestAlbum requestAlbum = new RequestAlbum();
    private ArrayList<Album> albums = (ArrayList<Album>) requestAlbum.call("back to black");

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
