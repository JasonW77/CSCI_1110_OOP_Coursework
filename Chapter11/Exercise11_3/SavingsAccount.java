// Author Jason Waters
// Date 12/19/2019
// CSCI_1110_Exercise11_3

//Savings account class
public class SavingsAccount extends Account{
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private java.util.Date date = new java.util.Date();
	
	//Define SavingsAccount
	public SavingsAccount(){
		super();
	}
	
	//specified settings
	public SavingsAccount(int id, double balance, double annualInterestRate){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.date = new java.util.Date();
	}
	//withdraw method
	public void withdrawl(double newbalance){
		if ((this.balance - newbalance) < 0 ) {
			System.out.println("Insufficent Funds, current balance: " +balance);
		}
		else if ((this.balance - newbalance) >= 0 ) {
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
