package com.automate;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> myContact;
     private String myNumber;
    public MobilePhone(String myNumber){
        this.myNumber=myNumber;
        myContact=new ArrayList<Contact>();
    }

    //Adding Contacts
    public boolean addNewContact(Contact contact){
       if (findContact(contact.getName())>=0){
           System.out.println("Contact is already on file");
           return false;
       }else
            myContact.add(contact);
        System.out.println(contact.getName()+ " was added to contacts");
        return true;
       }

       //Updating Contacts
  public boolean updateContact(Contact oldContact,Contact newContact){
       int findPosition=findContact(oldContact);
       if (findPosition<0){
           System.out.println(oldContact.getName()+" was Not found");
           return false;
       }
       this.myContact.set(findPosition,newContact);
      System.out.println(oldContact.getName()+" was replaced by" +
              newContact.getName());
       return true;
    }

    //Removing contact from avalilable list
   public boolean removeContact(Contact removeContact){
           int findPosition=findContact(removeContact);
            if(findPosition<0){
                System.out.println("contact is not in the file");
                return false;
            }
            this.myContact.remove(findPosition);
       System.out.println(removeContact.getName()+"was removed sucessfully");
        return true;
    }

    //Search contact and their position
   private int findContact(Contact contact){
        return this.myContact.indexOf(contact);
    }
   private int findContact(String contactName){
        for(int i=0;i<this.myContact.size();i++){
            Contact contact=this.myContact.get(i);
            if (contact.getName().equals(contactName))
                return i;
        }
        return -1;
    }
    public Contact queryContact(String name){
        int position= findContact(name);
        if (position>=0){
            return this.myContact.get(position);
        }
        return null;
    }

    //selecting particular query
    public String queryContact(Contact contact){
        if (findContact(contact)>=0){
            return contact.getName();
        }
        return null;
    }
     public void printContacts(){
         System.out.println("Contact List");
         for (int i=0;i<myContact.size();i++){
             System.out.println((i+1)+"."+this.myContact.get(i).getName()+
                     "->"+this.myContact.get(i).getPhoneNumber());
         }
     }

}
