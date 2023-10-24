package com.scaler.advancedDSA.stacks2.session;

import java.util.ArrayList;

public class HistogramArea {

    public static void main(String[] args) {
        int area = HistogramArea.areaOfHistogram(new int[]{3,2,5,7,4,6,5,2,3,1,5,6,4,3,5,6,4,1});

        System.out.print(area);
        ArrayList<Integer> arrayList = new ArrayList<>();

    }

    private static int areaOfHistogram(int heightArr[]){
        int N = heightArr.length;
        int [] minElementIndexOnRight = NearestMaxorMin.nearestMinElementIndexOnRight(heightArr);
        int [] minElementIndexOnLeft = NearestMaxorMin.nearestMinElementIndexOnLeft(heightArr);
        int ans=0;
        for(int i=0;i<N;i++){
            ans = Math.max(ans,heightArr[i]*(minElementIndexOnRight[i]-minElementIndexOnLeft[i]-1));
        }
        return ans;
    }
}
