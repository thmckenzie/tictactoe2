package com.thoughtworks.tafarii;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * Created by tafarii on 9/30/16.
 */
public class Main {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        PrintStream printStream = new PrintStream(System.out);
        Board board = new Board(printStream);
        Player player = new Player(printStream, board, bufferedReader);
        Game game = new Game(board, player);

        game.start();
    }
}
