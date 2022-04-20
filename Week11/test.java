import java.util.InputMismatchException;
import java.util.Scanner;
public class test {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        int x;

        try {
            System.out.print("Enter number: ");
            x = reader.nextInt();         
            System.out.println("Your number is " + x);
        } catch (InputMismatchException ex) {
           System.out.println("Exception occurred: " + ex);
        }
        reader.close();
    }

}
