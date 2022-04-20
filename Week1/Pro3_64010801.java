package Week1;

import java.util.Scanner;
public class Pro3_64010801 {
    public static void main(String[] args){

        Scanner inputnumber = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000 : ");
        int number = inputnumber.nextInt();
    
        int lessthan10 = number % 10;
        number /= 10;
        int tens = number % 10;
        number /= 10;
        int hundreds = number % 10;
        number /= 10;
        int sum = hundreds + tens + lessthan10;
    
        System.out.println("The sum of the digits is " + sum);
    }
}
