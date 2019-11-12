package com.hackerrank.problems;

public class BirthdayCakeCandles {

    public static void main(String[] args) {
        int ar[] = {3,2,1,3};
        int maxHeight = 0;
        int num = 0;
        for(int i : ar){
            if(maxHeight < i){
                maxHeight = i;
                num = 1;
            }else if(maxHeight == i){
                num++ ;
            }
        }
        System.out.println(num);
    }
}
