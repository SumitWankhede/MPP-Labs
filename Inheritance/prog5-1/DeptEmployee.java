package prob1;

public class DeptEmployee {

	String name;
	String hiredate;
	double salary;
	
	public DeptEmployee(String name, String hiredate, double salary) {
		this.name = name;
		this.hiredate = hiredate;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	
	public double computeSalary() {
		return salary;
	}
	
}
