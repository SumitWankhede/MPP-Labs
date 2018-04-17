package prog1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Rectangle(5, 2);
		Shape s2 = new Triangle(4, 3);
		Shape s3 = new Circle(3);
		
		System.out.println("Area of rectangle is: " + s1.computeArea());
		System.out.println("Area of triangle is: " + s2.computeArea());
		System.out.println("Area of circle is: " + s3.computeArea());
	}

}
