//Author Jason Waters
//Date 2/20/2020
//CSCI_1110_Final_Project

package battleship;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;

/*   			~~~ NOTES!! ~~~
 * a great resource is http://tutorials.jenkov.com/javafx/vbox.html 
 * 
 * TO DO!
 * add method for changing player turns, 
 * 
 * finish method for getting the score. (score will be printed in the console)
 * 
 * finish the method for counting boats
 * 
 * add a counter and math for deciding how many bombs they get 
 * 		the number of bombs should be a few more than there are ships
 * 		the number of bombs needs to decrease with every bomb dropped
 * 
 * add the game over status to the game complete with status counters
 * i.e. finish the object updating for the game changes
 * 
 * clean code by removing the excess code items and commented out items
 * 
 * Maybe? fix the counter for boats to remove them once hit.
 * 
 * I also need to update the README file for the MANY changes.
 */

public class Interface extends Application {
	
		GameCounter player1;
		GameCounter player2; 
		
		boolean player1turn;
		
		int hits = 0;
		int miss = 0;
		int boats = 0;
		
		private int gameID = 0;
		
		private String P1Name = "Bob";
		private int P1Loss = 0;
		private int P1Win = 0;
		private int P1Tie = 0;
		
		private String P2Name = "Steve";
		private int P2Loss = 0;
		private int P2Win = 0;
		private int P2Tie = 0;
		
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
		
		Button btLeft = new Button("Confirm");
		Button btRight = new Button("Decline");
		Button btReStart = new Button("ReStart");
		Button btScore = new Button("Score");
		Button P1UP = new Button("P1UP");
		
		public static void main(String[] args) {
			launch(args);
		}

