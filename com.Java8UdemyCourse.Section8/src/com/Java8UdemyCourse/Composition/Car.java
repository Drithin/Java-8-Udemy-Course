package com.Java8UdemyCourse.Composition;

public class Car extends Vehicle {
	
	private int doors;
	private int engineCapacity;
	/**
	 * @param doors
	 * @param engineCapacity
	 */
	/*
	 * Car IS-A Vehicle
	 */
	public Car(String name,int doors, int engineCapacity) {
		super();
		this.doors = doors;
		this.engineCapacity = engineCapacity;
	}
	
	

}
