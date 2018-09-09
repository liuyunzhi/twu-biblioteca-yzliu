package com.twu.biblioteca;

import com.twu.biblioteca.controllers.MainMenu;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private PrintStream console;
    private ByteArrayOutputStream bytes;

    @Before
    public void setUp() {
        bytes = new ByteArrayOutputStream();
        console = System.out;
        System.setOut(new PrintStream(bytes));
    }

    @After
    public void tearDown() {
        System.setOut(console);
    }

    @Test
    public void show_welcome_message() {
        //given
        String expected = "**************************\n"
                + "*                        *\n"
                + "* Welcome to Biblioteca !*\n"
                + "*                        *\n"
                + "**************************\n";

        //when
        MainMenu.printWelcomeMessage();

        //then
        assertEquals(expected, bytes.toString());
    }

    @Test
    public void show_main_menu() {
        //given
        String expected = "**************************\n"
                + "*                        *\n"
                + "*       Main Menu        *\n"
                + "*                        *\n"
                + "* 1. List Books          *\n"
                + "* 2. ...                 *\n"
                + "*                        *\n"
                + "**************************\n";

        //when
        MainMenu.printMainMenu();

        //then
        assertEquals(expected, bytes.toString());
    }
}
