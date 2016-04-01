package com.ksubaka.album;

import org.springframework.web.client.RestTemplate;

/**
 * Created by davicres on 01/04/2016.
 */
public class RequestAlbum {
    public AlbumWrapper call(String album) {
        RestTemplate restTemplate = new RestTemplate();
        AlbumWrapper albumList = restTemplate.getForObject("https://api.spotify.com/v1/search?q=" + album +
                "&type=album&market=US", AlbumWrapper.class);
        return albumList;
    }
}
