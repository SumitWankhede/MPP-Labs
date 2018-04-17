package prog1;

public class Rectangle implements Shape{
	
	double width;
	double length;
	
	public Rectangle(double width, double length) {
		super();
		this.length = length;
		this.width = width;
	}
	
	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	public double computeArea() {
		return length*width;
	}
	
	
}
