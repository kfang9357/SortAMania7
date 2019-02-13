package com.company;

public class SortingUtilities
{
    public static int[] randomIntsArr(int count)
    {
        int[]arr = new int[count];
        for (int i = 0; i < count; i++)
        {
            arr[i] = (int) (Math.random()*1001);
        }

        return arr;
    }

    public static String[] randomStringArr(int num, int length)
    {
        String[] arr = new String [num];
        while (num > 0)
        {
            int i = 0;
            String s = "";
            while (i<length) {
                char c = (char) (Math.random() * 26 + 97);
                s = s + c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
    }

    public static int[][] randomInts2Darr(int row, int col) {
        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 1001);
            }
        }
        return arr;
    }

    public static void swap (int[]arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swap2 (String[] arr, int i, int j)
    {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swap3 (Comparable[] objectArr, int i, int j)
    {
        Comparable temp = objectArr[i];
        objectArr[i] = objectArr[j];
        objectArr[j] = temp;
    }

    public static int median(int[] arr) {
        // to find the median
        int middle = arr.length / 2;
        int median = 0;
        if (arr.length % 2 == 1)
            median = arr[middle];
        else
            median = (arr[middle - 1] + arr[middle]) / 2;
        return median;
    }

    public static boolean isUnsorted(String[] arr)
    {
        int len = arr.length - 1;
        for (int pos = 0; pos < len; pos++)
        {
            if ((arr[pos].compareTo(arr[pos+1]))> 0)
            {
                return true;
            }
        }
        return false;
    }

    public static boolean isUnsorted2(int[][] arr)
    {
        int len = arr.length/2;
        for (int i = 0; i < arr.length-1; i++)
        {
            if (arr[i][len]>arr[i+1][len])
            {
                return true;
            }
        }
        return false;
    }

    public static boolean isUnsorted2(Comparable[] objectArr)
    {
        int len = objectArr.length - 1;
        for(int pos = 0; pos < len; pos++)
        {
            if((objectArr[pos].compareTo(objectArr[pos+1]))> 0)
            {
                return true;
            }
        }
        return false;
    }

    public static int[] copyIntArray(int[] arr)
    {
        int[] newArray = new int[arr.length];
        for (int i = 0; i<arr.length; i++)
        {
            newArray[i] = arr[i];
        }
        return newArray;
    }

    public static double[] copyDoubleArray(double[] arr)
    {
        double[] newArray = new double[arr.length];
        for (int i = 0; i<arr.length; i++)
        {
            newArray[i] = arr[i];
        }
        return newArray;
    }

    public static boolean checkSum(int[] before, int[] after){
        int sum1 = 0;
        for (int i = 0; i< before.length; i++)
        {
            sum1 = sum1 + before[i];
        }
        int sum2 = 0;
        for (int i = 0; i<after.length; i++)
        {
            sum2 = sum2 + after[i];
        }

        if (sum1 == sum2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean checkSum2(double[] before, double[] after){
        double sum1 = 0;
        for (int i = 0; i< before.length; i++)
        {
            sum1 = sum1 + before[i];
        }
        double sum2 = 0;
        for (int i = 0; i<after.length; i++)
        {
            sum2 = sum2 + after[i];
        }

        if (sum1 == sum2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}