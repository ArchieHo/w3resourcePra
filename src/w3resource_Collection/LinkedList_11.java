package w3resource_Collection;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_11 {

//	11. Write a Java program to display the elements and their positions in a linked list.
	
	public static void main(String[] args) {
		

		LinkedList<String> student = new LinkedList<String>();
		student.add("Archie");
		student.add("Carol");
		student.add("Dave");
		student.add("Mei");
		System.out.println(student);
		Scanner scan = new Scanner(System.in);
		int ind = scan.nextInt();
		
		System.out.println(ind);
		System.out.println(student.get(ind));
		
		
	}

}
