package com.association1.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		UnderGrad ug=new UnderGrad();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter student details \nEnter name");
		ug.setName(sc.nextLine());
		System.out.println("Enter roll");
		ug.setRollno(sc.nextInt());
		System.out.println("Enter year of studying");
		ug.setYear(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter city");
		ug.setCity(sc.nextLine());
		
		System.out.println("Enter Branch");
		String s=sc.nextLine();
		
		System.out.println("Enter Club");
		String s1=sc.nextLine();
		
		
		System.out.println("Student details are");
		System.out.println("Name " +ug.getName());
		System.out.println("Roll-no "+ug.getRollno());
		ug.getBranch(s);
		System.out.println("Studied Year "+ug.getYear());
		System.out.println("City "+ug.getCity());
		ug.getSociety(s1);
	
	}
}
