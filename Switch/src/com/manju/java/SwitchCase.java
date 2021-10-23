package com.manju.java;
import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		
		for(;;) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Do you want to continue press y or Y else print any key");
		String y=sc.next();
		
		
		boolean res=y.equals("y");
		boolean res1=y.equals("Y");
		
		if(res==true || res1) {
		
				
			System.out.println("Enter any number below 6 \n1 for addition \n2 for avergae \n3 for even/odd \n4 for posititve or negative \n5 for prime or not");
			int num=sc.nextInt();
			
			switch(num){
			case 1:System.out.println("Addition of two numbers \n Enter two numbers");
			       int a=sc.nextInt();
			       int b=sc.nextInt();
			       System.out.println("Result is "+(a+b));
			       break;
			case 2:System.out.println("Average of two numbers \n Enter two numbers");
		           int a1=sc.nextInt();
		           int b1=sc.nextInt();
		           float c=(float)(a1+b1)/2;
		           System.out.println("Result is "+c);
		           break;
			case 3:System.out.println("Check even or odd \n Enter a number");
			       int d=sc.nextInt();
			       if(d%2==0) {
			          System.out.println("Even Number");
			       }
			       else
			        System.out.println("odd number");
			       break;
			case 4:System.out.println("Check positive or negative \n Enter a number");
	        		int e=sc.nextInt();
	        		if(e<0) {
	        			System.out.println("Negative");
	        		}
	        		else
	        		System.out.println("Positive");
	        		break;
	        	
			case 5:System.out.println("Check prime or not \n Enter a number");
					   int f=sc.nextInt();	
					   if(f==2)
						   System.out.println("Prime number");
					   else if(f%2==0) {
			        	   System.out.println("Not a Prime Number");
			           }
			           else
			        	   System.out.println("Prime number");
			           break;
			           
			default:System.out.println("OOPs Not that one");
				break;	 
		       
			 }//switch
			
		}//if
			
	
		else {
			System.exit(0);	
			
		}
		
	}
	}//for	
}
