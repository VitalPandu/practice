package com.automate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number=123;

        while(number>0){
            int rev=0;
            int d=number%10;
                 rev=(rev*10)+d;
            System.out.print(rev);
           number/=10;

        }
    }
}
