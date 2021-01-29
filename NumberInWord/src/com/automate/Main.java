package com.automate;

public class Main {

    public static void main(String[] args) {
        // write your code here
        isOdd(3);
        //sumOdd(1,5);

    }

    static boolean isOdd(int number){
        if(number%2!=0){
            sumOdd(number, 50);
            return true;
        }
        return false;
    }

        static void sumOdd(int start, int end){
        int count=0;
        for (int i=1;(i>=start)&&(i<=end);i+=2){
           count+=i;
        }  System.out.println(count);

        }




}