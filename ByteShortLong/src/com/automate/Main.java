package com.automate;
import static java.lang.System.out;
public class Main {

    public static void main(String[] args) {
	//int maximum and minimum values
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue= Integer.MAX_VALUE;
        //System.out.println("Int minimum value" +myMinIntValue);
        //System.out.println("Int Max value" +myMaxIntValue);

        //byte maximum and minimum values
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxbyteValue= Byte.MAX_VALUE;
        //System.out.println("byte minimum value" +myMinByteValue);
        //System.out.println("byte Max value" +myMaxbyteValue);

        // int datatype test
        int myMinIntValueTest= myMinIntValue/2;
       // System.out.println(myMinIntValueTest);

        //Byte data type test
        byte myMinByteValueTest=  (byte)(myMinByteValue/2);
       // System.out.println(myMinByteValueTest);

        //exercise
        byte byteNumber=121;
        short shortNumber=32760;
        int intNumber=1000;
        long longNumber= 50000L +10L*(byteNumber+shortNumber+intNumber);
        //System.out.println("Long total=" +longNumber);

        //Decimal point values "Float and Double"
        float myFloatValue= 5.25f ;
        double myDoubleValue=5.25d;//by default decimal point values are double

        // Exercise
        double numberOfPounds=200;
        double convertedKilograms=numberOfPounds*0.45359237;
       // System.out.println(convertedKilograms);

        //char types
        char myChar='d';
        char myUnicodeChar='\u0044';
        //System.out.println(myChar);
       // System.out.println(myUnicodeChar);

        //operator challange
        double a=20.00;
        double b=80.00  ;
        double total=(a+b)*100.00;
        double remainder=total%40.00;
        System.out.println(remainder);
        boolean isTrue=(remainder==0)?true:false;
        System.out.println(isTrue);
        if(!isTrue){
            System.out.println("got some remainder");
        }

        int myVariable=50;
        myVariable++; 
        out.println(a);

    }
}
