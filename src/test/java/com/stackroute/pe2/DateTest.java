//package com.stackroute.pe2;
//
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.Test;
//
//import java.util.Calendar;
//
//import static org.junit.Assert.*;
//
//public class DateTest {
//    private static Date date;
//
//    @BeforeClass
//    public static void setup() {
//        // This methods runs, before running any one of the test case
//        // This method is used to initialize the required variables
//        date = new Date();
//
//    }
//
//    @AfterClass
//    public static void teardown() {
//        // This method runs, after running all the test cases
//        // This method is used to clear the initialized variables
//        date = null;
//
//    }
//    @Test
//    public void givenDateShouldReturnFirstToLastDayOfWeek(){
//        Calendar calendar= Calendar.getInstance();
//        String[] expected={"fri 07/19/2019","sat 07/20/2019","sun 07/21/2019","mon 07/22/2019","tue 07/22/2019","wed 07/23/2019","thu 07/24/2019"};
//        String[] actual=date.firstDay(calendar);
//        assertEquals(expected,actual);
//    }
//
//}