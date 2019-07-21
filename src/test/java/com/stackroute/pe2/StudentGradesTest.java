package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class StudentGradesTest {
    private static StudentGrades studentGrades;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        studentGrades = new StudentGrades();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        studentGrades = null;

    }

    @Test
    public void givenArrayShouldReturnGradeIsValid(){
        int numOfStudents=4;
        int[] stuGrades={54,68,91,90};
        String actualResult=studentGrades.calculateGrades(numOfStudents,stuGrades);
        assertEquals("Grades are within the range",actualResult);
    }

    @Test
    public void givenArrayShouldReturnGradeNotInRange(){
        int numOfStudents=3;
        int[] stuGrades={91,-154,168};
        String actualResult=studentGrades.calculateGrades(numOfStudents,stuGrades);
        assertEquals("Grades are not in range",actualResult);
    }

    @Test
    public void givenArrayShouldThrowErroeMessage(){
        int numOfStudents=3;
        int[] stuGrades={34,51,67,78};
        String actualResult=studentGrades.calculateGrades(numOfStudents,stuGrades);
        assertEquals("Given Array is Out of range",actualResult);
    }

}