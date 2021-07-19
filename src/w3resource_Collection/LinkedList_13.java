package w3resource_Collection;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_13 {

//	13. Write a Java program to remove first and last element from a linked list.
	
	public static void main(String[] args) {
		

		LinkedList<String> student = new LinkedList<String>();
		student.add("Archie");
		student.add("Carol");
		student.add("Dave");
		student.add("Mei");
		System.out.println(student);
		
		student.removeFirst();
		student.removeLast();
		
		System.out.println(student);
		
		
	}

}
