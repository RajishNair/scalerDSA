package com.scaler.contests.practice;

public class BinaryToDecimal {
    public static void main(String[] args) {
           int decimal = BinaryToDecimal.solve(1,3);
           System.out.print("decimal ------- "+decimal);
    }

    public static int solve(int A, int B){
        StringBuilder sb1 = new StringBuilder();

        for(int i=0;i<A;i++)
            sb1.append(1);
        for(int i=0;i<B;i++)
            sb1.append(0);
        String num = sb1.toString();
        char[] numArr = num.toCharArray();
        int decimal =0;
        int N = numArr.length-1;
        for(int i=0;i<=N;i++){
                if(numArr[i]=='1')
                    decimal+= Math.pow(2,N-i);



        }
        return decimal;
    }
}
