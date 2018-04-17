package app;

import java.util.ArrayList;

public class Company {
	
	private String name;
	private ArrayList<Department> departments;

	public Company(String name) {
		super();
		this.name = name;
		departments = new ArrayList<Department>();
	}

	public String getName() {
		return name;
	}
	
	public void setDepartments(Department department) {
		departments.add(department);
	}

	public void print(){
		System.out.println("Company name is " + name);
		if(departments.isEmpty()){
			System.out.println("No departments are assigned");
		}
		else{
			for(Department d : departments){
				d.print();
			}
		}
	}
	
}
