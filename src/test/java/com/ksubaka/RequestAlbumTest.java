package com.ksubaka;

import com.ksubaka.album.Album;
import com.ksubaka.album.AlbumWrapper;
import com.ksubaka.album.Artist;
import com.ksubaka.album.RequestAlbum;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by davicres on 01/04/2016.
 */
public class RequestAlbumTest {

    private RequestAlbum requestAlbum = new RequestAlbum();
    ;
    private AlbumWrapper albumList = requestAlbum.call("back to black");
    ;

    @Test
    public void httpCallReturnsAlbumTitle() {
        for (Album album : albumList.getAlbums().getAlbumList()) {
            assertNotNull(album.getTitle());
        }
    }

    @Test
    public void httpCallReturnsAlbumYear() {
        for (Album album : albumList.getAlbums().getAlbumList()) {
            assertNotNull(album.getYear());
        }
    }

    @Test
    public void httpCallReturnsAlbumID() {
        for (Album album : albumList.getAlbums().getAlbumList()) {
            assertNotNull(album.getId());
        }
    }

    @Test
    public void httpCallReturnsAlbumArtist() {
        for (Album album : albumList.getAlbums().getAlbumList()) {
            for (Artist artist : album.getArtistList()) {
                assertNotNull(artist.getName());
            }
        }
    }


}
