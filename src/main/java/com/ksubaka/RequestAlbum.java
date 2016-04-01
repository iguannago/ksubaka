package com.ksubaka;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Created by davicres on 01/04/2016.
 */
public class RequestAlbum {
    public HttpStatus call(String album) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity("https://api.spotify.com/v1/search?q=" + album +
                "&type=album&market=US", String.class);
        return response.getStatusCode();
    }
}
