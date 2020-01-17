//Author Jason Waters
//Date 1/16/2020
//CSCI_1110_Exercise_14_28

package exercise14_28;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ClockPaneTest extends Application {
		public static void main(String[] args) {
			Application.launch(args);
		}
public class ClockPaneTest extends Application {
	

		@Override // Override the start method in the Application class
		public void start(Stage primaryStage) {
			
			// Create a clock and a label
			ClockPane clock = new ClockPane((int)(Math.random() * 11),(int)(Math.random() * 30),0, false);
		
			String timeString = clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond();
			Label lblCurrentTime = new Label(timeString);

			// Place clock and label in border pane
			BorderPane pane = new BorderPane();
			pane.setCenter(clock);
			
			pane.setBottom(lblCurrentTime);
			BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);
			
			// Create a scene and place it in the stage
			Scene scene = new Scene(pane, 250, 250);
			primaryStage.setTitle("DisplayClock"); // Set the stage title
			primaryStage.setScene(scene); // Place the scene in the stage
			primaryStage.show(); // Display the stage
		}
	}
