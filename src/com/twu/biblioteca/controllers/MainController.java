package com.twu.biblioteca.controllers;

public class MainController {

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
                BookController.ListBooks();
                break;
            default:
                System.out.println("Select a valid option!");
                break;
        }
    }
}
