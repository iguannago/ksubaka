package com.ksubaka.album;

import org.springframework.web.client.RestTemplate;

/**
 * Created by davicres on 01/04/2016.
 */
public class RequestAlbum {

    private RestTemplate restTemplate = new RestTemplate();

    public AlbumWrapper call(String title) {
        AlbumWrapper albumList = doHttpCallToRetrieveAlbumsByTitle(title);
        for (int i = 0; i < albumList.getAlbums().getAlbumList().size(); i++) {
            String albumId = albumList.getAlbums().getAlbumList().get(i).getId();
            Album album = restTemplate.getForObject("https://api.spotify.com/v1/albums/" + albumId, Album.class);
            albumList.getAlbums().getAlbumList().set(i, album);
        }
        return albumList;
    }

    private AlbumWrapper doHttpCallToRetrieveAlbumsByTitle(String album) {
        return restTemplate.getForObject("https://api.spotify.com/v1/search?q=" + album +
                "&type=album&market=US", AlbumWrapper.class);
    }
}