		@Override // Override the start method in the Application class
		public void start(Stage primaryStage) {

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
		
			player1 = new GameCounter(gameID,P1Name,P1Win,P1Loss,P1Tie);
			player2 = new GameCounter(gameID,P2Name,P2Win,P2Loss,P2Tie);
			
			//create panes and buttons for the actPane
			BorderPane pane = new BorderPane();
			HBox scorepane = new HBox(20);
			HBox totalscorepane = new HBox(20);
			GridPane actpane = new GridPane();
			GridPane boatpane = new GridPane();
			HBox paneForButtons = new HBox(20);
			
			/*
			Label score = new Label("Score");
			Label tScore = new Label("W/L");
			Label name = new Label("Name");
			Label p1score = new Label("Hits");
			Label p2score = new Label("Miss");
			Label p1tscore = new Label("P1 W/L");
			Label p2tscore = new Label("P2 W/L");
			Label p1name = new Label("P1 name");
			Label p2name = new Label("P2 name");
			
			*/
			
			btLeft.setOnAction(e -> confirm());
			btRight.setOnAction(e -> decline());
			btReStart.setOnAction(e -> restart());
			btScore.setOnAction(e -> score());
			
			//This is here to test the setter for wins
			P1UP.setOnAction(e -> player1.setWin());
			
			
			//set actPane attributes
			actpane.setStyle("-fx-border-color: black");
			actpane.setAlignment(Pos.BOTTOM_CENTER);
			actpane.setPadding(new Insets(5, 5, 5, 5));
			actpane.setHgap(5);
			actpane.setVgap(5);
			
			//boat pane labels
			boatpane.add(scorepane,0,0);
			/*
			//boatpane.add(score,0,1);
			//boatpane.add(tScore,0,2);
			
			actpane.add(p1name,0,1);
			actpane.add(p2name,0,2);
			
			actpane.add(p1score,3,1);
			actpane.add(p2score,3,2);
			
			actpane.add(p1tscore,6,1);
			actpane.add(p2tscore,6,2);
			*/
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
			
			//Boat counter on actions!! repeat this for every button.
			rb1_1.setOnAction(e -> {
				if (rb1_1.isSelected()) {
					boats++;
				}
				else {
					boats--;
				}
			});
			
			//Bomb Drop Buttons
			bo1_1.setOnAction(e -> {
				if (rb1_1.isSelected()) {
					//bo1_1.setStyle("-fx-background-color: RED");
					rb1_1.setStyle("-fx-color: RED");
					rb1_1.setVisible(true);
				}
				else {
					//bo1_1.setStyle("-fx-background-color: LIGHTBLUE");
					rb1_1.setStyle("-fx-color: LIGHTBLUE");
					rb1_1.setVisible(true);
				}
			});
			
			bo1_2.setOnAction(e -> {
				if (rb1_2.isSelected()) {
					//bo1_2.setStyle("-fx-background-color: RED");
					rb1_2.setStyle("-fx-color: RED");
					rb1_2.setVisible(true);
				}
				else {
					//bo1_2.setStyle("-fx-background-color: LIGHTBLUE");
					rb1_2.setStyle("-fx-color: LIGHTBLUE");
					rb1_2.setVisible(true);
				}
			});
			
			bo1_3.setOnAction(e -> {
				if (rb1_3.isSelected()) {
					//bo1_3.setStyle("-fx-background-color: RED");
					rb1_3.setStyle("-fx-color: RED");
					rb1_3.setVisible(true);
				}
				else {
					//bo1_3.setStyle("-fx-background-color: LIGHTBLUE");
					rb1_3.setStyle("-fx-color: LIGHTBLUE");
					rb1_3.setVisible(true);
				}
			});
			
			bo1_4.setOnAction(e -> {
				if (rb1_4.isSelected()) {
					//bo1_4.setStyle("-fx-background-color: RED");
					rb1_4.setStyle("-fx-color: RED");
					rb1_4.setVisible(true);
				}
				else {
					//bo1_4.setStyle("-fx-background-color: LIGHTBLUE");
					rb1_4.setStyle("-fx-color: LIGHTBLUE");
					rb1_4.setVisible(true);
				}
			});
			
			bo1_5.setOnAction(e -> {
				if (rb1_5.isSelected()) {
					//bo1_5.setStyle("-fx-background-color: RED");
					rb1_5.setStyle("-fx-color: RED");
					rb1_5.setVisible(true);
				}
				else {
					//bo1_5.setStyle("-fx-background-color: LIGHTBLUE");
					rb1_5.setStyle("-fx-color: LIGHTBLUE");
					rb1_5.setVisible(true);
				}
			});
		      
			bo2_1.setOnAction(e -> {
				if (rb2_1.isSelected()) {
					//bo2_1.setStyle("-fx-background-color: RED");
					rb2_1.setStyle("-fx-color: RED");
					rb2_1.setVisible(true);
				}
				else {
					//bo2_1.setStyle("-fx-background-color: LIGHTBLUE");
					rb2_1.setStyle("-fx-color: LIGHTBLUE");
					rb2_1.setVisible(true);
				}
			});
			
			bo2_2.setOnAction(e -> {
				if (rb2_2.isSelected()) {
					//bo2_2.setStyle("-fx-background-color: RED");
					rb2_2.setStyle("-fx-color: RED");
					rb2_2.setVisible(true);
				}
				else {
					//bo2_2.setStyle("-fx-background-color: LIGHTBLUE");
					rb2_2.setStyle("-fx-color: LIGHTBLUE");
					rb2_2.setVisible(true);
				}
			});
			
			bo2_3.setOnAction(e -> {
				if (rb2_3.isSelected()) {
					//bo2_3.setStyle("-fx-background-color: RED");
					rb2_3.setStyle("-fx-color: RED");
					rb2_3.setVisible(true);
				}
				else {
					//bo2_3.setStyle("-fx-background-color: LIGHTBLUE");
					rb2_3.setStyle("-fx-color: LIGHTBLUE");
					rb2_3.setVisible(true);
				}
			});
			
			bo2_4.setOnAction(e -> {
				if (rb2_4.isSelected()) {
					//bo2_4.setStyle("-fx-background-color: RED");
					rb2_4.setStyle("-fx-color: RED");
					rb2_4.setVisible(true);
				}
				else {
					//bo2_4.setStyle("-fx-background-color: LIGHTBLUE");
					rb2_4.setStyle("-fx-color: LIGHTBLUE");
					rb2_4.setVisible(true);
				}
			});
			
			bo2_5.setOnAction(e -> {
				if (rb2_5.isSelected()) {
					//bo2_5.setStyle("-fx-background-color: RED");
					rb2_5.setStyle("-fx-color: RED");
					rb2_5.setVisible(true);
				}
				else {
					//bo2_5.setStyle("-fx-background-color: LIGHTBLUE");
					rb2_5.setStyle("-fx-color: LIGHTBLUE");
					rb2_5.setVisible(true);
				}
			});
		    
			bo3_1.setOnAction(e -> {
				if (rb3_1.isSelected()) {
					//bo3_1.setStyle("-fx-background-color: RED");
					rb3_1.setStyle("-fx-color: RED");
					rb3_1.setVisible(true);
				}
				else {
					//bo3_1.setStyle("-fx-background-color: LIGHTBLUE");
					rb3_1.setStyle("-fx-color: LIGHTBLUE");
					rb3_1.setVisible(true);
				}
			});
			
			bo3_2.setOnAction(e -> {
				if (rb3_2.isSelected()) {
					//bo3_2.setStyle("-fx-background-color: RED");
					rb3_2.setStyle("-fx-color: RED");
					rb3_2.setVisible(true);
				}
				else {
					//bo3_2.setStyle("-fx-background-color: LIGHTBLUE");
					rb3_2.setStyle("-fx-color: LIGHTBLUE");
					rb3_2.setVisible(true);
				}
			});
			
			bo3_3.setOnAction(e -> { 
				if (rb3_3.isSelected()) {
					//bo3_3.setStyle("-fx-background-color: RED");
					rb3_3.setStyle("-fx-color: RED");
					rb3_3.setVisible(true);
				}
				else {
					//bo3_3.setStyle("-fx-background-color: LIGHTBLUE");
					rb3_3.setStyle("-fx-color: LIGHTBLUE");
					rb3_3.setVisible(true);
				}
			});
			
			bo3_4.setOnAction(e -> { 
				if (rb3_4.isSelected()) {
					//bo3_4.setStyle("-fx-background-color: RED");
					rb3_4.setStyle("-fx-color: RED");
					rb3_4.setVisible(true);
				}
				else {
					//bo3_4.setStyle("-fx-background-color: LIGHTBLUE");
					rb3_4.setStyle("-fx-color: LIGHTBLUE");
					rb3_4.setVisible(true);
				}
			});
			
			bo3_5.setOnAction(e -> { 
				if (rb3_5.isSelected()) {
					//bo3_5.setStyle("-fx-background-color: RED");
					rb3_5.setStyle("-fx-color: RED");
					rb3_5.setVisible(true);
				}
				else {
					//bo3_5.setStyle("-fx-background-color: LIGHTBLUE");
					rb3_5.setStyle("-fx-color: LIGHTBLUE");
					rb3_5.setVisible(true);
				}
			});
			
			bo4_1.setOnAction(e -> { 
				if (rb4_1.isSelected()) {
					//bo4_1.setStyle("-fx-background-color: RED");
					rb4_1.setStyle("-fx-color: RED");
					rb4_1.setVisible(true);
				}
				else {
					//bo4_1.setStyle("-fx-background-color: LIGHTBLUE");
					rb4_1.setStyle("-fx-color: LIGHTBLUE");
					rb4_1.setVisible(true);
				}
			});
			
			bo4_2.setOnAction(e -> {
				if (rb4_2.isSelected()) {
					//bo4_2.setStyle("-fx-background-color: RED");
					rb4_2.setStyle("-fx-color: RED");
					rb4_2.setVisible(true);
				}
				else {
					//bo4_2.setStyle("-fx-background-color: LIGHTBLUE");
					rb4_2.setStyle("-fx-color: LIGHTBLUE");
					rb4_2.setVisible(true);
				}
			});
			
			bo4_3.setOnAction(e -> { 
				if (rb4_3.isSelected()) {
					//bo4_3.setStyle("-fx-background-color: RED");
					rb4_3.setStyle("-fx-color: RED");
					rb4_3.setVisible(true);
				}
				else {
					//bo4_3.setStyle("-fx-background-color: LIGHTBLUE");
					rb4_3.setStyle("-fx-color: LIGHTBLUE");
					rb4_3.setVisible(true);
				}
			});
			
			bo4_4.setOnAction(e -> { 
				if (rb4_4.isSelected()) {
					//bo4_4.setStyle("-fx-background-color: RED");
					rb4_4.setStyle("-fx-color: RED");
					rb4_4.setVisible(true);
				}
				else {
					//bo4_4.setStyle("-fx-background-color: LIGHTBLUE");
					rb4_4.setStyle("-fx-color: LIGHTBLUE");
					rb4_4.setVisible(true);
				}
			});
			
			bo4_5.setOnAction(e -> {
				if (rb4_5.isSelected()) {
					//bo4_5.setStyle("-fx-background-color: RED");
					rb4_5.setStyle("-fx-color: RED");
					rb4_5.setVisible(true);
				}
				else {
					//bo4_5.setStyle("-fx-background-color: LIGHTBLUE");
					rb4_5.setStyle("-fx-color: LIGHTBLUE");
					rb4_5.setVisible(true);
				}
			});
			
			bo5_1.setOnAction(e -> { 
				if (rb5_1.isSelected()) {
					//bo5_1.setStyle("-fx-background-color: RED");
					rb5_1.setStyle("-fx-color: RED");
					rb5_1.setVisible(true);
				}
				else {
					//bo5_1.setStyle("-fx-background-color: LIGHTBLUE");
					rb5_1.setStyle("-fx-color: LIGHTBLUE");
					rb5_1.setVisible(true);
				}
			});
			
			bo5_2.setOnAction(e -> { 
				if (rb5_2.isSelected()) {
					//bo5_2.setStyle("-fx-background-color: RED");
					rb5_2.setStyle("-fx-color: RED");
					rb5_2.setVisible(true);
				}
				else {
					//bo5_2.setStyle("-fx-background-color: LIGHTBLUE");
					rb5_2.setStyle("-fx-color: LIGHTBLUE");
					rb5_2.setVisible(true);
				}
			});
			
			bo5_3.setOnAction(e -> { 
				if (rb5_3.isSelected()) {
					//bo5_3.setStyle("-fx-background-color: RED");
					rb5_3.setStyle("-fx-color: RED");
					rb5_3.setVisible(true);
				}
				else {
					//bo5_3.setStyle("-fx-background-color: LIGHTBLUE");
					rb5_3.setStyle("-fx-color: LIGHTBLUE");
					rb5_3.setVisible(true);
				}
			});
			
			bo5_4.setOnAction(e -> { 
				if (rb5_4.isSelected()) {
					//bo5_4.setStyle("-fx-background-color: RED");
					rb5_4.setStyle("-fx-color: RED");
					rb5_4.setVisible(true);
				}
				else {
					//bo5_4.setStyle("-fx-background-color: LIGHTBLUE");
					rb5_4.setStyle("-fx-color: LIGHTBLUE");
					rb5_4.setVisible(true);
				}
			});
			
			bo5_5.setOnAction(e -> { 
				if (rb5_5.isSelected()) {
					//bo5_5.setStyle("-fx-background-color: RED");
					rb5_5.setStyle("-fx-color: RED");
					rb5_5.setVisible(true);
				}
				else {
					//bo5_5.setStyle("-fx-background-color: LIGHTBLUE");
					rb5_5.setStyle("-fx-color: LIGHTBLUE");
					rb5_5.setVisible(true);
				}
			});
			
			//set boatpane attributes
			boatpane.setStyle("-fx-background-color: ROYALBLUE");
			boatpane.setAlignment(Pos.TOP_CENTER);
			boatpane.setPadding(new Insets(5, 5, 5, 5));
			boatpane.setHgap(30);
			boatpane.setVgap(30);
		
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
				   
			scorepane.setStyle("-fx-border-color: black");
			totalscorepane.setStyle("-fx-border-color: black");
			//set pane attributes
			pane.setTop(boatpane);
			pane.setBottom(paneForButtons); 
			pane.setCenter(actpane);

				     
			return pane; 
		}


