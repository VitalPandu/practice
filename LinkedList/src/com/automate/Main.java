package com.automate;

import sun.awt.image.ImageWatched;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        LinkedList<String> placesToVisit = new LinkedList<>();
//        addInorder(placesToVisit,"Khammam");
//        addInorder(placesToVisit,"Suryapet");
//        addInorder(placesToVisit,"Hyderabad");
//        addInorder(placesToVisit,"Banglore");
//        addInorder(placesToVisit,"Assam");
//        addInorder(placesToVisit,"Bihar");
//
//        printList(placesToVisit);
//
////        placesToVisit.add(2,"Suryapet");
////        printList(placesToVisit);
////
////        placesToVisit.remove(1);
////        printList(placesToVisit);
       playerCall();

    }

    private static  void printList(LinkedList<String> linkedList){
        Iterator<String> i=linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now Visiting " + i.next());
        }
        System.out.println("=============================");
    }

    private static boolean addInorder(LinkedList<String> linkedList,String newCity){
        ListIterator<String> stringListIterator=linkedList.listIterator();
        while(stringListIterator.hasNext()){
            int comparision = stringListIterator.next().compareTo(newCity);
            if(comparision==0){
                System.out.println(newCity+ " is already included as a destination");
                return false;
            }
            else if(comparision>0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
            else if(comparision<0){

            }

        }
        stringListIterator.add(newCity);
        return true;
    }

    public static LinkedList<String> playerCall(){
        LinkedList<String> values=new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name and weapon");

        String name=sc.next();
        String weapon=sc.next();
        short hitpoints=100;
        short lifes=3;
        Saveable save= new Player(name,hitpoints,3,weapon);
        System.out.println("Enter your choice ");

        boolean quit= false;
        while (!false){
            System.out.println("\n1.save"+"\n2.load"+"\n3.Replay"+"\n0.quit");

            switch (sc.nextInt()){
                case 0:
                    quit=true;
                    break;
                case 1:
                    saveableObject(save);
                    quit=false;
                    break;
                case 2:
                    loadObject(save);
                    quit=false;
                    break;
                case 3:
                    playerCall();
                    break;
            }
        }
    }
     public static void saveableObject(Saveable objectToSave){
        for (int i=0;i<objectToSave.write().size();i++){
            System.out.println("Saving " +objectToSave.write().get(i)+" to Storage device");
        }
     }

     public static void loadObject(Saveable loadObject){
        LinkedList<String> values= playerCall();
        loadObject.read(values);
     }
}
