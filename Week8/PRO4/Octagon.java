package PRO4;

public class Octagon extends GeometricObject 
		implements Cloneable, Comparable<Octagon> {
	private double side;

	public Octagon() {
	}

	
	public Octagon(double Nside) {
		side = Nside;
	}

	public void setSide(double Nside) {
		side = Nside;
	}

	
	public double getSide() {
		return side;
	}

	@Override
	public double getArea() {
		return (4.828) * side * side;
	}

	@Override
	public double getPerimeter() {
		return 8 * side;
	}

	public int compareTo(Octagon o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}


	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return super.toString() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter() ;
	}
}