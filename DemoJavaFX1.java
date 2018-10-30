package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class DemoJavaFX1 extends Application {
	public void start(Stage primaryStage) {
		// Create button and the object
		Button btnOK= new Button("Do not click");
		Scene scene = new Scene(btnOK,400,400);
	
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		//set scene to stage	
		primaryStage.setScene(scene);
		primaryStage.setTitle("First JavFX page");
		//show the user the output	
		primaryStage.show();
		
		
		//SECOND STAGE
		
		Button btnOK1= new Button("do not click 2");
		Scene scene2 = new Scene(btnOK1,400,400);
	
		scene2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		//set scene to stage	
		primaryStage.setScene(scene2);
		primaryStage.setTitle("First JavFX page");
		//show the user the output	
		primaryStage.show();
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

