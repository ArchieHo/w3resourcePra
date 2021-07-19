package w3resource_Collection;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_15 {

//	15. Write a Java program of swap two elements in a linked list. 
	
	public static void main(String[] args) {
		

		LinkedList<String> student = new LinkedList<String>();
		student.add("Archie");
		student.add("Carol");
		student.add("Dave");
		student.add("Mei");
		System.out.println(student);
		
		student.set(0, "Mark");
		student.set(2, "Ding");
		
		System.out.println(student);
		
		
	}

}
