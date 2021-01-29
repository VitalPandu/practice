package com.automate;
import static java.lang.System.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Enter a number to be checked");
        double number = sc.nextInt();
        // checkNumber(number);
        printConversion(number);
    }

   /* static public void checkNumber(int number) {
        if (number == 0)
            System.out.println("The Given NUmber is positive");
        else if (number > 0)
            out.println("Given number is Positive");
        else
            out.println("Given umber is  negative");

    }*/

    public static long toMilesPerHour(double KilometersPerHour) {
       long result=0;
        if (KilometersPerHour < 0)
            result =-1;
        else if (KilometersPerHour > 0)
            result =Math.round(KilometersPerHour * 0.6);
           return result;
    }
    public static void printConversion(double kilometersPerHour){
        out.println(toMilesPerHour(kilometersPerHour));
       out.println(kilometersPerHour+"km/h="+  kilometersPerHour/1.6+"mi/h");
    }
}
