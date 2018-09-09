package com.twu.biblioteca;

import com.twu.biblioteca.controllers.BookController;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BookTest {

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
    public void should_show_thank_you_when_successful_checkout_given_1() {
        //given
        String expected = "Please enter checkout book's index:\n"
                + "Thank you! Enjoy the book.\n";
        //when
        System.setIn(new ByteArrayInputStream("1".getBytes()));
        BookController.checkoutBook();
        //then
        assertEquals(expected, bytes.toString());
    }
}
