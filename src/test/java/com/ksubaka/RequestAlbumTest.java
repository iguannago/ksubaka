package com.ksubaka;

import com.ksubaka.album.AlbumWrapper;
import com.ksubaka.album.RequestAlbum;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by davicres on 01/04/2016.
 */
public class RequestAlbumTest {
    @Test
    public void httpCallReturnAlbumTitle() {
        RequestAlbum requestAlbum = new RequestAlbum();
        AlbumWrapper albumList = requestAlbum.call("back to Black");
        String albumTitle = albumList.getAlbums().getAlbumList().get(0).getTitle();
        System.out.println("albumTitle: " + albumTitle);
        assertNotNull(albumTitle);
    }
}
