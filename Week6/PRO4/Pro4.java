package PRO4;
import java.util.Scanner;

public class Pro4 {
    public static void main(String[] args) {

    
        System.out.print("Filling Status\n");
        System.out.print("\t[0]-Single filer\n");
        System.out.print("\t[1]-Married jointly or qualifying widow(er)\n");
        System.out.print("\t[2]-Married separately\n");
        System.out.print("\t[3]-Head of household\n");


        Scanner input = new Scanner(System.in);
        System.out.print("Enter the filing status : ");
        int status = input.nextInt();

        if(status < 0 || status > 3)
        {
            System.out.println("Error : invalid status");
            System.exit(1);
        }

        System.out.print("Enter the taxable income : ");
        double income = input.nextDouble();

        double[] rates = { 0.10, 0.15, 0.25, 0.28, 0.33, 0.35 };
        
        int[][] brackets = { { 8350, 33950, 82250, 171550, 372950 }, // Single filer
          { 16700, 67900, 137050, 20885, 372950 }, // Married jointly or qualifying widow(er)
          { 8350, 33950, 68525, 104425, 186475 }, // Married separately
          { 11950, 45500, 117450, 190200, 372950 }};// Head of household


          double tax = 0;

        
        //Value tax
        if(income <= brackets[status][0])
          tax = income * rates[0];
        else if (income <= brackets[status][1])
          tax = 8350 * rates[0] + (income - 8350) * rates[1];
        else if (income <= brackets[status][2])
          tax = 8350 * rates[0] + (33950 - 8350) * rates[1] + (income - 33950)*rates[2];
        else if (income <= brackets[status][3])
          tax = 8350 * rates[0] + (33950 - 8350) * rates[1] + (82250 - 33950)* rates[2] + (income - 82250) * rates[3];
        else if (income <= brackets[status][4])
          tax = 8350 * rates[0] + (33950 - 8350) * rates[1] + (82250 - 33950)* rates[2] + (171550 - 82250) * rates[3] + (income - 171550)* rates[4];
        else
          tax = 8350 * rates[0] + (33950 - 8350) * rates[1] + (82250 - 33950)* rates[2] + (171550 - 82250) * rates[3] + (372950 - 171550)* rates[4] + (income - 372950) * rates[5];
        
    
 

          System.out.println("Tax is " + (int) (tax * 100) / 100.0);
        
    }
    
}
