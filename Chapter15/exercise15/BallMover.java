//Author Jason Waters
//Date 1/21/2020
//CSI_1110_Exercise_15

package exercise15;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;

public class BallMover extends Application {
	Circle c1;
	@Override
	public void start(Stage primaryStage) {
		//Pane creation
		Pane pane = new Pane();
		
		HBox hbox = new HBox(10);
		hbox.setAlignment(Pos.BOTTOM_CENTER);
		
		Button btUP = new Button("UP");
		Button btLE = new Button("Left");
		Button btRI = new Button("Right");
		Button btDN = new Button("DWN");
		
		c1 = new Circle(150, 150, 50);
		c1.setStroke(Color.BLACK);
		c1.setFill(Color.WHITE);
		
		btUP.setOnAction(e -> {
			mUp();
		});
		
		
		btLE.setOnAction(e -> {
			mRi();
		});
		
		btRI.setOnAction(e -> {
			mLe();
		});
		
		btDN.setOnAction(e -> {
			mDn();
		});
		
		hbox.getChildren().addAll(btUP,btDN,btLE,btRI);
		pane.getChildren().add(c1);
		pane.getChildren().add(hbox);
		
		//Scene creation
		Scene scene1 = new Scene(pane, 300, 300);
		primaryStage.setTitle("Moving Ball");
		primaryStage.setScene(scene1);
		primaryStage.show();
		
		scene1.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.UP) {
				mUp();
			}
			else if (e.getCode() == KeyCode.DOWN) {
				mDn();
			}
			else if (e.getCode() == KeyCode.RIGHT) {
				mLe();
			}
			else if (e.getCode() == KeyCode.LEFT) {
				mRi();
			}
		});
	}
	public void mUp() {
		if (c1.getCenterY() >= 80) {
			c1.setCenterY((c1.getCenterY()) - 10);
		} 
		else if (c1.getCenterY() <= 80) {
			System.out.println("NO!");
		}
	}
	public void mRi() {
		if (c1.getCenterX() >= 60) {
			c1.setCenterX((c1.getCenterX()) - 10);
		} 
		else if (c1.getCenterX() <= 60) {
			System.out.println("NO!");
		}
	}
	public void mLe() {
		if (c1.getCenterX() <= 240) {
			c1.setCenterX((c1.getCenterX()) + 10);
		} 
		else if (c1.getCenterX() >= 240) {
			System.out.println("NO!");
		}
	}
	public void mDn() {
		if (c1.getCenterY() <= 240) {
			c1.setCenterY((c1.getCenterY()) + 10);
		} 
		else if (c1.getCenterY() >= 240) {
			System.out.println("NO!");
		}
	}
}
