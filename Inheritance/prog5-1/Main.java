package prob1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DeptEmployee[] department = new DeptEmployee[5];
		department[0] = new Professor("Lerman", "02-02-1974", 90000, 5);
		department[1] = new Professor("Shad", "04-02-2011", 85000, 3);
		department[2] = new Professor("Boxerman", "07-02-1979", 97000, 10);

		department[3] = new Secretary("Lee Won", "04-21-2014", 65000, 30);
		department[4] = new Secretary("Sean Pual", "04-22-2014", 65000, 200);

		System.out.println("Do you wanna sum of salaries of entire department? (y/n)");
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		
		if (sc.next().equals("y")) {
			for (DeptEmployee emp : department) {
				sum += emp.computeSalary();
			}
		}
		
		System.out.println("Sum of salaries of all employees is: " + sum);
	}

}
