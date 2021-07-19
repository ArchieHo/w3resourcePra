package w3resource_Collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedList_24 {

//	24. Write a Java program to compare two linked lists.
	
	public static void main(String[] args) {

		LinkedList<String> student = new LinkedList<String>();
		student.add("Archie");
		student.add("Carol");
		student.add("Dave");
		student.add("Mei");
		System.out.println(student);
		
		LinkedList<String> student_2 = new LinkedList<String>();
		student_2.add("John");
		student_2.add("Kevin");
		student_2.add("Archie");
		student_2.add("Carol");
		System.out.println(student_2);
		
		for(String temp : student_2) {
			if(student.contains(temp)) {
				System.out.println(temp + ", Yes");
			}
			else {
				System.out.println(temp + ", No");
			}
		}
		
	}

}
