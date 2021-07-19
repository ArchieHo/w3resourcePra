package w3resource_Collection;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_6 {

//	6. Write a Java program to insert elements into the linked list at the first and last position. 
	
	public static void main(String[] args) {
		

		LinkedList<String> student = new LinkedList<String>();
		student.add("Archie");
		student.add("Carol");
		student.add("Dave");
		student.add("Mei");
		System.out.println(student);
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入名字:");
		String str = scan.next();
		System.out.println("請輸入名字:");
		String str_2 = scan.next();
		
		student.addFirst(str);
		student.addLast(str_2);		
		System.out.println(student);
	}

}
