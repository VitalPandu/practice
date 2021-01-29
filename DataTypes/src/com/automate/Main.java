package com.automate;
import java.util.Scanner;

import static java.lang.System.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(in);
        out.println("Enter Number of test cases");
        int testCase=sc.nextInt();
        out.println("Enter Number to check which can be fitted in");
        for (int i=0;i<testCase;i++){
            int a=sc.nextInt();
            if((a<Short.MAX_VALUE && a>Short.MIN_VALUE) )
                out.println("*short"+"\n"+"*int"+"\n"+"*long");
            else if(a<Integer.MAX_VALUE && a>Integer.MIN_VALUE)
                out.println("*Int"+"\n"+"*long");
            else if(a<Long.MAX_VALUE && a>Long.MIN_VALUE)
                out.println("*long");
            else
                out.println("cannot be fitted");



        }
    }
}
