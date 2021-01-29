package com.automate;

public class DeskPhone implements ITelephone{
    private int myNumber;
    public DeskPhone(int myNumber) {
        this.myNumber=myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("power on...");
    }

    @Override
    public void dail(int phoneNumber) {
        System.out.println("Dailing "+phoneNumber);
    }

    @Override
    public void answer() {
        System.out.println("Call Answred");
    }
    public void print(){
        System.out.println("This is sub class method");
    }
}
