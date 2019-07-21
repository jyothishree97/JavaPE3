//package com.stackroute.pe2;
//
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class RemoveVowelsTest {
//    private static RemoveVowels rmVowels;
//
//    @BeforeClass
//    public static void setup() {
//        // This methods runs, before running any one of the test case
//        // This method is used to initialize the required variables
//        rmVowels = new RemoveVowels();
//
//    }
//
//    @AfterClass
//    public static void teardown() {
//        // This method runs, after running all the test cases
//        // This method is used to clear the initialized variables
//        rmVowels = null;
//
//    }

//    @Test
//    public void givenInputArrayShouldReturnPlaceNameWithoutVowels(){
//
//        String[] inputArray={"India","Unitedstates","germany","Egypt"};
//        String[] actualResult=rmVowels.removeVowels(inputArray);
//        String[] expectedResult={"Ind","Untdstts","grmny","Egypt"};
//        assertArrayEquals(expectedResult,actualResult);
//    }
//
//}