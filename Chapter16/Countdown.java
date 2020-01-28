//Author Jason Waters
//Date 1/28/2020
//CSI_1110_Exercise_16_21

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



public class Countdown extends Application{
	public static void main(String[] args) {
	    launch(args);
	}
	
	double time = 0;
	
	public void start(Stage primaryStage) {
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(getPane(), 450, 200);
		primaryStage.setTitle("Exercise16_21"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
	}
	
	protected BorderPane getPane() {
	
		//create the pane to display everything on
		BorderPane pane = new BorderPane();
		
		//create the text field
		TextField tf = new TextField();
		
		//create the display 
		BorderPane Display = new BorderPane();
		
		//create the time counter
		Pane Time = new Pane();
		
		//alignment and style sets
		Display.setPadding(new Insets(5,5,5,5));
		Display.setStyle("-fx-border-color: blue");
		Display.setLeft(new Label("Enter Countdown Time: "));
		Display.setCenter(tf);
		pane.setTop(Display);
		pane.setBottom(Time);
		tf.setAlignment(Pos.TOP_RIGHT);
		
		
		
		/*
		tf.setOnAction(e -> cntDwn(Double.parseDouble(tf.getText())));
		*/
		return pane;
	}
	// method for time count down
	public double cntDwn(double time) {
		
		while (time >= 1);{
			System.out.println(this.time);
			 time --; 
		
	}
		return time;
	
	}
}
