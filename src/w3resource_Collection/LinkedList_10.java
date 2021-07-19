package w3resource_Collection;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_10 {

//	10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
	
	public static void main(String[] args) {
		

		LinkedList<String> student = new LinkedList<String>();
		student.add("Archie");
		student.add("Carol");
		student.add("Dave");
		student.add("Mei");
		System.out.println(student);
		
		System.out.println(student.getFirst());
		System.out.println(student.getLast());
		
	}

}
