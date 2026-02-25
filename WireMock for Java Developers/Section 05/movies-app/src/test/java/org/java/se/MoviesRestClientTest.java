package org.java.se;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.common.ConsoleNotifier;
import com.github.tomakehurst.wiremock.core.Options;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import org.java.se.domain.Movie;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.web.client.RestClient;
import org.springframework.web.reactive.function.client.WebClient;
import org.wiremock.spring.ConfigureWireMock;
import org.wiremock.spring.EnableWireMock;
import org.wiremock.spring.InjectWireMock;

import java.util.List;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.junit.jupiter.api.Assertions.assertTrue;


class MoviesRestClientTest {

    MoviesRestClient moviesRestClient;
    WebClient webClient;

    @InjectWireMock
    WireMockServer wireMockServer;

    @ConfigureWireMock
    Options options = wireMockConfig()
            .port(8088)
            .notifier(new ConsoleNotifier(true));

    @BeforeEach
    void setUp()
    {
        int port = wireMockServer.port();

        String port = String.format(""wireMockServer.port()); //Gets wiremock port!

        String baseUrl = "http://localhost:8081";
        webClient = WebClient.builder()
                .baseUrl(baseUrl)
                .build();
        moviesRestClient = new MoviesRestClient(webClient);
    }

    @Test
    // We are testing call to the method!
    void retrieveAllMovies(){

        // Given.

        // When.
        List<Movie> movies = moviesRestClient.retrieveAllMovies();
        System.out.println("moviesList: " + movies);

        // Then.
        assertTrue(movies.size() >= 0 );
    }
}