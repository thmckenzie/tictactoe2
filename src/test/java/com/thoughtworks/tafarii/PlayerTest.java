package com.thoughtworks.tafarii;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;

import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by tafarii on 10/1/16.
 */
public class PlayerTest {
    private BufferedReader bufferedReader;
    private PrintStream printStream;
    private Board board;
    private Player player;

    @Before
    public void setUp() throws Exception {
        bufferedReader = mock(BufferedReader.class);
        printStream = mock(PrintStream.class);
        board = mock(Board.class);
        player = new Player(printStream, board, bufferedReader, "x");

    }

    @Test
    public void shouldPromptUserForLocationWhenPlayerMakesMove() throws Exception {
        player.makeMove();

        verify(printStream).println("Please enter a number between 1 and 9 indicating where you would to place your mark");
    }

    @Test
    public void shouldRedrawBoardWhenPlayerMakesMove() throws Exception {
        player.makeMove();

        verify(board).drawBoard();
    }

    @Test
    public void shouldPlaceMarkWhereUserIndicatesWhenPlayerMakesMove() throws Exception {
        when(bufferedReader.readLine()).thenReturn("1");

        player.makeMove();

        verify(board).placeMark("x", "1");
    }

    @Test
    public void shouldMarkBoardWithOWhenPlayerSymbolIsO() throws Exception {
        Player player2 = new Player(printStream, board, bufferedReader, "O");

        player2.makeMove();

        verify(board).placeMark(eq("O"), anyString());
    }

    @Test
    public void shouldPrintTakenMessageWhenCellIsTaken() throws Exception {
        when(board.isCellTaken()).thenReturn(true);

        player.makeMove();

        verify(printStream).println("Location already taken.");
    }

}