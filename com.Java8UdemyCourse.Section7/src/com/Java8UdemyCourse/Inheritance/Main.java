package com.Java8UdemyCourse.Inheritance;

public class Main {

	public static void main(String[] args) {
		Animal a = new Animal("Animal", 1, 1, 5, 100);
		
		Dog d = new Dog("Lab", 8, 20, 2, 4, 1, 20, 1, 30, "Long Silky");
		
		d.eat();
		d.walk();
		d.run();
		
		

	}

}
