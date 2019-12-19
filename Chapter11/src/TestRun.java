// Author Jason Waters
// Date 12/19/2019
// CSCI_1110_Exercise11_3

import java.util.Scanner;

public class TestRun {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		
		//Constructor
		Account Checking;
		Checking = new Account(1, 20000, 4.5);
		Account Savings;
		Savings = new Account(2, 20000, 4.5);
		
		for (int run = 0; run < 10; run++) {
			System.out.println("Enter id: (1 for checking/2 for savings)");
			int i = input.nextInt();
			
			while(i > 2 || i < 0){
				System.out.print("Enter a valid id (1, or 2): ");
				i = input.nextInt();
			}
			if (i == 1) {
			
			System.out.println("Main menu");
			System.out.println("1: check balance");
			System.out.println("2: withdraw");
			System.out.println("3: deposit");
			System.out.println("4: exit");
			int m = 0;
		
			while(m > 4 || m < 0){
				System.out.print("Enter a choice (0,thru 4): ");
				m = input.nextInt();
			}
			while(m !=4  || m < 0){
				System.out.print("Enter a choice (0,thru 4): ");
				m = input.nextInt();
				
				if (m == 1){
					Checking.getBalance();
				}
				else if (m == 2){
					System.out.println("Enter withdraw ammount: ");
					double w = input.nextInt();
					Checking.withdrawl(w);
					Checking.getBalance();
				}
				else if (m == 3){
					System.out.println("Enter deposit ammount: ");
					double d = input.nextInt();
					Checking.deposit(d);
					Checking.getBalance();
				}
				else if (m == 4){
					System.out.println("Exit");
				}
				run--;
				
				//print out of account #1122
				System.out.println("\nAccount #1");
				System.out.println("Balance: " + Checking.getBalance());
				System.out.println("monthly interest: " + Checking.getMonthlyInterest());
				System.out.println("Account Created on Date: " + Checking.getDate());
			}
			
			}
			if (i == 2) {
				
				System.out.println("Main menu");
				System.out.println("1: check balance");
				System.out.println("2: withdraw");
				System.out.println("3: deposit");
				System.out.println("4: exit");
				int m = 0;
			
				while(m > 4 || m < 0){
					System.out.print("Enter a choice (0,thru 4): ");
					m = input.nextInt();
				}
				while(m !=4  || m < 0){
					System.out.print("Enter a choice (0,thru 4): ");
					m = input.nextInt();
					if (m == 1){
						Savings.getBalance();
					}
					else if (m == 2){
						System.out.println("Enter withdraw ammount: ");
						double w = input.nextInt();
						Savings.withdrawl(w);
						Savings.getBalance();
					}
					else if (m == 3){
						System.out.println("Enter deposit ammount: ");
						double d = input.nextInt();
						Savings.deposit(d);
						Savings.getBalance();
					}
					else if (m == 4){
						System.out.println("Exit");
					}
					run--;
				
					//print out of account #1122
					System.out.println("\nAccount #2");
					System.out.println("Balance: " + Savings.getBalance());
					System.out.println("monthly interest: " + Savings.getMonthlyInterest());
					System.out.println("Account Created on Date: " + Savings.getDate());
				}
			}
			
		}
	}
}