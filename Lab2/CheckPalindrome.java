package Lab2;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = new String();
		String revString = new String();
		
		System.out.println("Please enter the string:");
		input = sc.nextLine();
		
		revString = new StringBuffer(input).reverse().toString();
		
		if(input.equals(revString))
			System.out.println("Yaay! String is palindrome.");
		else
			System.out.println("Sorry! String is not a palindrome");
		
		sc.close();
	}

}
