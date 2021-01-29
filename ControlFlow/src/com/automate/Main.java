package com.automate;
import static java.lang.System.out;
public class Main {

    public static void main(String[] args) {
	//Switch Statements
       char switchChar='B';
       switch (switchChar){
                 default:
                     out.println("Invalid input");
                     break;
                     case'A':
                       out.println("A");
                         break;
                     case 'B':
                         out.println("B");
                         break;
       }

        //for loop
       for(int i=8;i>=2;i--)
       out.println("10000 at" + i+"%  interest=" +String.format("%.2f",calculateInterest(10000,i)));
    }

    static public double calculateInterest(double amount,double interest){
        return amount*(interest/100);
    }
}
