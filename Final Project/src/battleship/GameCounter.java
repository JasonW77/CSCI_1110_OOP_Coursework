/**
 * <h1>JavaDoc<h1/>
 * This is my Battleship game GameCounter class. this class is an object class for the interface class.
 * 	I created this program for the CSCI_1110_Final_Project
 * 
 * <p>Date created 2/24/2020 <p/>
 * @author Jason Waters
*/

package battleship;

public class GameCounter extends Interface{
	
	private int playerID;
	private String Name;
	private int loss;
	private int win;
	private int tie;
	private java.util.Date date = new java.util.Date();
	
	/**
	 * //default Object creation settings
	 */
	public GameCounter(){
		this.playerID = 0;
		this.Name = "Player";
		this.loss = 0;
		this.win = 0;
		this.tie = 0;
		this.date = new java.util.Date();
	}
	
	/**
	 * //Object creation with specified settings
	 * @param id game number
	 * @param Name Player name
	 * @param win # of wins the player has
	 * @param loss # of losses the player has
	 * @param tie this is not used in this version
	 */
	public GameCounter(int id, String Name, int win, int loss, int tie){
		this.playerID = id;
		this.Name = Name;
		this.win = win;
		this.loss = loss;
		this.tie = tie;
		this.date = new java.util.Date();
	}
	
	/**
	 * 	//Player ID getter and setter
	 * @return playerID
	 */
	public int getPlayerID(){
		return this.playerID;
	}
	/**
	 * method used for setting game number
	 */
	public void setPlayerID(){
		this.playerID++;
	}
	
	/**
	 * //method for Game Start date
	 * @return date
	 */
	public java.util.Date getDate(){
		return this.date;
	}
	
	/**
	 * //Player Name getter method
	 * @return Name
	 */
	public String getName(){
		return this.Name;
	}
	/**
	 * //Player Name setter method
	 * @param Name sets the player name
	 */
	public void setName(String Name){
		this.Name = Name;
	}
	
	/**
	 * //Player Win getter method
	 * @return win
	 */
	public int getWin(){
		return this.win;
	}
	/**
	 * //Player Win setter method
	 */
	public void setWin(){
		this.win++;
	}
	
	/**
	 * //Player loss getter method
	 * @return loss
	 */
	public int getLoss(){
		return this.loss;
	}
	/**
	 * //Player loss setter method
	 */
	public void setLoss(){
		this.loss++;
	}
	 
	/**
	 * //Player Tie getter method, even though A tie is not possible in this game...
	 * @return tie
	 */
	public int getTie(){
		return this.tie;
	}
	/**
	 * //Player Tie setter method, even though A tie is not possible in this game...
	 */
	public void setTie(){
		this.tie++;
	}
	
}