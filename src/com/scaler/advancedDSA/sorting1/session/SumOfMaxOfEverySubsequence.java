package com.scaler.advancedDSA.sorting1.session;

public class SumOfMaxOfEverySubsequence {
    static int arr[] ={4,7,2,5,8,10};

    public static void main(String[] args) {

        MergeSortAnyArray sort = new MergeSortAnyArray();
        sort.mergeSort(arr,0,arr.length-1);
        int sum = sumOfMaxofSubsequences(arr);
        System.out.print(sum);
    }
    public static int sumOfMaxofSubsequences(int arr1[]){
        int ans = 0;
        for(int i=0;i<arr1.length;i++){
            ans += Math.pow(2,i)*arr1[i];
        }
        return ans;
    }
}
