package com.thoughtworks.tafarii;

import java.io.PrintStream;
import java.util.Arrays;

/**
 * Created by tafarii on 9/30/16.
 */
public class Board {
    private PrintStream printStream;
    private String[] board = {"1", "|", "2", "|","3\n", "4", "|", "5", "|" ,"6\n", "7", "|","8", "|", "9"};

    public Board(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void drawBoard() {
        String toPrint = board[0] + board[1] + board[2] + board[3] + board[4] + board[5] + board[6] + board[7] + board[8]
                + board[9] + board[10] + board[11] + board[12] + board[13] + board[14];
        printStream.print(toPrint);
    }

    public void placeMark(String symbol, String location) {

    }

}
