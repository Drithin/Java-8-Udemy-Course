package com.Java8UdemyCourse.classes;

public class Car {
	
	private int doors;
	private int wheels;
	private String model;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		if(model.equalsIgnoreCase("Porsche") || model.equalsIgnoreCase("holden")){
			this.model = model; // if given condition meets, then only it refers to var
		} else {
			System.out.println(" Model Unindentified ");
		}
		
	}
	
	private String engine;
	private String colour;

}