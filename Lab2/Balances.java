package Lab2;

public class Balances {

	public static void main(String[] args) {
		double[][] balances = {{10000.00,10000.00,10000.00,10000.00,10000.00,10000.00},
							   {11000.00,11100.00,11200.00,11300.00,11400.00,11500.00},
							   {12100.00,12321.00,12544.00,12769.00,12996.00,13225.00}};
		
		double avgRow, avgCol;
		
		for(int row = 0; row< balances.length; row++) {
			avgRow = 0;
			for(int col = 0; col < balances[row].length;col++) {
				avgRow += balances[row][col];
			}
			avgRow /= 6.0;
			System.out.println("Average of row: " + row + " is: " + avgRow);
		}
		
		for(int col = 0; col < balances[0].length;col++){
			avgCol=0;
			for(int row = 0; row< balances.length; row++){
				avgCol += balances[row][col];
			}
			avgCol /= 3.0;
			System.out.println("Average of col: " + col + " is: " + avgCol);
		}
	}

}
