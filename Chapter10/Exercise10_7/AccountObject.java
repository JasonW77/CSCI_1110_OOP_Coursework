package chapter10;

//Author Jason Waters
//Date 12/10/2019
//CSCI_1110_Exercise_10_7

import java.util.Scanner ;

//AccountObject class
public class AccountObject {
	
	public static void main(String args[]) {
		
		double[] id = {100,100,100,100,100,100,100,100,100,100};
		
		Scanner input = new Scanner(System.in);
		int i = 0;
		do {
			System.out.println("Enter Account id#: ");
			int answer = input.nextInt();
			if (answer <  0) {
				System.out.println("Invalid entry!");
				i++;
			}
			else if (answer > 9)  (answer <  0) {
				System.out.println("Invalid entry!");
				i++;
			}
		}while 	(i <= 0);
		
		//Default Constructor
		Account def;
		def = new Account();
		
		//Constructor for creating account with given id, balance, and interest rate.
		Account spec1;
		spec1 = new Account(1122, 20000, 4.5);
		
		//calling method for withdraw
		spec1.withdrawl(2500);
		
		//calling method for deposit
		spec1.deposit(3000);
		
		//print out of account #1122
		System.out.println("\nAccount #1122");
		System.out.println("Balance: " + spec1.getBalance());
		System.out.println("monthly interest: " + spec1.getMonthlyInterest());
		System.out.println("Account Created on Date: " + spec1.getDate());
		
	}
}
