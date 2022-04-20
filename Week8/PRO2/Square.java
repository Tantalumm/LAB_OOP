package PRO2;

public class Square extends GeometricObject implements Colorable {
    private double side;

	public Square() {
	}

	public Square(double Nside) {
		side = Nside;
	}

	public Square(double side, String color, boolean filled) {
		super(color, filled);
		setSide(side);
	}

	public void setSide(double Nside) {
		side = Nside;
	}

	public double getSide() {
		return side;
	}

	@Override
	public double getArea() {
		return Math.pow(side, 2);
	}

	@Override
	public double getPerimeter() {
		return side * 4;
	}

	@Override
	public String howToColor() {
		if(isFilled()==false)
		{
			return "Color not four sides";
		}
		return "Color all four sides";
	}

	@Override
	public String toString() {
		return super.toString() + "\nSide: " + side + "\nArea: " + getArea()
			+ "\nPerimeter: " + getPerimeter();
	}

}
