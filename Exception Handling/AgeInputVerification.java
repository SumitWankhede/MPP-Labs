package prob1;

import javax.swing.*;

class AgeInputVerification {

	/** Default prompt message */
	private static final String DEFAULT_MESSAGE = "Your age:";

	/**
	 * Default constructor
	 */
	public AgeInputVerification() {

	}

	/**
	 * Inputs the age from an input dialog with default prompt
	 */
	public int getAge() {

		return getAge(DEFAULT_MESSAGE);
	}

	/**
	 * Inputs the age from an input dialog with the designated prompt
	 *
	 * @param prompt
	 *            message to prompt the user
	 */

	public int getAge(String prompt) {

		String inputStr;
		int age;

		while (true) {

			inputStr = JOptionPane.showInputDialog(null, prompt);

			try {
				age = Integer.parseInt(inputStr);
				return age; // We get out.

			}

			catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "'" + inputStr + "' is invalid\n" + "Please enter digits only");

				// System.out.println(e.getMessage()); COMMENTED OUT!
				// e.printStackTrace();
			}

			// finally {
			// this part is always executed whether there is
			// an exception or not
			// System.out.println("getAge is done");
			// }
		}
	}

}
