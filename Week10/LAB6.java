import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;

//FanPane1.java
public class LAB6 extends Application {
	@Override 
	public void start(Stage primaryStage) {
		// Create 3 buttons
		Button btPause = new Button("Pause");
		Button btResume = new Button("Resume");
		Button btReverse = new Button("Reverse");

		// Create a hbox
		HBox paneForButtons = new HBox(5);
		paneForButtons.setAlignment(Pos.CENTER);
		paneForButtons.getChildren().addAll(btPause, btResume, btReverse);

		// Create a new FanePane
		FanPane1 fan = new FanPane1();

		// Create a slider
		Slider slider = new Slider();
		slider.setMax(3);
		fan.rateProperty().bind(slider.valueProperty());

		// Create a pane
		BorderPane pane = new BorderPane();
		pane.setTop(paneForButtons);
		pane.setCenter(fan);
		pane.setBottom(slider);

		// Create handlers
		btPause.setOnAction(e -> {
			fan.pause();
		});

		btResume.setOnAction(e -> {
			fan.play();
		});

		btReverse.setOnAction(e -> {
			fan.reverse();
		});

		// Create a scene 
		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("LAB6"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}
    public static void main(String[] args) {
        launch(args);
    }
}
