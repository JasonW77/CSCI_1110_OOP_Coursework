// Author Jason Waters
// Date 12/19/2019
// CSCI_1110_Exercise11_3

//Checking account class
public class CheckingAccount extends Account{
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private java.util.Date date = new java.util.Date();
	private double overdraft;
	
	//default settings
	public CheckingAccount(){
		super();
		overdraft = 100;
	}
	
	//specified settings
	public CheckingAccount(int id, double balance, double annualInterestRate){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.date = new java.util.Date();
		overdraft = 100;
	}
	//withdraw method
	public void withdrawl(double newbalance){
		if ((this.balance +overdraft)- newbalance < 0 ) {
			System.out.println("Insufficent Funds, current balance " + balance);
		}
		else if ((this.balance + overdraft) - newbalance > 0 ) {
		this.balance = (this.balance - newbalance);
		}
	}
	//deposit method
	public void deposit(double newbalance){
		this.balance = (balance + newbalance);
	}
	public String toString() {
		return "Id: " + id +" Balance: " + balance + " annualInterestRate: " + annualInterestRate + " Date created: " + date;
	}

}
