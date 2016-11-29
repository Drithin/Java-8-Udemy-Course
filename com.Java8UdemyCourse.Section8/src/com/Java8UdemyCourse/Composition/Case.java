package com.Java8UdemyCourse.Composition;

public class Case {
	
	private String model;
	private String manufacturer;
	private String powerSupply;
	private Dimensions dimensions;
	/**
	 * @param model
	 * @param manufacturer
	 * @param powerSupply
	 * @param dimensions
	 */
	public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
		
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
		this.dimensions = dimensions;
	}
	
	public void pressPowerButton(){
		System.out.println(" Power button Pressed ");
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getPowerSupply() {
		return powerSupply;
	}

	public Dimensions getDimensions() {
		return dimensions;
	}
	
	
	
	
	

}
