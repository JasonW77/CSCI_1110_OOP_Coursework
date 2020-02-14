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
 * Finish code for radio button coloring, first button is done.
 * change buttons to private, radio buttons are done.
 * ad a Status pane to the side for keeping track of  the score. (Can this be my object? Yes it can!)
 * make each score board an object and have a second pane for keeping track of the score.
 * 		can keep score per quarter or per game or both.
 * change background color for the play field, make it look like an ocean.
 * 
 * disable the decline button after the game starts	
 * Decide if i need to change bombPane() to something else or just delete it.
 * Update confirm method to set radio buttons to invisible	
 * need to set selections for the radio buttons.
 * decide if i even need this method
 *update the buttons with If statements for hit/miss status
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
		
		Button bo1_1 = new Button("");
		Button bo1_2 = new Button("");
		Button bo1_3 = new Button("");
		Button bo1_4 = new Button("");
		Button bo1_5 = new Button("");

		Button bo2_1 = new Button("");
		Button bo2_2 = new Button("");
		Button bo2_3 = new Button("");
		Button bo2_4 = new Button("");
		Button bo2_5 = new Button("");
		
		Button bo3_1 = new Button("");
		Button bo3_2 = new Button("");
		Button bo3_3 = new Button("");
		Button bo3_4 = new Button("");
		Button bo3_5 = new Button("");
		
		Button bo4_1 = new Button("");
		Button bo4_2 = new Button("");
		Button bo4_3 = new Button("");
		Button bo4_4 = new Button("");
		Button bo4_5 = new Button("");
		
		Button bo5_1 = new Button("");
		Button bo5_2 = new Button("");
		Button bo5_3 = new Button("");
		Button bo5_4 = new Button("");
		Button bo5_5 = new Button("");
		
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
			
			BorderPane pane = new BorderPane();
			GridPane actpane = new GridPane();
			
			actpane.setAlignment(Pos.BOTTOM_CENTER);
			actpane.setPadding(new Insets(5, 5, 5, 5));
			actpane.setHgap(5);
			actpane.setVgap(5);
			GridPane boatpane = new GridPane();
			
			
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
		
			HBox paneForButtons = new HBox(20);
			
			Button btLeft = new Button("Confirm");
			Button btRight = new Button("Decline");
			
			paneForButtons.getChildren().addAll(btLeft, btRight); 
			paneForButtons.setAlignment(Pos.CENTER);
			paneForButtons.setStyle("-fx-border-color: grey");
				   
			btLeft.setOnAction(e -> confirm());
			btRight.setOnAction(e -> decline());
			
			pane.setTop(boatpane);
			pane.setBottom(paneForButtons); 

			
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
			
			actpane.setStyle("-fx-border-color: black");
			pane.setCenter(actpane);
				      
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
				}
			});
			bo1_3.setOnAction(e -> {
				if (rb1_3.isSelected()) {
					bo1_3.setStyle("-fx-background-color: RED");
				}
			});
			bo1_4.setOnAction(e -> {
				if (rb1_4.isSelected()) {
					bo1_4.setStyle("-fx-background-color: RED");
				}
			});
			bo1_5.setOnAction(e -> {
				if (rb1_5.isSelected()) {
					bo1_5.setStyle("-fx-background-color: RED");
				}
			});
		      
			bo2_1.setOnAction(e -> {
				if (rb2_1.isSelected()) {
					bo2_1.setStyle("-fx-background-color: RED");
				}
			});
			bo2_2.setOnAction(e -> {
				if (rb2_2.isSelected()) {
					bo2_2.setStyle("-fx-background-color: RED");
				}
			});
			bo2_3.setOnAction(e -> {
				if (rb2_3.isSelected()) {
					bo2_3.setStyle("-fx-background-color: RED");
				}
			});
			bo2_4.setOnAction(e -> {
				if (rb2_4.isSelected()) {
					bo2_4.setStyle("-fx-background-color: RED");
				}
			});
			bo2_5.setOnAction(e -> {
				if (rb2_5.isSelected()) {
					bo2_5.setStyle("-fx-background-color: RED");
				}
			});
		    
			bo3_1.setOnAction(e -> {
				if (rb3_1.isSelected()) {
					bo3_1.setStyle("-fx-background-color: RED");
				}
			});
			bo3_2.setOnAction(e -> {
				if (rb3_2.isSelected()) {
					bo3_2.setStyle("-fx-background-color: RED");
				}
			});
			bo3_3.setOnAction(e -> { 
				if (rb3_3.isSelected()) {
					bo3_3.setStyle("-fx-background-color: RED");
				}
			});
			bo3_4.setOnAction(e -> { 
				if (rb3_4.isSelected()) {
					bo3_4.setStyle("-fx-background-color: RED");
				}
			});
			bo3_5.setOnAction(e -> { 
				if (rb3_5.isSelected()) {
					bo3_5.setStyle("-fx-background-color: RED");
				}
			});
			
			bo4_1.setOnAction(e -> { 
				if (rb4_1.isSelected()) {
					bo4_1.setStyle("-fx-background-color: RED");
				}
			});
			bo4_2.setOnAction(e -> {
				if (rb4_2.isSelected()) {
					bo4_2.setStyle("-fx-background-color: RED");
				}
			});
			bo4_3.setOnAction(e -> { 
				if (rb4_3.isSelected()) {
					bo4_3.setStyle("-fx-background-color: RED");
				}
			});
			bo4_4.setOnAction(e -> { 
				if (rb4_4.isSelected()) {
					bo4_4.setStyle("-fx-background-color: RED");
				}
			});
			bo4_5.setOnAction(e -> {
				if (rb4_5.isSelected()) {
					bo4_5.setStyle("-fx-background-color: RED");
				}
			});
			
			bo5_1.setOnAction(e -> { 
				if (rb5_1.isSelected()) {
					bo5_1.setStyle("-fx-background-color: RED");
				}
			});
			bo5_2.setOnAction(e -> { 
				if (rb5_2.isSelected()) {
					bo5_2.setStyle("-fx-background-color: RED");
				}
			});
			bo5_3.setOnAction(e -> { 
				if (rb5_3.isSelected()) {
					bo5_3.setStyle("-fx-background-color: RED");
				}
			});
			bo5_4.setOnAction(e -> { 
				if (rb5_4.isSelected()) {
					bo5_4.setStyle("-fx-background-color: RED");
				}
			});
			bo5_5.setOnAction(e -> { 
				if (rb5_5.isSelected()) {
					bo5_5.setStyle("-fx-background-color: RED");
				}
			});
			
			return pane; 
		}
