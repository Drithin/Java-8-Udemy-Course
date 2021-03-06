package com.Java8UdemyCourse.Inheritance;

public class Dog extends Animal {
	
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	
	/*
	 * When a class inherits characters from parent,
	 * its constructor is declared same as parent class
	 */

	public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String coat)
		{
		super(name, brain, body, size, weight);
		this.eyes=eyes;
		this.legs=legs;
		this.tail=tail;
		this.teeth=teeth;
		this.coat=coat;
	}
	
	private void chew(){
		System.out.println("Dog.chew() is called ");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
		System.out.println("Pedigree");
	}
	
	public void walk(){
		System.out.println("Dog.walk() is called");
		super.move(5);
	}
	
	public void run(){
		System.out.println("Dog.walk is called");
		move(15);
	}
	
	/*
	 * with out the 'super' keyword, Dog class executes
	 * move method written in this class
	 */
	
	private void moveLegs(int speed){
		System.out.println("Dog.moveLegs()");
	}
	
	public void move(int speed){
		System.out.println(" Dog.move() is called");
		moveLegs(speed);
		super.move(speed);
	}
	
}
