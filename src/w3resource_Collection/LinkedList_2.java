package w3resource_Collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_2 {

//	2. Write a Java program to iterate through all elements in a linked list.
	
	public static void main(String[] args) {
		

		LinkedList<String> student = new LinkedList<String>();
		student.add("Archie");
		student.add("Carol");
		student.add("Dave");
		student.add("Mei");
		
		System.out.println(student);
		
		for(String temp:student) {
			System.out.println(temp);
		}

	}

}
