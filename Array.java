package com.ArrayList.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of array elements");
		int b=sc.nextInt();
		
		System.out.println("Enter the  array elements");
		for(int i=0;i<b;i++ ) {
			list.add(sc.nextInt());
			
		}
		
		sum(list);
		mean(list);
		mode(list);
		median(list);
		
	}

	public static void median(List<Integer> l) {
		// TODO Auto-generated method stub
		
		double middle=0;
		Collections.sort(l);
		if(l.size()%2 == 0)
		{
			double lower=l.get(l.size()/2-1);
			double upper=l.get(l.size()/2);
			middle=(lower+upper)/2.0;
		}
		else
		{
			middle=l.get((l.size()+1)/2-1);
			
		}
		System.out.println("Median "+middle);
	}


	public static void mode(List<Integer> l) {
		// TODO Auto-generated method stub
		int maxCount=0,maxValue=0;
		 for (int i = 0; i < l.size(); ++i) {
	         int count = 0;
	         for (int j = 0; j < l.size(); ++j) {
	            if (l.get(j) == l.get(i))
	            ++count;
	         }

	         if (count > maxCount) {
	            maxCount = count;
	            maxValue = l.get(i);
	         }
	      }
		 
		 System.out.println("mode of array elemnts is "+maxValue);
	}

	public static void sum(List<Integer> l) {
		// TODO Auto-generated method stub
		
		int sum=0;
		for(int i=0;i<l.size();i++) {
			sum=sum+l.get(i);
		}
		System.out.println("Sum of array elements are "+sum);
	}
	
	public static void mean(List<Integer> l) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<l.size();i++) {
			sum=sum+l.get(i);
		}
		System.out.println("Mean of array elements are "+(sum/l.size()));
		
	}
	
	
	
	
}
