package com.Java8UdemyCourse.Composition;

public class Main {

	public static void main(String[] args) {
		Dimensions dimensions = new Dimensions(20, 20, 5);
		
		Case theCase = new Case("220B", "Dell", "240", dimensions);
		
		Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
		//This is an e.g of creating classes on the fly (new Resolution(( ))
		
		Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
		
		PC thePC = new PC (theCase, theMonitor, theMotherboard);
		//thePC.getMonitor().drawPixel(1500, 1200, "red");
		//thePC.getMotherboard().ProgramLoading("Windows 1.0");
		//thePC.getTheCase().pressPowerButton();
		/*
		 * Above methods has become private, we can access them via other
		 * methods defined inside their classes
		 */
		
		
		thePC.powerUp();
		
		
		
	}

}
