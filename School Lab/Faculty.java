package cs.app;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends Person{
	
	private double salary;
	private ArrayList<Course> courses;
	
	public Faculty(String name, String phone, int age, double salary) {
		super(name, phone, age);
		this.salary = salary;
		courses = new ArrayList<>();
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void addCourse(Course course) {
		courses.add(course);
	}
	
	public int getTotalUnits(){
		int units = 0;
		for(Course cs : courses){
			units += cs.getUnits();
		}
		return units;
	}
}
