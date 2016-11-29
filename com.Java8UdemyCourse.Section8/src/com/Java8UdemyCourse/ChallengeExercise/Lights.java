package com.Java8UdemyCourse.ChallengeExercise;

public class Lights {
	
	private int watts;
	private String color;
	/**
	 * @param watts
	 * @param color
	 */
	public Lights(int watts, String color) {
		
		this.watts = watts;
		this.color = color;
	}
	
	public void LightsOn(){
		System.out.println(" Lights are ON ");
	}
	
	public void LightsOff(){
		System.out.println(" Lights are OFF ");
	}
	public int getWatts() {
		return watts;
	}
	public String getColor() {
		return color;
	}
	
	
	

}
