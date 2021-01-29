package com.automate;
import java.util.Scanner;

import static java.lang.System.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(in);

        while(true) {
            out.print("Enter Number");
            boolean hasNextInt=sc.hasNextInt();
            int minimum = sc.nextInt();
            int maximum = sc.nextInt();
            if (maximum>minimum)out.print("Given number is "+maximum);
            else out.print("Given number is "+minimum);
        }
        out.print("Enter Valid number");
        sc.close();
    }
    }
