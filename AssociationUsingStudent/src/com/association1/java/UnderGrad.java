package com.association1.java;

public class UnderGrad extends Student{

	private int year;

	public  int getYear() {
		return year;
	}

	public  void setYear(int year) {
		this.year = year;
	}
	
	public void getBranch(String branch) {
		Branch b=new Branch();
		b.studeisBranch(branch);
	}
	
	public void getSociety(String club) {
		Society s=new Society();
		s.collegeSociety(club);
	}
	
	

}
