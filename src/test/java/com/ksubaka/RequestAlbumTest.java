package com.ksubaka;

import com.ksubaka.album.Artist;
import com.ksubaka.album.RequestAlbum;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertNotNull;

/**
 * Created by davicres on 01/04/2016.
 */
public class RequestAlbumTest {

    private RequestAlbum requestAlbum = new RequestAlbum();
    private Collection<? extends Item> albums = requestAlbum.call("back to black");

    @Test
    public void httpCallReturnsAlbumTitle() {
        for (Item album : albums) {
            assertNotNull(album.getTitle());
        }
    }

    @Test
    public void httpCallReturnsAlbumYear() {
        for (Item album : albums) {
            assertNotNull(album.getYear());
        }
    }

    @Test
    public void httpCallReturnsAlbumID() {
        for (Item album : albums) {
            assertNotNull(album.getId());
        }
    }

    @Test
    public void httpCallReturnsAlbumArtist() {
        for (Item album : albums) {
            for (Artist artist : album.getArtistList()) {
                assertNotNull(artist.getName());
            }
        }
    }


}
