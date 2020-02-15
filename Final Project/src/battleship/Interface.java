//Author Jason Waters
//Date 2/13/2020
//CSCI_1110_Final_Project

package battleship;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;

/*   			~~~ NOTES!! ~~~
 * 
 * a great resource is http://tutorials.jenkov.com/javafx/vbox.html 
 * 
 * TO DO!
 * Set the radio buttons to non interact able after the confirm button has been pressed
 * Set the radio buttons to invisible after the confirm button is pressed
 * Set the Decline button to non interact able after confirm button is pressed
 * turn radio button visible when hit or missed
 * 
 * add TextFields for the player names. this will help keep score
 * add a Status pane to the side for keeping track of  the score. (Can this be my object? Yes it can!)
 * make each score board an object and have a second pane for keeping track of the score.
 * I can keep score per quarter or per game or both.
 *
 * 
 * disable the decline button after the game starts	
 * 
 * Update confirm method to set radio buttons to invisible	
 * need to set selections for the radio buttons.
 *
 * update the buttons with If statements for hit/miss status
 * 
 */

public class Interface extends Application {
	
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
		
		public static void main(String[] args) {
			launch(args);
		}

		@Override // Override the start method in the Application class
		public void start(Stage primaryStage) {
			
			// Create a scene and place it in the stage
			Scene scene = new Scene(actPane(), 500, 500);
			primaryStage.setTitle("BattleShip!"); // Set the stage title
			primaryStage.setScene(scene); // Place the scene in the stage
			primaryStage.show(); // Display the stage
			
		}
		

/*NEED TO DO!!!
* update the buttons with If statements for hit/miss status
*/
		//Create the actPane, this pane is the pane for bomb drops and result of hit/miss
		protected BorderPane actPane() {
		
			//create panes and buttons for the actPane
			BorderPane pane = new BorderPane();
			GridPane actpane = new GridPane();
			GridPane boatpane = new GridPane();
			HBox paneForButtons = new HBox(20);
			Button btLeft = new Button("Confirm");
			Button btRight = new Button("Decline");
			
			btLeft.setOnAction(e -> confirm());
			btRight.setOnAction(e -> decline());
			
			//set actPane attributes
			actpane.setStyle("-fx-border-color: black");
			actpane.setAlignment(Pos.BOTTOM_CENTER);
			actpane.setPadding(new Insets(5, 5, 5, 5));
			actpane.setHgap(5);
			actpane.setVgap(5);
			
			actpane.add(bo1_1,1,1);
			actpane.add(bo1_2,2,1);
			actpane.add(bo1_3,3,1);
			actpane.add(bo1_4,4,1);
			actpane.add(bo1_5,5,1);
			
			actpane.add(bo2_1,1,2);
			actpane.add(bo2_2,2,2);
			actpane.add(bo2_3,3,2);
			actpane.add(bo2_4,4,2);
			actpane.add(bo2_5,5,2);
			
			actpane.add(bo3_1,1,3);
			actpane.add(bo3_2,2,3);
			actpane.add(bo3_3,3,3);
			actpane.add(bo3_4,4,3);
			actpane.add(bo3_5,5,3);
			
			actpane.add(bo4_1,1,4);
			actpane.add(bo4_2,2,4);
			actpane.add(bo4_3,3,4);
			actpane.add(bo4_4,4,4);
			actpane.add(bo4_5,5,4);
			
			actpane.add(bo5_1,1,5);
			actpane.add(bo5_2,2,5);
			actpane.add(bo5_3,3,5);
			actpane.add(bo5_4,4,5);
			actpane.add(bo5_5,5,5);
			
			bo1_1.setOnAction(e -> {
				if (rb1_1.isSelected()) {
					bo1_1.setStyle("-fx-background-color: RED");
					rb1_1.setStyle("-fx-color: RED");
				}
				else {
					bo1_1.setStyle("-fx-background-color: LIGHTBLUE");
					rb1_1.setStyle("-fx-color: LIGHTBLUE");
				}
			});
			
			bo1_2.setOnAction(e -> {
				if (rb1_2.isSelected()) {
					bo1_2.setStyle("-fx-background-color: RED");
					rb1_2.setStyle("-fx-color: RED");
				}
				else {
					bo1_2.setStyle("-fx-background-color: LIGHTBLUE");
					rb1_2.setStyle("-fx-color: LIGHTBLUE");
				}
			});
			
			bo1_3.setOnAction(e -> {
				if (rb1_3.isSelected()) {
					bo1_3.setStyle("-fx-background-color: RED");
					rb1_3.setStyle("-fx-color: RED");
				}
				else {
					bo1_3.setStyle("-fx-background-color: LIGHTBLUE");
					rb1_3.setStyle("-fx-color: LIGHTBLUE");
				}
			});
			
			bo1_4.setOnAction(e -> {
				if (rb1_4.isSelected()) {
					bo1_4.setStyle("-fx-background-color: RED");
					rb1_4.setStyle("-fx-color: RED");
				}
				else {
					bo1_4.setStyle("-fx-background-color: LIGHTBLUE");
					rb1_4.setStyle("-fx-color: LIGHTBLUE");
				}
			});
			
			bo1_5.setOnAction(e -> {
				if (rb1_5.isSelected()) {
					bo1_5.setStyle("-fx-background-color: RED");
					rb1_5.setStyle("-fx-color: RED");
				}
				else {
					bo1_5.setStyle("-fx-background-color: LIGHTBLUE");
					rb1_5.setStyle("-fx-color: LIGHTBLUE");
				}
			});
		      
			bo2_1.setOnAction(e -> {
				if (rb2_1.isSelected()) {
					bo2_1.setStyle("-fx-background-color: RED");
					rb2_1.setStyle("-fx-color: RED");
				}
				else {
					bo2_1.setStyle("-fx-background-color: LIGHTBLUE");
					rb2_1.setStyle("-fx-color: LIGHTBLUE");
				}
			});
			
			bo2_2.setOnAction(e -> {
				if (rb2_2.isSelected()) {
					bo2_2.setStyle("-fx-background-color: RED");
					rb2_2.setStyle("-fx-color: RED");
				}
				else {
					bo2_2.setStyle("-fx-background-color: LIGHTBLUE");
					rb2_2.setStyle("-fx-color: LIGHTBLUE");
				}
			});
			
			bo2_3.setOnAction(e -> {
				if (rb2_3.isSelected()) {
					bo2_3.setStyle("-fx-background-color: RED");
					rb2_3.setStyle("-fx-color: RED");
				}
				else {
					bo2_3.setStyle("-fx-background-color: LIGHTBLUE");
					rb2_3.setStyle("-fx-color: LIGHTBLUE");
				}
			});
			
			bo2_4.setOnAction(e -> {
				if (rb2_4.isSelected()) {
					bo2_4.setStyle("-fx-background-color: RED");
					rb2_4.setStyle("-fx-color: RED");
				}
				else {
					bo2_4.setStyle("-fx-background-color: LIGHTBLUE");
					rb2_4.setStyle("-fx-color: LIGHTBLUE");
				}
			});
			
			bo2_5.setOnAction(e -> {
				if (rb2_5.isSelected()) {
					bo2_5.setStyle("-fx-background-color: RED");
					rb2_5.setStyle("-fx-color: RED");
				}
				else {
					bo2_5.setStyle("-fx-background-color: LIGHTBLUE");
					rb2_5.setStyle("-fx-color: LIGHTBLUE");
				}
			});
		    
			bo3_1.setOnAction(e -> {
				if (rb3_1.isSelected()) {
					bo3_1.setStyle("-fx-background-color: RED");
					rb3_1.setStyle("-fx-color: RED");
				}
				else {
					bo3_1.setStyle("-fx-background-color: LIGHTBLUE");
					rb3_1.setStyle("-fx-color: LIGHTBLUE");
				}
			});
			
			bo3_2.setOnAction(e -> {
				if (rb3_2.isSelected()) {
					bo3_2.setStyle("-fx-background-color: RED");
					rb3_2.setStyle("-fx-color: RED");
				}
				else {
					bo3_2.setStyle("-fx-background-color: LIGHTBLUE");
					rb3_2.setStyle("-fx-color: LIGHTBLUE");
				}
			});
			
			bo3_3.setOnAction(e -> { 
				if (rb3_3.isSelected()) {
					bo3_3.setStyle("-fx-background-color: RED");
					rb3_3.setStyle("-fx-color: RED");
				}
				else {
					bo3_3.setStyle("-fx-background-color: LIGHTBLUE");
					rb3_3.setStyle("-fx-color: LIGHTBLUE");
				}
			});
			
			bo3_4.setOnAction(e -> { 
				if (rb3_4.isSelected()) {
					bo3_4.setStyle("-fx-background-color: RED");
					rb3_4.setStyle("-fx-color: RED");
				}
				else {
					bo3_4.setStyle("-fx-background-color: LIGHTBLUE");
					rb3_4.setStyle("-fx-color: LIGHTBLUE");
				}
			});
			
			bo3_5.setOnAction(e -> { 
				if (rb3_5.isSelected()) {
					bo3_5.setStyle("-fx-background-color: RED");
					rb3_5.setStyle("-fx-color: RED");
				}
				else {
					bo3_5.setStyle("-fx-background-color: LIGHTBLUE");
					rb3_5.setStyle("-fx-color: LIGHTBLUE");
				}
			});
			
			bo4_1.setOnAction(e -> { 
				if (rb4_1.isSelected()) {
					bo4_1.setStyle("-fx-background-color: RED");
					rb4_1.setStyle("-fx-color: RED");
				}
				else {
					bo4_1.setStyle("-fx-background-color: LIGHTBLUE");
					rb4_1.setStyle("-fx-color: LIGHTBLUE");
				}
			});
			
			bo4_2.setOnAction(e -> {
				if (rb4_2.isSelected()) {
					bo4_2.setStyle("-fx-background-color: RED");
					rb4_2.setStyle("-fx-color: RED");
				}
				else {
					bo4_2.setStyle("-fx-background-color: LIGHTBLUE");
					rb4_2.setStyle("-fx-color: LIGHTBLUE");
				}
			});
			
			bo4_3.setOnAction(e -> { 
				if (rb4_3.isSelected()) {
					bo4_3.setStyle("-fx-background-color: RED");
					rb4_3.setStyle("-fx-color: RED");
				}
				else {
					bo4_3.setStyle("-fx-background-color: LIGHTBLUE");
					rb4_3.setStyle("-fx-color: LIGHTBLUE");
				}
			});
			
			bo4_4.setOnAction(e -> { 
				if (rb4_4.isSelected()) {
					bo4_4.setStyle("-fx-background-color: RED");
					rb4_4.setStyle("-fx-color: RED");
				}
				else {
					bo4_4.setStyle("-fx-background-color: LIGHTBLUE");
					rb4_4.setStyle("-fx-color: LIGHTBLUE");
				}
			});
			
			bo4_5.setOnAction(e -> {
				if (rb4_5.isSelected()) {
					bo4_5.setStyle("-fx-background-color: RED");
					rb4_5.setStyle("-fx-color: RED");
				}
				else {
					bo4_5.setStyle("-fx-background-color: LIGHTBLUE");
					rb4_5.setStyle("-fx-color: LIGHTBLUE");
				}
			});
			
			bo5_1.setOnAction(e -> { 
				if (rb5_1.isSelected()) {
					bo5_1.setStyle("-fx-background-color: RED");
					rb5_1.setStyle("-fx-color: RED");
				}
				else {
					bo5_1.setStyle("-fx-background-color: LIGHTBLUE");
					rb5_1.setStyle("-fx-color: LIGHTBLUE");
				}
			});
			
			bo5_2.setOnAction(e -> { 
				if (rb5_2.isSelected()) {
					bo5_2.setStyle("-fx-background-color: RED");
					rb5_2.setStyle("-fx-color: RED");
				}
				else {
					bo5_2.setStyle("-fx-background-color: LIGHTBLUE");
					rb5_2.setStyle("-fx-color: LIGHTBLUE");
				}
			});
			
			bo5_3.setOnAction(e -> { 
				if (rb5_3.isSelected()) {
					bo5_3.setStyle("-fx-background-color: RED");
					rb5_3.setStyle("-fx-color: RED");
				}
				else {
					bo5_3.setStyle("-fx-background-color: LIGHTBLUE");
					rb5_3.setStyle("-fx-color: LIGHTBLUE");
				}
			});
			
			bo5_4.setOnAction(e -> { 
				if (rb5_4.isSelected()) {
					bo5_4.setStyle("-fx-background-color: RED");
					rb5_4.setStyle("-fx-color: RED");
				}
				else {
					bo5_4.setStyle("-fx-background-color: LIGHTBLUE");
					rb5_4.setStyle("-fx-color: LIGHTBLUE");
				}
			});
			
			bo5_5.setOnAction(e -> { 
				if (rb5_5.isSelected()) {
					bo5_5.setStyle("-fx-background-color: RED");
					rb5_5.setStyle("-fx-color: RED");
				}
				else {
					bo5_5.setStyle("-fx-background-color: LIGHTBLUE");
					rb5_5.setStyle("-fx-color: LIGHTBLUE");
				}
			});
			
			//set boatpane attributes
			boatpane.setStyle("-fx-background-color: ROYALBLUE")
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
			paneForButtons.getChildren().addAll(btLeft, btRight); 
			paneForButtons.setAlignment(Pos.CENTER);
			paneForButtons.setStyle("-fx-border-color: black");
				   
			//set pane attributes
			pane.setTop(boatpane);
			pane.setBottom(paneForButtons); 
			pane.setCenter(actpane);
				     
			return pane; 
		}

/*NEED TO DO!!!
 * disable the decline button after the game starts		
 */
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
		
/*NEED TO DO!!!
 * Update confirm method to set radio buttons to invisible		
 */
		public void confirm() {
			System.out.println("Lets get to it then!");
		
			
		}
	}
