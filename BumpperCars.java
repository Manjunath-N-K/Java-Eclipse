package com.assesment1.java;

public class BumpperCars {

	private int adult=45;
	private int child=25;
	
	public void calculate(int a,int c,int h) {
		
		double sum=(a*adult+c*child)*h;
		System.out.println("total cost of the adults is "+a*adult+"$");
		System.out.println("total cost of the childrens is "+c*child+"$");
		System.out.println("total cost of the ride is "+sum+"$");

		
	}
}