/*NEED TO DO!!!
* need to set selections for the radio buttons.
* decide if i even need this method
*/
		//Create the boatPane to select boat placement positions
		protected BorderPane boatPane() {

			GridPane boatpane = new GridPane();
			BorderPane pane = new BorderPane();
			
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
		
			HBox paneForButtons = new HBox(20);
			
			Button btLeft = new Button("Confirm");
			Button btRight = new Button("Decline");
			
			paneForButtons.getChildren().addAll(btLeft, btRight); 
			paneForButtons.setAlignment(Pos.CENTER);
			paneForButtons.setStyle("-fx-border-color: grey");
				   
			btLeft.setOnAction(e -> confirm());
			btRight.setOnAction(e -> decline());
			
			pane.setTop(boatpane);
			pane.setBottom(paneForButtons); 
			
		return pane; 
	}
/*NEED TO DO!!!
 * Decide if i need to change bombPane() to something else or just delete it. 
 */
		
		protected GridPane bombPane() {
			GridPane bombpane = new GridPane();
			
			bombpane.setAlignment(Pos.TOP_LEFT);
			bombpane.setPadding(new Insets(5, 5, 5, 5));
			bombpane.setHgap(30);
			bombpane.setVgap(30);
			
			RadioButton b1_1 = new RadioButton("");
			RadioButton b1_2 = new RadioButton("");
			RadioButton b1_3 = new RadioButton("");
			RadioButton b1_4 = new RadioButton("");
			RadioButton b1_5 = new RadioButton("");
	
			RadioButton b2_1 = new RadioButton("");
			RadioButton b2_2 = new RadioButton("");
			RadioButton b2_3 = new RadioButton("");
			RadioButton b2_4 = new RadioButton("");
			RadioButton b2_5 = new RadioButton("");
			
			RadioButton b3_1 = new RadioButton("");
			RadioButton b3_2 = new RadioButton("");
			RadioButton b3_3 = new RadioButton("");
			RadioButton b3_4 = new RadioButton("");
			RadioButton b3_5 = new RadioButton("");
			
			RadioButton b4_1 = new RadioButton("");
			RadioButton b4_2 = new RadioButton("");
			RadioButton b4_3 = new RadioButton("");
			RadioButton b4_4 = new RadioButton("");
			RadioButton b4_5 = new RadioButton("");
			
			RadioButton b5_1 = new RadioButton("");
			RadioButton b5_2 = new RadioButton("");
			RadioButton b5_3 = new RadioButton("");
			RadioButton b5_4 = new RadioButton("");
			RadioButton b5_5 = new RadioButton("");
			
			bombpane.add(b1_1,1,1);
			bombpane.add(b1_2,2,1);
			bombpane.add(b1_3,3,1);
			bombpane.add(b1_4,4,1);
			bombpane.add(b1_5,5,1);
			
			bombpane.add(b2_1,1,2);
			bombpane.add(b2_2,2,2);
			bombpane.add(b2_3,3,2);
			bombpane.add(b2_4,4,2);
			bombpane.add(b2_5,5,2);
			
			bombpane.add(b3_1,1,3);
			bombpane.add(b3_2,2,3);
			bombpane.add(b3_3,3,3);
			bombpane.add(b3_4,4,3);
			bombpane.add(b3_5,5,3);
			
			bombpane.add(b4_1,1,4);
			bombpane.add(b4_2,2,4);
			bombpane.add(b4_3,3,4);
			bombpane.add(b4_4,4,4);
			bombpane.add(b4_5,5,4);
			
			bombpane.add(b5_1,1,5);
			bombpane.add(b5_2,2,5);
			bombpane.add(b5_3,3,5);
			bombpane.add(b5_4,4,5);
			bombpane.add(b5_5,5,5);
			
			return bombpane;
		}
		
/*NEED TO DO!!!
 * disable the decline button after the game starts		
 */
		//Resets the radio buttons
		public void decline() {
			System.out.println("try again then!");
			
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
			System.out.println(" well thats good!");
		
			
		}
	}
