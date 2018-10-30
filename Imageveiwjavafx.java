package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;



public class Imageveiwjavafx extends Application {
	public void start(Stage primaryStage) {
		
		Image image=new Image("image/heli1.jpg");
		ImageView imageview1= new ImageView(image);
		imageview1.setFitHeight(200);
		imageview1.setFitWidth(200);
		
		Image image1=new Image("image/heli2.jpg");
		ImageView imageview11= new ImageView(image1);
		imageview11.setFitHeight(200);
		imageview11.setFitWidth(200);
		
		
	
	//Hbox is a kind of Pane. it arranges all the nodes one after the another horizontally.
		
		HBox pane= new HBox(7);
		//apply padding
		pane.setPadding(new Insets(3,3.,3,3));
		
		//add image view to pane
		pane.getChildren().add(imageview1);
		pane.getChildren().add(imageview11);
		//create scene and add height and weight to scene
		Scene scene=new Scene(pane);
		
		//setting the scene on stage
		primaryStage.setScene(scene);
		
		//show the scene
		primaryStage.show();
	}
	
		public static void main(String[] args) {
		launch(args);
	}
}
