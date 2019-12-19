// Author Jason Waters
// Date 12/19/2019
// CSCI_1110_Exercise11_3

//Account class
public class Account{
	
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date date = new java.util.Date();
	
	//default settings
	public Account(){
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
		this.date = new java.util.Date();
	}
	
	//specified settings
	public Account(int id, double balance, double annualInterestRate){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.date = new java.util.Date();
	}
	//method for balance
	public double getBalance(){
		return this.balance;
	}
	//method for monthly interest
	public double getMonthlyInterest(){
		return ((balance * (annualInterestRate / 12)) / 100);
	}
	//method for creation date
	public java.util.Date getDate(){
		return this.date;
	}
	//withdraw method
	public void withdrawl(double newbalance){
		this.balance = (balance - newbalance);
	}
	//deposit method
	public void deposit(double newbalance){
		this.balance = (balance + newbalance);
	}
}