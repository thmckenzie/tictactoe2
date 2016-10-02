package com.thoughtworks.tafarii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by tafarii on 9/30/16.
 */
public class Player {
    private final String symbol;
    private PrintStream printStream;
    private Board board;
    private BufferedReader bufferedReader;

    public Player(PrintStream printStream, Board board, BufferedReader bufferedReader, String symbol) {
        this.printStream = printStream;
        this.board = board;
        this.bufferedReader = bufferedReader;
        this.symbol = symbol;
    }

    public void makeMove() {
        printStream.println("Please enter a number between 1 and 9 indicating where you would to place your mark");

        String mark = "";
        try {
            mark = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        board.placeMark(symbol, mark);
        board.drawBoard();
    }
}
