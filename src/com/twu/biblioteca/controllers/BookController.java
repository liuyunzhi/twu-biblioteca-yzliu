package com.twu.biblioteca.controllers;

import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.service.BookService;

import java.util.List;
import java.util.Scanner;

public class BookController {

    private static BookService bookService = new BookService();
    private static Scanner scanner = new Scanner(System.in);

    public static void listBooks() {
        System.out.println("*\t\t\t\t\tBook List");
        System.out.println("*");
        System.out.println("*    Name\t\t\tAuthor\t\t\tPublication Year");
        List<Book> books = bookService.getBooks();
        for (int i = 1; i <= books.size(); i++) {
            Book book = books.get(i - 1);
            if (!book.getCheckout()) {
                System.out.println("* " + i + ". "
                        + book.getName() + "\t"
                        + book.getAuthor() + "\t\t"
                        + book.getPublicationYear());
            }
        }
        System.out.println("*");
    }

    public static void checkoutBook() {
        System.out.println("Please enter checkout book's index:");
        while (true) {
            if (scanner.hasNext()) {
                String selection = scanner.next();
                if (selection.equals("0")) {
                    break;
                }
                if (bookService.checkoutBook(Integer.parseInt(selection) - 1)) {
                    System.out.println("Thank you! Enjoy the book.");
                    System.out.println("Whether to continue?(Enter 0 to return to the main menu.)");
                } else {
                    System.out.println("That book is not available.");
                    System.out.println("Whether to continue?(Enter 0 to return to the main menu.)");
                }
            }
        }
    }

    public static void returnBook() {
        System.out.println("Please enter return book's index:");
        while (true) {
            if (scanner.hasNext()) {
                String selection = scanner.next();
                if (selection.equals("0")) {
                    break;
                }
                if (bookService.returnBook(Integer.parseInt(selection) - 1)) {
                    System.out.println("Thank you for returning the book.");
                    System.out.println("Whether to continue?(Enter 0 to return to the main menu.)");
                } else {
                    System.out.println("That is not a valid book to return.");
                    System.out.println("Whether to continue?(Enter 0 to return to the main menu.)");
                }
            }
        }
    }
}
