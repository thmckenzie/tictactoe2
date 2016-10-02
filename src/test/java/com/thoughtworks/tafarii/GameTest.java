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
    private Player player;

    @Before
    public void setUp() throws Exception {
        board = mock(Board.class);
        player = mock(Player.class);
        game = new Game(board, player);
    }

    @Test
    public void drawEmptyBoardWhenStarting() throws Exception {
        game.start();

        verify(board).drawBoard();
    }

    @Test
    public void playerMakesMoveWhenStarting() throws Exception {
        game.start();

        verify(player).makeMove();
    }

}
