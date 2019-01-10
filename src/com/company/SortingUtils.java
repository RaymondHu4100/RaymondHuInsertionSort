package com.company;

public class SortingUtils
{
    public static int[] copyIntArray(int[] arr)
    {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            temp[i] = arr[i];
        }
        return temp;
    }
    public static int[] copyDoubleArray(int[] arr)
    {
    }
    public static int[] copyStringArray(int[] arr)
    {
    }
}
