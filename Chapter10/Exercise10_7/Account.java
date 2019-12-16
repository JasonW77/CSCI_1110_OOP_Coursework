//Author Jason Waters
//Date 12/10/2019
//CSCI_1110_Exercise_10_7

//Account class
public class Account{
	
	private int aid = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date date = new java.util.Date();
	int id;
	
	//default settings
	public Account(){
		this.aid = 0;
		this.balance = 100;
		this.annualInterestRate = 0;
		this.date = new java.util.Date();
	}
	//method for balance
	public double getBalance(){
		System.out.println("The balance is " + this.balance);
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
