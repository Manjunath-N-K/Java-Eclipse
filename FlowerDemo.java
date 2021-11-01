package assessment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Map.Entry;

public class FlowerDemo {

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
			System.out.println("Enter the continent {Asia,Europe,Africa} to display its information");
			String str=sc.next();
			sc.nextLine();
			
			displyaFLower(str);	  //display function
		}
			else {
				System.out.println("Try Next time");
				break; //break from the entire for loop
			}
		}	
		
	}

	public static void displyaFLower(String str) {
		
	
		HashMap<String,String> map=new HashMap<>();
		
				switch(str.toLowerCase()){
				
				case "asia":    map.put("INDIA", "LOTUS");
								map.put("PAK","JASMINE");
								map.put("NEPAL", "LALI GURANS");
								map.put("BHUTAN", "BLUE POPPY");
								map.put("IRAQ", "RED ROSE");
								System.out.println("Countries of "+str.toUpperCase()+" and its national flowers are");
								System.out.println("Country		National flower");
								for(Entry<String,String> pair:map.entrySet()) {
									System.out.println(pair.getKey()+"		"+pair.getValue());
								}
									break;
				
					
				case "europe":  map.put("GERMANY", "CORN FLOWER");
								map.put("FRANCE", "LILY");
								map.put("GREECE", "ACANTHUS MOLLIS");
								map.put("MALTA", "MALTESE CENTAURY");
								map.put("ENGLAND", "TUDOR ROSE");
								
								System.out.println("Countries of "+str.toUpperCase()+" and its national flowers are");
								System.out.println("Country		National flower");
								for(Entry<String,String> pair:map.entrySet()) {
									System.out.println(pair.getKey()+"		"+pair.getValue());
								}
								break;
					
					
				case "africa":	map.put("EGYPT", "BLUE LOTUS");
								map.put("NIGERIA", "YELLOW TRUMPET");
								map.put("KENYA", "ORCHID");
								map.put("MOROCCO", "NOT DECLARED");
								map.put("TUNISIA", "BLUE JASMINE");
								
								System.out.println("Countries of "+str.toUpperCase()+" and its national flowers are");
								System.out.println("Country		National flower");
								for(Entry<String,String> pair:map.entrySet()) {
									System.out.println(pair.getKey()+"		"+pair.getValue());
								}
								break;
				
				/*
			   case " north america ":	map.put("CANADA", "");
				map.put("NIGERIA", "YELLOW TRUMPET");
				map.put("KENYA", "ORCHID");
				map.put("MOROCCO", "NOT DECLARED");
				map.put("TUNISIA", "BLUE JASMINE");
				
				System.out.println("Countries of "+str+" and its national flowers are");
				System.out.println("Country		National flower");
				for(Entry<String,String> pair:map.entrySet()) {
					System.out.println(pair.getKey()+"		"+pair.getValue());
				}
				break;
				*/
					
					default: System.out.println("Try different continent");
								break;
				}//end switch
				
			
	
	}//end main

	}//end class



