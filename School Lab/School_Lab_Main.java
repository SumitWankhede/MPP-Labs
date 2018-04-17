package cs.app;

import java.io.IOException;
import java.util.Scanner;

public class School_Lab_Main {

	public static void main(String[] args) throws IOException {
		Department dept = new Department("ComputerScience");

		Person frankMoore = new Faculty("Frank Moore","472-5921",43,10000); 
		Person samHoward = new Faculty("Sam Howard","472-7222",55,9500); 
		Person johnDoodle = new Faculty("John Doodle","472-6190",39,8600);
		
		dept.addPerson(frankMoore); 
		dept.addPerson(samHoward);
		dept.addPerson(johnDoodle);
		
		Person johnDoe = new Student("John Doe","472-1121",22,4.0); 
		Person maryJones = new Student("Mary Jones","472-7322",32,3.80);
		Person leeJohnson = new Student("Lee Johnson","472-6009",19,3.65);
		
		dept.addPerson(johnDoe); 
		dept.addPerson(maryJones);
		dept.addPerson(leeJohnson);
		
		Person frankGore = new Staff("Frank Gore","472-3321",33,4050); 
		Person adamDavis = new Staff("Adam Davis","472-7552",50,5500); 
		Person davidHeck = new Staff("David Heck","472-8890",29,3600); 
		
		dept.addPerson(frankGore);
		dept.addPerson(adamDavis); 
		dept.addPerson(davidHeck);
		
		Course cs201 = new Course("cs201","programming",4); 
		Course cs360 = new Course("cs360","database",3); 
		Course cs404 = new Course("cs404","compiler",4); 
		Course cs240 = new Course("cs240","datastructure",2);
		Course cs301 = new Course("cs301","Software engg",3); 
		Course cs450 = new Course("cs450","Advanced architecture",5);
		
		////////////////////////////////////////////////////////////////////////////////
		
		frankMoore.addCourse(cs450);
		
		samHoward.addCourse(cs360);
		samHoward.addCourse(cs301);
		
		johnDoodle.addCourse(cs404);
		johnDoodle.addCourse(cs201);
		johnDoodle.addCourse(cs240);
		
		
		johnDoe.addCourse(cs201);
		johnDoe.addCourse(cs360);
		johnDoe.addCourse(cs404);
		johnDoe.addCourse(cs301);
		
		maryJones.addCourse(cs201);
		maryJones.addCourse(cs404);
		maryJones.addCourse(cs450);
		
		leeJohnson.addCourse(cs201);
		leeJohnson.addCourse(cs360);
		leeJohnson.addCourse(cs240);
		leeJohnson.addCourse(cs450);
		////////////////////////////////////////////////////////////////////////////////
		
		/*// The following commented out code will help you
		// create the objects that you need.

		// CHANGE the code below so that instead of addFaculty,
		// addStudent, and addStaff, we have ONLY ONE method,
		// addPerson (this replaces the other three methods).

		*//*******************************************************
		 * 
		 * // Create faculty objects Person frankMoore = new Faculty("Frank
		 * Moore","472-5921",43,10000); Person samHoward = new Faculty("Sam
		 * Howard","472-7222",55,9500); Person johnDoodle = new Faculty("John
		 * Doodle","472-6190",39,8600);
		 * 
		 * dept.addPerson (frankMoore); dept.addFaculty(samHoward);
		 * dept.addFaculty(johnDoodle);
		 * 
		 * 
		 * // Create student objects Person johnDoe = new Student("John
		 * Doe","472-1121",22,4.0); Person maryJones = new Student("Mary
		 * Jones","472-7322",32,3.80); Person leeJohnson = new Student("Lee
		 * Johnson","472-6009",19,3.65);
		 * 
		 * dept.addPerson (johnDoe); dept.addStudent(maryJones);
		 * dept.addStudent(leeJohnson);
		 * 
		 * 
		 * // Create staff objects Person frankGore = new Staff("Frank
		 * Gore","472-3321",33,4050); Person adamDavis = new Staff("Adam
		 * Davis","472-7552",50,5500); Person davidHeck = new Staff("David
		 * Heck","472-8890",29,3600); dept.addPerson (frankGore);
		 * dept.addStaff(adamDavis); dept.addStaff(davidHeck);
		 * 
		 * // Create course objects Course cs201 = new
		 * Course("cs201","programming",4, johnDoodle); Course cs360 = new
		 * Course("cs360","database",3, samHoward); Course cs404 = new
		 * Course("cs404","compiler",4, johnDoodle); Course cs240 = new
		 * Course("cs240","datastructure",2, johnDoodle); Course cs301 = new
		 * Course("cs301","Software engg",3, samHoward); Course cs450 = new
		 * Course("cs450","Advanced architecture",5,frankMoore);
		 * 
		 * /* The above course objects will go inside either a faculty object,
		 * or a student object. Not all of the course objects go into the same
		 * object.
		 * 
		 * You would have code that looks something like :
		 * frankMoore.addCourse(cs450);
		 * 
		 * The addCourse method would have to be written in the faculty class.
		 * Something similar would be done for students.
		 *//*

		*//********************************************************//*
*/
		double totsalary = 0;

		while (true) {
			putText("Enter first letter of ");
			putText("getTotalSalary, showAllMembers, unitsPerFaculty or quit : ");
			int choice = getChar();
			switch (choice) {
			case 'g':
				totsalary = dept.getTotalSalary();
				putText("Total sum of all salaries is:");
				putText(String.valueOf(totsalary) + "\n");
				break;
			case 's':
				dept.showAllMembers();
				break;
			case 'u':
				dept.unitsPerFaculty();
				break;
			case 'q':
				return;
			default:
				putText("Invalid entry\n");
			} // end switch
		} // end while
	} // end main()
	// -------------------------------------------------------------

	public static void putText(String s) // writes string s to the screen
	{
		System.out.println(s);
	}

	// -------------------------------------------------------------
	public static String getString() throws IOException // reads a string from
														// the keyboard input
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		//sc.close();
		return s;
	}

	// -------------------------------------------------------------
	public static char getChar() throws IOException // reads a character from
													// the keyboard input
	{
		String s = getString();
		return s.charAt(0);
	}

	// -------------------------------------------------------------
	public static int getInt() throws IOException // reads an integers from the
													// keyboard input
	{
		String s = getString();
		return Integer.parseInt(s);
	}
	// -------------------------------------------------------------
}
