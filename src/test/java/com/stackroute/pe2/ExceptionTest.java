package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionTest {
    private static Exception exceptionCheck;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        exceptionCheck= new Exception();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        exceptionCheck = null;

    }

    @Test
    public void givenInputShouldReturnNullPointerException(){
        int choice=0;
        String actualResult=exceptionCheck.checkException(choice);
        String expected="NullPointerException Exception caught.";
        assertEquals(expected,actualResult);
    }


    @Test
    public void givenInputShouldReturnNegativeArraySizeException(){
        int choice=1;
        String actualResult=exceptionCheck.checkException(choice);
        String expected="NegativeArraySizeException Exception caught.";
        assertEquals(expected,actualResult);
    }

    @Test
    public void givenInputShouldReturnArrayIndexOutOfBoundsException(){
        int choice=2;
        String actualResult=exceptionCheck.checkException(choice);
        String expected="ArrayIndexOutOfBoundsException Exception caught.";
        assertEquals(expected,actualResult);
    }

}