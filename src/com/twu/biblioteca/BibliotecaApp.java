package com.twu.biblioteca;

import com.twu.biblioteca.controllers.MainController;

import java.util.Scanner;

public class BibliotecaApp {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MainController.printWelcomeMessage();
        MainController.printMainMenu();
        System.out.println("Please enter your selection:");
        if (scanner.hasNext()) {
            MainController.selectMenuItem(scanner.next());
        }
    }
}
