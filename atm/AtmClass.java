package com.atm;

public class AtmClass {
	//variables
	private double balance;
	private double withdraw;
	private double deposite;
	
	
	//getters and setters
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}
	public double getDeposite() {
		return deposite;
	}
	public void setDeposite(double deposite) {
		this.deposite = deposite;
	}
	// constructor based on the given fields
	public AtmClass() {
		super();
		// TODO Auto-generated constructor stub
	}
		
}
