package com.company;

public class Team7SortCompetition extends SortCompetition {

    public String greeting()
    {
        return "Hello";
    }
    public int challengeOne(int[] arr){
        /** Data Set - an array of 10,000 random integers between 0-10000
         Task: Sort the list and return the median **/
        Sorts.insertionSort(arr);
        return SortingUtilities.median(arr);
    }

    public int challengeTwo(String[] arr, String query)
    {
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


    public int challengeThree(int[] arr){
        /** Data Set - a mostly sorted array of 100,000 integers (>75% of elements are in the correct order)
         Task: Sort the list and return the median **/
        Sorts.insertionSort(arr);
        return SortingUtilities.median(arr);
    }

    public int challengeFour(int[][] arr) {
        /** Data Set - a multi-dimensional array int[1000][1000] all elements are random integers between 0-10000
         Task: Sort each sub-array and then sort the arrays by their median value
         Return the median of the median array **/
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i].length - j; k++) {
                    if (arr[i][k] > arr[i][k + 1]) {
                        int t = arr[i][k];
                        arr[i][k] = arr[i][k + 1];
                        arr[i][k + 1] = t;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            {
                {
                    if (SortingUtilities.median(arr[i]) > SortingUtilities.median(arr[i + 1])) {
                        {
                            int[] temp = arr[i];
                            arr[i] = arr[i + 1];
                            arr[i + 1] = temp;
                        }
                    }
                }
            }
        }
        return SortingUtilities.median(arr[500]);
    }


    public int challengeFive(Comparable[] arr, Comparable query)
    {
        Sorts.bubbleSortObject(arr);
        return 0;
    }
    /**public int challengeFive(Comparable[] arr){
     /** Data Set - an array of 10,000 objects that implement the comparable interface
     Task: Sort the array by the compareTo method, and determine if it contains the element given. Return the position of the object, or -1 if not found.
     Hint: You must use a stable sort for this challenge, equivalent objects should stay in the same order. **/

}
