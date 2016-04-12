package com.ksubaka;

import com.ksubaka.album.AlbumWrapper;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by davicres on 12/04/2016.
 */
public class HttpCallTest {
    @Test
    public void httpCallGetObjectForAlbumTest() {
        String album = "back to black";
        String endpoint = "https://api.spotify.com/v1/search?q=" + album +
                "&type=album&market=US";
        HttpCall httCall = new HttpCall(endpoint, AlbumWrapper.class);
        Response response = httCall.getResponse();
        System.out.println("response: " + response);
        assertTrue(response.getClass().equals(AlbumWrapper.class));
    }
}
