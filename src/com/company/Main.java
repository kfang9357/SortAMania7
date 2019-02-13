package com.company;

public class Main {

    public static void main(String[] args) {
        Team7SortCompetition team7 = new Team7SortCompetition();

        /****** challenge 1 test *****/

        int[] randIntArr = SortingUtilities.randomIntsArr(9);

        System.out.println("Unsorted");
        printArr(randIntArr);

        System.out.println(" ");
        System.out.println(" ");

        long time = System.nanoTime();
        int median = team7.challengeOne(randIntArr);
        time = System.nanoTime() - time;

        System.out.println("Challenge One Time Taken: " + time + " nanoseconds.");
        System.out.println("Median Equals: " + median);

        System.out.println("Sorted");
        printArr(randIntArr);
        System.out.println(" ");
        System.out.println(" ");

        /***** challenge 2 test *****/

        //String[] randStringArr = SortingUtilities.randomStringArr(10, 5);
        String[] randStringArr = {"hello", "my", "name", "is", "kelly"};

        System.out.println("Unsorted");
        printArr(randStringArr);

        System.out.println(" ");
        System.out.println(" ");

        long time2 = System.nanoTime();
        int index = team7.challengeTwo(randStringArr, "kelly");
        time2 = System.nanoTime() - time2;

        System.out.println("Challenge Two Time Taken: " + time2 + " nanoseconds.");
        System.out.println("Index of Query Equals: " + index);

        System.out.println("Sorted");
        printArr(randStringArr);
        System.out.println(" ");
        System.out.println(" ");

        /***** challenge 3 test *****/

        int[] randIntArr2 = SortingUtilities.randomIntsArr(10);
        System.out.println("Unsorted");
        printArr(randIntArr2);

        System.out.println(" ");
        System.out.println(" ");

        long time3 = System.nanoTime();
        int median2 = team7.challengeThree(randIntArr2);
        time3 = System.nanoTime() - time3;

        System.out.println("Challenge Three Time Taken: " + time3 + " nanoseconds.");
        System.out.println("Median Equals: " + median2);

        System.out.println("Sorted");
        printArr(randIntArr2);
        System.out.println(" ");
        System.out.println(" ");

        /**** challenge 4 test ****/

        int[][] randint2darr = SortingUtilities.randomInts2Darr(5, 5);
        System.out.println("Unsorted");
        print2D(randint2darr);

        System.out.println(" ");
        System.out.println(" ");

        long time4 = System.nanoTime();
        int median3 = team7.challengeFour(randint2darr);
        time4 = System.nanoTime() - time4;

        System.out.println("Challenge Four Time Taken: " + time4 + " nanoseconds.");
        System.out.println("Median Equals: " + median3);

        System.out.println("Sorted");
        print2D(randint2darr);

        System.out.println(" ");
        System.out.println(" ");
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void printArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void print2D(int[][] arr) {
        for (int[] x : arr) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}


