package application;

import com.sun.prism.paint.Color;

import javafx.application.Application;
	import javafx.stage.Stage;
	import javafx.scene.Scene;
	import javafx.scene.layout.Pane;
	import javafx.scene.text.Font;
	import javafx.scene.text.FontPosture;
	import javafx.scene.text.FontWeight;
	import javafx.scene.text.Text;


	public class JavaFXText extends Application {
	    public void start(Stage primaryStage) {
	        
	            Text text=new Text();
	            text.setFont(Font.font("Times New Roman", FontWeight.BOLD,
	                    FontPosture.ITALIC, 50));
	            
	            //Set the coordinates where you want to display text
	            text.setX(50);
	            text.setY(100);
	            
	            text.setFill(javafx.scene.paint.Color.BLUE);
	            text.setStroke(javafx.scene.paint.Color.GREEN);
	            text.setText("GoodEvening!");
	            
	            Pane pane=new Pane();
	            pane.getChildren().add(text);
	            
	            Scene scene=new Scene(pane,500,600);
	            
	            primaryStage.setScene(scene);
	            primaryStage.show();
	        }
	    
	    public static void main(String[] args) {
	        launch(args);
	    }
	}


