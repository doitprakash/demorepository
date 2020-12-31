package com.braindata.bankmanagement.serviceImpl;

import com.braindata.bankmanagement.model.Account;
import com.briandata.bankmanagement.service.RBI;

import java.util.Scanner;
public class Sbi implements RBI {
	   
	       int ggg = 0;
	      Scanner sc = new Scanner(System.in);
	      Account a = new Account ();               //implements all methods here
		public void createAccount()
		{
			System.out.println("Enter Your Account Number");
			String  q = sc.next();
			a.setAccNo(q);
			System.out.println("Enter Your Name");
			String  aa = sc.next();
			a.setName(aa);
			System.out.println("Enter Your Mobile Number");
			String  bb = sc.next();
			a.setMobNo(bb);
			System.out.println("Enter Your Aadhar Card Number");
			String  cc = sc.next();
			a.setAdharNo(cc);
			System.out.println("Enter your Gender");
			String  dd = sc.next();
			a.setGender(dd);
			
			System.out.println("Enter your Age");
			int  ee = sc.nextInt();
			if(ee<18) {
				System.out.println("Age should be more than 18");
			}
			else {
				a.setAge(ee);
			
			System.out.println("Enter your Balance");
			double ff = sc.nextDouble();
			
			while(ff>0){ 
			{
		     if (ff<=500) {
		    	 System.out.println("Please enter balance more than 500!!!");
		         System.out.println("Please enter the balance!!!");
		         ff = sc.nextDouble();
		         //a.setBalance(ff);
			} else 
		         {
		    	 a.setBalance(ff);
		    	 ggg++;
		    	 System.out.println("Account created successfully !!!");
		    	 break;
		         } 
			
			}}}}
		
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
		
