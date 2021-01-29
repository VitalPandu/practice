package com.automate;

public class BankAccount {
    private String accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    public BankAccount(  String accountNumber,int balance,String customerName,String email,String phoneNumber){
        this.accountNumber=accountNumber;
        this.balance=-balance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    /*public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }*/
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public int getBalance(){
       return this.balance;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public int deposit(int balance){
        return (this.balance+balance);
    }
    public int withdrawl(int balance){
       if(balance< 0) System.out.println("insufficent funds");;
        return(this.balance-balance);
    }
}
