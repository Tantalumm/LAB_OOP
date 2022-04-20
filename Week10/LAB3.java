import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.geometry.Pos;

//ClockPane.java
public class LAB3 extends Application {
	@Override 
	public void start(Stage primaryStage) {
		// Create a clock and a label
		
		int hour = (int)(Math.random() * 12);
		int min = (int)(Math.random()*60);
		int sec = 0;
		ClockPane clock = new ClockPane(hour,min,sec);
		String timeString = clock.getHour() + ":" + clock.getMinute()+ ":" + clock.getSecond();
		clock.setSecondHandVisible(false); 
		Label time = new Label(timeString);

		// Place clock and label in border pane
		BorderPane pane = new BorderPane();
		pane.setCenter(clock);
		pane.setBottom(time);
		BorderPane.setAlignment(time, Pos.TOP_CENTER);

		// Create  scene 
		Scene scene = new Scene(pane, 250, 250); 
		primaryStage.setTitle("LAB3"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}

    public static void main(String[] args) {
    launch(args);
    }
}