package PRO2;
public class PRO2 {
    public static void main(String[] args) {
	
		GeometricObject[] squares = {new Square(5,"blue",true), new Square(5.5),new Square(10), new Square(15.5), new Square(20)};


		for (int i = 0; i < squares.length; i++) {
		 	System.out.println("\nSquare #" + (i + 1));
		 	System.out.println("Area: " + squares[i].getArea() + "\nColor :" + squares[i].getColor());
		 	System.out.println("How to color: " + ((Square)squares[i]).howToColor());
		 } 
	}
}