		//Resets the radio buttons
		public void decline() {
			System.out.println("Pick again!");
			
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
		
		public void confirm() {
			
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

			
			rb1_1.setVisible(false);
			rb1_1.setDisable(true);
			bo1_1.setDisable(false);
			rb1_2.setVisible(false);
			rb1_2.setDisable(true);
			bo1_2.setDisable(false);
			rb1_3.setVisible(false);
			rb1_3.setDisable(true);
			bo1_3.setDisable(false);
			rb1_4.setVisible(false);
			rb1_4.setDisable(true);
			bo1_4.setDisable(false);
			rb1_5.setVisible(false);
			rb1_5.setDisable(true);
			bo1_5.setDisable(false);
			
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
			
			btRight.setVisible(false);
			btRight.setDisable(true);
			btLeft.setVisible(false);
			btLeft.setDisable(true);

			
		}
		
		public void restart() {
			
			boats = 0;
			
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
			
			rb1_1.setVisible(true);
			rb1_1.setDisable(false);
			rb1_1.setSelected(false);
		//	bo1_1.setStyle("-fx-background-color: GREY");
			rb1_1.setStyle("-fx-color: WHITE");
			rb1_2.setVisible(true);
			rb1_2.setDisable(false);
			rb1_2.setSelected(false);
		//	bo1_2.setStyle("-fx-background-color: WHITE");
			rb1_2.setStyle("-fx-color: WHITE");
			rb1_3.setVisible(true);
			rb1_3.setDisable(false);
			rb1_3.setSelected(false);
		//	bo1_3.setStyle("-fx-background-color: WHITE");
			rb1_3.setStyle("-fx-color: WHITE");
			rb1_4.setVisible(true);
			rb1_4.setDisable(false);
			rb1_4.setSelected(false);
			//bo1_4.setStyle("-fx-background-color: WHITE");
			rb1_4.setStyle("-fx-color: WHITE");
			rb1_5.setVisible(true);
			rb1_5.setDisable(false);
			rb1_5.setSelected(false);
			//bo1_5.setStyle("-fx-background-color: WHITE");
			rb1_5.setStyle("-fx-color: WHITE");
			
			rb2_1.setVisible(true);
			rb2_1.setDisable(false);
			rb2_1.setSelected(false);
			//bo2_1.setStyle("-fx-background-color: WHITE");
			rb2_1.setStyle("-fx-color: WHITE");
			rb2_2.setVisible(true);
			rb2_2.setDisable(false);
			rb2_2.setSelected(false);
			//bo2_2.setStyle("-fx-background-color: WHITE");
			rb2_2.setStyle("-fx-color: WHITE");
			rb2_3.setVisible(true);
			rb2_3.setDisable(false);
			rb2_3.setSelected(false);
			//bo2_3.setStyle("-fx-background-color: WHITE");
			rb2_3.setStyle("-fx-color: WHITE");
			rb2_4.setVisible(true);
			rb2_4.setDisable(false);
			rb2_4.setSelected(false);
			//bo2_4.setStyle("-fx-background-color: WHITE");
			rb2_4.setStyle("-fx-color: WHITE");
			rb2_5.setVisible(true);
			rb2_5.setDisable(false);
			rb2_5.setSelected(false);
			//bo2_5.setStyle("-fx-background-color: WHITE");
			rb2_5.setStyle("-fx-color: WHITE");
			
			rb3_1.setVisible(true);
			rb3_1.setDisable(false);
			rb3_1.setSelected(false);
			//bo3_1.setStyle("-fx-background-color: WHITE");
			rb3_1.setStyle("-fx-color: WHITE");
			rb3_2.setVisible(true);
			rb3_2.setDisable(false);
			rb3_2.setSelected(false);
			//bo3_2.setStyle("-fx-background-color: WHITE");
			rb3_2.setStyle("-fx-color: WHITE");
			rb3_3.setVisible(true);
			rb3_3.setDisable(false);
			rb3_3.setSelected(false);
			//bo3_3.setStyle("-fx-background-color: WHITE");
			rb3_3.setStyle("-fx-color: WHITE");
			rb3_4.setVisible(true);
			rb3_4.setDisable(false);
			rb3_4.setSelected(false);
			//bo3_4.setStyle("-fx-background-color: WHITE");
			rb3_4.setStyle("-fx-color: WHITE");
			rb3_5.setVisible(true);
			rb3_5.setDisable(false);
			rb3_5.setSelected(false);
			//bo3_5.setStyle("-fx-background-color: WHITE");
			rb3_5.setStyle("-fx-color: WHITE");
		
			rb4_1.setVisible(true);
			rb4_1.setDisable(false);
			rb4_1.setSelected(false);
			//bo4_1.setStyle("-fx-background-color: WHITE");
			rb4_1.setStyle("-fx-color: WHITE");
			rb4_2.setVisible(true);
			rb4_2.setDisable(false);
			rb4_2.setSelected(false);
			//bo4_2.setStyle("-fx-background-color: WHITE");
			rb4_2.setStyle("-fx-color: WHITE");
			rb4_3.setVisible(true);
			rb4_3.setDisable(false);
			rb4_3.setSelected(false);
			//bo4_3.setStyle("-fx-background-color: WHITE");
			rb4_3.setStyle("-fx-color: WHITE");
			rb4_4.setVisible(true);
			rb4_4.setDisable(false);
			rb4_4.setSelected(false);
			//bo4_4.setStyle("-fx-background-color: WHITE");
			rb4_4.setStyle("-fx-color: WHITE");
			rb4_5.setVisible(true);
			rb4_5.setDisable(false);
			rb4_5.setSelected(false);
			//bo4_5.setStyle("-fx-background-color: WHITE");
			rb4_5.setStyle("-fx-color: WHITE");
		
			rb5_1.setVisible(true);
			rb5_1.setDisable(false);
			rb5_1.setSelected(false);
			//bo5_1.setStyle("-fx-background-color: WHITE");
			rb5_1.setStyle("-fx-color: WHITE");
			rb5_2.setVisible(true);
			rb5_2.setDisable(false);
			rb5_2.setSelected(false);
			//bo5_2.setStyle("-fx-background-color: WHITE");
			rb5_2.setStyle("-fx-color: WHITE");
			rb5_3.setVisible(true);
			rb5_3.setDisable(false);
			rb5_3.setSelected(false);
			//bo5_3.setStyle("-fx-background-color: WHITE");
			rb5_3.setStyle("-fx-color: WHITE");
			rb5_4.setVisible(true);
			rb5_4.setDisable(false);
			rb5_4.setSelected(false);
			//bo5_4.setStyle("-fx-background-color: WHITE");
			rb5_4.setStyle("-fx-color: WHITE");
			rb5_5.setVisible(true);
			rb5_5.setDisable(false);
			rb5_5.setSelected(false);
			//bo5_5.setStyle("-fx-background-color: WHITE");
			rb5_5.setStyle("-fx-color: WHITE");
			
			btRight.setVisible(true);
			btRight.setDisable(false);
			btLeft.setVisible(true);
			btLeft.setDisable(false);
		
	}
		
		public void score(Stage scoreStage) {
			
			// Create a scene and place it in the stage
			Stage scoreStage1 = new Stage();
			Scene scoreboard = new Scene(ScoreTable(), 500, 500);
			scoreStage1.setTitle("Scoreboard!"); // Set the stage title
			scoreStage1.setScene(scoreboard); // Place the scene in the stage
			scoreStage1.show(); // Display the stage
		}
		
		
		//This method does not work yet
		public BorderPane ScoreTable() {
			
			BorderPane spane = new BorderPane();
			TableView<GameCounter> tableView = new TableView<GameCounter>();
			
			TableColumn<GameCounter, ?> column1 = new TableColumn<>("Player Name");
			TableColumn<GameCounter, ?> column2 = new TableColumn<>("Player Wins");
			TableColumn<GameCounter, ?> column3 = new TableColumn<>("Player Loss");
			TableColumn<GameCounter, ?> column4 = new TableColumn<>("Player Tie");
			TableColumn<GameCounter, ?> column5 = new TableColumn<>("# of Games Played");
			
			column1.setCellValueFactory(new PropertyValueFactory<>(player1.getName()));
			column2.setCellValueFactory(new PropertyValueFactory<>("player wins"));
			column3.setCellValueFactory(new PropertyValueFactory<>("player loss"));
			column4.setCellValueFactory(new PropertyValueFactory<>("player ties"));
			column5.setCellValueFactory(new PropertyValueFactory<>("# games played"));
			
			
			tableView.getColumns().add(column1);
			tableView.getColumns().add(column2);
			tableView.getColumns().add(column3);
			tableView.getColumns().add(column4);
			tableView.getColumns().add(column5);
			
			tableView.getItems().add(player1);
			tableView.getItems().add(player2);
			
			VBox vbox = new VBox(tableView);
			
			Scene scene = new Scene(vbox);
			spane.setTop(tableView);
			
			return spane;
			
		}
		
		public void score() {
			
			System.out.println();
			
			System.out.println("Player Name " + player1.getName());
			System.out.println("# of Ties for this player " + player1.getTie());
			System.out.println("# of Wins for this player " + player1.getWin());
			System.out.println("# of Loss for this player " + player1.getLoss());
			System.out.println("Number of games Played by this player " + player1.getPlayerID());
			System.out.println("Object at creation " + player1.toString());
			System.out.println("Game Date " + player1.getDate());
			
			System.out.println();
			
			System.out.println("Player Name " + player2.getName());
			System.out.println("# of Ties for this player " + player2.getTie());
			System.out.println("# of Wins for this player " + player2.getWin());
			System.out.println("# of Loss for this player " + player2.getLoss());
			System.out.println("Number of games Played by this player " + player2.getPlayerID());
			System.out.println("Object at creation " + player2.toString());
			System.out.println("Game Date " + player2.getDate());
			
			System.out.println("# of boats: " + boats);
		}
		

		
}
