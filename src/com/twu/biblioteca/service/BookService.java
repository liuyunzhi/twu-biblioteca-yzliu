package com.twu.biblioteca.service;

import com.twu.biblioteca.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    private List<Book> books;

    public BookService() {
        books = new ArrayList<>();
        books.add(new Book("Harry·Potter", "J. K. Rowling", "1997"));
        books.add(new Book("Jane Eyre", "Charlotte Bronte", "1847"));
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}