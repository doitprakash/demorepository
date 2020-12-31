package com.braindata.bankmanagement.client;

import com.braindata.bankmanagement.serviceImpl.Sbi;
import java.util.Scanner;
public class Test {
         
	public static void main(String[] args){
System.out.println ("new line");
		Sbi bank=new Sbi();
		while(true) {
			System.out.println("For Creating Account         Press 1\n"+
			                   "For Displaying All details   Press 2\n"+
			                   "For Depositing Money         Press 3\n"+
			                   "For Withdrawal               Press 4\n"+
			                   "For Checking Balance         Press 5\n");
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Choice:");
		int a = sc.nextInt();
		
	//Display proper msg for calling methods.
	//As per user choice perform bank operation using switch case
		
		
	int x = a;
	switch(x)
	{
	case 1 :
		bank.createAccount();
		break;
	case 2 :
		bank.displayAllDetails();
		break;
	case 3 :
		bank.depositeMoney();
		break;
	case 4 :
		bank.withdrawal();
		break;
	case 5 :
		 bank.balanceCheck();
		break;
		}
	 

	}}}

