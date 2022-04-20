import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.input.KeyCode;

//CarPane.java
public class LAB4 extends Application {
	@Override 
	public void start(Stage primaryStage) {
		
		CarPane pane = new CarPane();

		
		pane.setOnMousePressed(e -> pane.pause());
		pane.setOnMouseReleased(e -> pane.play());

		pane.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.D) 
			{
				pane.increaseSpeed();
			}
			else if (e.getCode() == KeyCode.A) 
			{
				pane.decreaseSpeed();
			}
		});

		// Create a scene 
		Scene scene = new Scene(pane, 600, 100);
		primaryStage.setTitle("LAB4"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 

		pane.requestFocus(); 
	}
    public static void main(String[] args) {
        launch(args);
    }
}
