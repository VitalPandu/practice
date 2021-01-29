package com.automate;

import java.util.Scanner;
import static java.lang.System.*;
public class Main {

    public static void main(String[] args) {
	//
    VipCustomer vc= new VipCustomer();
    out.println("Name="+vc.getName()+"\t Creditlimit="+vc.getCreditLimit()+"\tEmail="+vc.getEmail());
    VipCustomer Vc= new VipCustomer("vital",12000.0);
    out.println("Name="+Vc.getName()+"\t Creditlimit="+vc.getCreditLimit()+"\tEmail="+vc.getEmail());
    VipCustomer VC= new VipCustomer("vital",12000.0,"pandu.y13@gmail.com");
    out.println("Name="+VC.getName()+"\t Creditlimit="+VC.getCreditLimit()+"\tEmail="+VC.getEmail());


    }
}
