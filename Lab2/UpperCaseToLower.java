package Lab2;

import javax.swing.JOptionPane;

public class UpperCaseToLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer input = new StringBuffer();
		StringBuffer output = new StringBuffer();
		
		input.append(JOptionPane.showInputDialog("Enter the string: "));
		input.append(" Bye");
		
		System.out.println("Output after appending bye: " + input);
		
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i)>='a' && input.charAt(i)<='z') {
				output.append(Character.toUpperCase(input.charAt(i)));
			}
			else if(input.charAt(i)>='A' && input.charAt(i)<='Z') {
				output.append(Character.toLowerCase(input.charAt(i)));
			}
			else {
				output.append(input.charAt(i));
			}
		}
		
		System.out.println("Final output is: " + output);
	}

}
