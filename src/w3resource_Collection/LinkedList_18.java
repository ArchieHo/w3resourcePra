package w3resource_Collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedList_18 {

//	18. Write a Java program to clone an linked list to another linked list.
	
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
		
		LinkedList<String> student_3 = new LinkedList<String>();
		student_3 = (LinkedList)student.clone();
		System.out.println(student_3);
		
	}

}
