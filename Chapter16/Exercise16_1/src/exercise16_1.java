//Author Jason Waters
//Date 1/27/2020
//CSI_1110_Exercise_16_1

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;

public class exercise16_1 extends Application {

	protected Text text = new Text(50, 50, "Programming is fun");
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a scene and place it in the stage
		Scene scene = new Scene(getPane(), 450, 200);
		primaryStage.setTitle("Exercise16_1"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	
	protected BorderPane getPane() {
		HBox paneForButtons = new HBox(20);
		Button btLeft = new Button("Left");
		Button btRight = new Button("Right");
		paneForButtons.getChildren().addAll(btLeft, btRight); 
		paneForButtons.setAlignment(Pos.CENTER);
		paneForButtons.setStyle("-fx-border-color: grey");
			   
		BorderPane pane = new BorderPane();
		pane.setBottom(paneForButtons); 
			 
		Pane paneForText = new Pane();
		paneForText.getChildren().add(text);
		pane.setCenter(paneForText);
		
		pane.setTop(getButtons());
			      
		btLeft.setOnAction(e -> mRi());
		btRight.setOnAction(e -> mLe());
		
		return pane; 
	}

	protected HBox getButtons() {
		HBox radpane = new HBox(20);
		
		radpane.setPadding(new Insets(5, 5, 5, 5));
		radpane.setStyle("-fx-border-color: grey");
		radpane.setStyle("-fx-border-width: 2px; -fx-border-color: grey"); 
		RadioButton rbRed = new RadioButton("Red");
		RadioButton rbYel = new RadioButton("Yellow");
		RadioButton rbBlk = new RadioButton("Black");
		RadioButton rbOng = new RadioButton("Orange");
		RadioButton rbGre = new RadioButton("Green");
		radpane.getChildren().addAll(rbRed, rbYel, rbBlk, rbOng, rbGre);
			
		ToggleGroup group = new ToggleGroup();
		rbRed.setToggleGroup(group);
		rbYel.setToggleGroup(group);
		rbBlk.setToggleGroup(group);
		rbOng.setToggleGroup(group);
		rbGre.setToggleGroup(group);
			
		rbRed.setOnAction(e -> {
			if (rbRed.isSelected()) {
				text.setFill(Color.RED);
			}
		});
		rbYel.setOnAction(e -> {
			if (rbYel.isSelected()) {
				text.setFill(Color.YELLOW);
			}
		});
		rbBlk.setOnAction(e -> {
			if (rbBlk.isSelected()) {
				text.setFill(Color.BLACK);
			}
		});
		rbOng.setOnAction(e -> {
			if (rbOng.isSelected()) {
				text.setFill(Color.ORANGE);
			}
		});
		rbGre.setOnAction(e -> {
			if (rbGre.isSelected()) {
				text.setFill(Color.GREEN);
			}
		});
			
		return radpane;
	}
	public void mRi() {
		if (text.getX() >= 1) {
			text.setX((text.getX()) - 50);
		} 
		else if (text.getX() <= 1) {
			System.out.println("NO!");
		}
	}
	public void mLe() {
		if (text.getX() <= 295) {
			text.setX((text.getX()) + 50);
		} 
		else if (text.getX() >= 295) {
			System.out.println("NO!");
		}
	}
}