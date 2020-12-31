package com.cjc.calculator.client;

import com.cjc.calculator.services.Calculator;

public class Test {
	
		public static void main(String args[]){         //Give the proper msg to call calculator methods 
			 Calculator w = new Calculator();
			 System.out.println("enter 1 for addition \n "+"enter 2 for subraction \n "+"enter 3 for Multiplication \n"+ "enter 4 for multiplication");
			int x = 4;
			switch(x){                                    //Only call calculator methods here
			
			case 1 : 
				w.add();
				break;
			case 2 :
				w.sub();
				break;
			case 3 :
				w.mul();
				break;
			case 4 :
				w.div();
				break;	
			 default:
			    	System.out.println("proper input required");
			
		}}}
				
	

