package application;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Fadetransitionex extends Application {
	public void start(Stage primaryStage) {
		
		Rectangle rec=new Rectangle(10,50,250,90);
		rec.setFill(Color.CORNFLOWERBLUE);
		//stroke means the border
		
		rec.setStrokeWidth(20);
		
		//create object for fade transition and pass the duration
		
		FadeTransition fade=new FadeTransition(Duration.millis(1000));
		
		//pass the 
		fade.setFromValue(1.0);
		fade.setToValue(0.3);
		fade.setAutoReverse(false);
		fade.setCycleCount(50);
		fade.setNode(rec);
		fade.play();
		
		Pane pane=new Pane(rec);
		
		 Scene scene=new Scene(pane);
		 primaryStage.setScene(scene);
		 primaryStage.show();
	}

	public static void main(String[] args)
{
		launch(args);
}

}
