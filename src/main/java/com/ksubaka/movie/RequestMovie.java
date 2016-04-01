package com.ksubaka.movie;

import org.springframework.web.client.RestTemplate;

/**
 * Created by davicres on 01/04/2016.
 */
public class RequestMovie {

    private RestTemplate restTemplate = new RestTemplate();;

    public MovieList call(String title) {
        MovieList movieList = doHttpCallToRetrieveMovilesByTitle(title);
        doHttpCallToRetrieveMovieDirector(movieList);
        return movieList;
    }

    private void doHttpCallToRetrieveMovieDirector(MovieList movieList) {
        for (int i = 0; i < movieList.getMovieList().size(); i++) {
            String imdbId = movieList.getMovieList().get(i).getImdbID();
            Movie movie = restTemplate.getForObject("http://www.omdbapi.com/?i=" + imdbId + "&plot=short&r=json",
                    Movie.class);
             movieList.getMovieList().set(i, movie);
        }
    }

    private MovieList doHttpCallToRetrieveMovilesByTitle(String title) {
        return restTemplate.getForObject("http://www.omdbapi.com/?s=" + title +
                "&type=movie&y=&plot=short&r=json", MovieList.class);
    }
}
