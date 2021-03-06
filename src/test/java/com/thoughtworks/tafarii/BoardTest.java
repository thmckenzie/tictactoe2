package com.thoughtworks.tafarii;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by tafarii on 10/1/16.
 */
public class BoardTest {
    private PrintStream printStream;
    private Board board;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        String[] boardContents = {"1", "|", "2", "|", "3\n", "4", "|", "5", "|", "6\n", "7", "|", "8", "|", "9\n"};

        board = new Board(printStream, boardContents);
    }

    @Test
    public void shouldPrintBoardWithNumbers1Through9WhenDrawingBoard() throws Exception {
        board.drawBoard();

        verify(printStream).print("1|2|3\n" +
                                    "4|5|6\n" +
                                    "7|8|9\n");
    }

    @Test
    public void shouldPlaceSymbolInLocationWhenPlacingMark() throws Exception {
        board.placeMark("X", "1");

        board.drawBoard();

        verify(printStream).print("X|2|3\n" +
                                    "4|5|6\n" +
                                    "7|8|9\n");
    }


}