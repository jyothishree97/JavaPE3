package com.stackroute.pe2;

public class Exception {
    public String checkException(int choice) {
        int result = 0;                                                    // Somewhere to store a result.
        int arraySize = 3;
        int badSize = -1;                                                  // A negative size to generate NegativeArraySizeException.
        int[] array = null;
        String temp=null;

        // Define an integer array variable.


            try {
                switch(choice) {
                    case 0:
                        result = array[0];                                            // Generates a NullPointerException.
                        break;
                    case 1:
                        array = new int[badSize];                                     // Generates a NegativeArraySizeException.
                        break;
                    case 2:
                        array = new int[arraySize];
                        result = array[arraySize];                                    // Generates an ArrayIndexOutOfBoundsException.
                        break;
            }
           } catch(NullPointerException e) {                                  // Catch the NullPointerException:
                temp="NullPointerException Exception caught.";
            } catch(NegativeArraySizeException e) {                            // Catch the NegativeArraySizeException:
                temp="NegativeArraySizeException Exception caught.";
            } catch(ArrayIndexOutOfBoundsException e) {                        // Catch the ArrayIndexOutOfBoundsException:
                temp = "ArrayIndexOutOfBoundsException Exception caught.";
            }
            return temp;
    }
}
