package com.stackroute.pe2;

public class StudentGrades {
    public  String calculateGrades(int n,int[] intputArray) {
        int len = intputArray.length;
        String temp="";
        if ((len == n)||((len < n) && (n > 0))) {
            for (int i = 0; i < len; i++) {
                if ((intputArray[i] >= 0)&&(intputArray[i] <= 100)) {
                    temp = "Grades are within the range";
                } else {
                    temp = "Grades are not in range";
                }
            }
        } else
            temp = "Given Array is Out of range";
        return temp;
    }

}
