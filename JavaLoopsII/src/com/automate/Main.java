package com.automate;
import java.util.Scanner;

import static java.lang.System.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int n= sc.nextInt();
        for(int i=1;i<n-1;i++){
            int s=a+(i*b)+((i+1)*b);
            out.println(s);
        }

    }
}
