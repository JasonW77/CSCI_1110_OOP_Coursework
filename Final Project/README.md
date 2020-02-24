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

[https://github.com/JasonW77/CSCI_1110_OOP_Coursework/blob/master/Final%20Project/Boat%20PLacement.png] (Boat PLacement.png)

After the boat player has chosen the boat positions, the player will then click the confirm button to pass the turn to the second player or the "Bombs" player.
The bombs player will choose the placement of the bombs to try and sink the ships. the placement of bombs is done by clicking the button grid at the bottom section of the pane with the mouse.
the "Bomb" player will have 3 more bombs than the number of ships placed to try and sink the boat players ships.

[https://github.com/JasonW77/CSCI_1110_OOP_Coursework/blob/master/Final%20Project/Bomb%20Player%20turn.png]

(BombPlayerturn.png)


## Code Example
here is a code example of player one placing thier ships.

'''
//Boat counter radio button onActions these keep track of the number of boats placed.
			rb1_1.setOnAction(e -> {
				if (rb1_1.isSelected()) {
					boats++;
					btLeft.setDisable(false);
				}
				else {
					boats--;
					if(boats <= 0) {
						btLeft.setDisable(true);
					}
				}
			});
'''
## Tests
there are no value returning methods.
