package com.automate;

public class Demo {
    static Pizza pizza ;

    public Demo(Pizza pizza) {
        this.pizza=pizza;
    }

    public void demo(){
        pizza.setCheeseType("Cottage ");
        System.out.println(pizza.getCheeseType());
        System.out.println("Parent class");
    }
}

