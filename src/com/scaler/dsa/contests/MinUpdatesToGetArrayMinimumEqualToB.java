package com.scaler.dsa.contests;

import java.util.Arrays;

public class MinUpdatesToGetArrayMinimumEqualToB {

    public static void main(String[] args) {
    int minUpdate = minUpdates(new int[]{69,47,21,11},96);
    System.out.print(minUpdate);
    }

    public static int minUpdates(int[] arr,int B){
        int ans =0;
        //Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){

                if(Math.min(arr[i],B)<=B)
                    ans+=1;


            return ans;
        }
        return -1;
    }
}

