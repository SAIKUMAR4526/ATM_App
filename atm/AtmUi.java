package com.atm;
import java.util.*;

public class AtmUi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating object for AtmImplementaion class
		AtmImplementation atmImp = new AtmImplementation();
		long cardNumber=123456789l;
		int pin=4526;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Debit Card Number");
		long custCrdNumber=sc. nextLong();
		System.out.println("Enter Debit Card Pin");
		int cardPin=sc. nextInt();
		if (cardNumber==custCrdNumber && pin==cardPin) {
			while (true) {
				System.out.println("choose the option from menu");
				System.out.println("\n 1.View Balance  \n 2.WithDraw  \n 3.Deposit  \n 4.Mini-Statement  \n 5.End");
				int option=sc.nextInt();
				switch (option) {
				case 1:
					atmImp.viewBalance();
					break;
				case 2:
					System.out.println("Enter Amout to WithDraw");
					double wd=sc.nextDouble();
					atmImp.withdrawMoney(wd);
					break;
				case 3:
					System.out.println("Enter Amout to Deposit");
					double d=sc.nextDouble();
					atmImp.depositMoney(d);
					break;
				case 4:
					atmImp.getMiniStatement();;
					break;
				case 5:
					System.out.println("Collect Card & Cash");
					System.out.println("Thank You Visit Again");
					atmImp.endTransaction();;
					break;
				default:
					System.out.println("Choose The Option Only From Menu");
					break;
				}
			}
			
		} else {
			System.out.println("Invalid Credentials ");
		}
		
	}

}
