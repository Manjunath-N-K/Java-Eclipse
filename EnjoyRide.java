package com.assesment1.java;

import java.util.Scanner;

public class EnjoyRide {

public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		for(;;)  //for user interactivity
		{
		System.out.println("Do you wish to continue press y or Y else press any key");
		String y=sc.next();
		boolean res=y.equals("y");
		boolean res1=y.equals("Y");
		if(res==true || res1==true)
		{
	
			
		System.out.println("Enter the number of adults");
		int adult=sc.nextInt();
		System.out.println("Enter the number of childrens");
		int child=sc.nextInt();
		System.out.println("Enter the name of the ride {1.alibab,2.alpine slide,3.bumpper ride 4.baloon race} ");
		int sel=sc.nextInt();
		System.out.println("Enter the number of hours");
		int hours=sc.nextInt();
		
		calculate(adult,child,sel,hours);	
		
		}else {
			System.out.println("Enjoy the ride");
			break;
		}
		
	}//for
		
}//main

public static void calculate(int a, int c, int sel,int h) {
	// TODO Auto-generated method stub
	
	//System.out.println("You Selected "+str.toUpperCase()+" Ride");
	
	switch(sel) {
	
		case 1:System.out.println("You Selected ALIBABA Ride");
						Alibaba ab=new Alibaba();
						ab.calculate(a, c, h);
						break;
		
		case 2:System.out.println("You Selected ALPINE SLIDE Ride");
			alpineSlide as=new alpineSlide();
							as.calculate(a, c, h);
							break;
	
		case 3:System.out.println("You Selected BUMPPER CARS Ride");
							BumpperCars bs=new BumpperCars();
							bs.calculate(a, c, h);
							break;
						
		case 4:System.out.println("You Selected BALOON RACE Ride");
			baloonRace br=new baloonRace();
		br.calculate(a, c, h);
		break;
	
		
		default:System.out.println("Try out an existing game");
			break;
			
	}//end switch
	
}//end main
}//end class
