package org.java.se.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
        String cast;
        Long movie_id;
        String name;
        LocalDate release_date;
        Integer year;
}