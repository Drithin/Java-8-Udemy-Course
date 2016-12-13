package com.Java8UdemyCourse.Section8.PolymorphismChallenge;

public class Benz extends Cars {
	
	public Benz(int cylinders, String name){
		super(cylinders, name);
	}

	public String startEngine() {
		// TODO Auto-generated method stub
		return " Benz -> Start Engine ";
	}

	public String accelerate() {
		// TODO Auto-generated method stub
		return "Benz -> Accelerate";
	}

	public String brake() {
		// TODO Auto-generated method stub
		return " Benz -> Break ";
	}
	
	

}
