package com.Java8UdemyCourse.forLoop;

public class findPrimes {
	
	public static boolean isPrime (int n ){
		
		if( n ==1){
			return false;
		}
		
		for(int i =2; i<=n/2; i++){
			
			if(n%i==0){
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		int k =0;
		
		for(int n = 1; n <= 1000000; n++){
			
			if(isPrime(n) == true){
				System.out.println(n);
				k++;
			if( k >= 3){
				break;
			}
			};
		}
		
		System.out.println(" Total number of primes allowed to get counted are "+ k);
	}

}
