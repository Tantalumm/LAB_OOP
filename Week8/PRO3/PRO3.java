package PRO3;

public class PRO3 {
    public static void main(String[] args) {
		// Create three Rectangle objects
		Rectangle r1 = new Rectangle(2, 5, "blue", true);
		Rectangle r2 = new Rectangle(5, 2, "gray", false);
		Rectangle r3 = new Rectangle(2.5, 5, "blue", true);

		System.out.println("Rectangle1 Area :" + r1.getArea());
		System.out.println("Rectangle2 Area :" + r2.getArea());
		System.out.println("Rectangle3 Area :" + r3.getArea());

		if(r1.equals(r2))
		{
			System.out.println("\nRectangle1 is equal to Rectangle2");
		}
		else 
		{
			System.out.println("\nRectangle1 is not equal to Rectangle2");
		}

		if(r1.equals(r3))
		{
			System.out.println("\nRectangle1 is equal to Rectangle3");
		}
		else 
		{
			System.out.println("\nRectangle1 is not equal to Rectangle3");
		}
	}
}
