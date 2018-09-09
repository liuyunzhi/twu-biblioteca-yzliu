package com.twu.biblioteca.controllers;

import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.service.BookService;

import java.util.List;

public class BookController {

    private static BookService bookService = new BookService();

    public static void ListBooks() {
        System.out.println("*\t\t\t\t\tBook List");
        System.out.println("*");
        System.out.println("*    Name\t\t\tAuthor\t\t\tPublication Year");
        List<Book> books = bookService.getBooks();
        for (int i = 1; i <= books.size(); i++) {
            Book book = books.get(i - 1);
            System.out.println("* " + i + ". "
                    + book.getName() + "\t"
                    + book.getAuthor() + "\t\t"
                    + book.getPublicationYear());
        }
        System.out.println("*");
    }
}
