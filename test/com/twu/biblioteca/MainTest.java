package com.twu.biblioteca;

import com.twu.biblioteca.controllers.BookController;
import com.twu.biblioteca.controllers.MainController;
import com.twu.biblioteca.entity.Book;
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
                + "* 2. ...                 *\n"
                + "*                        *\n"
                + "**************************\n";

        //when
        MainController.printMainMenu();

        //then
        assertEquals(expected, bytes.toString());
    }

    @Test
    public void should_list_books_when_input_1() {
        //given
        String expected = "**************************\n"
                + "*                        *\n"
                + "*       Book List        *\n"
                + "*                        *\n"
                + "* 1. Harry·Potter        *\n"
                + "* 2. Jane Eyre           *\n"
                + "*                        *\n"
                + "**************************\n";
        //when
        MainController.selectMenuItem("1");
        //then
        assertEquals(expected, bytes.toString());

    }
}
