//Author Jason Waters
//Date 2/13/2020
//CSCI_1110_Final_Project

package battleship;

public class GameCounter extends Interface{
	
	private int playerID;
	private String Name;
	private int loss;
	private int win;
	private int tie;
	private java.util.Date date = new java.util.Date();
	
	//default Object creation settings
	public GameCounter(){
		this.playerID = 0;
		this.Name = "Player";
		this.loss = 0;
		this.win = 0;
		this.tie = 0;
		this.date = new java.util.Date();
	}
	
	//Object creation with specified settings
	public GameCounter(int id, String P1Name, int win, int loss, int tie){
		this.playerID = id;
		this.Name = P1Name;
		this.win = win;
		this.loss = loss;
		this.tie = tie;
		this.date = new java.util.Date();
	}
	
	//method for current Game ID
	public int getPlayerID(){
		return this.playerID;
	}
	
	//method to return Player one Name
	public String getName(){
		return this.Name;
	}
	
	//method for Game date
	public java.util.Date getDate(){
		return this.date;
	}
	
	//method for returning win or loss
	public int getWin(){
		return this.win;
	}
	//method for returning win or loss
	public int getLoss(){
		return this.loss;
	}
	//method for returning win or loss
	public int getTie(){
		return this.tie;
	}
}