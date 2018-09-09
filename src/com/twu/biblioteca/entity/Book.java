package com.twu.biblioteca.entity;

public class Book {

    private String name;
    private String author;
    private String publicationYear;
    private Boolean isCheckout;

    public Book() {
    }

    public Book(String name, String author, String publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
        isCheckout = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Boolean getCheckout() {
        return isCheckout;
    }

    public void setCheckout(Boolean checkout) {
        isCheckout = checkout;
    }
}
