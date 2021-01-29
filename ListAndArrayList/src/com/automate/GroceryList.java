package com.automate;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList=new ArrayList<String>();

   //Adding Grocery List
    public void addGroceryList(String item){
        groceryList.add(item);
    }

    //Removing Grocery List
    public void removeGroceryList(int position){
        String theItem= groceryList.get(position);
        groceryList.remove(position);
    }

    //Updating Grocery List
    public void updatingGroceryList(int position,String newItem){
        groceryList.add(position,newItem);
        System.out.println("Your Grocery item" +(position+1)+"has been modified");
    }

    //Search the item
    public String findItem(String searchItem){
    int position=groceryList.indexOf(searchItem);
    if(position>=0)
        return groceryList.get(position);
    return null;
    }

    //Print GroceryList
    public void printingGroceryList(){
        System.out.println("You have " +groceryList.size() +"items in your grocery list");
        for(int i=0;i<groceryList.size();i++){
            System.out.println((i+1)+"."+groceryList.get(i));
        }
    }
}
