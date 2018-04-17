package prob1;

public class Secretary extends DeptEmployee{
	double overtimeHours;

	public Secretary(String name, String hiredate, double salary, double overtimeHours) {
		super(name, hiredate, salary);
		this.overtimeHours = overtimeHours;
	}

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	
	public double computeSalary() {
		return salary+(12*overtimeHours);
	}
	
}
