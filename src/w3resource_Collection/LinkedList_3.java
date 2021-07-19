package w3resource_Collection;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_3 {

//	3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
	
	public static void main(String[] args) {
		

		LinkedList<String> student = new LinkedList<String>();
		student.add("Archie");
		student.add("Carol");
		student.add("Dave");
		student.add("Mei");
		System.out.println(student);
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int a = n;a < student.size();a++) {
			System.out.println(student.get(a));
		}
	
	}

}
