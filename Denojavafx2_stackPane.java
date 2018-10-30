package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class Denojavafx2_stackPane extends Application {
	public void start(Stage primaryStage) {
		
		StackPane pane = new StackPane();
		//Children will return list of nodes AVL
		Button b = new Button("click me if you want to live");
		pane.getChildren().add(b);
		
		
		//create scene
		Scene scene = new Scene(pane,200,50);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
