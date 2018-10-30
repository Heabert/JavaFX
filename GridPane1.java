package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;  
import javafx.stage.Stage;


public class GridPane1 extends Application {
	public void start(Stage primaryStage) {
		//create a login form
		GridPane pane1=new GridPane();
		pane1.setAlignment(Pos.CENTER);
		
		//create the object
		 pane1.add(new Label("User name:"),0,0);
		 pane1.add(new TextField(),1,0);
		 pane1.add(new Label("User name:"),0,1);
		 pane1.add(new TextField(),1,1);
		 
		 Button btnOK= new Button("login");
		 pane1.add(btnOK,2,1);
		 
		 Scene scene=new Scene(pane1,200,200);
		 primaryStage.setScene(scene);
		 primaryStage.show();

	}
	
	

	public static void main(String[] args) {
	launch(args);
}
}
