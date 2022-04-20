package Week1;

import java.util.Scanner;
public class Pro4_64010801 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double KILOGRAM_PER_POUND = 0.45359237;
        double METERS_PER_INCH = 0.0254;

        System.out.print("Enter weight in pounds : ");
        double weight = input.nextDouble();

        System.out.print("Enter height in inches : ");
        double height = input.nextDouble();

        weight = weight * KILOGRAM_PER_POUND;

        height = height * METERS_PER_INCH;
        if(weight > 0 && height > 0)
        {
            double BMI = weight / Math.pow(height, 2);
            System.out.println("BMI is " + BMI);
        }
        else 
        {
            System.out.println("ERROR");
        }

    }
}
