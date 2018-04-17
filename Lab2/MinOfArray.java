package Lab2;

public class MinOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int output;
		int[] input = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		output = min(input);
		System.out.println(output);
	}

	static int min(int[] arrayOfInts) {
		int minValue = arrayOfInts[0];
		
		for(int i: arrayOfInts) {
			if(minValue > i) {
				minValue = i;
			}
		}
		
		return minValue;
	}
}
