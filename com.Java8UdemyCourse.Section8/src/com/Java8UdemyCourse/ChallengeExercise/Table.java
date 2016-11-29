package com.Java8UdemyCourse.ChallengeExercise;

public class Table {
	
	private String tableTop;
	private int numberOfChairs;
	/**
	 * @param tableTop
	 * @param numberOfChairs
	 */
	public Table(String tableTop, int numberOfChairs) {
		
		this.tableTop = tableTop;
		this.numberOfChairs = numberOfChairs;
	}
	
	public void tableInfo(){
		System.out.println(" Table is 4 legged and has one chair");
	}
	public String getTableTop() {
		return tableTop;
	}
	public int getNumberOfChairs() {
		return numberOfChairs;
	}
	
	

}
