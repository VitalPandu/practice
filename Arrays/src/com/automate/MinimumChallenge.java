package com.automate;
import static java.lang.System.*;
import java.util.Scanner;

public class MinimumChallenge {

    public int[] readIntegers(int count){
        Scanner sc= new Scanner(in);
        int[] array= new int[count];

         for(int i=0;i<array.length;i++){
             array[i]=sc.nextInt();
             //out.println("Entered numbers are="+array[i]);
         return array;
         }
         return null;

    }
}
