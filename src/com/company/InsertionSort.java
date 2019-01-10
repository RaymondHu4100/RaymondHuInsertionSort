package com.company;

public class InsertionSort
{
    public static void insertionSort(int[] arr)
    {
        int n = arr.length;
        for (int i = 1; i < n; i++)
        {
            int insert = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > insert)
            {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = insert;
        }
    }
}
