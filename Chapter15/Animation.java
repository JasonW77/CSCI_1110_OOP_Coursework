//Author Jason Waters
//Date 1/27/2020
//CSI_1110_Exercise_15

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.animation.FadeTransition;

public class Animation extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {   
		// Create a scene and place it in the stage
		Scene scene = new Scene(new MyPolygon(), 800, 800);
		primaryStage.setTitle("ShowPolygon"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
}

	class MyPolygon extends Pane {
		private void paint() {
			// Create a polygon and place polygon to pane
			Polygon polygon = new Polygon();
			polygon.setFill(Color.BLUE);
			polygon.setStrokeWidth(5);
			polygon.setStroke(Color.WHITE);
			ObservableList<Double> list = polygon.getPoints();
			
			Rectangle rectangle = new Rectangle (0, 0, 25, 50);
			rectangle.setFill(Color.RED);
			
			double centerX = getWidth() / 2, centerY = getHeight() / 2;
			double radius = Math.min(getWidth(), getHeight()) / 10;

			// s represents the number of sides of the shape
			// Make sure to update this number when necessary
			int s = 5;
			// Add points to the polygon list
			for (int i = 0; i < s; i++) {
				list.add(centerX + radius * Math.cos(2 * i * Math.PI / s)); 
				list.add(centerY - radius * Math.sin(2 * i * Math.PI / s));
			}     
			
			polygon.setRotate(53.5);
			getChildren().clear();
			getChildren().addAll(polygon, rectangle); 
			
			//Create the path transition
			PathTransition pt = new PathTransition();
			pt.setDuration(Duration.millis(4000));
			pt.setPath(polygon);
			pt.setNode(rectangle);
			pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
			pt.setCycleCount(Timeline.INDEFINITE);
			pt.setAutoReverse(false);
			pt.play();
			
			//Create the fade transition
			FadeTransition ft = new FadeTransition(Duration.millis(3000), rectangle);
			ft.setFromValue(1.0);
			ft.setToValue(0.1);
			ft.setCycleCount(Timeline.INDEFINITE);
			ft.setAutoReverse(true);
			ft.play();
			
			this.setOnMousePressed(e -> {
				if (e.getButton() == MouseButton.PRIMARY) {
					pt.pause();
					ft.pause();
				}
				else if (e.getButton() == MouseButton.SECONDARY) {
					pt.play();
					ft.play();
				}
			});
	
		}
	
		@Override
		public void setWidth(double width) {
			super.setWidth(width);
			paint();
		}
		
		@Override
		public void setHeight(double height) {
			super.setHeight(height);
			paint();
		}
	}
