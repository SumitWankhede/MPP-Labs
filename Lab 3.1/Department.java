package app;

import java.util.ArrayList;

public class Department {
	private String name;
	private String location;
	private ArrayList<Position> positions;
	private Company myCompany;
	
	
	public Department(String name, String location, Company newCompany) {
		super();
		this.name = name;
		this.location = location;
		positions = new ArrayList<Position>();
		myCompany = newCompany;
	}

	public Company getMyCompany() {
		return myCompany;
	}

	public void setPositions(Position position) {
		positions.add(position);
	}
	
	public void print(){
		System.out.println("\tThis is " + name + " department located at " + location);
		if(!positions.isEmpty()){
			System.out.println("\tList of positions: ");
			for(Position p : positions)
				p.print();
		}
		else{
			System.out.println("\tDeparatment has no positions assigned");
		}
	}
	
}
