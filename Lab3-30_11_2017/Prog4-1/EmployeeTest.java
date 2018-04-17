package Lab3;

class EmployeeTest {
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Carl", "",75000,1987, 12,15);
		staff[1] = new Employee("Harry", "", 50000, 1989, 10, 1);
		staff[2] = new Employee("Tony","", 4000, 1990, 3, 15);
		
		Account[] account = new Account[3];
		account[0] = new Account(staff[0], "checking", 300.00);
		account[1] = new Account(staff[1], "savings", 300.00);
		account[2] = new Account(staff[2], "retirement", 300.00);
		
		for(Employee e : staff) {
			e.raiseSalary(5);
		}
		
		for(Employee e : staff) {
			System.out.println("name = "+e.getName() +
			", salary = "+e.getSalary() +
			", hire day = "+e.getHireDay() +
			", account type = " );
			
			// Print yearly federal tax for each employee
			System.out.println("Yearly federal tax for " + e.getName() + " is " + e.yearlyFederalTax());
		}
		System.out.println();
		for(Account ac : account) {
			System.out.println(ac.toString());
		}
		
	}
}

