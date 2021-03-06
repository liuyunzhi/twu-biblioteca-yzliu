package com.twu.biblioteca.entity;

public class Movie {

    private String name;
    private String year;
    private String director;
    private String rate;
    private Boolean checkout;

    public Movie() {
    }

    public Movie(String name, String year, String director, String rate) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rate = rate;
        checkout = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public Boolean getCheckout() {
        return checkout;
    }

    public void setCheckout(Boolean checkout) {
        this.checkout = checkout;
    }
}
