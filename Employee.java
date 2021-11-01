package com.assesment2.java;

import java.util.Scanner;

public class Employee {

	private static int employeeid;
	private static String employeename;
	private static float basic;
	private static float sa;
	private static float hra;
	private static float tra;
	private static int tax=2500;
	
	

	public synchronized int getEmployeeid() {
		return employeeid;
	}
	public synchronized void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public synchronized String getEmployeename() {
		return employeename;
	}
	public synchronized void setEmployeensame(String employeename) {
		this.employeename = employeename;
	}
	public synchronized float getBasic() {
		return basic;
	}
	public synchronized void setBasic(float basic) {
		this.basic = basic;
	}
	public synchronized float getSa() {
		return sa;
	}
	public synchronized void setSa(float sa) {
		this.sa = sa;
	}
	public synchronized float getHra() {
		return hra;
	}
	public synchronized void setHra(float hra) {
		this.hra = hra;
	}
	public synchronized float getTra() {
		return tra;
	}
	public synchronized void setTra(float tra) {
		this.tra = tra;
	}
	public synchronized int getTax() {
		return tax;
	}
	public synchronized void setTax(int tax) {
		this.tax = tax;
	}
	
	
	public static double calculatesalary() {
		
		
			tra= (float)(0.2*basic);
			
			if(basic<=10000) {
			hra=(float) (0.2*basic);
			sa=(float) (0.8*basic);
			double sal=basic+hra+sa+tra-tax;
		
			return sal;
			}
			else if(basic>10001 && basic<20000 ) {
				
				hra=(float) (0.25*basic);
				sa=(float) (0.9*basic);
				double sal=basic+hra+sa+tra-tax;
				
				return sal;
			}
			else {
				hra=(float) (0.3*basic);
				sa=(float) (0.95*basic);
				double sal=basic+hra+sa+tra-tax;
				
				return sal;
			}
			
		
		
		
		
		
		
	}
public static void main(String[] args) {
		
		Employee e=new Employee();
		
		Scanner sc=new Scanner(System.in);
		for(;;)  //for user interactivity
		{
		System.out.println("Do you wish to continue press y or Y else press any key");
		String y=sc.next();
		boolean res=y.equals("y");
		boolean res1=y.equals("Y");
		if(res==true || res1==true)
		{
		System.out.println("Enter Employee ID");
		e.setEmployeeid(sc.nextInt());
		System.out.println("Enter Employee Name");
		String str=sc.nextLine();
		str+=sc.nextLine();
	    e.setEmployeensame(str);
		System.out.println("Enter Employee Basic Salary");
		e.setBasic(sc.nextFloat());
		double sal=e.calculatesalary();
		System.out.println("Employee id  "+e.getEmployeeid()+" \nEmployee Name "+e.getEmployeename()+" \nEmployee salary after deduction is "+sal);
		}
		else {
			System.out.println("Try out other time");
			break;
		}
		
		}//for
		
		
		
		
		
		
		
	}
		
		
		
	}
	
	
	
	
	
