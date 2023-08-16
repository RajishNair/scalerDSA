package com.scaler.advancedDSA.sorting1.session;

import java.util.Arrays;

public class MergeSortAnyArray {

    public static void main(String[] args) {
    //int arr[] = {2,3,6,8,10,12,15,17,18};
    int[] arr = {4,8,-1,2,6,9,11,3,4,7,13,0};
    mergeSort(arr,0,8);
    System.out.print(Arrays.toString(arr));
    }

 public static void mergeSort(int[] originArr, int start, int end){
        if(start == end)
            return;
        int mid = (start+end)/2;
        //left subarray
        mergeSort(originArr, start,mid);
        //right subarray
        mergeSort(originArr,mid+1,end);
        int [] mergedSortedArr = mergeSortedArrays(originArr,start,mid,end);
 }

 public static int[] mergeSortedArrays(int subArr1[],int start, int mid, int end){
 int p1= start;
 int p2 = mid+1;

 int p3=0;
 int [] mergedArr = new int[end-start+1];
 while(p1<=mid && p2<=end){
     if(subArr1[p1]<subArr1[p2]){
         mergedArr[p3] = subArr1[p1];
         p1++;
         p3++;
     }
     else{
         mergedArr[p3] = subArr1[p2];
         p2++;
         p3++;
     }

     }
 while(p1<=mid){
        mergedArr[p3] =subArr1[p1];
        p1++;
        p3++;
 }
 while(p2<=end){
     mergedArr[p3] =subArr1[p2];
     p2++;
     p3++;
 }
 for(int i=0;i<end-start+1;i++) {
     subArr1[start+i] = mergedArr[i];

 }
 return subArr1;
 }
}
