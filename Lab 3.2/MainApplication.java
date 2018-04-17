package app;

public class MainApplication {
	public static void main(String args[]){
		Company newCompany = new Company("Barista");
		
		Department dept1 = new Department("IT", "FairField", newCompany);
		Department dept2 = new Department("Sales", "Ottumwa", newCompany);
		
		Position pos1 = new Position("Manager", "Manage department", dept1);
		Position pos2 = new Position("Security", "Responsible for security", dept1);
		Position pos3 = new Position("Recruiter", "Manage recruitment", dept1);
		Position pos4 = new Position("Assistant", "Assist manager", dept2);
		Position pos5 = new Position("Manager", "Manage department", dept2);
		Position pos6 = new Position("Engineer", "Manage engineering department", dept2);
		
		Employee emp1 = new Employee("1", "Ron", "Will", "Farrell", "01-21-1986", "876-456-1223", 18000.0);
		Employee emp2 = new Employee("2", "Sam", "", "Jon", "04-02-1989", "876-436-1223", 12000.0);
		Employee emp3 = new Employee("3", "Ravi", "Sean", "Smith", "11-1-1987", "876-456-1239", 8000.0);
		Employee emp4 = new Employee("4", "Ronak", "", "Singh", "01-21-1982", "876-456-1653", 36000.0);
		
		
		newCompany.setDepartments(dept1);
		newCompany.setDepartments(dept2);
		
		dept1.setPositions(pos1);
		dept1.setPositions(pos2);
		dept1.setPositions(pos3);
		dept2.setPositions(pos4);
		dept2.setPositions(pos5);
		dept2.setPositions(pos6);
		
		pos1.setEmp(emp1);
		pos3.setEmp(emp2);
		pos4.setEmp(emp3);
		pos5.setEmp(emp4);
		
		newCompany.print();
		System.out.println("Total salary :" + newCompany.getSalary());
	}
}
