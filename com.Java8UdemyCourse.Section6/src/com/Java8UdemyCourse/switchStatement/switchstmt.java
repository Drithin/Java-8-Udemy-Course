package com.Java8UdemyCourse.switchStatement;

public class switchstmt {

	public static void main(String[] args) {
		
		int switchvalue = 0;
		
		for (switchvalue = 0; switchvalue < 5; switchvalue++){
			
		switch(switchvalue) {
		
		case 0 : System.out.println(" Value is 0");
		break;
		case 1 : System.out.println(" Value is 1");
		break;
		case 2 : System.out.println(" Value is 2");
		break;
		case 3 : System.out.println(" Value is 3");
		break;
		default: System.out.println(switchvalue+ " is Invalid Value");
		break;
		}
		}
	}

}
