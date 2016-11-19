package com.Java8UdemyCourse.InheritanceChallenge;

public class Vehicle {

	private String vehicleName;
	private String steering;
	protected int speed;
	private int gears;
	
	public Vehicle(String vehicleName, String steering, int speed, int gears) {
		
		this.vehicleName = vehicleName;
		this.steering = steering;
		this.speed = speed;
		this.gears = gears;
	}
	
	

	public void accelerate(){
		System.out.println("Vehicle should accelerate at "+ speed);
	}
	
	public void breaking(){
		System.out.println(" Vehicle just pulled over");
	}
	
	
}
