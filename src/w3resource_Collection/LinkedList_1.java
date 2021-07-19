package w3resource_Collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_1 {

//	1. Write a Java program to append the specified element to the end of a linked list.
	
	public static void main(String[] args) {
		

		LinkedList<String> student = new LinkedList<String>();
		student.add("Archie");
		student.add("Carol");
		student.add("Dave");
		student.add("Mei");
		
		System.out.println(student);
		student.addFirst("Tom");
		
		System.out.println(student);

	}

}
