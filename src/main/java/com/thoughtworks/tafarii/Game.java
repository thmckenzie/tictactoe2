package com.thoughtworks.tafarii;

/**
 * Created by tafarii on 9/30/16.
 */
public class Game {
    private Board board;
    private Player player;

    public Game(Board board, Player player) {
        this.board = board;
        this.player = player;
    }

    public void start() {
        board.drawBoard();
        player.makeMove();
    }
}
