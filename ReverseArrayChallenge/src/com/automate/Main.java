package com.automate;

public class Main {

    public static void main(String[] args) {
	// write your code here
      /*  int[] array=new int[]{1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<array.length;i++)
        System.out.print("\t"+array[i]);
        System.out.println("\n");
        reverse(array);*/

        String s="hello";
        String s1="hello";
      System.out.println(s.hashCode());
        System.out.println(s1.hashCode());

    }
    static void reverse(int[] array){
        for(int i=array.length-1;i>=0;i--){
            System.out.print("\t"+array[i]);
        }
    }
}
