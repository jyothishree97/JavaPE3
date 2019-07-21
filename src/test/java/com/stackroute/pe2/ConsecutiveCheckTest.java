package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveCheckTest {
    private static ConsecutiveCheck consecutiveCheck;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        consecutiveCheck = new ConsecutiveCheck();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        consecutiveCheck = null;

    }
    @Test
    public void givenInputArrayShouldReturnConsecutiveNumber(){
        boolean expected=true;
        int[] a={1,2,3};
        boolean actualResult=consecutiveCheck.areConsecutive(a,3);
        assertEquals(expected,actualResult);
    }

    @Test
    public void givenInputArrayShouldReturnFalse(){
        boolean expected=false;
        int[] a={1,2,4};
        boolean actualResult=consecutiveCheck.areConsecutive(a,3);
        assertEquals(expected,actualResult);
    }


}