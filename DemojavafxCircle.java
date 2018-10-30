package application;

import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;



public class DemojavafxCircle extends Application {
	public void start(Stage primaryStage) {
		
		Circle circle=new Circle();
		
		circle.setCenterX(200);
		circle.setCenterY(200);
		circle.setRadius(40);
		circle.setStrokeWidth(10.1);
		circle.setFill(javafx.scene.paint.Color.CORNFLOWERBLUE);
		circle.setStroke(javafx.scene.paint.Color.AQUA);
		
		Pane pane=new Pane();
		
		pane.getChildren().add(circle);
		
		Scene scene = new Scene(pane,300,300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
		

	public static void main(String[] args) {
		launch(args);
	}
}
