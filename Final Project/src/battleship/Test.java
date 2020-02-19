package battleship;



public class Test extends GameCounter{
	public static void main(String[] args) {
		
		//Constructor for checking account
		GameCounter player1;
		player1 = new GameCounter(1, "Steve", 0,0,0);
		GameCounter player2;
		player2 = new GameCounter(2, "Bob", 1,1,1);
		
//printout of Player 1 status
		System.out.println("Player Name " + player1.getName());
		System.out.println("# of Ties for this player " + player1.getTie());
		System.out.println("# of Wins for this player " + player1.getWin());
		System.out.println("# of Loss for this player " + player1.getLoss());
		System.out.println("Number of games Played by this player " + player1.getPlayerID());
		System.out.println("Object at creation " + player1.toString());
		System.out.println("Game Date " + player1.getDate());
		
//Printout or PLayer 2 Status
		System.out.println();
		System.out.println("Player Name " + player2.getName());
		System.out.println("# of Ties for this player " + player2.getTie());
		System.out.println("# of Wins for this player " + player2.getWin());
		System.out.println("# of Loss for this player " + player2.getLoss());
		System.out.println("Number of games Played by this player " + player2.getPlayerID());
		System.out.println("Object at creation " + player2.toString());
		System.out.println("Game Date " + player2.getDate());
		
		
	}
}
