package com.stackroute.pe2;

public class ConsecutiveCheck {
    public boolean areConsecutive(int[] arr, int n) {
        if (n < 1)
            return false;

       //Check for minimum number
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min)
                min = arr[i];
        }

        //check for maximum number
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

       //
        if (max - min + 1 == n) {
            int i;
            for (i = 0; i < n; i++) {
                int j;

                if (arr[i] < 0)
                    j = -arr[i] - min;
                else
                    j = arr[i] - min;

                // if the value at index j is negative then
                // there is repitition
                if (arr[j] > 0)
                    arr[j] = -arr[j];
                else
                    return false;
            }

            /* If we do not see a negative value then all elements
               are distinct */
            return true;

        }
        return false;
    }
}
