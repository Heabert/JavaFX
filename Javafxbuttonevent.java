package application;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Javafxbuttonevent extends Application{
	public void start(Stage primaryStage) {
		Text text=new Text();
		//set the font
		text.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.ITALIC,50));
		
		
		//set the coordinates where you want to display text
		text.setX(70);
		text.setY(100);
		
		text.setFill(Color.BLUE);
		text.setStroke(Color.BROWN);
		text.setStrokeWidth(3);
		text.setText("Good Evening");
		Pane pane2=new Pane();
		pane2.getChildren().add(text);
		
		HBox pane3=new HBox();
		Button b1=new Button("<--");
		Button b2=new Button("-->");
		
		pane3.getChildren().add(b1);
		pane3.getChildren().add(b2);
		pane3.setAlignment(Pos.CENTER);
		//Button event
		BorderPane pane=new BorderPane();
		pane.setBottom(pane3);
		pane.setCenter(pane2);
		
		b1.setOnAction(e->text.setX(text.getX()-15));
		//get the current value of the X coordinate for updating by -15
		b2.setOnAction(e->text.setX(text.getX()+15));
		Scene scene=new Scene(pane,600,300);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
		public static void main(String[] args) {
		launch(args);
	}
}
