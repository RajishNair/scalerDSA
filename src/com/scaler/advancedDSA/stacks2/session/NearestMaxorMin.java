package com.scaler.advancedDSA.stacks2.session;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.stream.IntStream;

public class NearestMaxorMin {

    public static void main(String[] args) {
    //int [] minOnLeft = NearestMaxorMin.nearestMinElementOnLeft(new int[]{4,8,12,7,9,12,5});
    //int [] minOnRight = NearestMaxorMin.nearestMinElementOnRight(new int[]{4,8,12,7,9,12,5});
    int [] minElementIndexOnRight = NearestMaxorMin.nearestMinElementIndexOnRight(new int[]{3,2,5,7,4,6,5,2,3,1,5,6,4,3,5,6,4,1});
    int [] minElementIndexOnLeft = NearestMaxorMin.nearestMinElementIndexOnLeft(new int[]{3,2,5,7,4,6,5,2,3,1,5,6,4,3,5,6,4,1});
    //System.out.println(Arrays.toString(minOnLeft));
    //System.out.print(Arrays.toString(minOnRight));
        System.out.print(Arrays.toString(minElementIndexOnRight));
        System.out.print(Arrays.toString(minElementIndexOnLeft));
    }

    public static int[] nearestMinElementOnLeft(int arr[]){

        int N = arr.length;
        //int t=0;
        int [] ans = new int[N];
        Arrays.fill(ans,-1);
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<N;i++){
            //if top is no more an option as minimum for future elements
            while(stack.size()>0 && stack.peek()>=arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty())
                ans[i] = stack.peek();
            stack.push(arr[i]);
        }


        return ans;
    }

    public static int[] nearestMinElementOnRight(int arr[]){

        int N = arr.length;
        //int t=0;
        int [] ans = new int[N];
        Arrays.fill(ans,-1);
        Stack<Integer> stack = new Stack<>();
        //for every arr[i] get the 1st smaller element from its right
        for(int i=N-1;i>=0;i--){
            //if top is no more an option as minimum for future elements
            while(stack.size()>0 && stack.peek()>=arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty())
                ans[i] = stack.peek();
            stack.push(arr[i]);
        }


        return ans;
    }

    public static int[] nearestMinElementIndexOnRight(int arr[]){

        int N = arr.length;
        //int t=0;
        int [] ans = new int[N];
        Arrays.fill(ans,-1);
        Stack<Integer> stack = new Stack<>();
        //for every arr[i] get the 1st smaller element from its right
        for(int i=N-1;i>=0;i--){
            //if top is no more an option as minimum for future elements
            while(stack.size()>0 && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty())
                ans[i] = stack.peek();
            stack.push(i);
        }


        return ans;
    }
    public static int[] nearestMinElementIndexOnLeft(int arr[]) {

        int N = arr.length;
        //int t=0;
        int[] ans = new int[N];
        Arrays.fill(ans, -1);
        Stack<Integer> stack = new Stack<>();
        //for every arr[i] get the 1st smaller element from its right
        for (int i = 0; i<N; i++) {
            //if top is no more an option as minimum for future elements
            while (stack.size() > 0 && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty())
                ans[i] = stack.peek();
            stack.push(i);
        }
        return ans;
    }
}
