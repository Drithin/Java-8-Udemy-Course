package com.Java8UdemyCourse.Section8.PolymorphismChallenge;



public class Main {

	public static void main(String[] args) {
		Cars car = new Cars(8, " Base Car");
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());
		
		Benz Eclass = new Benz (6, "outlander");
	   System.out.println(Eclass.startEngine());
		System.out.println(Eclass.accelerate());
		System.out.println(Eclass.brake());
//		
		
		Ford ford = new Ford(8, "Falcon");
		System.out.println(ford.startEngine());
		System.out.println(ford.accelerate());
	    System.out.println(ford.brake());
		
	}

}
