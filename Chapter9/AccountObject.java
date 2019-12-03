// Author Jason Waters
// Date 12/3/2019
// CSCI_1110_Assignment_9_7

//AccountObject class
public class AccountObject {
	
	public static void main(String args[]) {
		
		//Default Constructor
		Account def;
		def = new Account();
		
		//Constructor for creating account with given id, balance, and interest rate.
		Account spec1;
		spec1 = new Account(1122, 20000, 4.5);
		
		/*  lines for printing out the default account settings.
		System.out.println("\n Default Account");
		System.out.println("Balance " + def.getBalance());
		System.out.println("monthly interest " + def.getMonthlyInterest());
		System.out.println("Date " + def.getDate());
		*/
		
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
