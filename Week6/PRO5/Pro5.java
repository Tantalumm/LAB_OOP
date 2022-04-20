package PRO5;
import java.util.Scanner;

import PRO6.Tax;
public class Pro5 {
    public static void main(String[] args) {
        
        int[][] brackets = new int[][] {
            // stat 0 single
            {8350,33950, 82250, 171550, 372950},
            // stat 1 Married Filing Jointly
            {16700, 67900, 137050, 208850, 372950},
            // stat 2 Married Filing Separately
            {8350, 33950, 68525, 104425, 186475},
            // stat 3 Head of Household
            {11950, 45500, 117450, 190200, 372950}};
    
            double[] rates = new double[] { 0.10, 0.15,0.25,0.28,0.33,0.35 };

            
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the filing status : ");
            int status = input.nextInt();

            
            System.out.print("Enter the taxable income : ");
            int income = input.nextInt();


            
            Tax tax = new Tax(status,brackets,rates,income);

        System.out.printf("%.2f\n",tax.getTax());
            
    }
}
