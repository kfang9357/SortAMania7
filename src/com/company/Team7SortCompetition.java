package com.company;

import static com.company.SortingUtilities.isUnsorted2;
import static com.company.SortingUtilities.median;
import static com.company.SortingUtilities.swap;
import static com.company.Sorts.insertionSort;

public class Team7SortCompetition extends SortCompetition {

    public String greeting() {
        return "Hello";
    }

    public int challengeOne(int[] arr) {
        /** Data Set - an array of 10,000 random integers between 0-10000
         Task: Sort the list and return the median **/
        insertionSort(arr);
        return median(arr);
    }

    public int challengeTwo(String[] arr, String query) {
        /** Data Set - an array of 10,000 random strings (strings will be of length 5)
         Task: Sort the list and determine if it contains a given string, return the index of the first instance of that string, or -1 if not found **/
        Sorts.bubbleSort(arr); // use compare to
        int index = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(query) == 0) {
                index = i;
            }
        }
        return index;
    }


    public int challengeThree(int[] arr) {
        /** Data Set - a mostly sorted array of 100,000 integers (>75% of elements are in the correct order)
         Task: Sort the list and return the median **/
        insertionSort(arr);
        return median(arr);
    }

    public int challengeFour(int[][] arr) {
        /** Data Set - a multi-dimensional array int[1000][1000] all elements are random integers between 0-10000
         Task: Sort each sub-array and then sort the arrays by their median value
         Return the median of the median array **/
        for (int i = 0; i < arr.length; i++) {
            insertionSort(arr[i]);
        }
        while (isUnsorted2(arr)) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (median(arr[i]) > median(arr[i + 1])) {
                    int[] temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        int length = (arr.length) / 2;
        return median(arr[length]);
    }
}
