package com.ksubaka.movie;

import com.ksubaka.Item;
import com.ksubaka.Request;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * Created by davicres on 01/04/2016.
 */
public class RequestMovie implements Request<MovieList> {

    private RestTemplate restTemplate = new RestTemplate();;

    public Collection<? extends Item> call(String title) {
        MovieList movieList = doHttpCallToRetrieveMovilesByTitle(title);
        doHttpCallToRetrieveMovieDirector(movieList);
        return movieList.getMovieList();
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
