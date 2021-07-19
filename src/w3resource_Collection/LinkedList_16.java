package w3resource_Collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_16 {

//	16. Write a Java program to shuffle the elements in a linked list.
	
	public static void main(String[] args) {
		

		LinkedList<String> student = new LinkedList<String>();
		student.add("Archie");
		student.add("Carol");
		student.add("Dave");
		student.add("Mei");
		System.out.println(student);
		
		Collections.shuffle(student);
		
		System.out.println(student);
		
		
	}

}
