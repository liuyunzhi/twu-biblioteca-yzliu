package com.twu.biblioteca.controllers;

import java.util.Scanner;

public class MainController {

    private static Scanner scanner = new Scanner(System.in);


    public static void printWelcomeMessage() {
        System.out.println("**************************");
        System.out.println("*                        *");
        System.out.println("* Welcome to Biblioteca !*");
        System.out.println("*                        *");
        System.out.println("**************************");
    }

    public static void printMainMenu() {
        System.out.println("**************************");
        System.out.println("*                        *");
        System.out.println("*       Main Menu        *");
        System.out.println("*                        *");
        System.out.println("* 1. List Books          *");
        System.out.println("* 2. Checkout Book       *");
        System.out.println("* 3. Return Book         *");
        System.out.println("*                        *");
        System.out.println("*                Quit(0) *");
        System.out.println("**************************");
    }

    public static void selectMenuItem(String index) {
        switch (index) {
            case "1":
                BookController.listBooks();
                System.out.println("Enter 0 to return to the main menu.");
                while (true) {
                    if (scanner.next().equals("0")) {
                        break;
                    }
                }
                break;
            case "2":
                BookController.listBooks();
                BookController.checkoutBook();
                break;
            case "3":
                BookController.returnBook();
                break;
            default:
                System.out.println("Select a valid option!");
                break;
        }
    }
}
