package dataTypes;

public class dataTypesInJava {
	
	public static void main(String[] args) {
		
		byte b = -128;
		
		short s = 1000;
		
		int i = 10000;
		
		long l = 50000 + 10 * (b + s + i);
		/**
		 * 	
		casting is a process of telling java that obj A is of type obj B
		casting NOT required for high end data types
		low end data types need casting* 
		 */
		
		short st = (short) (50000 + 10 * (b+s+i));
	
		System.out.println("Value of l is " + l);
		System.out.println("Value of st is " + st);
	}

}
