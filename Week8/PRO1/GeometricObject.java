package PRO1;

public abstract class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;


	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}


	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String Ncolor) {
		color = Ncolor;
	}


	public boolean isFilled() {
		return filled;
	}

	
	public void setFilled(boolean Nfilled) {
		filled = Nfilled;
	}


	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color +
			" and filled: " + filled;
	}


	public abstract double getArea();


	public abstract double getPerimeter();
}