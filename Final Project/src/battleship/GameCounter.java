//Author Jason Waters
//Date 2/19/2020
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
	public GameCounter(int id, String Name, int win, int loss, int tie){
		this.playerID = id;
		this.Name = Name;
		this.win = win;
		this.loss = loss;
		this.tie = tie;
		this.date = new java.util.Date();
	}
	
	//Player ID getter and setter
	public int getPlayerID(){
		return this.playerID;
	}
	public void setPlayerID(int playerID){
		this.playerID = playerID;
	}
	
	//method for Game Start date
	public java.util.Date getDate(){
		return this.date;
	}
	
	//Player Name getter and setter
	public String getName(){
		return this.Name;
	}
	public void setName(String Name){
		this.Name = Name;
	}
	
	//Player Win getter and setter
	public int getWin(){
		return this.win;
	}
	public void setWin(){
		this.win++;
	}
	
	//Player loss getter and setter
	public int getLoss(){
		return this.loss;
	}
	public void setLoss(){
		this.loss++;
	}
	
	//Player Tie getter and setter
	public int getTie(){
		return this.tie;
	}
	public void setTie(){
		this.tie++;
	}
}