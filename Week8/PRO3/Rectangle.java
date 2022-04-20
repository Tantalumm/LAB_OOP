package PRO3;

public class Rectangle
		extends GeometricObject implements Comparable<Rectangle> {
	private double width;
	private double height;

	public Rectangle() {
	}

	public Rectangle(
		double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(
		double width, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}

	
	public double getWidth() {
		return width;
	}

	
	public void setWidth(double Nwidth) {
		width = Nwidth;
	}

	
	public double getheight() {
		return height;
	}

	
	public void setheight(double Nheight) {
		height = Nheight;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		return 2 * (width * height);
	}

	@Override
	public boolean equals(Object o) {
		return this.compareTo((Rectangle)o) == 0;
	}


	@Override
	public int compareTo(Rectangle o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}


	@Override
	public String toString() {
		return super.toString() + "\nWidth: " + width + "\nHeight: " + height
			+ "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
	}
}