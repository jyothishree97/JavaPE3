package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
    private static ChessBoard chessBoard;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        chessBoard = new ChessBoard();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        chessBoard = null;

    }

    @Test
    public void givenInputShouldReturnPatternOfChess(){
        //act
        String[][] actualPattern=chessBoard.chessPattern(3,2);
        String[][] expectedPattern={{"WW","BB"},{"BB","WW"},{"WW","BB"}};
        //assert
        assertArrayEquals(expectedPattern,actualPattern);
    }
}