package w3resource_Collection;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_4 {

//	4. Write a Java program to iterate a linked list in reverse order.
	
	public static void main(String[] args) {
		

		LinkedList<String> student = new LinkedList<String>();
		student.add("Archie");
		student.add("Carol");
		student.add("Dave");
		student.add("Mei");
		System.out.println(student);
		
		
		for(int a = student.size()-1;a >= 0;a--) {
			System.out.println(student.get(a));
		}
	
	}

}
