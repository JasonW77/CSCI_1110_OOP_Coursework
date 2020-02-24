//Author Jason Waters
//Date 2/20/2020
//CSCI_1110_Final_Project

package battleship;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.RadioButton;
import javafx.geometry.Insets;


public class Interface extends Application {
		
		//creates objects on a global level
		GameCounter player1;
		GameCounter player2; 
		
		
		//player turn boolean (used to keep track of who's turn it is)
		boolean player1turn = true;
		
		//integers for game play status
		private int hits = 0;
		private int miss = 0;
		private int boats = 0;
		private int boatleft = 0;
		private int bombs = 0;
		private int gameID = 0;

		
		//player attributes (used to modify the objects on game end)
		private String P1Name = "Bob";
		private int P1Loss = 0;
		private int P1Win = 0;
		private int P1Tie = 0;
		
		private String P2Name = "Steve";
		private int P2Loss = 0;
		private int P2Win = 0;
		private int P2Tie = 0;
		
		//Radio buttons used for boat placement
		private RadioButton rb1_1 = new RadioButton("");
		private RadioButton rb1_2 = new RadioButton("");
		private RadioButton rb1_3 = new RadioButton("");
		private RadioButton rb1_4 = new RadioButton("");
		private RadioButton rb1_5 = new RadioButton("");

		private RadioButton rb2_1 = new RadioButton("");
		private RadioButton rb2_2 = new RadioButton("");
		private RadioButton rb2_3 = new RadioButton("");
		private RadioButton rb2_4 = new RadioButton("");
		private RadioButton rb2_5 = new RadioButton("");
		
		private RadioButton rb3_1 = new RadioButton("");
		private RadioButton rb3_2 = new RadioButton("");
		private RadioButton rb3_3 = new RadioButton("");
		private RadioButton rb3_4 = new RadioButton("");
		private RadioButton rb3_5 = new RadioButton("");
		
		private RadioButton rb4_1 = new RadioButton("");
		private RadioButton rb4_2 = new RadioButton("");
		private RadioButton rb4_3 = new RadioButton("");
		private RadioButton rb4_4 = new RadioButton("");
		private RadioButton rb4_5 = new RadioButton("");
	
		private RadioButton rb5_1 = new RadioButton("");
		private RadioButton rb5_2 = new RadioButton("");
		private RadioButton rb5_3 = new RadioButton("");
		private RadioButton rb5_4 = new RadioButton("");
		private RadioButton rb5_5 = new RadioButton("");
		
		
		//buttons used for bomb drop locations
		private Button bo1_1 = new Button("");
		private Button bo1_2 = new Button("");
		private Button bo1_3 = new Button("");
		private Button bo1_4 = new Button("");
		private Button bo1_5 = new Button("");

		private Button bo2_1 = new Button("");
		private Button bo2_2 = new Button("");
		private Button bo2_3 = new Button("");
		private Button bo2_4 = new Button("");
		private Button bo2_5 = new Button("");
		
		private Button bo3_1 = new Button("");
		private Button bo3_2 = new Button("");
		private Button bo3_3 = new Button("");
		private Button bo3_4 = new Button("");
		private Button bo3_5 = new Button("");
		
		private Button bo4_1 = new Button("");
		private Button bo4_2 = new Button("");
		private Button bo4_3 = new Button("");
		private Button bo4_4 = new Button("");
		private Button bo4_5 = new Button("");
		
		private Button bo5_1 = new Button("");
		private Button bo5_2 = new Button("");
		private Button bo5_3 = new Button("");
		private Button bo5_4 = new Button("");
		private Button bo5_5 = new Button("");
		
		//buttons for the game progress bar (Confirm, Decline, Restart, and Score buttons)
		Button btLeft = new Button("Confirm");
		Button btRight = new Button("Decline");
		Button btReStart = new Button("ReStart");
		Button btScore = new Button("Score");
		
		//this button is for testing purposes only
		Button P1UP = new Button("P1UP");
		
		public static void main(String[] args) {
			launch(args);
		}

		@Override // Override the start method in the Application class
		public void start(Stage primaryStage) {

			//Disable the bomb buttons until it is bomb drop time
			bo1_1.setDisable(true);
			bo1_2.setDisable(true);
			bo1_3.setDisable(true);
			bo1_4.setDisable(true);
			bo1_5.setDisable(true);
			
			bo2_1.setDisable(true);
			bo2_2.setDisable(true);
			bo2_3.setDisable(true);
			bo2_4.setDisable(true);
			bo2_5.setDisable(true);
			
			bo3_1.setDisable(true);
			bo3_2.setDisable(true);
			bo3_3.setDisable(true);
			bo3_4.setDisable(true);
			bo3_5.setDisable(true);
			
			bo4_1.setDisable(true);
			bo4_2.setDisable(true);
			bo4_3.setDisable(true);
			bo4_4.setDisable(true);
			bo4_5.setDisable(true);
			
			bo5_1.setDisable(true);
			bo5_2.setDisable(true);
			bo5_3.setDisable(true);
			bo5_4.setDisable(true);
			bo5_5.setDisable(true);
			
			// Create a scene and place it in the stage
			Scene scene = new Scene(actPane(), 500, 500);
			primaryStage.setTitle("BattleShip!"); // Set the stage title
			primaryStage.setScene(scene); // Place the scene in the stage
			primaryStage.show(); // Display the stage
			


		}
		
