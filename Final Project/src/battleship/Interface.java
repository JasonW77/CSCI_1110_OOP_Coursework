//Author Jason Waters
//Date 2/13/2020
//CSCI_1110_Final_Project

package battleship;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;

/*NOTES!!
 * a great resource is http://tutorials.jenkov.com/javafx/vbox.html 
 * 
 * TO DO!
 * set a grid pane and put buttons on the pane
 * set two grids 
 * 	Grid #1 is the Boat Grid place it under the Bomb grid
 * 	Grid #2 is the bomb grid place it on top of the boat grid 
 * 		(this will enable you to "HIDE" the boats under the bomb pane, 
 * 			then when the boat is hit make that button transparent. 
 * 			and change the boat label to a hit label)
 * 
 * 			
 * 
 * 
 */
public class Interface extends Application {

	//remove almost all of these text  because when we change it to a button overlay we will not need them.
		protected Text Text = new Text(50, 50, "Fix this");
		protected Text c1r1 = new Text(50, 50, "1-1");
		protected Text c1r2 = new Text(50, 50, "1-2");
		protected Text c1r3 = new Text(50, 50, "1-3");
		protected Text c1r4 = new Text(50, 50, "1-4");
		protected Text c1r5 = new Text(50, 50, "1-5");
		protected Text c2r1 = new Text(50, 50, "2-1");
		protected Text c2r2 = new Text(50, 50, "2-2");
		protected Text c2r3 = new Text(50, 50, "2-3");
		protected Text c2r4 = new Text(50, 50, "2-4");
		protected Text c2r5 = new Text(50, 50, "2-5");
		protected Text c3r1 = new Text(50, 50, "3-1");
		protected Text c3r2 = new Text(50, 50, "3-2");
		protected Text c3r3 = new Text(50, 50, "3-3");
		protected Text c3r4 = new Text(50, 50, "3-4");
		protected Text c3r5 = new Text(50, 50, "3-5");
		protected Text c4r1 = new Text(50, 50, "4-1");
		protected Text c4r2 = new Text(50, 50, "4-2");
		protected Text c4r3 = new Text(50, 50, "4-3");
		protected Text c4r4 = new Text(50, 50, "4-4");
		protected Text c4r5 = new Text(50, 50, "4-5");
		protected Text c5r1 = new Text(50, 50, "5-1");
		protected Text c5r2 = new Text(50, 50, "5-2");
		protected Text c5r3 = new Text(50, 50, "5-3");
		protected Text c5r4 = new Text(50, 50, "5-4");
		protected Text c5r5 = new Text(50, 50, "5-5");
		
		public static void main(String[] args) {
			launch(args);
		}

		@Override // Override the start method in the Application class
		public void start(Stage primaryStage) {
			// Create a scene and place it in the stage
			Scene scene = new Scene(getPane(), 500, 500);
			primaryStage.setTitle("BattleShip!"); // Set the stage title
			primaryStage.setScene(scene); // Place the scene in the stage
			primaryStage.show(); // Display the stage
		}
		
		//Create the pane for Confirm and decline button
		protected BorderPane getPane() {
			HBox paneForButtons = new HBox(20);
			Button btLeft = new Button("Confirm");
			Button btRight = new Button("Decline");
			paneForButtons.getChildren().addAll(btLeft, btRight); 
			paneForButtons.setAlignment(Pos.CENTER);
			paneForButtons.setStyle("-fx-border-color: grey");
				   
			BorderPane pane = new BorderPane();
			pane.setBottom(paneForButtons); 
				 
			Pane panec1r1 = new Pane();
			panec1r1.setStyle("-fx-border-color: black");
			panec1r1.getChildren().add(c1r1);
			pane.setCenter(panec1r1);
			
			pane.setTop(getColumnButtons());
			pane.setLeft(getRowButtons());
				      
			btLeft.setOnAction(e -> mRi());
			btRight.setOnAction(e -> mLe());
			
			return pane; 
		}
		protected HBox getColumnButtons() {
			
			HBox column = new HBox(20);
			column.setPadding(new Insets(5, 5, 5, 85));
			column.setStyle("-fx-border-color: grey");
			column.setStyle("-fx-border-width: 2px; -fx-border-color: grey"); 
			
			RadioButton col1 = new RadioButton("Col-1");
			RadioButton col2 = new RadioButton("Col-2");
			RadioButton col3 = new RadioButton("Col-3");
			RadioButton col4 = new RadioButton("Col-4");
			RadioButton col5 = new RadioButton("Col-5");
			
			column.getChildren().addAll(col1, col2, col3, col4, col5);
			
			ToggleGroup groupC = new ToggleGroup();
			col1.setToggleGroup(groupC);
			col2.setToggleGroup(groupC);
			col3.setToggleGroup(groupC);
			col4.setToggleGroup(groupC);
			col5.setToggleGroup(groupC);
			
			col1.setOnAction(e -> {
				if (col1.isSelected()) {
					c1r1.setFill(Color.RED);
				}
			});
			col2.setOnAction(e -> {
				if (col2.isSelected()) {
					c1r1.setFill(Color.YELLOW);
				}
			});
			col3.setOnAction(e -> {
				if (col3.isSelected()) {
					c1r1.setFill(Color.BLACK);
				}
			});
			col4.setOnAction(e -> {
				if (col4.isSelected()) {
					c1r1.setFill(Color.ORANGE);
				}
			});
			col5.setOnAction(e -> {
				if (col5.isSelected()) {
					c1r1.setFill(Color.GREEN);
				}
			});
			return column;
			
		}
		protected VBox getRowButtons() {
			
			VBox row = new VBox(20);
			row.setPadding(new Insets(5, 5, 5, 5));
			row.setStyle("-fx-border-color: grey");
			row.setStyle("-fx-border-width: 2px; -fx-border-color: grey"); 
			
			RadioButton row1 = new RadioButton("Row-1");
			RadioButton row2 = new RadioButton("Row-2");
			RadioButton row3 = new RadioButton("Row-3");
			RadioButton row4 = new RadioButton("Row-4");
			RadioButton row5 = new RadioButton("Row-5");
			
			row.getChildren().addAll(row1, row2, row3, row4, row5);

			ToggleGroup groupR = new ToggleGroup();
			row1.setToggleGroup(groupR);
			row2.setToggleGroup(groupR);
			row3.setToggleGroup(groupR);
			row4.setToggleGroup(groupR);
			row5.setToggleGroup(groupR);
				
			row1.setOnAction(e -> {
				if (row1.isSelected()) {
					Text.setFill(Color.RED);
				}
			});
			row2.setOnAction(e -> {
				if (row2.isSelected()) {
					Text.setFill(Color.YELLOW);
				}
			});
			row3.setOnAction(e -> {
				if (row3.isSelected()) {
					Text.setFill(Color.BLACK);
				}
			});
			row4.setOnAction(e -> {
				if (row4.isSelected()) {
					Text.setFill(Color.ORANGE);
				}
			});
			row5.setOnAction(e -> {
				if (row5.isSelected()) {
					Text.setFill(Color.GREEN);
				}
			});
				
			return row;
		}
		public void mRi() {
			if (Text.getX() >= 1) {
				Text.setX((Text.getX()) - 50);
			} 
			else if (Text.getX() <= 1) {
				System.out.println("NO!");
			}
		}
		public void mLe() {
			if (Text.getX() <= 295) {
				Text.setX((Text.getX()) + 50);
			} 
			else if (Text.getX() >= 295) {
				System.out.println("NO!");
			}
		}
	}

