package com.braindata.bankmanagement.serviceImpl;
import java.util.Scanner;

import com.braindata.bankmanagement.model.Account;

public class Hdfc {
	int ggg = 0;
	Scanner sc = new Scanner (System.in);
	Account a =new Account ();
	public void createAccount() 
	{
		System.out.println("Enter Your Account Number");
		String q = sc.next();
		a.setAccNo(q);
	        
		System.out.println("Enter Your Name");
	    String w = sc.next();
	    a.setName(w);
	    
	    System.out.println("Enter Your Mobile Number");
		String  e = sc.next();
		a.setMobNo(e);
	
		System.out.println("Enter Your Aadhar Card Number");
		String  r = sc.next();
		a.setAdharNo(r);
		
		System.out.println("Enter your Gender");
		String t = sc.next();
		a.setGender(t);
		
		System.out.println("Enter your Age");
		int y = sc.nextInt();
		a.setAge(y);
		
		System.out.println("Enter your Balance");
		double u = sc.nextDouble();
		
		while(u>0){ 
			{
		     if (u<=2000) {
		    	 System.out.println("Please enter balance more than 2000!!!");
		         System.out.println("Please enter the balance!!!");
		         u = sc.nextDouble();
		         
			} else 
		         {
		    	 a.setBalance(u);
		    	 ggg++;
		    	 System.out.println("Account created successfully !!!");
		    	 break;
		         } }}}
	public void displayAllDetails()
	{    
		if (ggg!=0)
		{
		System.out.println(a.getAccNo());
		System.out.println(a.getName());
		System.out.println(a.getMobNo());
		System.out.println(a.getAdharNo());
		System.out.println(a.getGender());
		System.out.println(a.getAge());
		System.out.println(a.getBalance());
		
		
		System.out.println("---------------------------------");
		}
		else {
			System.out.println("First create Account ");
		}
	}
	public void depositeMoney()
	{
		if (ggg!=0) {
		System.out.println("Please enter Deposit Amount");
		double gg = sc.nextDouble();
		double hh = a.getBalance()+gg;
		a.setBalance(hh);
		
		System.out.println("---------------------------------");
	     }
		else {
			System.out.println("First create Account ");
		     }
    }
	

	public void withdrawal()
	{
		if (ggg!=0) {
		System.out.println("Please enter Withdrawal Amount");
		double jj = sc.nextDouble();
		double kk = a.getBalance()-jj;
		//a.setBalance(kk);
		while (true)
		{
			if (kk<=500) 
		{
				System.out.println("please keep a minimum balance of 500");
				System.out.println("Please enter Withdrawal Amount");
				kk = a.getBalance()- sc.nextDouble();
			}
		
	else {
		        a.setBalance(kk);
		        System.out.println("Please collect the cash");
		        break;
		  }}}}
		

	public void balanceCheck()
	{
		if (ggg!=0) {
		System.out.println("Your Balance is ");
		System.out.println(a.getBalance());
		}
	else {
		System.out.println("First create Account ");
	}
}

	
	
}
	


