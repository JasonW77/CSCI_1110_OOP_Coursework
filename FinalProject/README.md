# **Java Battleship**

## Synopsis
This is a game of Battleship, it is a two player game where the first player picks the number of ships
and places them in a grid. after which the second player tries to sink the ships.

## Motivation
This is a program for the Introduction to programming class final project. I created it for my final project in that class.

## How to Play
This game is played using java.

The game is played by the first player (the player owning the ships) picks the number of ships
and places them in a 5x5 grid, choosing first an "x" axis and then a "y" axis.(0-4 respectively)

The second player will choose the placement of the bombs or mines to try and sink the ships.
they have 5 more bombs than ships placed to try and sink player ones ships.

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
