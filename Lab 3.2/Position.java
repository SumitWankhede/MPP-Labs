package app;

public class Position {
	private String title;
	private String description;
	private Employee emp;
	private Department myDepartment;
	
	public Position(String title, String description, Department myDepartment) {
		super();
		this.title = title;
		this.description = description;
		this.myDepartment = myDepartment;
	}
	
	public Department getMyDepartment() {
		return myDepartment;
	}

	public Position(String title, String description, Employee emp) {
		super();
		this.title = title;
		this.description = description;
		this.emp = emp;
	}
	
	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public void print(){
		System.out.println("\t\tThis is " + title + " position which work for " + description);
		if(emp != null){
			System.out.println("\t\tPerson working on this position:");
			emp.print();
		}
		else{
			System.out.println("\t\tPosition is vacant");
		}
	}
	
	public double getSalary(){
		if(emp != null)
			return emp.getSalary();
		return 0;
	}
	
}
