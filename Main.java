package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		// the object of borderPane was created as shown below
			BorderPane root = new BorderPane();
			//the scene has 3 parameters or arguments
			Scene scene = new Scene(root,400,400);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
//Understanding the basic of JavaFX
//JavaFX is used the create GUI programs
//Stage is where you write your code, but cannot hold everything. 
// Scene is a container that holds the components of the stage
//Button ---nodes