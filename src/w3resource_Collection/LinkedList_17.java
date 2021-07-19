package w3resource_Collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedList_17 {

//	17. Write a Java program to join two linked lists.
	
	public static void main(String[] args) {
		

		LinkedList<String> student = new LinkedList<String>();
		student.add("Archie");
		student.add("Carol");
		student.add("Dave");
		student.add("Mei");
		System.out.println(student);
		
		
		LinkedList<String> student_2 = new LinkedList<String>();
		student_2.add("John");
		student_2.add("Andy");
		student_2.add("Jeff");
		student_2.add("Lily");
		System.out.println(student_2);
		
		for(String name : student_2) {
			student.add(name);
			
		}
		System.out.println(student);
	}

}
