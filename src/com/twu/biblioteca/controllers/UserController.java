package com.twu.biblioteca.controllers;

import com.twu.biblioteca.entity.User;
import com.twu.biblioteca.service.UserService;

import java.util.Scanner;

public class UserController {

    private static UserService userService = new UserService();
    private static Scanner scanner = new Scanner(System.in);

    public static User login() {
        String account = null;
        String password = null;
        while (true) {
            System.out.println("Please enter your account:");
            if (scanner.hasNextLine()) {
                account = scanner.nextLine();
            }
            System.out.println("Please enter your password:");
            if (scanner.hasNextLine()) {
                password = scanner.nextLine();
            }

            User user = userService.login(account, password);
            if (user == null) {
                System.out.println("The account or password is incorrect. Please re-enter!");
                continue;
            }
            return user;
        }
    }
}
