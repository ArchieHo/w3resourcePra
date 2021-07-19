package w3resource_Collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedList_19 {

//	19. Write a Java program to remove and return the first element of a linked list.
	
	public static void main(String[] args) {
		

		LinkedList<String> student = new LinkedList<String>();
		student.add("Archie");
		student.add("Carol");
		student.add("Dave");
		student.add("Mei");
		System.out.println(student);
		
		student.remove(0);
		System.out.println(student.get(0));
		
		
	}

}
