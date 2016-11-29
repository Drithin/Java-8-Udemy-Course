package com.Java8UdemyCourse.Composition;

public class PC {
	
	private Case theCase;
	private Monitor monitor;
	private Motherboard motherboard;
	/**
	 * @param theCase
	 * @param monitor
	 * @param motherboard
	 */
	public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
		
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}
	
	public void powerUp(){
		theCase.pressPowerButton();
		drawLogo();
	}
	
	private void drawLogo(){
		Monitor.drawPixel(1200, 50, "Yellow");
	}
	
	
	
	
	

}
