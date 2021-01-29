package com.automate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(canPack(1,0,4));
    }
    public static boolean canPack(int bigCount,int smallCount, int goal){
        if(goal==((bigCount*5)+smallCount) || goal==((bigCount*5)+smallCount)+1 || goal==((bigCount*5)+smallCount)-1 && bigCount>goal){
            return true;
        }
        return false;

    }
}
