import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javafx.application.Application;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LoanCalculator extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    
    private TextField tfAnnualInterestRate = new TextField();
    private TextField tfNumberOfYear = new TextField();
    private TextField tfLoanAmount = new TextField();
    private TextField tfMonthlyPayment = new TextField();
    private TextField tfTotalPayment = new TextField();

    private Button btCalculate = new Button("Calculate");
    private Button btClear = new Button("Clear");
    private Button btSave = new Button("Save");
    private Button btLoad = new Button("Load");

   

    @Override
    public void start(Stage primaryStage) throws Exception {

        //Hbox for Bottoms
        HBox hbox1 = new HBox(20);
        hbox1.setAlignment(Pos.BOTTOM_RIGHT);
        hbox1.getChildren().addAll(btClear,btCalculate);

        HBox hbox2 = new HBox(20);
        hbox2.setAlignment(Pos.BOTTOM_LEFT);
        hbox2.getChildren().addAll(btSave,btLoad);
        

        //add Label and Hbox
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.add(new Label("Annual Interest Rate :"), 0, 0);
        gridPane.add(tfAnnualInterestRate, 1 , 0);
        gridPane.add(new Label("Number of Years :"), 0 , 1);
        gridPane.add(tfNumberOfYear, 1 , 1);
        gridPane.add(new Label("Loan Amount :"), 0, 2);
        gridPane.add(tfLoanAmount, 1, 2);
        gridPane.add(new Label("Monthly Payment :"), 0, 3);
        gridPane.add(tfMonthlyPayment, 1, 3);
        gridPane.add(new Label("Total Payment :"), 0, 4);
        gridPane.add(tfTotalPayment, 1, 4);
        gridPane.add(hbox1, 1, 5);
        gridPane.add(hbox2, 0, 5);
        

        //setPosition TextField
        gridPane.setAlignment(Pos.CENTER);
        tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
        tfNumberOfYear.setAlignment(Pos.BOTTOM_RIGHT);
        tfLoanAmount.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthlyPayment.setAlignment(Pos.BOTTOM_RIGHT);
        tfTotalPayment.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthlyPayment.setEditable(false);
        tfTotalPayment.setEditable(false);


        //botton load
        btLoad.setOnAction(e -> {
            try {Load();} 
            catch (IOException e1) { 
                TfError();
        }
        });


        //botton Save
        btSave.setOnAction(e -> {
            try {Save();} 
            catch (IOException e1) {
                TfError();
             }
             catch (NumberFormatException e2){
                TfError();
             }
        });


        //botton clear
        btClear.setOnAction(e -> Clear());


        //botton CalculateLoanPayment
        btCalculate.setOnAction(e -> {
            try {calculateLoanPayment();} 
            catch (NumberFormatException e1) {
                TfError();
             }
        });
    
        


        //Scene 
        Scene scene = new Scene(gridPane, 400, 250);
        primaryStage.setTitle("LoanCalculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //CalculateLoanPayment
    private void calculateLoanPayment(){

        double interest = Double.parseDouble(tfAnnualInterestRate.getText());
        int year = Integer.parseInt(tfNumberOfYear.getText());
        double loanAmount = Double.parseDouble(tfLoanAmount.getText());

        Loan loan = new Loan(interest,year,loanAmount);

        if(interest <= 0) 
        {
            System.out.println("Interest is still negative or zero. Please enter a new value.");
            tfAnnualInterestRate.clear();
        }
        else if(loanAmount <= 0)
        {
            System.out.println("Loan Amount is still negative or zero. Please enter a new value.");
            tfLoanAmount.clear();
        }
        else if(year == 0)
        {
            System.out.println("Year is still zero.  Please enter a new value.");
            tfNumberOfYear.clear();
        }
        else
        {
            tfMonthlyPayment.setText(String.format("$%.2f",loan.getMonthlyPayment()));
            tfTotalPayment.setText(String.format("$%.2f", loan.getTotalPayment()));
        }
    }

    //Clear
    private void Clear(){
        tfAnnualInterestRate.clear();
        tfNumberOfYear.clear();
        tfLoanAmount.clear();
        tfMonthlyPayment.clear();
        tfTotalPayment.clear();
    }

    //Save Value
    private void Save() throws IOException {
        try (DataOutputStream output = new DataOutputStream(new FileOutputStream("loan.dat"));)
        {    
            double interest = Double.parseDouble(tfAnnualInterestRate.getText());
            int year = Integer.parseInt(tfNumberOfYear.getText());
            double loanAmount = Double.parseDouble(tfLoanAmount.getText());

            Loan loan = new Loan(interest,year,loanAmount);

            output.writeDouble(loan.getAnnualInterestRate());
            output.writeInt(loan.getNumberOfYears());
            output.writeDouble(loan.getLoanAmount());
        }
    }

    //Load Value
    private void Load() throws FileNotFoundException, IOException{
        try(DataInputStream input = new DataInputStream(new FileInputStream("loan.dat"));) 
        {
             tfAnnualInterestRate.setText(String.valueOf(input.readDouble()));
             tfNumberOfYear.setText(String.valueOf(input.readInt()));
             tfLoanAmount.setText(String.valueOf(input.readDouble()));
           
        }
    }

    private void TfError()
    {
        tfAnnualInterestRate.setText("ERROR");
        tfNumberOfYear.setText("ERROR");
        tfLoanAmount.setText("ERROR");
        tfMonthlyPayment.setText("ERROR");
        tfTotalPayment.setText("ERROR");
    }


}