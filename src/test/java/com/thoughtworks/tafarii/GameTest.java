package com.thoughtworks.tafarii;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by tafarii on 9/30/16.
 */
public class GameTest {
    private Board board;
    private Game game;
    private Player firstPlayer;
    private Player secondPlayer;

    @Before
    public void setUp() throws Exception {
        board = mock(Board.class);
        firstPlayer = mock(Player.class);
        secondPlayer = mock(Player.class);
        game = new Game(board, firstPlayer, secondPlayer);
    }

    @Test
    public void drawEmptyBoardWhenStarting() throws Exception {
        game.start();

        verify(board).drawBoard();
    }

    @Test
    public void firstPlayerMakesMoveWhenStarting() throws Exception {
        game.start();

        verify(firstPlayer).makeMove();
    }

    @Test
    public void secondPlayerMakesMoveAfterFirstPlayerMakesMove() throws Exception {
        game.start();

        verify(secondPlayer).makeMove();
    }
}
