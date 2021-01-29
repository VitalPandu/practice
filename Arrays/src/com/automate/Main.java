package com.automate;
import java.util.Scanner;

import static java.lang.System.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
//        int[] myIntVariable=new int[10];
//        myIntVariable[5]=50;
//        myIntVariable[0]=80;
//       // System.out.println(myIntVariable.length  );
//       int []myInteger=myIntVariable;
//        System.out.println("myInteger="+myInteger[5]);
//        System.out.println("myIntVAriable="+myIntVariable[0]);
//        myInteger=new int[]{1,2,3,4,5,6};
//        System.out.println("myInteger="+myInteger[5]);
        Scanner sc=new Scanner(in);
        MinimumChallenge mc=new MinimumChallenge();
        out.print("Enter the number you want to store in an array");
        out.println("Entered numbers are="+mc.readIntegers(sc.nextInt()));

    }

}
