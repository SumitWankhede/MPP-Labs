package prob1;

public class Rectangle extends ClosedCurve implements Polygon{

	double width;
	double length;
	
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	double computeArea() {
		return length*width;	
	}
	
	public int getNumberOfSides() {
		return 4;
	}
	public double computePerimeter() {
		return width+width+length+length;
	}
	
}
