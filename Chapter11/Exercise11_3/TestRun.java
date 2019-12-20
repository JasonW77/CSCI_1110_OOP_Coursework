// Author Jason Waters
// Date 12/19/2019
// CSCI_1110_Exercise11_3

public class TestRun {
	public static void main(String args[]) {

				//Constructor for checking account
				CheckingAccount Checking;
				Checking = new CheckingAccount(1, 100, 4.5);
				System.out.println("Checking account at creation 			" + Checking.toString());
				
				//checking withdrawl for 100
				Checking.withdrawl(101);
				System.out.println("Checking account after 101 withdrawl 		" + Checking.toString());
				
				//checking withdrawl for 1 after already at 0
				Checking.withdrawl(100);
				System.out.println("Checking account after 100 withdrawl attempt 	" + Checking.toString());
				
				//checking deposit of 100
				Checking.deposit(100);
				System.out.println("Checking account after 100 deposit	 	" + Checking.toString());
				
				//Final checking output
				System.out.println();
				System.out.println("Final Checking					" + Checking.toString());
				System.out.println();
				
				//Constructor for savings account
				SavingsAccount Savings;
				Savings = new SavingsAccount(2, 100, 4.5);
				System.out.println("Savings account at creation 			" + Savings.toString());
				
				//savings withdrawl for 100
				Savings.withdrawl(100);
				System.out.println("Savings account after 100 withdrawl 		" + Savings.toString());
				
				//savings withdrawl after already at 0
				Savings.withdrawl(1);
				System.out.println("Savings account after 1 withdrawl attempt	" + Savings.toString());
				
				//final savings output
				System.out.println();
				System.out.println("Final Savings 					" +Savings.toString());
				
	}
}
