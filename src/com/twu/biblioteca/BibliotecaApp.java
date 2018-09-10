package com.twu.biblioteca;

import com.twu.biblioteca.controllers.MainController;
import com.twu.biblioteca.controllers.UserController;
import com.twu.biblioteca.entity.User;

import java.util.Scanner;

public class BibliotecaApp {
    private static Scanner scanner = new Scanner(System.in);
    private static User user = null;

    public static void main(String[] args) {
        MainController.printWelcomeMessage();
        MainController.printMainMenu(user);
        while (true) {
            System.out.println("Please enter your selection:");
            if (scanner.hasNext()) {
                String selection = scanner.next();
                if (selection.equals("Q")) {
                    break;
                }
                if (selection.equals("L")) {
                    user = UserController.login();
                }
                if (user == null) {
                    System.out.println("Please login!");
                    continue;
                }
                MainController.selectMenuItem(selection);
                MainController.printMainMenu(user);
            }
        }
    }
}
