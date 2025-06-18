package com.atm;
import java.util.*;
import java.util.Map.Entry;

public class AtmImplementation implements AtmInterface {

AtmClass atm = new AtmClass();
HashMap<String, Double> hm=new HashMap<>();

//business logic

//Method for viewing balance
	public void viewBalance() {
		System.out.println("Available Balance : "+atm.getBalance());	
	}
//Method for depositing amount
	public void depositMoney(double depositMoney) {
		System.out.println("Amount Deposited : "+depositMoney);
		atm.setBalance(atm.getBalance()+depositMoney);
		hm.put("Deposited", depositMoney);
		viewBalance();
	}
//Method for withdraw of amount
	public void withdrawMoney(double withdrawMoney) {
		// TODO Auto-generated method stub
		if (atm. getBalance() >= withdrawMoney) {
			if (withdrawMoney%500==0) {
				System.out.println("Enter Amount To Withdraw : "+withdrawMoney);
				atm.setBalance(atm.getBalance()-withdrawMoney);
				hm.put("Withdrawn", withdrawMoney);
				viewBalance();
			} else {
				System.out.println("Enter Multiples Of 500");
			}
		} else {
			System.out.println("Insufficient Funds");

		}
	
	}
	
//Method for fetching MiniStatement
	public void getMiniStatement() {
		// TODO Auto-generated method stub
		Set<Entry<String,Double>> entrySet=hm.entrySet();
		for(Entry<String,Double> m:entrySet) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
			
	}
	
//Method for terminating App
	public void endTransaction() {
	System.exit(0);
		
	}

}
