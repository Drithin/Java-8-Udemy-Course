package com.Java8UdemyCourse.whileDoWhile;

public class challenge {
	
	public static void isEvenNumber( int n){
		
		int l = 0;
		int m = 0;
		
		while(n>=2){
			if(n%2==0){
				System.out.println(n + " is an even number");
                l++;
				break;
				
				}
			
			if(n%2!=0) {
				System.out.println(n + " is NOT an even number");
				m++;
				break;
			}
			
		}
		System.out.println(" Total number of even Numbers are "+ l);
		System.out.println(" Total number of odd Numbers are "+ m);
		
   }
	
	public static void main(String[] args) {
		int [] m = {2,3,4,6,8,10,12,13,14,16,18,20};
		
		for(int i : m){
			isEvenNumber(i);
		}
		
	}

}