		//Create the actPane, this pane is the pane for bomb drops and result of hit/miss
		protected BorderPane actPane() {
			
			//construct objects for the players using current game count status (status changes on game end)
			player1 = new GameCounter(gameID,P1Name,P1Win,P1Loss,P1Tie);
			player2 = new GameCounter(gameID,P2Name,P2Win,P2Loss,P2Tie);
			
			//create panes and buttons for the actPane
			BorderPane pane = new BorderPane();
			GridPane actpane = new GridPane();
			GridPane boatpane = new GridPane();
			HBox paneForButtons = new HBox(20);
			
			//button pane onAction assignments
			btLeft.setOnAction(e -> confirm());
			btRight.setOnAction(e -> decline());
			btReStart.setOnAction(e -> restart());
			btScore.setOnAction(e -> score());
			btLeft.setDisable(true);
			/*
			//This is here to for testing the setter for wins
			P1UP.setOnAction(e -> player1.setWin());
			*/
			
			//set actPane attributes
			actpane.setStyle("-fx-border-color: black");
			actpane.setAlignment(Pos.BOTTOM_CENTER);
			actpane.setPadding(new Insets(5, 5, 5, 5));
			actpane.setHgap(5);
			actpane.setVgap(5);
			
			/*
			//boat pane labels not sure if i will use this
			boatpane.add(scorepane,0,0);
			*/
			
			//Add the Bomb buttons to the actpane
			actpane.add(bo1_1,1,11);
			actpane.add(bo1_2,2,11);
			actpane.add(bo1_3,3,11);
			actpane.add(bo1_4,4,11);
			actpane.add(bo1_5,5,11);
			
			actpane.add(bo2_1,1,12);
			actpane.add(bo2_2,2,12);
			actpane.add(bo2_3,3,12);
			actpane.add(bo2_4,4,12);
			actpane.add(bo2_5,5,12);
			
			actpane.add(bo3_1,1,13);
			actpane.add(bo3_2,2,13);
			actpane.add(bo3_3,3,13);
			actpane.add(bo3_4,4,13);
			actpane.add(bo3_5,5,13);
			
			actpane.add(bo4_1,1,14);
			actpane.add(bo4_2,2,14);
			actpane.add(bo4_3,3,14);
			actpane.add(bo4_4,4,14);
			actpane.add(bo4_5,5,14);
			
			actpane.add(bo5_1,1,15);
			actpane.add(bo5_2,2,15);
			actpane.add(bo5_3,3,15);
			actpane.add(bo5_4,4,15);
			actpane.add(bo5_5,5,15);
			
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
			
			rb1_2.setOnAction(e -> {
				if (rb1_2.isSelected()) {
					boats++;
				}
				else {
					boats--;
					if(boats <= 0) {
						btLeft.setDisable(true);
					}
				}
			});
			
			rb1_3.setOnAction(e -> {
				if (rb1_3.isSelected()) {
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
			
			rb1_4.setOnAction(e -> {
				if (rb1_4.isSelected()) {
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
			
			rb1_5.setOnAction(e -> {
				if (rb1_5.isSelected()) {
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
			
			rb2_1.setOnAction(e -> {
				if (rb2_1.isSelected()) {
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
			
			rb2_2.setOnAction(e -> {
				if (rb2_2.isSelected()) {
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
			
			rb2_3.setOnAction(e -> {
				if (rb2_3.isSelected()) {
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
			
			rb2_4.setOnAction(e -> {
				if (rb2_4.isSelected()) {
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
			
			rb2_5.setOnAction(e -> {
				if (rb2_5.isSelected()) {
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
			
			rb3_1.setOnAction(e -> {
				if (rb3_1.isSelected()) {
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
			
			rb3_2.setOnAction(e -> {
				if (rb3_2.isSelected()) {
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
			
			rb3_3.setOnAction(e -> {
				if (rb3_3.isSelected()) {
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
			
			rb3_4.setOnAction(e -> {
				if (rb3_4.isSelected()) {
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
			
			rb3_5.setOnAction(e -> {
				if (rb3_5.isSelected()) {
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
			
			rb4_1.setOnAction(e -> {
				if (rb4_1.isSelected()) {
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
			
			rb4_2.setOnAction(e -> {
				if (rb4_2.isSelected()) {
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
			
			rb4_3.setOnAction(e -> {
				if (rb4_3.isSelected()) {
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
			
			rb4_4.setOnAction(e -> {
				if (rb4_4.isSelected()) {
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
			
			rb4_5.setOnAction(e -> {
				if (rb4_5.isSelected()) {
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
			
			rb5_1.setOnAction(e -> {
				if (rb5_1.isSelected()) {
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
			
			rb5_2.setOnAction(e -> {
				if (rb5_2.isSelected()) {
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
			
			rb5_3.setOnAction(e -> {
				if (rb5_3.isSelected()) {
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
			
			rb5_4.setOnAction(e -> {
				if (rb5_4.isSelected()) {
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
			
			rb5_5.setOnAction(e -> {
				if (rb5_5.isSelected()) {
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
			
			//Bomb Drop Buttons setOnAction assignments, changes color for hit/miss as well as counts the hit/miss counters and depletes bomb count
			bo1_1.setOnAction(e -> {
				if (rb1_1.isSelected()) {
					rb1_1.setStyle("-fx-color: RED");
					rb1_1.setVisible(true);
					bo1_1.setDisable(true);
					hits++;
					boatleft--;
				}
				else {
					rb1_1.setStyle("-fx-color: LIGHTBLUE");
					rb1_1.setVisible(true);
					bo1_1.setDisable(true);
					miss++;
				}
				bombs--;
				gameOver();
			});
			
			bo1_2.setOnAction(e -> {
				if (rb1_2.isSelected()) {
					rb1_2.setStyle("-fx-color: RED");
					rb1_2.setVisible(true);
					bo1_2.setDisable(true);
					hits++;
					boatleft--;
				}
				else {
					rb1_2.setStyle("-fx-color: LIGHTBLUE");
					rb1_2.setVisible(true);
					bo1_2.setDisable(true);
					miss++;
				}
				bombs--;
				gameOver();
			});
			
			bo1_3.setOnAction(e -> {
				if (rb1_3.isSelected()) {
					rb1_3.setStyle("-fx-color: RED");
					rb1_3.setVisible(true);
					bo1_3.setDisable(true);
					hits++;
					boatleft--;
				}
				else {
					rb1_3.setStyle("-fx-color: LIGHTBLUE");
					rb1_3.setVisible(true);
					bo1_3.setDisable(true);
					miss++;
				}
				bombs--;
				gameOver();
			});
			
			bo1_4.setOnAction(e -> {
				if (rb1_4.isSelected()) {
					rb1_4.setStyle("-fx-color: RED");
					rb1_4.setVisible(true);
					bo1_4.setDisable(true);
					hits++;
					boatleft--;
				}
				else {
					rb1_4.setStyle("-fx-color: LIGHTBLUE");
					rb1_4.setVisible(true);
					bo1_4.setDisable(true);
					miss++;
				}
				bombs--;
				gameOver();
			});
			
			bo1_5.setOnAction(e -> {
				if (rb1_5.isSelected()) {
					rb1_5.setStyle("-fx-color: RED");
					rb1_5.setVisible(true);
					bo1_5.setDisable(true);
					hits++;
					boatleft--;
				}
				else {
					rb1_5.setStyle("-fx-color: LIGHTBLUE");
					rb1_5.setVisible(true);
					bo1_5.setDisable(true);
					miss++;
				}
				bombs--;
				gameOver();
			});
		      
			bo2_1.setOnAction(e -> {
				if (rb2_1.isSelected()) {
					rb2_1.setStyle("-fx-color: RED");
					rb2_1.setVisible(true);
					bo2_1.setDisable(true);
					hits++;
					boatleft--;
				}
				else {
					rb2_1.setStyle("-fx-color: LIGHTBLUE");
					rb2_1.setVisible(true);
					bo2_1.setDisable(true);
					miss++;
				}
				bombs--;
				gameOver();
			});
			
			bo2_2.setOnAction(e -> {
				if (rb2_2.isSelected()) {
					rb2_2.setStyle("-fx-color: RED");
					rb2_2.setVisible(true);
					bo2_2.setDisable(true);
					hits++;
					boatleft--;
				}
				else {
					rb2_2.setStyle("-fx-color: LIGHTBLUE");
					rb2_2.setVisible(true);
					bo2_2.setDisable(true);
					miss++;
				}
				bombs--;
				gameOver();
			});
			
			bo2_3.setOnAction(e -> {
				if (rb2_3.isSelected()) {
					rb2_3.setStyle("-fx-color: RED");
					rb2_3.setVisible(true);
					bo2_3.setDisable(true);
					hits++;
					boatleft--;
				}
				else {
					rb2_3.setStyle("-fx-color: LIGHTBLUE");
					rb2_3.setVisible(true);
					bo2_3.setDisable(true);
					miss++;
				}
				bombs--;
				gameOver();
			});
			
			bo2_4.setOnAction(e -> {
				if (rb2_4.isSelected()) {
					rb2_4.setStyle("-fx-color: RED");
					rb2_4.setVisible(true);
					bo2_4.setDisable(true);
					hits++;
					boatleft--;
				}
				else {
					rb2_4.setStyle("-fx-color: LIGHTBLUE");
					rb2_4.setVisible(true);
					bo2_4.setDisable(true);
					miss++;
				}
				bombs--;
				gameOver();
			});
			
			bo2_5.setOnAction(e -> {
				if (rb2_5.isSelected()) {
					rb2_5.setStyle("-fx-color: RED");
					rb2_5.setVisible(true);
					bo2_5.setDisable(true);
					hits++;
					boatleft--;
				}
				else {
					rb2_5.setStyle("-fx-color: LIGHTBLUE");
					rb2_5.setVisible(true);
					bo2_5.setDisable(true);
					miss++;
				}
				bombs--;
				gameOver();
			});
		    
			bo3_1.setOnAction(e -> {
				if (rb3_1.isSelected()) {
					rb3_1.setStyle("-fx-color: RED");
					rb3_1.setVisible(true);
					bo3_1.setDisable(true);
					hits++;
					boatleft--;
				}
				else {
					rb3_1.setStyle("-fx-color: LIGHTBLUE");
					rb3_1.setVisible(true);
					bo3_1.setDisable(true);
					miss++;
				}
				bombs--;
				gameOver();
			});
			
			bo3_2.setOnAction(e -> {
				if (rb3_2.isSelected()) {
					rb3_2.setStyle("-fx-color: RED");
					rb3_2.setVisible(true);
					bo3_2.setDisable(true);
					hits++;
					boatleft--;
				}
				else {
					rb3_2.setStyle("-fx-color: LIGHTBLUE");
					rb3_2.setVisible(true);
					bo3_2.setDisable(true);
					miss++;
				}
				bombs--;
				gameOver();
			});
			
			bo3_3.setOnAction(e -> { 
				if (rb3_3.isSelected()) {
					rb3_3.setStyle("-fx-color: RED");
					rb3_3.setVisible(true);
					bo3_3.setDisable(true);
					hits++;
					boatleft--;
				}
				else {
					rb3_3.setStyle("-fx-color: LIGHTBLUE");
					rb3_3.setVisible(true);
					bo3_3.setDisable(true);
					miss++;
				}
				bombs--;
				gameOver();
			});
			
			bo3_4.setOnAction(e -> { 
				if (rb3_4.isSelected()) {
					rb3_4.setStyle("-fx-color: RED");
					rb3_4.setVisible(true);
					bo3_4.setDisable(true);
					hits++;
					boatleft--;
				}
				else {
					rb3_4.setStyle("-fx-color: LIGHTBLUE");
					rb3_4.setVisible(true);
					bo3_4.setDisable(true);
					miss++;
				}
				bombs--;
				gameOver();
			});
			
			bo3_5.setOnAction(e -> { 
				if (rb3_5.isSelected()) {
					rb3_5.setStyle("-fx-color: RED");
					rb3_5.setVisible(true);
					bo3_5.setDisable(true);
					hits++;
					boatleft--;
				}
				else {

					rb3_5.setStyle("-fx-color: LIGHTBLUE");
					rb3_5.setVisible(true);
					bo3_5.setDisable(true);
					miss++;
				}
				bombs--;
				gameOver();
			});
			
			bo4_1.setOnAction(e -> { 
				if (rb4_1.isSelected()) {
					rb4_1.setStyle("-fx-color: RED");
					rb4_1.setVisible(true);
					bo4_1.setDisable(true);
					hits++;
					boatleft--;
				}
				else {
					rb4_1.setStyle("-fx-color: LIGHTBLUE");
					rb4_1.setVisible(true);
					bo4_1.setDisable(true);
					miss++;
				}
				bombs--;
				gameOver();
			});
			
			bo4_2.setOnAction(e -> {
				if (rb4_2.isSelected()) {
					rb4_2.setStyle("-fx-color: RED");
					rb4_2.setVisible(true);
					bo4_2.setDisable(true);
					hits++;
					boatleft--;
				}
				else {
					rb4_2.setStyle("-fx-color: LIGHTBLUE");
					rb4_2.setVisible(true);
					bo4_2.setDisable(true);
					miss++;
				}
				bombs--;
				gameOver();
			});
			
			bo4_3.setOnAction(e -> { 
				if (rb4_3.isSelected()) {
					rb4_3.setStyle("-fx-color: RED");
					rb4_3.setVisible(true);
					bo4_3.setDisable(true);
					hits++;
					boatleft--;
				}
				else {
					rb4_3.setStyle("-fx-color: LIGHTBLUE");
					rb4_3.setVisible(true);
					bo4_3.setDisable(true);
					miss++;
				}
				bombs--;
				gameOver();
			});
			
			bo4_4.setOnAction(e -> { 
				if (rb4_4.isSelected()) {
					rb4_4.setStyle("-fx-color: RED");
					rb4_4.setVisible(true);
					bo4_4.setDisable(true);
					hits++;
					boatleft--;
				}
				else {
					rb4_4.setStyle("-fx-color: LIGHTBLUE");
					rb4_4.setVisible(true);
					bo4_4.setDisable(true);
					miss++;
				}
				bombs--;
				gameOver();
			});
			
			bo4_5.setOnAction(e -> {
				if (rb4_5.isSelected()) {
					rb4_5.setStyle("-fx-color: RED");
					rb4_5.setVisible(true);
					bo4_5.setDisable(true);
					hits++;
					boatleft--;
				}
				else {
					rb4_5.setStyle("-fx-color: LIGHTBLUE");
					rb4_5.setVisible(true);
					bo4_5.setDisable(true);
					miss++;
				}
				bombs--;
				gameOver();
			});
			
			bo5_1.setOnAction(e -> { 
				if (rb5_1.isSelected()) {
					rb5_1.setStyle("-fx-color: RED");
					rb5_1.setVisible(true);
					bo5_1.setDisable(true);
					hits++;
					boatleft--;
				}
				else {
					rb5_1.setStyle("-fx-color: LIGHTBLUE");
					rb5_1.setVisible(true);
					bo5_1.setDisable(true);
					miss++;
				}
				bombs--;
				gameOver();
			});
			
			bo5_2.setOnAction(e -> { 
				if (rb5_2.isSelected()) {
					rb5_2.setStyle("-fx-color: RED");
					rb5_2.setVisible(true);
					bo5_2.setDisable(true);
					hits++;
					boatleft--;
				}
				else {
					rb5_2.setStyle("-fx-color: LIGHTBLUE");
					rb5_2.setVisible(true);
					bo5_2.setDisable(true);
					miss++;
				}
				bombs--;
				gameOver();
			});
			
			bo5_3.setOnAction(e -> { 
				if (rb5_3.isSelected()) {
					rb5_3.setStyle("-fx-color: RED");
					rb5_3.setVisible(true);
					bo5_3.setDisable(true);
					hits++;
					boatleft--;
				}
				else {
					rb5_3.setStyle("-fx-color: LIGHTBLUE");
					rb5_3.setVisible(true);
					bo5_3.setDisable(true);
					miss++;
				}
				bombs--;
				gameOver();
			});
			
			bo5_4.setOnAction(e -> { 
				if (rb5_4.isSelected()) {
					rb5_4.setStyle("-fx-color: RED");
					rb5_4.setVisible(true);
					bo5_4.setDisable(true);
					hits++;
					boatleft--;
				}
				else {
					rb5_4.setStyle("-fx-color: LIGHTBLUE");
					rb5_4.setVisible(true);
					bo5_4.setDisable(true);
					miss++;
				}
				bombs--;
				gameOver();
			});
			
			bo5_5.setOnAction(e -> { 
				if (rb5_5.isSelected()) {
					rb5_5.setStyle("-fx-color: RED");
					rb5_5.setVisible(true);
					bo5_5.setDisable(true);
					hits++;
					boatleft--;
				}
				else {
					rb5_5.setStyle("-fx-color: LIGHTBLUE");
					rb5_5.setVisible(true);
					bo5_5.setDisable(true);
					miss++;
				}
				bombs--;
				gameOver();
			});
			
			//set boatpane attributes
			boatpane.setStyle("-fx-background-color: ROYALBLUE");
			boatpane.setAlignment(Pos.TOP_CENTER);
			boatpane.setPadding(new Insets(5, 5, 5, 5));
			boatpane.setHgap(30);
			boatpane.setVgap(30);
			
			//Add Radio buttons for boat selection to the boatpane
			boatpane.add(rb1_1,1,1);
			boatpane.add(rb1_2,2,1);
			boatpane.add(rb1_3,3,1);
			boatpane.add(rb1_4,4,1);
			boatpane.add(rb1_5,5,1);
			
			boatpane.add(rb2_1,1,2);
			boatpane.add(rb2_2,2,2);
			boatpane.add(rb2_3,3,2);
			boatpane.add(rb2_4,4,2);
			boatpane.add(rb2_5,5,2);
			
			boatpane.add(rb3_1,1,3);
			boatpane.add(rb3_2,2,3);
			boatpane.add(rb3_3,3,3);
			boatpane.add(rb3_4,4,3);
			boatpane.add(rb3_5,5,3);
			
			boatpane.add(rb4_1,1,4);
			boatpane.add(rb4_2,2,4);
			boatpane.add(rb4_3,3,4);
			boatpane.add(rb4_4,4,4);
			boatpane.add(rb4_5,5,4);
			
			boatpane.add(rb5_1,1,5);
			boatpane.add(rb5_2,2,5);
			boatpane.add(rb5_3,3,5);
			boatpane.add(rb5_4,4,5);
			boatpane.add(rb5_5,5,5);
		
			//set paneForButtons attributes
			paneForButtons.getChildren().addAll(btLeft, btRight, btReStart, btScore); 
			paneForButtons.setAlignment(Pos.CENTER);
			paneForButtons.setStyle("-fx-border-color: black");
			
			//set pane attributes
			pane.setTop(boatpane);
			pane.setBottom(paneForButtons); 
			pane.setCenter(actpane);

			return pane; 
		}

		//Decline button method for use to reset the boat choices if a mistake is made
		public void decline() {
			
			//Reset the radio buttons to not selected
			rb1_1.setSelected(false);
			rb1_2.setSelected(false);
			rb1_3.setSelected(false);
			rb1_4.setSelected(false);
			rb1_5.setSelected(false);
			
			rb2_1.setSelected(false);
			rb2_2.setSelected(false);
			rb2_3.setSelected(false);
			rb2_4.setSelected(false);
			rb2_5.setSelected(false);
			
			rb3_1.setSelected(false);
			rb3_2.setSelected(false);
			rb3_3.setSelected(false);
			rb3_4.setSelected(false);
			rb3_5.setSelected(false);
			
			rb4_1.setSelected(false);
			rb4_2.setSelected(false);
			rb4_3.setSelected(false);
			rb4_4.setSelected(false);
			rb4_5.setSelected(false);
			
			rb5_1.setSelected(false);
			rb5_2.setSelected(false);
			rb5_3.setSelected(false);
			rb5_4.setSelected(false);
			rb5_5.setSelected(false);
			
			
		}
		
		//Confirm button method for use after all boats have been placed 
		public void confirm() {
	
				//set number of bombs in inventory gives 3 more bombs than the number of boats placed.
				bombs = (boats + 3);
				boatleft = boats;
				
				//enable bomb buttons after boats are set
				bo1_1.setDisable(false);
				bo1_2.setDisable(false);
				bo1_3.setDisable(false);
				bo1_4.setDisable(false);
				bo1_5.setDisable(false);
				
				bo2_1.setDisable(false);
				bo2_2.setDisable(false);
				bo2_3.setDisable(false);
				bo2_4.setDisable(false);
				bo2_5.setDisable(false);
	
				bo3_1.setDisable(false);
				bo3_2.setDisable(false);
				bo3_3.setDisable(false);
				bo3_4.setDisable(false);
				bo3_5.setDisable(false);
				
				bo4_1.setDisable(false);
				bo4_2.setDisable(false);
				bo4_3.setDisable(false);
				bo4_4.setDisable(false);
				bo4_5.setDisable(false);
				
				bo5_1.setDisable(false);
				bo5_2.setDisable(false);
				bo5_3.setDisable(false);
				bo5_4.setDisable(false);
				bo5_5.setDisable(false);
				
				//hide boat radio buttons and make them non interactable after boats are set
				rb1_1.setVisible(false);
				rb1_1.setDisable(true);
				rb1_2.setVisible(false);
				rb1_2.setDisable(true);
				rb1_3.setVisible(false);
				rb1_3.setDisable(true);
				rb1_4.setVisible(false);
				rb1_4.setDisable(true);
				rb1_5.setVisible(false);
				rb1_5.setDisable(true);
				
				rb2_1.setVisible(false);
				rb2_1.setDisable(true);
				rb2_2.setVisible(false);
				rb2_2.setDisable(true);
				rb2_3.setVisible(false);
				rb2_3.setDisable(true);
				rb2_4.setVisible(false);
				rb2_4.setDisable(true);
				rb2_5.setVisible(false);
				rb2_5.setDisable(true);
				
				rb3_1.setVisible(false);
				rb3_1.setDisable(true);
				rb3_2.setVisible(false);
				rb3_2.setDisable(true);
				rb3_3.setVisible(false);
				rb3_3.setDisable(true);
				rb3_4.setVisible(false);
				rb3_4.setDisable(true);
				rb3_5.setVisible(false);
				rb3_5.setDisable(true);
				
				rb4_1.setVisible(false);
				rb4_1.setDisable(true);
				rb4_2.setVisible(false);
				rb4_2.setDisable(true);
				rb4_3.setVisible(false);
				rb4_3.setDisable(true);
				rb4_4.setVisible(false);
				rb4_4.setDisable(true);
				rb4_5.setVisible(false);
				rb4_5.setDisable(true);
				
				rb5_1.setVisible(false);
				rb5_1.setDisable(true);
				rb5_2.setVisible(false);
				rb5_2.setDisable(true);
				rb5_3.setVisible(false);
				rb5_3.setDisable(true);
				rb5_4.setVisible(false);
				rb5_4.setDisable(true);
				rb5_5.setVisible(false);
				rb5_5.setDisable(true);
				
				//hide and disable confirm and decline buttons after boats are set
				btRight.setVisible(false);
				btRight.setDisable(true);
				btLeft.setVisible(false);
				btLeft.setDisable(true);
			}
		
		//Restart button method, used to restart the current game
		public void restart() {
		
			//reset boat count on reset button activation
			boats = 0;
			boatleft = 0;
			bombs = 0;
			hits = 0;
			miss = 0;
			
			
			//Disable Bomb buttons on reset
			bo1_1.setDisable(true);
			bo1_2.setDisable(true);
			bo1_3.setDisable(true);
			bo1_4.setDisable(true);
			bo1_5.setDisable(true);
			
			bo2_1.setDisable(true);
			bo2_2.setDisable(true);
			bo2_3.setDisable(true);
			bo2_4.setDisable(true);
			bo2_5.setDisable(true);
			
			bo3_1.setDisable(true);
			bo3_2.setDisable(true);
			bo3_3.setDisable(true);
			bo3_4.setDisable(true);
			bo3_5.setDisable(true);
			
			bo4_1.setDisable(true);
			bo4_2.setDisable(true);
			bo4_3.setDisable(true);
			bo4_4.setDisable(true);
			bo4_5.setDisable(true);
			
			bo5_1.setDisable(true);
			bo5_2.setDisable(true);
			bo5_3.setDisable(true);
			bo5_4.setDisable(true);
			bo5_5.setDisable(true);
			
			//Show and Enable boat radio buttons on reset
			rb1_1.setVisible(true);
			rb1_1.setDisable(false);
			rb1_1.setSelected(false);
			rb1_1.setStyle("-fx-color: WHITE");
			
			rb1_2.setVisible(true);
			rb1_2.setDisable(false);
			rb1_2.setSelected(false);
			rb1_2.setStyle("-fx-color: WHITE");
			
			rb1_3.setVisible(true);
			rb1_3.setDisable(false);
			rb1_3.setSelected(false);
			rb1_3.setStyle("-fx-color: WHITE");
			
			rb1_4.setVisible(true);
			rb1_4.setDisable(false);
			rb1_4.setSelected(false);
			rb1_4.setStyle("-fx-color: WHITE");
			
			rb1_5.setVisible(true);
			rb1_5.setDisable(false);
			rb1_5.setSelected(false);
			rb1_5.setStyle("-fx-color: WHITE");
			
			rb2_1.setVisible(true);
			rb2_1.setDisable(false);
			rb2_1.setSelected(false);
			rb2_1.setStyle("-fx-color: WHITE");
			
			rb2_2.setVisible(true);
			rb2_2.setDisable(false);
			rb2_2.setSelected(false);
			rb2_2.setStyle("-fx-color: WHITE");
			
			rb2_3.setVisible(true);
			rb2_3.setDisable(false);
			rb2_3.setSelected(false);
			rb2_3.setStyle("-fx-color: WHITE");
			
			rb2_4.setVisible(true);
			rb2_4.setDisable(false);
			rb2_4.setSelected(false);
			rb2_4.setStyle("-fx-color: WHITE");
			
			rb2_5.setVisible(true);
			rb2_5.setDisable(false);
			rb2_5.setSelected(false);
			rb2_5.setStyle("-fx-color: WHITE");
			
			rb3_1.setVisible(true);
			rb3_1.setDisable(false);
			rb3_1.setSelected(false);
			rb3_1.setStyle("-fx-color: WHITE");
			
			rb3_2.setVisible(true);
			rb3_2.setDisable(false);
			rb3_2.setSelected(false);
			rb3_2.setStyle("-fx-color: WHITE");
			
			rb3_3.setVisible(true);
			rb3_3.setDisable(false);
			rb3_3.setSelected(false);
			rb3_3.setStyle("-fx-color: WHITE");
			
			rb3_4.setVisible(true);
			rb3_4.setDisable(false);
			rb3_4.setSelected(false);
			rb3_4.setStyle("-fx-color: WHITE");
			
			rb3_5.setVisible(true);
			rb3_5.setDisable(false);
			rb3_5.setSelected(false);
			rb3_5.setStyle("-fx-color: WHITE");
			
			rb4_1.setVisible(true);
			rb4_1.setDisable(false);
			rb4_1.setSelected(false);
			rb4_1.setStyle("-fx-color: WHITE");
			
			rb4_2.setVisible(true);
			rb4_2.setDisable(false);
			rb4_2.setSelected(false);
			rb4_2.setStyle("-fx-color: WHITE");
			
			rb4_3.setVisible(true);
			rb4_3.setDisable(false);
			rb4_3.setSelected(false);
			rb4_3.setStyle("-fx-color: WHITE");
			
			rb4_4.setVisible(true);
			rb4_4.setDisable(false);
			rb4_4.setSelected(false);
			rb4_4.setStyle("-fx-color: WHITE");
			
			rb4_5.setVisible(true);
			rb4_5.setDisable(false);
			rb4_5.setSelected(false);
			rb4_5.setStyle("-fx-color: WHITE");
			
			rb5_1.setVisible(true);
			rb5_1.setDisable(false);
			rb5_1.setSelected(false);
			rb5_1.setStyle("-fx-color: WHITE");
			
			rb5_2.setVisible(true);
			rb5_2.setDisable(false);
			rb5_2.setSelected(false);
			rb5_2.setStyle("-fx-color: WHITE");
			
			rb5_3.setVisible(true);
			rb5_3.setDisable(false);
			rb5_3.setSelected(false);
			rb5_3.setStyle("-fx-color: WHITE");
			
			rb5_4.setVisible(true);
			rb5_4.setDisable(false);
			rb5_4.setSelected(false);
			rb5_4.setStyle("-fx-color: WHITE");
			
			rb5_5.setVisible(true);
			rb5_5.setDisable(false);
			rb5_5.setSelected(false);
			rb5_5.setStyle("-fx-color: WHITE");
			
			//Show and Enable Confirm and Decline buttons on reset
			btRight.setVisible(true);
			btRight.setDisable(false);
			btLeft.setVisible(true);
			btLeft.setDisable(false);
		
	}
		
		//game over method
		public void gameOver() {
			
			//loop to keep track of game play duration.
			if (boats - hits >= 0) {
					if (player1turn == true) {
						if (hits >= boats) {
							System.out.println(player1.getName() + " wins!");
							System.out.println("Hits/miss: " + hits + "/" +  miss);
							btLeft.setDisable(true);
							btRight.setDisable(true);
							
							bo1_1.setDisable(true);
							bo1_2.setDisable(true);
							bo1_3.setDisable(true);
							bo1_4.setDisable(true);
							bo1_5.setDisable(true);
							
							bo2_1.setDisable(true);
							bo2_2.setDisable(true);
							bo2_3.setDisable(true);
							bo2_4.setDisable(true);
							bo2_5.setDisable(true);
							
							bo3_1.setDisable(true);
							bo3_2.setDisable(true);
							bo3_3.setDisable(true);
							bo3_4.setDisable(true);
							bo3_5.setDisable(true);
							
							bo4_1.setDisable(true);
							bo4_2.setDisable(true);
							bo4_3.setDisable(true);
							bo4_4.setDisable(true);
							bo4_5.setDisable(true);
							
							bo5_1.setDisable(true);
							bo5_2.setDisable(true);
							bo5_3.setDisable(true);
							bo5_4.setDisable(true);
							bo5_5.setDisable(true);
							
							player1turn = false;
							//restart();
							player1.setPlayerID();
							player2.setPlayerID();
							player1.setWin();
							player2.setLoss();
						}
						else if (miss >= (boats + 3)) {
							System.out.println(player2.getName() + " wins");
							System.out.println("Hits/miss: " + hits + "/" +  miss);
							btLeft.setDisable(true);
							btRight.setDisable(true);
							
							bo1_1.setDisable(true);
							bo1_2.setDisable(true);
							bo1_3.setDisable(true);
							bo1_4.setDisable(true);
							bo1_5.setDisable(true);
							
							bo2_1.setDisable(true);
							bo2_2.setDisable(true);
							bo2_3.setDisable(true);
							bo2_4.setDisable(true);
							bo2_5.setDisable(true);
							
							bo3_1.setDisable(true);
							bo3_2.setDisable(true);
							bo3_3.setDisable(true);
							bo3_4.setDisable(true);
							bo3_5.setDisable(true);
							
							bo4_1.setDisable(true);
							bo4_2.setDisable(true);
							bo4_3.setDisable(true);
							bo4_4.setDisable(true);
							bo4_5.setDisable(true);
							
							bo5_1.setDisable(true);
							bo5_2.setDisable(true);
							bo5_3.setDisable(true);
							bo5_4.setDisable(true);
							bo5_5.setDisable(true);
							
							player1turn = false;
							//restart();
							player1.setPlayerID();
							player2.setPlayerID();
							player2.setWin();
							player1.setLoss();
						}

						
					}
					else if (player1turn == false) {
						if (hits >= boats) {
							System.out.println(player2.getName() + " wins!");
							System.out.println("Hits/miss: " + hits + "/" +  miss);
							btLeft.setDisable(true);
							btRight.setDisable(true);
							
							bo1_1.setDisable(true);
							bo1_2.setDisable(true);
							bo1_3.setDisable(true);
							bo1_4.setDisable(true);
							bo1_5.setDisable(true);
							
							bo2_1.setDisable(true);
							bo2_2.setDisable(true);
							bo2_3.setDisable(true);
							bo2_4.setDisable(true);
							bo2_5.setDisable(true);
							
							bo3_1.setDisable(true);
							bo3_2.setDisable(true);
							bo3_3.setDisable(true);
							bo3_4.setDisable(true);
							bo3_5.setDisable(true);
							
							bo4_1.setDisable(true);
							bo4_2.setDisable(true);
							bo4_3.setDisable(true);
							bo4_4.setDisable(true);
							bo4_5.setDisable(true);
							
							bo5_1.setDisable(true);
							bo5_2.setDisable(true);
							bo5_3.setDisable(true);
							bo5_4.setDisable(true);
							bo5_5.setDisable(true);
							
							player1turn = true;
							//restart();
							player1.setPlayerID();
							player2.setPlayerID();
							player2.setWin();
							player1.setLoss();
						}
						else if (miss >= (boats + 3)) {
							System.out.println(player1.getName() + " wins");
							System.out.println("Hits/miss: " + hits + "/" +  miss);
							btLeft.setDisable(true);
							btRight.setDisable(true);
							
							bo1_1.setDisable(true);
							bo1_2.setDisable(true);
							bo1_3.setDisable(true);
							bo1_4.setDisable(true);
							bo1_5.setDisable(true);
							
							bo2_1.setDisable(true);
							bo2_2.setDisable(true);
							bo2_3.setDisable(true);
							bo2_4.setDisable(true);
							bo2_5.setDisable(true);
							
							bo3_1.setDisable(true);
							bo3_2.setDisable(true);
							bo3_3.setDisable(true);
							bo3_4.setDisable(true);
							bo3_5.setDisable(true);
							
							bo4_1.setDisable(true);
							bo4_2.setDisable(true);
							bo4_3.setDisable(true);
							bo4_4.setDisable(true);
							bo4_5.setDisable(true);
							
							bo5_1.setDisable(true);
							bo5_2.setDisable(true);
							bo5_3.setDisable(true);
							bo5_4.setDisable(true);
							bo5_5.setDisable(true);
							
							player1turn = true;
							//restart();
							player1.setPlayerID();
							player2.setPlayerID();
							player1.setWin();
							player2.setLoss();
						}

					}
			
			}
			score();
		}
			
		// this method prints the object status in the console as a score keeping tool
		public void score() {
			
			if (player1turn == true) {
				System.out.println();
				
				System.out.println("Player Name " + player1.getName());
				System.out.println("Number of games Played by this player " + player1.getPlayerID());
				System.out.println("# of Wins for this player " + player1.getWin());
				System.out.println("# of Loss for this player " + player1.getLoss());

				//System.out.println("Object at creation " + player1.toString());
				//System.out.println("Game Date " + player1.getDate());
			}
			else if (player1turn == false) {
				System.out.println();
				
				System.out.println("Player Name " + player2.getName());
				System.out.println("Number of games Played by this player " + player2.getPlayerID());
				System.out.println("# of Wins for this player " + player2.getWin());
				System.out.println("# of Loss for this player " + player2.getLoss());

				//System.out.println("Object at creation " + player2.toString());
				//System.out.println("Game Date " + player2.getDate());
			}
			System.out.println();
			System.out.println("~~~~~This Game~~~~~");
			System.out.println("# of boats placed on field: " + boats);
			System.out.println("# of boats left on field: " + boatleft);
			System.out.println("# of bombs left in bay: " + bombs);
			System.out.println("# of hits: " + hits);
			System.out.println("# of miss: " + miss);
			
		}
		
		
}