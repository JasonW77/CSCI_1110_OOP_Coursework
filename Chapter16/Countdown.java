//Author Jason Waters
//Date 1/28/2020
//CSI_1110_Exercise_16_21

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;



public class Countdown extends Application{
	private static final String MEDIA_URL = 
		"https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3";
		
	public static void main(String[] args) {
	    launch(args);
	}
	
	public void start(Stage primaryStage) {

		// Create a scene and place it in the stage
		Scene scene = new Scene(getPane(), 450, 50);
		primaryStage.setTitle("Exercise16_21"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
	}
	
	protected BorderPane getPane() {
		
		Media media = new Media(MEDIA_URL);
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		
		TextField tf = new TextField();
		//create the pane to display the count down label and text field
		BorderPane pane = new BorderPane();
		//create the display
		BorderPane Display = new BorderPane();
		
		//alignment and style sets
		Display.setPadding(new Insets(5,5,5,5));
		Display.setLeft(new Label("Enter Countdown Time: "));
		Display.setCenter(tf);
		pane.setTop(Display);
		
		tf.setAlignment(Pos.TOP_RIGHT);
		
		tf.setOnKeyPressed(new EventHandler<KeyEvent>(){
			@Override
			public void handle(KeyEvent event) {

				if(event.getCode().equals(KeyCode.ENTER))
	              {	int a = Integer.parseInt(tf.getText());
	                while(a > 0) {
	                	try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
	                	a--;
	                	tf.setText(" "+ a);
	                	System.out.println(a);
	                	
	                }					
					System.out.println("Playing Media");
					mediaPlayer.play();
	            }
				
			}
			
		});
		
		return pane;
	}
	
}
