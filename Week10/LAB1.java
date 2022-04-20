import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class LAB1 extends Application {
	@Override 
	public void start(Stage primaryStage) {
		// Create a pane to hold the images views
		GridPane pane = new GridPane();

		ImageView pic1 =  new ImageView(new Image("image/rama.png"));
		ImageView pic2 =  new ImageView(new Image("image/queen.png"));
		ImageView pic3 =  new ImageView(new Image("image/china.gif"));
		ImageView pic4 =  new ImageView(new Image("image/us.gif"));
		// Place nodes in the pane
		pane.add(pic1, 0, 0);
		pic1.setFitWidth(200);
		pic1.setFitHeight(100);

		pane.add(pic2, 1, 0);
		pic2.setFitWidth(200);
		pic2.setFitHeight(100);

		pane.add(pic3, 0, 1);
		pic3.setFitWidth(200);
		pic3.setFitHeight(100);
		
		pane.add(pic4, 1, 1);
		pic4.setFitWidth(200);
		pic4.setFitHeight(100);

		
		// Create a scene
		Scene scene = new Scene(pane);
		primaryStage.setTitle("LAB1"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}
	public static void main(String[] args) {
		launch(args);
	}
}