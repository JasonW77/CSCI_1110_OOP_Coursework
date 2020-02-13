package battleship;

/**
 * <h1> Battleship </h1>
 * <p>This is a game of Battleship, it is a two player game where the first player picks the number of ships and places them in a grid. 
 * after which the second player tries to sink the ships.</p>
 * 
 * @Author Jason Waters
 * Date 2/13/2020
 * Final Project - Object Oriented Programming, CSCI 1110 
 * @version 2.0
 * @param ogame this is the array used to store player Ones ship locations
 * @param xgame this is the array that is used to store and print out the bomb drops from player Two
*/

import java.util.Scanner ;

public class Battleship_CSCI_1110_OOP_FinalProject {
	
	public static void main(String[] args) {
		
		String[][] ogame = {
			{" ", " ", " ", " ", " "},
			{" ", " ", " ", " ", " "},
			{" ", " ", " ", " ", " "},
			{" ", " ", " ", " ", " "},
			{" ", " ", " ", " ", " "},
		};
		String[][] xgame = {
			{" ", " ", " ", " ", " "},
			{" ", " ", " ", " ", " "},
			{" ", " ", " ", " ", " "},
			{" ", " ", " ", " ", " "},
			{" ", " ", " ", " ", " "},
		};
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Player One enter number of ships to place: ");
		int ship = input.nextInt();
		int hit = 0;
		int miss = 0;
		for (int px = 0; px < ship; px++) {
			System.out.print("Enter a row (0,thru 4) for Ship Location: ");
			int xr = input.nextInt();
			while(xr > 4 || xr < 0){
				System.out.print("Enter a row (0,thru 4) for Ship Location: ");
				xr = input.nextInt();
			}
			System.out.print("Enter a column (0,thru 4) for Ship Location: ");
			int xc = input.nextInt();
			while(xc > 4 || xc < 0){
				System.out.print("Enter a column (0,thru 4) Ship Location: ");
				xc = input.nextInt();
			}
				if (ogame[xr][xc] == " "){
					ogame[xr][xc] = "O";
				}
				else if (ogame[xr][xc] == "O"){
					System.out.println("\nShip already in this place!");
					px--;
					
				}
				
		}
		System.out.println("\n "+ ship + " Ships PLaced, X's Turn!");
		System.out.println("\nX you only have " + (ship + 5) + " Bombs!");
		System.out.println("\nGood Luck!");
		
		for (int g = 0; g < (ship + 5); g++) {
			if (hit <= ship){
				for (int po = 0; po < 1; po++) {
					System.out.print("Player X, Enter a row position (0,thru 4) to drop bomb: ");
					int or = input.nextInt();
					if (or > 4) {
						System.out.print("invalid row entry, please choose either 0,1,2,3, or 4 ");
					}
					while(or > 4 || or < 0){
						System.out.print("Player Two, Enter a row position (0,thru 4) to drop bomb: ");
						or = input.nextInt();
						if (or > 4) {
							System.out.print("invalid X entry, please choose either 0,1,2,3, or 4 ");
						}
					}
					System.out.print("Player X, Enter a column position (0,thru 4) to drop bomb: ");
					int oc = input.nextInt();
					if (oc > 4) {
						System.out.print("invalid Y entry, please choose either 0,1,2,3, or 4 ");
					}
					while(oc > 4 || oc < 0){
						System.out.print("Player Two, Enter a column position (0,thru 4) to drop bomb: ");
						oc = input.nextInt();
						if (oc > 4) {
							System.out.print("invalid Y entry, please choose either 0,1,2,3, or 4 ");
						}
					}
						if (ogame[or][oc] == " " && xgame[or][oc] == " ") {
							xgame[or][oc] = "-";
							System.out.println("Miss!");
							miss++;
						}
						else if (ogame[or][oc] == "O" && xgame[or][oc] == " ") {
							xgame[or][oc] = "X";
							System.out.println("\nYou Sunk A battleship!");
							hit++;
						}
						else if (xgame[or][oc] == "-"){
							System.out.println("Double Miss");
							miss++;	
						}
						else if (xgame[or][oc] == "X"){
							System.out.println("Previous Hit, Miss");
							miss++;
						}
					}	
					
				System.out.println("-----------");
				System.out.println("|" +(xgame[0][0]) + "|" + (xgame[0][1]) +"|"+ (xgame[0][2])+ "|"+ (xgame[0][3])+ "|"+ (xgame[0][4])+ "|");
				System.out.println("-----------");
				System.out.println("|" +(xgame[1][0]) + "|" + (xgame[1][1]) +"|"+ (xgame[1][2])+ "|"+ (xgame[1][3])+ "|"+ (xgame[1][4])+ "|");
				System.out.println("-----------");
				System.out.println("|" +(xgame[2][0]) + "|" + (xgame[2][1]) +"|"+ (xgame[2][2])+ "|"+ (xgame[2][3])+ "|"+ (xgame[2][4])+ "|");
				System.out.println("-----------");
				System.out.println("|" +(xgame[3][0]) + "|" + (xgame[3][1]) +"|"+ (xgame[3][2])+ "|"+ (xgame[3][3])+ "|"+ (xgame[3][4])+ "|");
				System.out.println("-----------");
				System.out.println("|" +(xgame[4][0]) + "|" + (xgame[4][1]) +"|"+ (xgame[4][2])+ "|"+ (xgame[4][3])+ "|"+ (xgame[4][4])+ "|");
				System.out.println("-----------");
				
			}
		}
		endgame(hit,miss,ship);
	}
		/**
		 * This method prints out the ending status for the game.
		 * @param hit the number of hits player Two scored
		 * @param miss the number of times player Two missed
		 * @param ship the number of ships player One placed on the field
		 */
	public static void endgame(int hit, int miss, int ship) {
		
		System.out.print("\nNumber of ships placed by player one: " + ship);
		System.out.print("\nNumber of Bombs dropped by player two: " + (hit + miss));
		System.out.print("\nNumber of ships hit by player two: " + hit);
		System.out.print("\nNumber of ships missed by player two: " + miss);
		System.out.println("\nNumber of ships remaining: " + (ship - hit));
		
		if (hit <= ship) {
			System.out.println("\nPlayer One 'ships' wins!");
		}
		else if (hit == ship) {
			System.out.println("\nPlayer Two 'Bombs' wins!");
		}	
	}
}