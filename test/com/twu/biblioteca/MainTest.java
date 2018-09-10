package com.twu.biblioteca;

import com.twu.biblioteca.controllers.MainController;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MainTest {

    private InputStream in;
    private PrintStream out;
    private ByteArrayOutputStream bytes;

    @Before
    public void setUp() {
        bytes = new ByteArrayOutputStream();
        in = System.in;
        out = System.out;
        System.setOut(new PrintStream(bytes));
    }

    @After
    public void tearDown() {
        System.setIn(in);
        System.setOut(out);
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
        MainController.printWelcomeMessage();

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
                + "* 2. Checkout Book       *\n"
                + "* 3. Return Book         *\n"
                + "*                        *\n"
                + "*                Quit(0) *\n"
                + "**************************\n";

        //when
        MainController.printMainMenu(null);

        //then
        assertEquals(expected, bytes.toString());
    }

    @Test
    public void should_list_books_when_input_1() {
        //given
        String expected = "*\t\t\t\t\tBook List\n"
                + "*\n"
                + "*    Name\t\t\tAuthor\t\t\tPublication Year\n"
                + "* 1. Harry·Potter\tJ. K. Rowling\t\t1997\n"
                + "* 2. Jane Eyre\tCharlotte Bronte\t\t1847\n"
                + "*\n";
        //when
        MainController.selectMenuItem("1");
        //then
        assertEquals(expected, bytes.toString());
    }

    @Test
    public void should_be_notified_given_invalid_input() {
        //given
        String expected = "Select a valid option!\n";
        //when
        MainController.selectMenuItem("a");
        //then
        assertEquals(expected, bytes.toString());
    }
}
