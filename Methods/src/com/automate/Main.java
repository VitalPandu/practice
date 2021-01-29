package com.automate;
import static java.lang.System.in;
import static java.lang.System.out;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        boolean gameOver=true;
        out.println("Enter Score. levelsCompleted,bonus");
        int score=sc.nextInt();
        int levelCompleted=sc.nextInt();
        int bonus=sc.nextInt();
        int finalScore=calculatedScore(gameOver,score,levelCompleted,bonus);
        out.println(finalScore);
    }
    public static int calculatedScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore=0;
        if(gameOver){
                finalScore+=score+(levelCompleted*bonus);
            }
        return finalScore;
    }
}
