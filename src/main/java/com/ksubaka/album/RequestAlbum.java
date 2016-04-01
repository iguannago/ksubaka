package com.ksubaka.album;

import com.ksubaka.Request;
import org.springframework.web.client.RestTemplate;

/**
 * Created by davicres on 01/04/2016.
 */
public class RequestAlbum implements Request<AlbumWrapper> {

    private RestTemplate restTemplate = new RestTemplate();

    public AlbumWrapper call(String title) {
        AlbumWrapper albumList = doHttpCallToRetrieveAlbumsByTitle(title);
        doHttpCallToRetrieveAlbumYearsAndArtists(albumList);
        return albumList;
    }

    private void doHttpCallToRetrieveAlbumYearsAndArtists(AlbumWrapper albumList) {
        for (int i = 0; i < albumList.getAlbums().getAlbumList().size(); i++) {
            String albumId = albumList.getAlbums().getAlbumList().get(i).getId();
            Album album = restTemplate.getForObject("https://api.spotify.com/v1/albums/" + albumId, Album.class);
            albumList.getAlbums().getAlbumList().set(i, album);
        }
    }

    private AlbumWrapper doHttpCallToRetrieveAlbumsByTitle(String album) {
        return restTemplate.getForObject("https://api.spotify.com/v1/search?q=" + album +
                "&type=album&market=US", AlbumWrapper.class);
    }
}
