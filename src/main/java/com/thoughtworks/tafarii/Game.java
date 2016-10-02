package com.thoughtworks.tafarii;

/**
 * Created by tafarii on 9/30/16.
 */
public class Game {
    private Board board;
    private Player firstPlayer;
    private Player secondPlayer;

    public Game(Board board, Player firstPlayer, Player secondPlayer) {
        this.board = board;
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void start() {
        board.drawBoard();
        firstPlayer.makeMove();
        secondPlayer.makeMove();
    }
}
