public class Triangle 
		 {
	private double side1;
	private double side2;
	private double side3;
	private String color;

	
	public Triangle() {
		side1 = side2 = side3 = 1.0;
	}

	public Triangle(double side1, double side2, double side3) 
		throws IllegalTriangleException {
		if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) 
			throw new IllegalTriangleException(side1, side2, side3);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public String getColor() {
		return color;
	}
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}