package cs.app;

import java.util.ArrayList;
import java.util.List;

public class Department {
	
	private String name;
	private ArrayList<Person> people;
	
	public Department(String name) {
		super();
		this.name = name;
		people = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Person> getPeople() {
		return people;
	}
	
	public void addPerson(Person person) {
		people.add(person);
	}
	
	public double getTotalSalary(){
		double totalSalary = 0;
		for(Person p : people){
			totalSalary += p.getSalary();
		}
		return totalSalary;
	}
	
	public void showAllMembers(){
		for(Person p : people){
			System.out.println("Name: " + p.getName() + " Phone: " + p.getPhone() + " Age: " + p.getAge() + " Type: " + p.getClass().getSimpleName());
		}
	}
	
	public void unitsPerFaculty(){
		for(Person p : people){
			if(p instanceof Faculty){
				Faculty f = (Faculty)p;
				System.out.println("Name: " + f.getName() + " Total number of units: " + f.getTotalUnits());
			}
		}
	}
	
}
