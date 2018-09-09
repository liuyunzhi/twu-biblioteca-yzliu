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
        System.out.println("* 2. ...                 *");
        System.out.println("*                        *");
        System.out.println("**************************");
    }

    public static void selectMenuItem(String index) {
        switch (index) {
            case "1":
                BookController.ListBooks();
                break;
            default:
                break;
        }
    }
}
