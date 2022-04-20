package PRO1;
import java.util.Scanner;

public class PRO1 {
    
public class Exercise_13_01 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first sides of the triangle: ");
		double side1 = input.nextDouble();
		System.out.print("Enter second sides of the triangle: ");
		double side2 = input.nextDouble();
		System.out.print("Enter third sides of the triangle: ");
		double side3 = input.nextDouble();

		System.out.print("Enter a color: ");
		String color = input.next();

		System.out.print("Is the triangle filled (true / false)? ");
		boolean filled = input.nextBoolean();
		input.close();

		
		Triangle triangle = new Triangle(side1, side2, side3, color, filled);

		System.out.println(triangle);
	}
}
}
