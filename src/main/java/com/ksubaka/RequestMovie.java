package com.ksubaka;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Created by davicres on 01/04/2016.
 */
public class RequestMovie {
    public HttpStatus call(String movieName) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity("http://www.omdbapi.com/?s=" + movieName +
                "&type=movie&y=&plot=short&r=json", String.class);
        return response.getStatusCode();
    }
}
