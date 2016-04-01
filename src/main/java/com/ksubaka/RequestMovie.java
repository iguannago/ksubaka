package com.ksubaka;

import org.springframework.web.client.RestTemplate;

/**
 * Created by davicres on 01/04/2016.
 */
public class RequestMovie {
    public MovieList call(String title) {
        RestTemplate restTemplate = new RestTemplate();
        MovieList movieList = doHttpCallToRetrieveMovilesByTitle(title, restTemplate);
        return movieList;
    }

    private MovieList doHttpCallToRetrieveMovilesByTitle(String title, RestTemplate restTemplate) {
        return restTemplate.getForObject("http://www.omdbapi.com/?s=" + title +
                "&type=movie&y=&plot=short&r=json", MovieList.class);
    }
}
