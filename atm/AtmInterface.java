package com.atm;

public interface AtmInterface {
	
	//abstract methods based on fields
	
	public void viewBalance();
	public void depositMoney(double depositMoney);
	public void withdrawMoney(double withdrawMoney);
	public void getMiniStatement();
	public void endTransaction();
	
}
