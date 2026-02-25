package org.java.se;

import org.java.se.constants.MoviesAppConstants;
import org.java.se.domain.Movie;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

public class MoviesRestClient {

    // Use this as example "http://localhost:8081/movieservice/v1/allMovies

    private WebClient webClient;

    // We want this to be initialized from outside the class!
    public MoviesRestClient(WebClient webClient) {
        this.webClient = webClient;
    }

    public List<Movie> retrieveAllMovies()
    {
        return webClient.get()
                .uri(MoviesAppConstants.GET_ALL_MOVIES_V1)
                .retrieve()
                .bodyToFlux(Movie.class) // If multiple results, .bodyToMono() if the result is single object!
                .collectList()
                .block();
    }

// Finish this.
//    public Movie getMovieById(Integer movieId)
//    {
//        webClient.get().uri()
//    }
}
