package com.Java8UdemyCourse.InheritanceChallenge;

public class Car extends Vehicle{
	
	private int tyres;
	private int frontLights;

	public Car(String carName, String steering, int speed, int gears) {
		super(carName, steering, speed, gears);
		
		this.tyres = tyres;
		this.frontLights = frontLights;
		
	}

	@Override
//	public void accelerate() {
//		// TODO Auto-generated method stub
//		super.accelerate();
//	}
	
	public void accelerate(){
		System.out.println(" Car is accelerating at " + speed);
	}
	public void breaking(){
		System.out.println(" Car pulled over");
	}
	
	

}