package com.thoughtworks.tafarii;

import java.io.PrintStream;

/**
 * Created by tafarii on 9/30/16.
 */
public class Board {
    private PrintStream printStream;
    private String[] board;

    public Board(PrintStream printStream, String[] boardContents) {
        this.printStream = printStream;
        this.board = boardContents;
    }

    public void drawBoard() {
        String toPrint = board[0] + board[1] + board[2] + board[3] + board[4] + board[5] + board[6] + board[7] + board[8]
                + board[9] + board[10] + board[11] + board[12] + board[13] + board[14];
        printStream.print(toPrint);
    }

    public void placeMark(String symbol, String location) {
        for (int i = 0; i < board.length; i++) {
            if (board[i].equals(location) || board[i].equals(location + "\n")) {
                board[i] = symbol;
            }
        }

    }


    public Boolean isCellTaken() {
        printStream.println("Location already taken. Please enter a different location.");
        return true;
    }
}