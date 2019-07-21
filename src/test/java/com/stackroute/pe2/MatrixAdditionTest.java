package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {
    private static MatrixAddition matrixAddition;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        matrixAddition = new MatrixAddition();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        matrixAddition = null;

    }
    @Test
    public void givenArrayShouldReturnAdditionOfMatrix(){
        int[][] matrix1={{1,2},{3,4},{5,6}};
        int[][] matrix2={{9, 8},{7,6},{5,4}};
        int row=3,col=2;
        int[][] actualResult= matrixAddition.addMatrix(row,col,matrix1,matrix2);
        int[][] expected={{10,10},{10,10},{10,10}};
        assertArrayEquals(expected,actualResult);
    }

//    @Test
//    public void givenArrayShouldReturnErrorMessage() throws Exception{
//        int[][] matrix1={{1,2},{3,4},{5,6}};
//        int[][] matrix2={{9, 8},{7,6},{5,4}};
//        int row=3,col=3;
//        int[][] actualResult= matrixAddition.addMatrix(row,col,matrix1,matrix2);
//        int[][] expected={{10,10},{10,10},{10,10}};
//        assertArrayEquals(expected,actualResult);
//    }

    }

