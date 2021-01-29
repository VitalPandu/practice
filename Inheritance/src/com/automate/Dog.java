package com.automate;

public class Dog extends Animal{

    public Dog(String name, int brain, int body, int size) {
        super(name, brain, body, size);
    }
    public void sleep(){
        System.out.println("Sleep for 8 hrs");
        Animal.eat();
    }
}
