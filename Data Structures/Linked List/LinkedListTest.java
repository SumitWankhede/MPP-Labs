package Prog1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userCommand = "";
		String temp = "";
		DynamicString sd = new DynamicString();
		List<Character> A = new LinkedList<Character>();
		List<Character> B = new LinkedList<Character>();
		List<Character> C = new LinkedList<Character>();

		while (!userCommand.equals("Q")) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Command:");
			userCommand = sc.nextLine();

			switch (userCommand) {
			case "R":
				userCommand = sd.askStringName(sc);
				if (userCommand.equals("A"))
					A = sd.readString();
				if (userCommand.equals("B"))
					B = sd.readString();
				if (userCommand.equals("C"))
					C = sd.readString();
				break;
			case "W":
				userCommand = sd.askStringName(sc);
				if (userCommand.equals("A"))
					sd.writeString(A);
				if (userCommand.equals("B"))
					sd.writeString(B);
				if (userCommand.equals("C"))
					sd.writeString(C);
				break;
			case "CLR":
				userCommand = sd.askStringName(sc);
				if (userCommand.equals("A"))
					sd.clear(A);
				if (userCommand.equals("B"))
					sd.clear(B);
				if (userCommand.equals("C"))
					sd.clear(C);
				break;
			case "L":
				userCommand = sd.askStringName(sc);
				if (userCommand.equals("A"))
					sd.length(A);
				if (userCommand.equals("B"))
					sd.length(B);
				if (userCommand.equals("C"))
					sd.length(C);
				break;
			case "E":
				userCommand = sd.askStringName(sc);
				System.out.print("Enter the second string name:");
				temp = sc.nextLine();
				if ((userCommand.equals("A") || userCommand.equals("B")) && (temp.equals("B") || temp.equals("A")))
					System.out.println(sd.equals(A, B));
				else if ((userCommand.equals("A") || userCommand.equals("C")) && (temp.equals("C") || temp.equals("A")))
					System.out.println(sd.equals(A, C));
				else if ((userCommand.equals("C") || userCommand.equals("B")) && (temp.equals("B") || temp.equals("C")))
					System.out.println(sd.equals(C, B));
				break;
			case "CON":
				userCommand = sd.askStringName(sc);
				System.out.print("Enter the second string name:");
				temp = sc.nextLine();
				if (userCommand.equals("A") && temp.equals("B")) {
					sd.concatanate(A, B);
					sd.writeString(A);
				} else if (userCommand.equals("B") && temp.equals("A")) {
					sd.concatanate(B, A);
					sd.writeString(B);
				} else if (userCommand.equals("A") && temp.equals("C")) {
					sd.concatanate(A, C);
					sd.writeString(A);
				} else if (userCommand.equals("C") && temp.equals("A")) {
					sd.concatanate(C, A);
					sd.writeString(C);
				} else if (userCommand.equals("B") && temp.equals("C")) {
					sd.concatanate(B, C);
					sd.writeString(B);
				} else if (userCommand.equals("C") && temp.equals("B")) {
					sd.concatanate(C, B);
					sd.writeString(C);
				}
				break;
			}
		}
	}

}
