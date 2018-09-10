package com.twu.biblioteca.controllers;

import com.twu.biblioteca.entity.Movie;
import com.twu.biblioteca.service.MovieService;

import java.util.List;
import java.util.Scanner;

public class MovieController {

    private static MovieService movieService = new MovieService();
    private static Scanner scanner = new Scanner(System.in);

    public static void listMovies() {
        System.out.println("*\t\t\t\t\tMovie List");
        System.out.println("*");
        System.out.println("*    Name\t\t\tDirector\t\t\tYear\t\t\tRate");
        List<Movie> movies = movieService.getMovies();
        for (int i = 1; i <= movies.size(); i++) {
            Movie movie = movies.get(i - 1);
            if (!movie.getCheckout()) {
                System.out.println("* " + i + ". "
                        + movie.getName() + "\t"
                        + movie.getDirector() + "\t\t"
                        + movie.getYear() + "\t\t"
                        + movie.getRate());
            }
        }
        System.out.println("*");
    }

    public static void checkoutMovie() {
        System.out.println("Please enter checkout movie's index:");
        while (true) {
            if (scanner.hasNext()) {
                String selection = scanner.next();
                if (selection.equals("0")) {
                    break;
                }
                if (movieService.checkoutMovie(Integer.parseInt(selection) - 1)) {
                    System.out.println("Thank you! Enjoy the movie.");
                    System.out.println("Whether to continue?(Enter 0 to return to the main menu.)");
                } else {
                    System.out.println("That movie is not available.");
                    System.out.println("Whether to continue?(Enter 0 to return to the main menu.)");
                }
            }
        }
    }

    public static void returnMovie() {
        System.out.println("Please enter return movie's index:");
        while (true) {
            if (scanner.hasNext()) {
                String selection = scanner.next();
                if (selection.equals("0")) {
                    break;
                }
                if (movieService.returnMovie(Integer.parseInt(selection) - 1)) {
                    System.out.println("Thank you for returning the movie.");
                    System.out.println("Whether to continue?(Enter 0 to return to the main menu.)");
                } else {
                    System.out.println("That is not a valid movie to return.");
                    System.out.println("Whether to continue?(Enter 0 to return to the main menu.)");
                }
            }
        }
    }
}
