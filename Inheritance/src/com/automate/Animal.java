package com.automate;

public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;

    public Animal(String name, int brain, int body, int size) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
    }
   public  static void eat(){
       System.out.println("Eat twice a day");
   }
}
