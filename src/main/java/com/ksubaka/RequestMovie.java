package com.ksubaka;

import org.springframework.web.client.RestTemplate;

/**
 * Created by davicres on 01/04/2016.
 */
public class RequestMovie {
    public MovieList call(String movieName) {
        RestTemplate restTemplate = new RestTemplate();
        MovieList movieList = restTemplate.getForObject("http://www.omdbapi.com/?s=" + movieName +
                "&type=movie&y=&plot=short&r=json", MovieList.class);
        return movieList;
    }
}
