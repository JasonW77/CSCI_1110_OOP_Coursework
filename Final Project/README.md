# **Java Battleship**

## Synopsis
This is a game of Battleship, it is a two player game where the first player picks the number of ships
and places them in a grid. after which the second player tries to sink the ships.

## Motivation
This is a program for the Object Oriented Programming CSCI-1110-OOP class at Southwest Tech. I created this program for my final project in that class.

## How to Play
This game is played using java.

The game is played by the first player (the player owning the boats) picks the number of boats
and places them in a 5x5 grid, choosing the ship placement by clicking the radio buttons at the top section of the pane with the mouse.
After the player has chosen the boat positions, the player will then click the confirm button to pass the turn to the second player or the "Bombs" player.
The second player will choose the placement of the bombs to try and sink the ships. the placement of bombs is done by clicking the button grid at the bottom section of the pane with the mouse.
the "Bomb" player will have 3 more bombs than the number of ships placed to try and sink the boat players ships.

[Caption of Image](Battleshipscreenshot.png)

## Code Example
here is a code example of player one placing thier ships.
```
System.out.println("Enter number of ships to place: ");
		int ship = input.nextInt();
		int hit = 1;
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
				System.out.print("Enter a row (0,thru 4) Ship Location: ");
				xc = input.nextInt();
			}
				if (ogame[xr][xc] == " "){
					ogame[xr][xc] = "O";
				}
				else if (ogame[xr][xc] == "O"){
					System.out.println("\nShip already in this place!");
					px++;
					
				}
				
		}
		System.out.println("\n "+ ship + " Ships PLaced, X's Turn!");
		System.out.println("\nX you only have " + (ship + 5) + " Bombs!");
		System.out.println("\nGood Luck!");
```

## Tests
there are no value returning methods.
