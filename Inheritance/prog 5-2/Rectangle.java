package prob1;

public class Rectangle extends ClosedCurve{

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
	
}
