package methodsAndMoreMethods;

public class methodOverLoadingChallenge {
	
	/*
	 * In this challenge, i nailed the first method and in the second method,
	 * I failed to understand the EXACT REQUIREMENT. Nevertheless, the logical thinking is in right way,
	 * I feel a clear requirement can enable to deliver the exact logic. I should
	 * definitely work on delivering for whatever asked
	 */
	
	public static int calcFeetAndInchesToCentimeters(double feet, double inch){
		
		if(feet >= 0 && inch <= 12){
		
			double cmForFeet;
			double cmForInch;
			
			cmForFeet = 30.48*feet;
			
			cmForInch = 0.3937 * inch;
			
			System.out.println("Centimeters for given feet and inches are : "+ (cmForFeet + cmForInch));
		}
		return -1;
	}
	
public static int calcFeetAndInchesToCentimeters(double inch){
		
		if(inch > 0){
			double feet = (int) inch / 12;
			
			double remainingInches = (int) feet % 12;
			
			System.out.println(inch + " inches is equal to "+ feet + " feet and remaining inches are "+ remainingInches);
			
			return calcFeetAndInchesToCentimeters(feet, remainingInches);
		
			

		}
		return -1;
	}

	public static void main(String[] args) {
		calcFeetAndInchesToCentimeters(6, 0);
		calcFeetAndInchesToCentimeters(13);
		
		

	}

}
