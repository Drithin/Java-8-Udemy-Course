package com.Java8UdemyCourse.bankingChallenge;

public class banking {

	private int accNumber;
	private double balance = 0; //if you don't want to convert to a static var, refer every 
	// balance var by this.balance
	
    private String custName;
	private String email;
	private int phnNumber;
	
	public banking(int accNumber, String custName, String email, int phnNumber) {
		this.accNumber = accNumber;
		this.custName = custName;
		this.email = email;
		this.phnNumber = phnNumber;
	}
	
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhnNumber() {
		return phnNumber;
	}
	public void setPhnNumber(int phnNumber) {
		this.phnNumber = phnNumber;
	}
	
	public  double deposit(int amount){
		this.balance += amount;
		System.out.println(" Total this.balance after deposition is = " + this.balance);
		return this.balance;
	}
	
	public double withdrawl(int amount){
		
		if(this.balance - amount >= 0 ){
			this.balance -= amount;
			System.out.println(" Total this.balance after withdrawl is = " + this.balance);
		} else {
			if(amount - this.balance >= 1){
			System.out.println(" Insufficient this.balance for Withdrawl! You are short by  " + (amount - this.balance)+"$");
			}
		}
		
		
		return this.balance;
	}
	
	
}
