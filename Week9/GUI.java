import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;

public class GUI extends Application {
	protected TextField tfLoanAmount = new TextField();
	protected TextField tfNumberOfYears = new TextField();
	protected TextArea textArea = new TextArea();

	@Override 
	public void start(Stage primaryStage) {
		tfNumberOfYears.setPrefColumnCount(2);
		tfLoanAmount.setPrefColumnCount(7);
		textArea.setPrefColumnCount(30);

		Button buttonShow = new Button("Show Table");

		Label TextLoanAmount = new Label("Loan Amounts");
		Label TextNumberOfYears = new Label("Number of Years");

		//Create paneControl at top
		HBox paneForControls = new HBox(10);
		paneForControls.setAlignment(Pos.CENTER);
		paneForControls.getChildren().addAll(TextLoanAmount, tfLoanAmount,TextNumberOfYears, tfNumberOfYears, buttonShow);

		//Create  scrollPane
		ScrollPane scrollPane = new ScrollPane(textArea);

		//Create  pane
		BorderPane pane = new BorderPane();
		pane.setTop(paneForControls);
		pane.setCenter(textArea);

		//Show print when click buttonShow
		buttonShow.setOnAction(e -> {print(); });

		//Create a scene 
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Loan GUI"); 
		primaryStage.setScene(scene);
		primaryStage.show(); // Display 
	}

	private void print() {
		
		String output = "";

		double monthlyInterestRate; 
		double monthlyPayment;	

		double amount = Double.parseDouble(tfLoanAmount.getText());
		double numberyear = Double.parseDouble(tfNumberOfYears.getText());

		if(amount < 0 )
		{
			output += "Error";
		}
		else
		{
			output += "Interest Rate       Monthly Payment          Total Payment\n";
		
			for (double i = 5.0; i <= 8; i += 0.25) {
				monthlyInterestRate = i / 1200;
	
				monthlyPayment = amount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate,numberyear * 12)); 
				//mothlyPayment = Amount * monthlyInterestRate / 1 - ( 1 / ( 1 + (monthlyInterestRate)^Year))
				
				output += String.format("%-24.2f%-34.2f%-8.2f\n", i, monthlyPayment, (monthlyPayment * 12) * numberyear);
			}
		}

		textArea.setText(output);
	}


	public static void main(String[] args) {
        launch(args);
    }
}