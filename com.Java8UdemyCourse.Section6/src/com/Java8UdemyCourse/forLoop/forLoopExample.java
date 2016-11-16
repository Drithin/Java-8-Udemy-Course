package com.Java8UdemyCourse.forLoop;

/*
 * Can be done in either ways but I was not able to call the
 * method from main. So I removed method and initialized the values in main
 * Referred to the author who did it by calling from main.
 */

public class forLoopExample {
	
	public static double calcInterest(double amount, double interest){
		return (amount * (interest/100));
		
	} 
		

	public static void main(String[] args) {
		
		
		for (double interest = 1; interest < 13; interest++){
			
//			double amount = 10000.0;
//			
//			double total = amount * (interest/100);
			
			System.out.println(" 10,000$ at "+ interest + "% is " + calcInterest(10000.00, interest) );

		}
		
		
	}

}
