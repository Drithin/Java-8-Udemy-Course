package com.Java8UdemyCourse.switchStatement;

public class challengeExercise {

	public static void main(String[] args) {
		
		char val = 'H';
		
		switch(val){
		
		case 'A': case 'B': case 'C': case 'D': case 'E':
			System.out.println("One of the A,B,C,D,E is found");
			break;
		
		default:
			System.out.println(" Not found any of A,B,C,D,E chars ");
		
		}
	}

}
