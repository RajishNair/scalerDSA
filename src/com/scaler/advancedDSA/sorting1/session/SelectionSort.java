package com.scaler.advancedDSA.sorting1.session;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
    SelectionSort selObj = new SelectionSort();
    int[] arr = {4,10,7,28,11,1,9};
    int[] sortedArr = selObj.selectionSort(arr);
    System.out.print(Arrays.toString(sortedArr));
    }
// Returns Sorted Array

    public static int[] selectionSort(int[] arr) {
        int N = arr.length;

        for (int i = 0; i < N; i++) {
            int minInd = i;
            //for every element in original array find the element smaller than arr[i] and put it in right place
            for (int j = i+1; j < N; j++) {
                if (arr[j]<arr[minInd])
                    minInd = j;
            }
            int temp = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;
        }
    return arr;
    }

}
