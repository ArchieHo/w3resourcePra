package w3resource_Collection;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_12 {

//	12. Write a Java program to remove a specified element from a linked list.
	
	public static void main(String[] args) {
		

		LinkedList<String> student = new LinkedList<String>();
		student.add("Archie");
		student.add("Carol");
		student.add("Dave");
		student.add("Mei");
		System.out.println(student);
		
		student.remove(0);
		
		System.out.println(student);
		
		
	}

}
