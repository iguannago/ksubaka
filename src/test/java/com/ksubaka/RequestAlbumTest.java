package com.ksubaka;

import com.ksubaka.album.AlbumWrapper;
import com.ksubaka.album.RequestAlbum;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by davicres on 01/04/2016.
 */
public class RequestAlbumTest {

    private RequestAlbum requestAlbum = new RequestAlbum();;
    private AlbumWrapper albumList = requestAlbum.call("back to black");;

    @Test
    public void httpCallReturnsAlbumTitle() {
        String albumTitle = albumList.getAlbums().getAlbumList().get(0).getTitle();
        System.out.println("albumTitle: " + albumTitle);
        assertNotNull(albumTitle);
    }

    @Test@Ignore
    public void httpCallReturnsAlbumYear() {
        String albumYear = albumList.getAlbums().getAlbumList().get(0).getYear();
        System.out.println("albumYear: " + albumYear);
        assertNotNull(albumYear);
    }

    @Test
    public void httpCallReturnsAlbumID() {
        String albumId = albumList.getAlbums().getAlbumList().get(0).getId();
        System.out.println("albumId: " + albumId);
        assertNotNull(albumId);
    }


}
