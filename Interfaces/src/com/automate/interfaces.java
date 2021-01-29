package com. automate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class interfaces {
    public static void main(String[] args) {
        /*ITelephone vPhone=new DeskPhone(1234567890);
        vPhone.powerOn();
        vPhone.dail(970339);
        vPhone.answer();*/

        player vital = new player("vital", 100, 10);

        System.out.println(vital.toString());
        savableObject(vital);

        vital.setHitpoints(0);
         vital.setWeapon("stone breaker");
        System.out.println(vital);
        System.out.println("---------------------------");
        savableObject(vital);
        vital.setWeapon("Bstone");
       savableObject(vital);
       System.out.println("-----------------");
       loadObject(vital);
        System.out.println(vital);



    }
    public static  ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<>();

        Scanner sc=new Scanner(System.in);
        boolean quit=false;
        int index=0;
        System.out.println("Choose\n"+
                    "1 to enter a string\n"+
                    "0 to quit");
        while(!quit){
            System.out.println("Enter your choice");
            int choice= sc.nextInt();
            switch(choice){
                case 0:
                    quit=true;
                    break;
                 case 1:
                    System.out.println("Enter a string");
                    String stringInput=sc.next();
                    values.add(index,stringInput);
                    index++;
                    break;
            }

        } quit=true;
        return values;
    }

    public static void savableObject(Saveable objectToSave){
        for (int i=0;i<objectToSave.write().size();i++){
            System.out.println( "Saving "+ objectToSave.write().get(i)+" to storage device");

        }

    }
    public static void loadObject(Saveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }


    }
