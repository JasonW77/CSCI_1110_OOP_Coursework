//Author Jason Waters
//Date 1/21/2020
//CSI_1110_Exercise_15

package exercise15;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class BallMover extends Application{
	public static void main(String[] args) {
		Application.launch(args);
	}
	@Override 
	public void start(Stage primaryStage) {
		
		//create a ball
		BallPane ball = new BallPane();
		
		//Place the ball in the pane
		BorderPane pane = new BorderPane();
		pane.setCenter(ball);
		
		//Create scene and place it on the stage
		Scene scene = new Scene(pane, 250, 250);
		primaryStage.setTitle("Ball Mover");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
}
