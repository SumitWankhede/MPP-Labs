package cs.app;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
	
	private double gPA;
	private ArrayList<Course> courses;
	

	public Student(String name, String phone, int age, double gPA) {
		super(name, phone, age);
		this.gPA = gPA;
		courses = new ArrayList<>();
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void addCourse(Course course) {
		courses.add(course);
	}

	public double getgPA() {
		return gPA;
	}

	public void setgPA(double gPA) {
		this.gPA = gPA;
	}
	
	public int getTotalUnits(){
		int units = 0;
		for(Course cs : courses){
			units += cs.getUnits();
		}
		return units;
	}
	
}
