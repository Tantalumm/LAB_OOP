import java.util.Scanner;

//Triangle.java
public class LAB2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a color: ");
		String color = input.next();

		boolean repeatSidesInput = true;
		do {
			
			
			System.out.print("Enter first side of the triangle: ");
			double side1 = input.nextDouble();		
			System.out.print("Enter second side of the triangle: ");
			double side2 = input.nextDouble();		
			System.out.print("Enter third side of the triangle: ");
			double side3 = input.nextDouble();

			try {
				
				Triangle triangle = new Triangle(side1, side2, side3);
				repeatSidesInput = false;	
				
				triangle.setColor(color);
				System.out.println(triangle.toString());
				System.out.println("Color: " + triangle.getColor());
			}
			catch (IllegalTriangleException ex) {
				System.out.println(ex.getMessage());
			}

		} while (repeatSidesInput);
        input.close();
	}
}
