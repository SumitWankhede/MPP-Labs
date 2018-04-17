package prog1;

public class Circle implements Shape{
	
	double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double computeArea() {
		return Math.PI*radius*radius;
	}
	
}
