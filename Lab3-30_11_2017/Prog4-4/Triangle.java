package prog1;

public class Triangle implements Shape{
	
	double length;
	double breadth;

	public Triangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public double getLength() {
		return length;
	}

	public double getBreadth() {
		return breadth;
	}

	public double computeArea() {
		return 0.5*length*breadth;
	}
	
}
