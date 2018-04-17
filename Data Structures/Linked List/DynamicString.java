package Prog1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;



public class DynamicString {
	
	public List<Character> readString(){
		
		String tempStr = "";
		List<Character> tempLl = new LinkedList<Character>();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter text:");
		tempStr = sc.nextLine();
		
		for(int i=0; i<tempStr.length(); i++) {
			tempLl.add(tempStr.charAt(i));
		}
		return tempLl;
	}
	
	public void writeString(List<Character> list) {
		
		Iterator<Character> iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next());
		}
		System.out.println();
	}
	
	public void clear(List<Character> list ) {
		
		list.clear();
		
	}
	
	public String askStringName(Scanner sc) {
		System.out.print("Enter string name:");
		return sc.nextLine();
	}
	
	public void length(List<Character> list) {
		
		int size = 0;
		Iterator<Character> iter = list.iterator();
		
		while(iter.hasNext()) {
			size++;
			iter.next();
		}
		System.out.println("The Legnth:" + size++);
	}
	
	public boolean equals(List<Character> list1, List<Character> list2) {	
		
		if(list1.equals(list2))
			return true;
		
		return false;
	}

	public void concatanate(List<Character> target, List<Character> list) {
		
		Iterator<Character> iter = list.iterator();
		while(iter.hasNext()) {
			target.add(iter.next());
		}
	}
}
