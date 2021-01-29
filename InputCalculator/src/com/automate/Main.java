package com.automate;
import java.util.Scanner;

import static java.lang.System.*;


public class Main {

    public static void main(String[] args) {
	// write your code here
        inputThenPrintSumAndAverage();
    }
    static void inputThenPrintSumAndAverage(){
        Scanner sc=new Scanner(in);
        int count=0,a=0,sum=0;
       while(sc.hasNextInt()){
            a=sc.nextInt();
            sum+=a;
            count++;
       }    out.println("SUM = " +sum+ "AVG =" +(sum/count));



    }
}
