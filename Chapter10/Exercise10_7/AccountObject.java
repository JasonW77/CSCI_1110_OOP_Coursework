//Author Jason Waters
//Date 12/10/2019
//CSCI_1110_Exercise_10_7

import java.util.Scanner ;

//AccountObject class
public class AccountObject {
	
	public static void main(String args[]) {
		
		//Default Constructor
		Account def;
		def = new Account();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter id: ");
		int i = input.nextInt();
		
		while(i > 9 || i < 0){
			System.out.print("Enter a valid id (0,thru 9): ");
			i = input.nextInt();
		}
		System.out.println("Main menu");
		System.out.println("1: check balance");
		System.out.println("2: withdraw");
		System.out.println("3: deposit");
		System.out.println("4: exit");
		int m = input.nextInt();

		while(m > 4 || m < 0){
			System.out.print("Enter a valid id (0,thru 4): ");
			m = input.nextInt();
			
		}
		if (m == 1){
			def.getBalance();
			
		}
		else if (m == 2){
			System.out.println("Enter withdraw ammount: ");
			double w = input.nextInt();
			def.withdrawl(w);
			def.getBalance();
		}
		else if (m == 3){
			System.out.println("Enter deposit ammount: ");
			double d = input.nextInt();
			def.deposit(d);
			def.getBalance();
		}
		else if (m == 4){
			System.out.println("Exit");
		}			
	}
}
