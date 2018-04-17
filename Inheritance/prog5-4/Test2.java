package prob1;

public class Test2 {
	
	public static void main(String[] args) {

		Polygon[] objects = {new Triangle(4,5,6),
								 new Square(3),
								 new Rectangle(3, 4)};
		//compute areas
		for(Polygon cc : objects) {
			System.out.println("For this object:");
			System.out.printf("	Number of sides = %d",cc.getNumberOfSides());
			System.out.println();
			System.out.printf("	Perimeter = %.2f", cc.computePerimeter());
			System.out.println();
		}
    
	}

}