package com.twu.biblioteca;

import com.twu.biblioteca.controllers.MainMenu;

import java.util.Scanner;

public class BibliotecaApp {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MainMenu.printWelcomeMessage();
        MainMenu.printMainMenu();
    }
}
