package app;

public class Employee {
	private String employeeID;
	private String firstName;
	private String middleName;
	private String lastName;
	private String birthDate;
	private String sSN;
	private double salary;
	
	public Employee(String employeeID, String firstName, String middleName, String lastName, String birthDate,
			String sSN, double salary) {
		super();
		this.employeeID = employeeID;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.sSN = sSN;
		this.salary = salary;
	}
	
	public void print(){
		System.out.println("\t\tName: " + firstName + " " + lastName);
	}
	
}
