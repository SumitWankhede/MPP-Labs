package labWork;

import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the string:");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int xCounter = 0;
		
		for(int i = input.length() - 1; i >= 0; i--) {
			System.out.print(input.charAt(i));
			if(input.charAt(i) == 'x') {
				xCounter++;
			}
		}
		System.out.println();
		System.out.println("Total number of x's are: " + xCounter);
		sc.close();
	}

}
