package com.automate;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> myIntArray=new ArrayList<>();
//        myIntArray.add(56);
        for(int i=0;i<10;i++){
            myIntArray.add(Integer.valueOf(i));//converting primitive to object i.e,Integer.valueOf(i)
        }

        //unboxing
        for (int i=0;i<myIntArray.size();i++){
            System.out.println(i+"--->"+myIntArray.get(i).intValue());//intValue() is doing unboxing i.e, converting object value to primitive data
        }
    }
}
