package com.twu.biblioteca.service;

import com.twu.biblioteca.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieService {

    private List<Movie> movies;

    public MovieService() {
        movies = new ArrayList<>();
        movies.add(new Movie("Kung Fu Panda", "2008", "Mark Osborne", "8.0"));
        movies.add(new Movie("Zootopia", "2016", "Byron Howard", "9.0"));
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public boolean checkoutMovie(int index) {
        Movie movie;
        try {
            movie = movies.get(index);
            if (movie.getCheckout()) {
                return false;
            }
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
        movie.setCheckout(true);
        return true;
    }

    public boolean returnMovie(Integer index) {
        Movie movie;
        try {
            movie = movies.get(index);
            if (!movie.getCheckout()) {
                return false;
            }
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
        movie.setCheckout(false);
        return true;
    }
}
