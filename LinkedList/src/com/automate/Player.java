package com.automate;

import java.util.LinkedList;

public class Player implements Saveable {
    private String name;
    private int hitPoints;
    private int lifes;
    private String weapon;

    public Player(String name, int hitPoints, int lifes, String weapon) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.lifes = lifes;
        this.weapon = weapon;
    }

    @Override
    public LinkedList<String> write() {
        LinkedList<String> values=new LinkedList<>();
        values.add(0,this.name);
        values.add(1,""+(this.hitPoints));
        values.add(2,""+(this.lifes));
        values.add(3,this.weapon);
    return values;
    }

    @Override
    public void read(LinkedList<String> saveableValues) {
        if (saveableValues.size()!=0 && saveableValues.size()>0){
            this.name=saveableValues.get(0);
            this.hitPoints=Integer.parseInt(saveableValues.get(1));
            this.lifes= Integer.parseInt(saveableValues.get(2));
            this.weapon=saveableValues.get(3);

        }

    }
}
