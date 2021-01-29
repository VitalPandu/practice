package com.automate;
import static java.lang.System.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
      double res=  clacFeetAndInchesToCentimeters(5,150);
        out.println(res);
    }
    static double clacFeetAndInchesToCentimeters(double feet,double inches) {

        if (feet >= 0 && (inches >= 0 && inches <= 12))
            return ((feet * 12 * 2.54) + (inches * 2.54));
        else return -1;
    } 
}
