package com.automate;

public class Pizza {
    private String sauceType;
    private String cheeseType;

    public Pizza(String sauceType, String cheeseType) {
        this.sauceType = sauceType;
        this.cheeseType = cheeseType;
    }

    public String getSauceType() {
        return sauceType;
    }

    public void setSauceType(String sauceType) {
        this.sauceType = sauceType;
    }

    public String getCheeseType() {
        return cheeseType;
    }

    public void setCheeseType(String cheeseType) {
        this.cheeseType = cheeseType;
    }
}


