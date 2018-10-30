package application;
import javafx.application.Application;
import javafx.stage.Stage;

public class Fan extends Application {
	 private Object Medium;
	public void start(Stage primaryStage) {
		 Fan Fan1=new Fan();
		 Fan1(Medium,6,"Brown",true);
		 
	 }
	
	private void Fan1(Object medium2, int i, String string, boolean b) {
		// TODO Auto-generated method stub
		
	}

	class Fan1
	{
		public static final int Slow=1,Medium=2, Fast=3;
		
		int speed;
		boolean F_On;
		double radius;
		String color;
	
	
	void Fan1()
	{
		speed=Slow;
		F_On=false;
		radius=4;
		color="Blue";
	}
	
	Fan1(int speed, boolean F_On, double radius, String color)
	{
		this.speed=speed;
		this.F_On=F_On;
		this.radius= radius;
		this.color=color;
		}
	
	void display()
	{
		if(F_On == true)
		{
			System.out.printf("Fan is on  the speed is" + speed, "the color is" + color, " and the radius is " + radius);
		}
		else {
			System.out.printf("Fan is off  the speed is" + speed, "the color is" + color, " and the radius is " + radius);
		}
		}
	}
	public static void main(String[] args) {
	        launch(args);
	    }
}
