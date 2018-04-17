package Lab2;

public class AvgOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float output;
		int[] input = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		output = avg(input);
		System.out.println(output);
	}

	static float avg(int[] arrayOfInts) {
		int avgValue = 0;
		
		for(int i: arrayOfInts) {
			avgValue += i;
		}
		
		return avgValue/arrayOfInts.length;
	}
}
