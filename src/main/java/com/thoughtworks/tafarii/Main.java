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
        String[] boardContents = {"1", "|", "2", "|", "3\n", "4", "|", "5", "|", "6\n", "7", "|", "8", "|", "9\n"};

        Board board = new Board(printStream, boardContents);
        Player firstPlayer = new Player(printStream, board, bufferedReader, "X");
        Player secondPlayer = new Player(printStream, board, bufferedReader, "O");
        Game game = new Game(board, firstPlayer, secondPlayer);

        game.start();
    }
}
