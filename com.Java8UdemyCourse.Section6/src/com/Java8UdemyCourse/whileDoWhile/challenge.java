package com.Java8UdemyCourse.whileDoWhile;

public class challenge {
	
	public static boolean isEvenNumber( int n){
		
		
		
		while(n>=2){
			if(n%2==0){
				System.out.println(n + " is an even number");
                
                return true;
				
				}
			
			if(n%2!=0) {
				System.out.println(n + " is NOT an even number");
				return false;
			}
			
		}
		return false;
		
   }
	
	public static void main(String[] args) {
		int l = 0;
		int m = 0;
		int [] k = {2,3,4,6,8,10,12,13,14,16,18,20};
		
		for(int i : k){
			if(isEvenNumber(i)){
				l++;
			} else {
				m++;
			}
		}
		System.out.println(" Total number of even numbers are " + l);
		System.out.println(" Total number of odd numbers are " + m);
		
	}

}